#requires -Version 7.0
[CmdletBinding()]
param(
    [Parameter(Mandatory)][ValidateScript({ Test-Path -LiteralPath $_ -PathType Leaf })]
    [string]$BaselineClientJar,
    [Parameter(Mandatory)][ValidateScript({ Test-Path -LiteralPath $_ -PathType Leaf })]
    [string]$TargetClientJar
)

$ErrorActionPreference = 'Stop'
Add-Type -AssemblyName System.IO.Compression.FileSystem

function Get-VanillaBlockNames([string]$Path) {
    $archive = [IO.Compression.ZipFile]::OpenRead((Resolve-Path -LiteralPath $Path).Path)
    try {
        $names = @($archive.Entries | ForEach-Object {
            if ($_.FullName -match '^assets/minecraft/blockstates/([^/]+)\.json$') {
                $Matches[1]
            }
        } | Sort-Object -Unique)
        if ($names.Count -eq 0) { throw "No vanilla blockstates found in $Path" }
        return $names
    } finally {
        $archive.Dispose()
    }
}

$baseline = @(Get-VanillaBlockNames $BaselineClientJar)
$target = @(Get-VanillaBlockNames $TargetClientJar)
$sourcePath = Join-Path $PSScriptRoot '../src/main/java/growthcraft/deco/init/GrowthcraftDecoBlocks.java'
$registrations = Get-Content -LiteralPath $sourcePath -Raw

function Test-StairReference([string]$Name) {
    if ($registrations -match ('Blocks\.' + [regex]::Escape($Name.ToUpperInvariant()) + '\b')) {
        return $true
    }
    # Minecraft 26.2 groups copper constants by wax and weathering state.
    if ($Name -match '^(waxed_)?(exposed_|weathered_|oxidized_)?cut_copper_stairs$') {
        $wax = if ($Matches[1]) { 'waxed' } else { 'weathering' }
        $state = if ($Matches[2]) { $Matches[2].TrimEnd('_') } else { 'unaffected' }
        return $registrations -match ('Blocks\.CUT_COPPER_STAIRS\.' + $wax + '\(\)\.' + $state + '\(\)')
    }
    return $false
}

[pscustomobject]@{
    BaselineBlockCount = $baseline.Count
    TargetBlockCount = $target.Count
    Added = @($target | Where-Object { $_ -notin $baseline })
    Removed = @($baseline | Where-Object { $_ -notin $target })
    StairsWithoutRegistrationReference = @($target | Where-Object {
        $_.EndsWith('_stairs') -and !(Test-StairReference $_)
    })
} | ConvertTo-Json -Depth 3

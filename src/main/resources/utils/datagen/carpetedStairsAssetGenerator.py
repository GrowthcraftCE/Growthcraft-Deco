import os
import json

# Define constants
COLORS = [
    "black", "blue", "brown", "clear", "cyan", "gray", "green", "light_blue",
    "light_gray", "lime", "magenta", "orange", "pink", "purple", "red", "white", "yellow"
]
BLOCK_NAME = "stairs_warped_planks_carpet"
TEXTURE_BASE = "minecraft:block/warped_planks"
TEMPLATE_PATH = "growthcraft_deco:block/stairs/template"
RESOURCES_PATH = "resources/assets/growthcraft_deco"

def generate_blockstate_file(color):
    file_content = {
        "variants": {
            # Complete the blockstate structure as per your provided JSON
        }
    }
    # Define file path
    file_path = os.path.join(RESOURCES_PATH, "blockstates", f"{BLOCK_NAME}_{color}.json")
    # Write to file
    with open(file_path, "w") as file:
        json.dump(file_content, file, indent=4)

def generate_block_model_file(color, variant):
    model_content = {
        "parent": f"{TEMPLATE_PATH}/stairs_{variant}",
        "textures": {
            "base": TEXTURE_BASE,
            "carpet": f"minecraft:block/{color}_wool",
            "particle": TEXTURE_BASE
        }
    }
    file_path = os.path.join(RESOURCES_PATH, "models", "block", f"{BLOCK_NAME}_{color}_{variant}.json")
    with open(file_path, "w") as file:
        json.dump(model_content, file, indent=4)

def generate_item_model_file(color):
    model_content = {
        "parent": f"growthcraft_deco:block/stairs/{BLOCK_NAME}_{color}"
    }
    file_path = os.path.join(RESOURCES_PATH, "models", "item", f"{BLOCK_NAME}_{color}.json")
    with open(file_path, "w") as file:
        json.dump(model_content, file, indent=4)

def main():
    for color in COLORS:
        # Generate blockstate file
        generate_blockstate_file(color)

        # Generate block model files
        generate_block_model_file(color, "inner")
        generate_block_model_file(color, "outer")
        generate_block_model_file(color, "")

        # Generate item model file
        generate_item_model_file(color)

    print("All block models and blockstate files generated successfully.")

if __name__ == "__main__":
    main()

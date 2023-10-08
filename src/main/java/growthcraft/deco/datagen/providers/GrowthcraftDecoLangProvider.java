package growthcraft.deco.datagen.providers;

import growthcraft.deco.shared.Reference;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.commons.codec.language.bm.Lang;

public class GrowthcraftDecoLangProvider extends LanguageProvider {

    public GrowthcraftDecoLangProvider(PackOutput output) {
        super(output, Reference.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        Reference.LocalizedNames.DOORS_EN_US.forEach(this::add);
        Reference.LocalizedNames.GLOWING_BLOCKS_EN_US.forEach(this::add);
    }


}

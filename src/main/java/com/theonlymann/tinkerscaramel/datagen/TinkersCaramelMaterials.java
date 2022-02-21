package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.init.ModifierInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

import javax.annotation.Nonnull;

public class TinkersCaramelMaterials extends AbstractMaterialDataProvider {

    public TinkersCaramelMaterials(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addMaterials() {
        addMaterial(glazed_pig_iron, 3, ORDER_NETHER, false, 0xffb82a);
    }

    public static final MaterialId glazed_pig_iron = new MaterialId(new ResourceLocation(TinkersCaramel.MOD_ID, "glazed_pig_iron"));

    @Nonnull
    @Override
    public String getName() {
        return "Tinkers Caramel Materials";
    }

    public static class TinkersCaramelTraits extends AbstractMaterialTraitDataProvider {

        public TinkersCaramelTraits(DataGenerator gen, AbstractMaterialDataProvider materials) {
            super(gen, materials);
        }

        @Override
        protected void addMaterialTraits() {
            addDefaultTraits(glazed_pig_iron, TinkerModifiers.tasty.get(), ModifierInit.GLAZED_PIGIRON_GLAZED.get());
        }

        @Nonnull
        @Override
        public String getName() {
            return "Tinkers Caramel Material Traits";
        }
    }


    public static class TinkersCaramelMaterialStats extends AbstractMaterialStatsDataProvider {

        public TinkersCaramelMaterialStats(DataGenerator gen, AbstractMaterialDataProvider materials) {
            super(gen, materials);
        }

        @Nonnull
        @Override
        public String getName() {
            return "Tinkers Caramel Material Stats";
        }

        @Override
        protected void addMaterialStats() {

            addMaterialStats(glazed_pig_iron,
                    new HeadMaterialStats(730, 5.5f, 3, 2.7f),
                    HandleMaterialStats.DEFAULT.withDurability(1.3f).withMiningSpeed(0.8f).withAttackSpeed(0.9f).withAttackDamage(1.2f),
                    ExtraMaterialStats.DEFAULT);
        }
    }
}

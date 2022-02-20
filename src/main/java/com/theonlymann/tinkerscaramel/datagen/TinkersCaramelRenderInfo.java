package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

public class TinkersCaramelRenderInfo extends AbstractMaterialRenderInfoProvider {
    public TinkersCaramelRenderInfo(DataGenerator gen, AbstractMaterialSpriteProvider spriteProvider) {
        super(gen, spriteProvider);
    }

    @Override
    protected void addMaterialRenderInfo() {
        buildRenderInfo(TinkersCaramelMaterials.glazed_pig_iron).color(0xD1F1C1).fallbacks("metal");
    }
    @Nonnull
    @Override
    public String getName() {
        return "Tinkers Caramel Render info provider!";
    }
}

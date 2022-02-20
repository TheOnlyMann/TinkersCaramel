package com.theonlymann.tinkerscaramel.datagen;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

import javax.annotation.Nonnull;

public class TinkersCaramelMaterialSpriteProvider extends AbstractMaterialSpriteProvider {
    @Nonnull
    @Override
    public String getName() {
        return "TinkersCaramel Material Sprite Provider";
    }

    @Override
    protected void addAllMaterials() {
        buildMaterial(TinkersCaramelMaterials.glazed_pig_iron)
                .meleeHarvest()
                .fallbacks("metal")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF69363A).addARGB(102, 0xFF7E484C).addARGB(140, 0xFFAF666C).addARGB(178, 0xFFC87D82).addARGB(216, 0xFFF0A8A4).addARGB(255, 0xFFFBCECC).build());

    }
}

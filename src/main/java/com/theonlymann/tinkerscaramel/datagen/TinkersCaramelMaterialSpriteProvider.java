package com.theonlymann.tinkerscaramel.datagen;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.tools.data.material.MaterialIds;
import slimeknights.tconstruct.tools.data.sprite.TinkerPartSpriteProvider;

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
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF761500).addARGB(102, 0xFFA44216).addARGB(140, 0xFFF0A8A4).addARGB(178, 0xFFEC7F43).addARGB(216, 0xFFFFE094).addARGB(255, 0xFFFFFFFF).build());

    }
}

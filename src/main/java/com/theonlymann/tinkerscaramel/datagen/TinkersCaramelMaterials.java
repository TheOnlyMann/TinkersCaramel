package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

import javax.annotation.Nonnull;

public class TinkersCaramelMaterials extends AbstractMaterialDataProvider {

    public TinkersCaramelMaterials(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addMaterials() {
        //addMaterial(glazed_pig_iron, 3, ORDER_HARVEST, false, 0xffb82a);
    }

    public static final MaterialId glazed_pig_iron = new MaterialId(new ResourceLocation(TinkersCaramel.MOD_ID, "glazed_pig_iron"));

    @Nonnull
    @Override
    public String getName() {
        return "Tinkers Caramel Materials";
    }
}

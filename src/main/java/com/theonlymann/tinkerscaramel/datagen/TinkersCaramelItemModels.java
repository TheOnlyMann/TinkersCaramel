package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.init.FluidInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class TinkersCaramelItemModels  extends ItemModelProvider {
    public TinkersCaramelItemModels (DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TinkersCaramel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //itemWithModel(FluidInit.MOLTEN_CARAMEL.asItem()., "item/generated");
    }
    /*
    public void itemWithModel(RegistryObject<? extends Item> registryObject, String model) {
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
        singleTexture(id.getPath(), new ResourceLocation(model), "layer0", textureLocation);
    }
    */
}

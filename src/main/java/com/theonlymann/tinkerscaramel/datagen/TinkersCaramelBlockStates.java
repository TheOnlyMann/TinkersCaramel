package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.init.FluidInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.object.FluidObject;

public class TinkersCaramelBlockStates  extends BlockStateProvider {
    public TinkersCaramelBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TinkersCaramel.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        fluid(FluidInit.MOLTEN_CARAMEL);
        fluid(FluidInit.MOLTEN_CARAMEL_BLOOD);
        fluid(FluidInit.MOLTEN_CARAMEL_EARTHSLIME);
        fluid(FluidInit.MOLTEN_CARAMEL_SKYSLIME);
        fluid(FluidInit.MOLTEN_CARAMEL_ENDERSLIME);
        fluid(FluidInit.MOLTEN_CARAMEL_MAGMA_CREAM);
        fluid(FluidInit.MOLTEN_SUGAR);
        //simpleBlock(FluidInit.MOLTEN_CARAMEL.getBlock(),models().cubeAll(FluidInit.MOLTEN_CARAMEL.getBlock().getRegistryName().getPath(), new ResourceLocation(FluidInit.MOLTEN_CARAMEL.getBlock().getRegistryName().getNamespace(), ModelProvider.BLOCK_FOLDER + "/fluid/" + FluidInit.MOLTEN_CARAMEL.getBlock().getRegistryName().getPath()+"_still")));
    }

    public void fluid(FluidObject fluid) {
        ResourceLocation name = fluid.getBlock().getRegistryName();
        simpleBlock(fluid.getBlock(), models().cubeAll(name.getPath(), new ResourceLocation(name.getNamespace(), ModelProvider.BLOCK_FOLDER + "/fluid/" + name.getPath()+"_still")));
    }
}

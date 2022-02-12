package com.theonlymann.tinkerscaramel.datagen;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.init.FluidInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.FluidTagsProvider;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TinkersCaramelFluidTags extends FluidTagsProvider {

    public TinkersCaramelFluidTags(DataGenerator gen, ExistingFileHelper fileHelper) {
        super(gen, TinkersCaramel.MOD_ID, fileHelper);
    }
    public static final ITag.INamedTag<Fluid> MOLTEN_SUGAR = FluidTags.bind("forge:molten_sugar");
    public static final ITag.INamedTag<Fluid> MOLTEN_SUGAR_T = FluidTags.bind("tinkerscaramel:molten_sugar");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL = FluidTags.bind("forge:molten_caramel");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_T = FluidTags.bind("tinkerscaramel:molten_caramel");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_BLOOD = FluidTags.bind("forge:molten_caramel_blood");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_BLOOD_T = FluidTags.bind("tinkerscaramel:molten_caramel_blood");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_EARTHSLIME = FluidTags.bind("forge:molten_caramel_earthslime");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_EARTHSLIME_T = FluidTags.bind("tinkerscaramel:molten_caramel_earthslime");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_ENDERSLIME = FluidTags.bind("forge:molten_caramel_enderslime");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_ENDERSLIME_T = FluidTags.bind("tinkerscaramel:molten_caramel_enderslime");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_MAGMA_CREAM = FluidTags.bind("forge:molten_caramel_magma_cream");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_MAGMA_CREAM_T = FluidTags.bind("tinkerscaramel:molten_caramel_magma_cream");

    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_SKYSLIME = FluidTags.bind("forge:molten_caramel_skyslime");
    public static final ITag.INamedTag<Fluid> MOLTEN_CARAMEL_SKYSLIME_T = FluidTags.bind("tinkerscaramel:molten_caramel_skyslime");

    @Override
    protected void addTags() {
        tag(MOLTEN_SUGAR).add(FluidInit.MOLTEN_SUGAR.get());
        tag(MOLTEN_SUGAR_T).add(FluidInit.MOLTEN_SUGAR.get());

        tag(MOLTEN_CARAMEL).add(FluidInit.MOLTEN_CARAMEL.get());
        tag(MOLTEN_CARAMEL_T).add(FluidInit.MOLTEN_CARAMEL.get());

        tag(MOLTEN_CARAMEL_BLOOD).add(FluidInit.MOLTEN_CARAMEL_BLOOD.get());
        tag(MOLTEN_CARAMEL_BLOOD_T).add(FluidInit.MOLTEN_CARAMEL_BLOOD.get());

        tag(MOLTEN_CARAMEL_EARTHSLIME).add(FluidInit.MOLTEN_CARAMEL_EARTHSLIME.get());
        tag(MOLTEN_CARAMEL_EARTHSLIME_T).add(FluidInit.MOLTEN_CARAMEL_EARTHSLIME.get());

        tag(MOLTEN_CARAMEL_ENDERSLIME).add(FluidInit.MOLTEN_CARAMEL_ENDERSLIME.get());
        tag(MOLTEN_CARAMEL_ENDERSLIME_T).add(FluidInit.MOLTEN_CARAMEL_ENDERSLIME.get());

        tag(MOLTEN_CARAMEL_MAGMA_CREAM).add(FluidInit.MOLTEN_CARAMEL_MAGMA_CREAM.get());
        tag(MOLTEN_CARAMEL_MAGMA_CREAM_T).add(FluidInit.MOLTEN_CARAMEL_MAGMA_CREAM.get());

        tag(MOLTEN_CARAMEL_SKYSLIME).add(FluidInit.MOLTEN_CARAMEL_SKYSLIME.get());
        tag(MOLTEN_CARAMEL_SKYSLIME_T).add(FluidInit.MOLTEN_CARAMEL_SKYSLIME.get());
    }

}

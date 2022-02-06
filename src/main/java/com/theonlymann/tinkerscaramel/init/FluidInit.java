package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;
import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.ModelFluidAttributes;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.fluids.fluids.SlimeFluid;
import slimeknights.tconstruct.shared.block.SlimeType;

import java.util.EnumMap;
import java.util.Map;


public class FluidInit {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(TinkersCaramel.MOD_ID);
    //public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TinkersCaramel.MOD_ID);
    //public static final RegistryObject<Fluid> CARAMEL = FLUIDS.register("caramel", FluidCaramel.Source::new);
    //public static final RegistryObject<Fluid> CARAMEL_FLOWING = FLUIDS.register("caramel_flowing", FluidCaramel.Flowing::new);

    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL = FLUIDS.register("molten_caramel",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL_BLOOD = FLUIDS.register("molten_caramel_blood",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL_EARTHSLIME = FLUIDS.register("molten_caramel_earthslime",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL_ENDERSLIME = FLUIDS.register("molten_caramel_enderslime",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL_MAGMA_CREAM = FLUIDS.register("molten_caramel_magma_cream",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CARAMEL_SKYSLIME = FLUIDS.register("molten_caramel_skyslime",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336),
            Material.WATER,0);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_SUGAR = FLUIDS.register("molten_sugar",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1600).viscosity(1600).temperature(225),
            Material.WATER,0);
}

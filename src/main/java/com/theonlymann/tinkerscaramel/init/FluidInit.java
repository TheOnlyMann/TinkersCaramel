package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
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
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            TinkersCaramel.MOD_ID);
    public static final FluidObject<ForgeFlowingFluid> caramel = FLUIDS.register("caramel",
            ModelFluidAttributes.builder().sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY).density(1200).viscosity(1200).temperature(336).build(), Material.WATER,0);
}

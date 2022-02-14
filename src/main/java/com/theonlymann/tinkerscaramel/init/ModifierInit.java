package com.theonlymann.tinkerscaramel.init;

import com.theonlymann.tinkerscaramel.TinkersCaramel;
import com.theonlymann.tinkerscaramel.modifier.TraitGlazed;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class ModifierInit {
    public static DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, TinkersCaramel.MOD_ID);

    public static RegistryObject<Modifier> GLAZED_PIGIRON_GLAZED =MODIFIERS.register("glazed", TraitGlazed::new);
}
package com.theonlymann.tinkerscaramel.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.helper.ToolDamageUtil;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.modifiers.slotless.OverslimeModifier;

import javax.tools.Tool;

public class TraitGlazed extends Modifier {
    public TraitGlazed() {
        super(0xFDE499);
    }

    @Override
    public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {

        if (!world.isClientSide && holder.tickCount % (420 / level) == 0 && tool.getDamage() > 0 && holder.getUseItem() != stack){
            OverslimeModifier overslime = TinkerModifiers.overslime.get();
            int current = overslime.getOverslime(tool);
            //int cap = overslime.getCapacity(tool);
            if(current >= 2 && tool.getDamage() >= 1){
                overslime.addOverslime(tool,-2);
                ToolDamageUtil.repair(tool,1);
            }
        }
    }
}

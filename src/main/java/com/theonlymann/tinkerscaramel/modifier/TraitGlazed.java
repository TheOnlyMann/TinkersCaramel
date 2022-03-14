package com.theonlymann.tinkerscaramel.modifier;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameter;
import net.minecraft.loot.LootParameters;
import net.minecraft.world.World;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.helper.ToolDamageUtil;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.shared.TinkerCommons;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.modifiers.slotless.OverslimeModifier;

import javax.tools.Tool;
import java.util.List;

public class TraitGlazed extends Modifier {
    public TraitGlazed() {
        super(0xFDE499);
    }

    @Override
    public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {

        if (!world.isClientSide && holder.tickCount % (60 / level) == 0 && tool.getDamage() > 0 && holder.getUseItem() != stack){
            OverslimeModifier overslime = TinkerModifiers.overslime.get();
            int current = overslime.getOverslime(tool);
            //int cap = overslime.getCapacity(tool);
            if(current >= 2 && tool.getDamage() >= 1){
                overslime.addOverslime(tool,-2);
                ToolDamageUtil.repair(tool,1);
            }
        }
    }
    /*
    @Override
    public List<ItemStack> processLoot(IModifierToolStack tool, int level, List<ItemStack> generatedLoot, LootContext context) {
        // if no damage source, probably not a mob
        // otherwise blocks breaking (where THIS_ENTITY is the player) start dropping bacon
        // we want the opposite
        if (context.hasParam(LootParameters.DAMAGE_SOURCE)) {
            return generatedLoot;
        }
        context.hasParam(LootParameters.);
        BlockState variable = context.getParamOrNull(LootParameter <BlockState>);
        if(generatedLoot.contains(Items.CARROT.asItem()))
        {

        }
        // must have an entity
        Entity entity = context.getParamOrNull(LootParameters.THIS_ENTITY);
        if (entity != null && TinkerTags.EntityTypes.BACON_PRODUCER.contains(entity.getType())) {
            // at tasty 1, 2, 3, and 4 its a 2%, 4.15%, 6.25%, 8% per level
            int looting = context.getLootingModifier();
            if (RANDOM.nextInt(48 / level) <= looting) {
                // bacon
                generatedLoot.add(new ItemStack(TinkerCommons.bacon));
            }
        }
        // must have an block
        BlockState blockstate = context.getParamOrNull(LootParameters.BLOCK_STATE);
        if (entity != null && TinkerTags.EntityTypes.BACON_PRODUCER.contains(entity.getType())) {
            // at tasty 1, 2, 3, and 4 its a 2%, 4.15%, 6.25%, 8% per level
            int looting = context.getLootingModifier();
            if (RANDOM.nextInt(48 / level) <= looting) {
                // bacon
                generatedLoot.add(new ItemStack(TinkerCommons.bacon));
            }
        }
        return generatedLoot;
    }

     */
}

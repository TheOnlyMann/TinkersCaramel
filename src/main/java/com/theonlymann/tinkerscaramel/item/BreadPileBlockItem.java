package com.theonlymann.tinkerscaramel.item;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;


public class BreadPileBlockItem extends BlockItem {
    public BreadPileBlockItem(Block block, Properties props) {
        super(block, props);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        if(!player.isCrouching()) {
            ActionResultType actionresulttype = this.place(new BlockItemUseContext(context));
            return !actionresulttype.consumesAction() && this.isEdible() ? this.use(context.getLevel(), context.getPlayer(), context.getHand()).getResult() : actionresulttype;
        }
        return ActionResultType.PASS;
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    }

    @Override
    public int getUseDuration(ItemStack p_77626_1_) {
        if (p_77626_1_.getItem().isEdible()) {
            return this.getFoodProperties().isFastFood() ? 32 : 128;
        } else {
            return 0;
        }
    }
    @Override
    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        ItemStack itemstack = super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        p_77654_3_.hurt(new DamageSource("tinkerscaramel.bread_death").bypassArmor(),20);
        return itemstack;
    }

    @Override
    public UseAction getUseAnimation(ItemStack p_77661_1_) {
        return super.getUseAnimation(p_77661_1_);
    }
}

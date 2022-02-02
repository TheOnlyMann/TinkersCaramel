package com.theonlymann.tinkerscaramel.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;


public class CaramelBlockItem extends BlockItem {
    public CaramelBlockItem(Block block, Properties props) {
        super(block, props);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        if(player.isCrouching()) {
            ActionResultType actionresulttype = this.place(new BlockItemUseContext(context));
            return !actionresulttype.consumesAction() && this.isEdible() ? this.use(context.getLevel(), context.getPlayer(), context.getHand()).getResult() : actionresulttype;
        }
        return ActionResultType.PASS;
    }
}

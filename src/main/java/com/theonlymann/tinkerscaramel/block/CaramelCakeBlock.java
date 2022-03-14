package com.theonlymann.tinkerscaramel.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class CaramelCakeBlock extends FallingBlock {
    public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 8);
    public CaramelCakeBlock(Properties p_i48434_1_) {
        super(p_i48434_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, Integer.valueOf(0)));
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(BITES);
    }

    @Override
    public int getAnalogOutputSignal(BlockState p_180641_1_, World p_180641_2_, BlockPos p_180641_3_) {
        return 9 - p_180641_1_.getValue(BITES);
    }
    public boolean hasAnalogOutputSignal(BlockState p_149740_1_) {
        return true;
    }

    public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
        return false;
    }

    private static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D);
    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public void tick(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, Random p_225534_4_) {
        if (p_225534_2_.isEmptyBlock(p_225534_3_.below()) || isFree(p_225534_2_.getBlockState(p_225534_3_.below())) && p_225534_3_.getY() >= 0) {
            FallingBlockEntity fallingblockentity = new FallingBlockEntity(p_225534_2_, (double)p_225534_3_.getX() + 0.5D, (double)p_225534_3_.getY(), (double)p_225534_3_.getZ() + 0.5D, p_225534_2_.getBlockState(p_225534_3_));
            fallingblockentity.dropItem = false;
            this.falling(fallingblockentity);
            p_225534_2_.addFreshEntity(fallingblockentity);
        }
    }


    @Override
    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (p_225533_2_.isClientSide) {
            ItemStack itemstack = p_225533_4_.getItemInHand(p_225533_5_);
            if (this.eat(p_225533_2_, p_225533_3_, p_225533_1_, p_225533_4_).consumesAction()) {
                return ActionResultType.SUCCESS;
            }

            if (itemstack.isEmpty()) {
                return ActionResultType.CONSUME;
            }
        }

        return this.eat(p_225533_2_, p_225533_3_, p_225533_1_, p_225533_4_);
    }
    private ActionResultType eat(IWorld p_226911_1_, BlockPos p_226911_2_, BlockState p_226911_3_, PlayerEntity p_226911_4_) {
        if (!p_226911_4_.canEat(false)) {
            return ActionResultType.PASS;
        } else {
            p_226911_4_.awardStat(Stats.EAT_CAKE_SLICE);
            p_226911_4_.getFoodData().eat(11, 0.4F);
            //p_226911_4_.addEffect(new EffectInstance(Effects.SATURATION, 2, 0));
            int i = p_226911_3_.getValue(BITES);
            if (i < 8) {
                p_226911_1_.setBlock(p_226911_2_, p_226911_3_.setValue(BITES, Integer.valueOf(i + 1)), 3);
            } else {
                p_226911_1_.removeBlock(p_226911_2_, false);
            }

            return ActionResultType.SUCCESS;
        }
    }
}

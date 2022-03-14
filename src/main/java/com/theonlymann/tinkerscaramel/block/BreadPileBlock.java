package com.theonlymann.tinkerscaramel.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.command.arguments.ScoreHolderArgument;
import net.minecraft.entity.MobEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BreadPileBlock extends FallingBlock {

    public BreadPileBlock(Properties properties) {
        super(properties);
    }


    @Override
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }

    @Override
    public float getShadeBrightness(BlockState p_220080_1_, IBlockReader p_220080_2_, BlockPos p_220080_3_) {
        return 0.8F;
    }

    private static final VoxelShape SHAPE = Block.box(2, 2, 2, 14, 14, 14);
    @Deprecated
    public VoxelShape getBlockSupportShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return SHAPE;
    }
}

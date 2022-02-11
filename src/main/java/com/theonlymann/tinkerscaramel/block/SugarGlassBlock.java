package com.theonlymann.tinkerscaramel.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SugarGlassBlock extends Block {
    public SugarGlassBlock(Properties properties){
        super(properties);
    }

    private static final VoxelShape SHAPE = Block.box(2, 2, 2, 14, 14, 14);
    @Deprecated
    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public boolean isPathfindable(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

    //Thanks GizmoTheMoonPig
    @Override
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }

    @Override
    public float getShadeBrightness(BlockState p_220080_1_, IBlockReader p_220080_2_, BlockPos p_220080_3_) {
        return 1.0F;
    }

    @Deprecated
    @Override
    public boolean skipRendering(BlockState p_200122_1_, BlockState p_200122_2_, Direction p_200122_3_) {
        return p_200122_2_.is(this) ? true : super.skipRendering(p_200122_1_, p_200122_2_, p_200122_3_);
    }

    @Nullable
    @Override
    public PathNodeType getAiPathNodeType(BlockState state, IBlockReader world, BlockPos pos, @Nullable MobEntity entity) {
        return PathNodeType.STICKY_HONEY;
    }



    @Override
    public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        entityIn.causeFallDamage(fallDistance, 0.5F);
    }

    @Override
    public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isClientSide() && !entityIn.isSuppressingBounce() && entityIn instanceof LivingEntity) {
            Vector3d entityPosition = entityIn.getPosition(1.0F);
            //Vector3d direction = entityPosition.subtract(pos.getX() + 0.5f, pos.getY(), pos.getZ() + 0.5f);
            double velocity = entityPosition.subtract(entityIn.xo, entityIn.yo, entityIn.zo).length() * 0.95;
            // determine whether we bounce in the X or the Z direction, we want whichever is bigger
            //Vector3d motion = entityIn.getDeltaMovement();
            if (velocity >= 0.4) {
                worldIn.destroyBlock(pos,false);
                //entityIn.setDeltaMovement(new Vector3d(direction.x * 0.8, motion.y * 0.8, motion.z * 0.8));
            }
        }
    }
}

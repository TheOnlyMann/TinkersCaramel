package com.theonlymann.tinkerscaramel.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import slimeknights.tconstruct.shared.block.ClearGlassPaneBlock;

import javax.annotation.Nullable;

public class SugarGlassPaneBlock extends ClearGlassPaneBlock {
    public SugarGlassPaneBlock(Properties properties){
        super(properties);
    }


    @Override
    public boolean isPathfindable(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

    //Thanks GizmoTheMoonPig
    /*
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


     */


    @Override
    public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        entityIn.causeFallDamage(fallDistance, 0.2F);
        if (!worldIn.isClientSide() && !entityIn.isSuppressingBounce() && entityIn instanceof LivingEntity && fallDistance>1.2F){
            worldIn.destroyBlock(pos,true);
        }
    }

    @Override
    public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (true) {//!worldIn.isClientSide() && !entityIn.isCrouching() && entityIn.isColliding(pos,state)
            Vector3d entityPosition = entityIn.getPosition(1.0F);
            //Vector3d direction = entityPosition.subtract(pos.getX() + 0.5f, pos.getY(), pos.getZ() + 0.5f);
            double velocity = entityPosition.subtract(entityIn.xo, entityPosition.y, entityIn.zo).length() * 0.95;//only seeing horizantal directional movements
            // determine whether we bounce in the X or the Z direction, we want whichever is bigger
            //Vector3d motion = entityIn.getDeltaMovement();
            double range = entityPosition.subtract(pos.getX()+0.5, entityPosition.y, pos.getZ()+0.5).length();
            boolean foundrange = (-0.3<(entityPosition.x-pos.getX()-0.5)&&(entityPosition.x-pos.getX()-0.5)<0.3)&&(-0.3<(entityPosition.z-pos.getZ()-0.5)&&(entityPosition.z-pos.getZ()-0.5)<0.3);
            if (range <0.61&& velocity >= 0.225) {
                worldIn.destroyBlock(pos,true);
                //entityIn.setDeltaMovement(new Vector3d(direction.x * 0.8, motion.y * 0.8, motion.z * 0.8));
            }
        }
    }
}

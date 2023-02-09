package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class ShoalFishBaseAI extends EntityAIBase {
    private final EntityPrehistoricFloraFishBase entity;
    private final double speed;
    private final boolean memory;
    private Path currentPath;
    private Random rand = new Random();

    public ShoalFishBaseAI(EntityPrehistoricFloraFishBase entity, double speed, boolean memory) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.setMutexBits(7);
    }

    @Override
    public boolean shouldExecute() {
        EntityPrehistoricFloraFishBase target = this.entity.getShoalLeader();
        if (target == null || !target.isEntityAlive()) {
            return false;
        }
        if (target == this.entity) {
            return false;
        }
        this.currentPath = this.entity.getNavigator().getPathToEntityLiving(target);
        return this.currentPath != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        EntityLivingBase entity = this.entity.getShoalLeader();
        if (rand.nextInt(24) == 0) {
            return false;
        }
        return entity != null && (entity.isEntityAlive() && (!this.memory ? !this.entity.getNavigator().noPath() : this.entity.isWithinHomeDistanceFromPosition(entity.getPosition())));
    }

    @Override
    public void startExecuting() {
        if (this.entity.getControllingPassenger() == null) {
            this.entity.getNavigator().setPath(this.currentPath, this.speed);
        }
    }

    @Override
    public void resetTask() {
        this.entity.getNavigator().clearPath();
    }

    @Override
    public void updateTask() {
        EntityLivingBase target = this.entity.getShoalLeader();
        if (target == null) {
            return;
        }
        if (this.entity.getControllingPassenger() == null) {
            if (rand.nextInt(8) == 0) {
                BlockPos targetPos = getOffsetTarget(this.entity.world, target.getPositionVector());
                if (targetPos != null) {
                    this.entity.getNavigator().tryMoveToXYZ(targetPos.getX() + 0.5, targetPos.getY() + 0.5, targetPos.getZ() + 0.5, 1);
                    return;
                }
            }
            this.entity.getNavigator().tryMoveToEntityLiving(target, this.speed);
        }
    }

    @Nullable
    public BlockPos getOffsetTarget(World world, Vec3d vec3d) {
        BlockPos blockpos = new BlockPos(vec3d);
        blockpos = blockpos.add(rand.nextInt(3) - 1, rand.nextInt(3) - 1, rand.nextInt(3) - 1);
        if (world.getBlockState(blockpos).getMaterial() == Material.WATER && this.entity.isDirectPathBetweenPoints(this.entity.getPositionVector(), new Vec3d(blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5))) {
            return blockpos;
        }
        return null;
    }
}
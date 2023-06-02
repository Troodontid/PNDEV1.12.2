
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEurypteridEggsCiurcopterus;
import net.lepidodendron.block.BlockEurypteridEggsPterygotus;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.render.entity.RenderCiurcopterus;
import net.lepidodendron.entity.render.entity.RenderGyrodus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.item.ItemFishFood;
import net.lepidodendron.item.entities.ItemNautiloidEggsProteroctopus;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraCiurcopterus extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraCiurcopterus(World world) {
		super(world);
		setSize(0.5F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.2F;
		maxHealthAgeable = 12.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int swimTransitionLength() {
		return 20;
	}

	@Override
	public int unswimTransitionLength() {
		return 20;
	}

	@Override
	public int swimLength() {
		return 1500;
	}

	@Override
	public int walkLength() {
		return 1000;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Silurian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	@Override
	protected double getAISpeedSwim() {
		if (!this.isReallySwimming()) {
			return 0.15f;
		} else {
			return 0.3f;
		}
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(2, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishItemsAI(this));
		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteBottomBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteSwimBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
				(OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), stack))
				//	|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
		);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying()) && this.getTicks() > 0
				&& (BlockEurypteridEggsCiurcopterus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP)
				|| BlockEurypteridEggsCiurcopterus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP))
				&& (BlockEurypteridEggsCiurcopterus.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockEurypteridEggsCiurcopterus.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			//if (Math.random() > 0.5) {
			this.setTicks(-50); //Flag this as stationary for egg-laying
			//}
		}

		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getTicks() > -30 && this.getTicks() < 0) {
			//Is stationary for egg-laying:
			//System.err.println("Test2");
			IBlockState eggs = BlockEurypteridEggsCiurcopterus.block.getDefaultState();
			if (BlockEurypteridEggsCiurcopterus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP) && BlockEurypteridEggsCiurcopterus.block.canPlaceBlockAt(world, this.getPosition())) {
				world.setBlockState(this.getPosition(), eggs);
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockEurypteridEggsCiurcopterus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP) && BlockEurypteridEggsCiurcopterus.block.canPlaceBlockAt(world, this.getPosition().down())) {
				world.setBlockState(this.getPosition().down(), eggs);
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.CIURCOPTERUS_LOOT_YOUNG;
		}
		return LepidodendronMod.CIURCOPTERUS_LOOT;
	}
	public static double offsetWall(@Nullable String variant) {
		return -0.7;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 4.0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return -0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.99F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return -1.9;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 4.99F;}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.38;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.8F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderCiurcopterus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelCiurcopterus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderCiurcopterus.getScaler();
	}
}

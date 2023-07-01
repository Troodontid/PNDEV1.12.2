
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.EntityLookIdleAI;
import net.lepidodendron.entity.ai.LandEntitySwimmingAI;
import net.lepidodendron.entity.ai.LandWanderAvoidWaterAI;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;


public class EntityPrehistoricFloraTitanopteraNymph extends EntityPrehistoricFloraLandBase {

	private static final float[] CLATROTITAN_SIZE = new float[]{0.3F, 0.3F};
	private static final float[] GIGATITAN_SIZE = new float[]{0.3F, 0.3F};
	private static final float[] MESOTITAN_SIZE = new float[]{0.3F, 0.3F};

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraTitanopteraNymph.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraTitanopteraNymph(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
		minWidth = 0.1F;
		maxWidth = getHitBoxSize()[0];
		maxHeight = getHitBoxSize()[1];
		maxHealthAgeable = 2.0D;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (OreDictionary.containsMatch(false, OreDictionary.getOres("itemMoss"), stack));
	}

	//*****************************************************
	//Insect variant managers:

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		CLATROTITAN(1, "clatrotitan"),
		GIGATITAN(2, "gigatitan"),
		MESOTITAN(3, "mesotitan")
		;

		private final String name;
		private final int metadata;

		Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityPrehistoricFloraTitanopteraNymph.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraTitanopteraNymph.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < values().length; ++i)
			{
				if (values()[i].getName().equals(nameIn))
				{
					return values()[i];
				}
			}

			return values()[0];
		}

	}

	public ResourceLocation getFreezeLoot() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return LepidodendronMod.TITANOPTERA_NYMPH_LOOT;

			case GIGATITAN:
				return LepidodendronMod.TITANOPTERA_NYMPH_LOOT;

			case MESOTITAN:
				return LepidodendronMod.TITANOPTERA_NYMPH_LOOT;
		}
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return LepidodendronMod.BUG_LOOT;

			case GIGATITAN:
				return LepidodendronMod.BUG_LOOT;

			case MESOTITAN:
				return LepidodendronMod.BUG_LOOT;

		}
	}

//	public float getFlySpeed() {
//		switch (this.getPNType()) {
//			case DELITZSCHALA: default:
//				return 3f;
//
//			case DUNBARIA:
//				return 3f;
//
//			case HOMALONEURA:
//				return 3f;
//
//			case HOMOIOPTERA:
//				return 3f;
//
//			case LITHOMANTIS:
//				return 3f;
//
//			case LYCOCERCUS:
//				return 3f;
//
//			case SINODUNBARIA:
//				return 3f;
//
//			case STENODICTYA:
//				return 3f;
//
//			case MAZOTHAIROS:
//				return 3f;
//		}
//	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return CLATROTITAN_SIZE;

			case GIGATITAN:
				return GIGATITAN_SIZE;

			case MESOTITAN:
				return MESOTITAN_SIZE;

		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			ResourceLocation resourcelocation = getFreezeLoot();
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", this.getPNType().getName());
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(INSECT_TYPE, 0);
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_palaeodictyoptera_nymph_" + this.getPNType().getName() + ".name");
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraTitanopteraNymph.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(EntityPrehistoricFloraTitanopteraNymph.Type type)
	{
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraTitanopteraNymph.Type getPNType()
	{
		return EntityPrehistoricFloraTitanopteraNymph.Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	//*****************************************************


	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	@Override //Spawn as baby so it grows:
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setAgeTicks(0);
		this.heal(this.getMaxHealth());
		this.setNoAI(false);
		return livingdata;
	}

	@Override
	public int getAdultAge() {
		return 32000;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public float getAISpeedLand() {
		return 0.36f;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(1, new LandWanderAvoidWaterAI(this, 1.0D));
		tasks.addTask(2, new EntityLookIdleAI(this));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(0.8D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		Entity entity = null;
		if (this.getAgeScale() >= 0.99)
		{
			if (!(world.isRemote)) {
				BlockPos pos = this.getPosition();

				entity = ItemMonsterPlacer.spawnCreature(this.getEntityWorld(), EntityList.getKey(EntityPrehistoricFloraTitanoptera.class), (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);

				if (entity != null) {
					if (entity instanceof EntityPrehistoricFloraTitanoptera) {
						((EntityPrehistoricFloraTitanoptera) entity).setPNType(EntityPrehistoricFloraTitanoptera.Type.getTypeFromString(this.getPNType().getName()));
					}
					this.setDead();
					if (world instanceof WorldServer) {
						((WorldServer) world).playSound(null, pos.up(), SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 0.5F, 2.6F + (rand.nextFloat() - rand.nextFloat()) * 0.8F);
						for (int k = 0; k < 8; ++k) {
							((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (double) pos.getX() + Math.random(), (double) pos.getY() + Math.random(), (double) pos.getZ() + Math.random() + Math.random(), (int) 1, 0.5, 0.5, 0.5, 0.1, new int[0]);
						}
					}
				}
			}
		}
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return false;
	}

}

package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.SeedSporeLeavesBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockQuasistrobus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:quasistrobus")
	public static final Block block = null;
	public BlockQuasistrobus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.quasistrobus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("quasistrobus"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:quasistrobus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:quasistrobus", BlockQuasistrobus.block);
		OreDictionary.registerOre("plantPrehistoric", BlockQuasistrobus.block);
		OreDictionary.registerOre("plant", BlockQuasistrobus.block);
	}


	public static class BlockCustom extends SeedSporeLeavesBase {
		public BlockCustom() {
			super();
			setTranslationKey("pf_quasistrobus");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false));
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{CHECK_DECAY, DECAYABLE});
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockQuasistrobus.block, (int) (1)));
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(DECAYABLE, (meta & 1) != 0).withProperty(CHECK_DECAY, (meta & 2) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(DECAYABLE))
				i |= 1;
			if ((Boolean) state.getValue(CHECK_DECAY))
				i |= 2;
			return i;
		}

		@SideOnly(Side.CLIENT)
		@Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
		
		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockQuasistrobus.block, (int) (1));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 1;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockQuasistrobus.block);
			}
		}

		public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        	return false;
    	}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

	    @Override
        public ItemStack getSilkTouchDrop(IBlockState state)  {
            return new ItemStack(BlockQuasistrobus.block, (int) (1));
        }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			
			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
				if (Math.random() > 0.66) {
					if (!world.isRemote) {
						EntityItem entityToSpawn;
						if (!LepidodendronConfig.doPropagation) {
							entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockQuasistrobus.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
			
			Block block = world.getBlockState(pos.up()).getBlock();
			if (block != BlockQuasistrobusCentre.block) {
				world.setBlockToAir(pos);
				
				if (Math.random() > 0.66) {
					if (!world.isRemote) {
						EntityItem entityToSpawn;
						if (!LepidodendronConfig.doPropagation) {
							entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockQuasistrobus.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
		}
		
		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
	        return (
	        	(super.canPlaceBlockAt(worldIn, pos) && worldIn.isAirBlock(pos.up()) && worldIn.isAirBlock(pos.up(2)))

	        	&& (super.canPlaceBlockAt(worldIn, pos.north()) && worldIn.isAirBlock(pos.north().up()) && worldIn.isAirBlock(pos.north().up(2)))
	        	&& (super.canPlaceBlockAt(worldIn, pos.south()) && worldIn.isAirBlock(pos.south().up()) && worldIn.isAirBlock(pos.south().up(2)))
	        	&& (super.canPlaceBlockAt(worldIn, pos.east()) && worldIn.isAirBlock(pos.east().up()) && worldIn.isAirBlock(pos.east().up(2)))
	        	&& (super.canPlaceBlockAt(worldIn, pos.west()) && worldIn.isAirBlock(pos.west().up()) && worldIn.isAirBlock(pos.west().up(2)))

	        	&& (super.canPlaceBlockAt(worldIn, pos.north().east()) && worldIn.isAirBlock(pos.north().east().up()) && worldIn.isAirBlock(pos.north().east().up(2)))
	        	&& (super.canPlaceBlockAt(worldIn, pos.north().west()) && worldIn.isAirBlock(pos.north().west().up()) && worldIn.isAirBlock(pos.north().west().up(2)))
				&& (super.canPlaceBlockAt(worldIn, pos.south().east()) && worldIn.isAirBlock(pos.south().east().up()) && worldIn.isAirBlock(pos.south().east().up(2)))
	        	&& (super.canPlaceBlockAt(worldIn, pos.south().west()) && worldIn.isAirBlock(pos.south().west().up()) && worldIn.isAirBlock(pos.south().west().up(2)))
	        	);
	    }

	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	
			world.setBlockState(pos.up(), BlockQuasistrobusCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2), BlockQuasistrobusTop.block.getDefaultState(), 3);

			world.setBlockState(pos.north(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.north().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.north().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.south(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.south().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.south().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.north().east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.north().east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.north().east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.south().east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.south().east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.south().east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.north().west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.north().west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.north().west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);

			world.setBlockState(pos.south().west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
			world.setBlockState(pos.south().west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
			world.setBlockState(pos.south().west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
			
			super.onBlockAdded(world, pos, state);
	    }
	    
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Seed-Plant shrub");
	        tooltip.add("Periods: Permian");
	        tooltip.add("Propagation: seeds");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

		@Override
		public Block planted() {
			return BlockQuasistrobus.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}

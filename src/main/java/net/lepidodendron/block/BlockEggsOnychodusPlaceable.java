
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraOnychodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockEggsOnychodusPlaceable extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_onychodus")
	public static final Block block = null;
	public BlockEggsOnychodusPlaceable(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_onychodus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("eggs_onychodus"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:entities/eggs_onychodus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockEggsOnychodusPlaceable.BlockCustom.LEVEL).build());
	}
	
	public static class BlockCustom extends BlockMobSpawn {
		public BlockCustom() {
			setTranslationKey("pf_eggs_onychodus");
			this.setTickRandomly(true);
			setCreativeTab(null);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockEggsOnychodusPlaceable.block, (int) (1));
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (!(worldIn.isRemote)) {
				EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraOnychodus.class).toString(), "{AgeTicks:0}", (double)pos.getX() , (double)pos.getY(), (double)pos.getZ());
			}
			worldIn.destroyBlock(pos, false);
		}

		/*@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: " + EntityPrehistoricFloraOnychodus.getHabitat() + " Carnivorous Lobe-finned fish");
				tooltip.add("Periods: " + EntityPrehistoricFloraOnychodus.getPeriod());
				super.addInformation(stack, player, tooltip, advanced);
			}
		}*/
	}
}

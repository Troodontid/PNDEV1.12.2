
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockDicroidiumFLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dicroidium_f_leaves")
	public static final Block block = null;
	public BlockDicroidiumFLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dicroidium_fremouwensis_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dicroidium_f_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:dicroidium_f_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:dicroidium_f_sapling", BlockDicroidiumFLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockDicroidiumFLeaves.block);
		OreDictionary.registerOre("plant", BlockDicroidiumFLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockDicroidiumFLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_dicroidium_f_leaves");
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 20;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Drop air and use the seed method instead:
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockDicroidiumFSapling.block);
			}
		}

	}
}
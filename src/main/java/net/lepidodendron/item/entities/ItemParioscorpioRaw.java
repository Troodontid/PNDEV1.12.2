
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemParioscorpioRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:parioscorpio_raw")
	public static final Item block = null;
	public ItemParioscorpioRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.parioscorpio_raw);
	}
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_parioscorpio", ItemParioscorpioRaw.block);
		OreDictionary.registerOre("pnfurnaceCrustacean", ItemParioscorpioRaw.block);
		OreDictionary.registerOre("pndietCrustacean", ItemParioscorpioRaw.block);
	}
	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/parioscorpio_raw", "inventory"));
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(0,0,false);
			setTranslationKey("pf_parioscorpio_raw");
			setRegistryName("parioscorpio_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack stack)
		{
			return EnumAction.NONE;
		}

//		@Nullable
//		@Override
//		public String getMobStr() {
//			return "lepidodendron:prehistoric_flora_parioscorpio";
//		}

		@Nullable
		@Override
		public String getVariantStr() {
			return null;
		}
	}
}

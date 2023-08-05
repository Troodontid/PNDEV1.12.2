
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemArchocyrtusRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archocyrtus_raw")
	public static final Item block = null;
	public ItemArchocyrtusRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archocyrtus_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/archocyrtus_raw", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_archocyrtus", ItemArchocyrtusRaw.block);
		OreDictionary.registerOre("listAllmeatraw", ItemArchocyrtusRaw.block);
		OreDictionary.registerOre("foodMeat", ItemArchocyrtusRaw.block);
		OreDictionary.registerOre("listAllinsectraw", ItemArchocyrtusRaw.block);
		OreDictionary.registerOre("foodInsect", ItemArchocyrtusRaw.block);
		OreDictionary.registerOre("pndietBug", ItemArchocyrtusRaw.block);
	}
	public static class ItemFoodCustom extends ItemGlassCaseDisplayItem {
		public ItemFoodCustom() {
			super();
			setTranslationKey("pf_archocyrtus_raw");
			setRegistryName("archocyrtus_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		@Override
		public String getMobStr() {
			return "lepidodendron:archocyrtus";
		}

		@Nullable
		@Override
		public String getVariantStr() {
			return null;
		}
	}
}

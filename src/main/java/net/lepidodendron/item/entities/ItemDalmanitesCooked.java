
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemDalmanitesCooked extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dalmanites_cooked")
	public static final Item block = null;
	public ItemDalmanitesCooked(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dalmanites_cooked);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/dalmanites_cooked", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("listAllfishcooked", ItemDalmanitesCooked.block);
		OreDictionary.registerOre("foodCooked", ItemDalmanitesCooked.block);
		OreDictionary.registerOre("foodMeat", ItemDalmanitesCooked.block);
		OreDictionary.registerOre("listAllmeatcooked", ItemDalmanitesCooked.block);
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.7f, false);
			setTranslationKey("pf_dalmanites_cooked");
			setRegistryName("dalmanites_cooked");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

	}
}

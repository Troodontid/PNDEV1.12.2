
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
public class ItemFeroxichthysRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:feroxichthys_raw")
	public static final Item block = null;
	public ItemFeroxichthysRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.feroxichthys_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/feroxichthys_raw", "inventory"));
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("listAllfishcooked", ItemFeroxichthysCooked.block);
		OreDictionary.registerOre("foodCooked", ItemFeroxichthysCooked.block);
		OreDictionary.registerOre("foodMeat", ItemFeroxichthysCooked.block);
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_feroxichthys_raw");
			setRegistryName("feroxichthys_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}


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
public class ItemProfallotaspisCooked extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:profallotaspis_cooked")
	public static final Item block = null;
	public ItemProfallotaspisCooked(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.profallotaspis_cooked);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/profallotaspis_cooked", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("listAllfishcooked", ItemProfallotaspisCooked.block);
		OreDictionary.registerOre("foodCooked", ItemProfallotaspisCooked.block);
		OreDictionary.registerOre("foodMeat", ItemProfallotaspisCooked.block);
		OreDictionary.registerOre("listAllmeatcooked", ItemProfallotaspisCooked.block);
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.7f, false);
			setTranslationKey("pf_profallotaspis_cooked");
			setRegistryName("profallotaspis_cooked");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

	}
}


package net.mcreator.featuretest.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.featuretest.item.BattleborniconItem;
import net.mcreator.featuretest.FeatureTest01ModElements;

@FeatureTest01ModElements.ModElement.Tag
public class BattleBornItemGroup extends FeatureTest01ModElements.ModElement {
	public BattleBornItemGroup(FeatureTest01ModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbattle_born") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BattleborniconItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}


package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.featuretest.FeatureTest01ModElements;

@FeatureTest01ModElements.ModElement.Tag
public class BDSItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:bds")
	public static final Item block = null;
	public BDSItem(FeatureTest01ModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("bds"));
	}
}

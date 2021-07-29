
package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.featuretest.FeatureTest01ModElements;

@FeatureTest01ModElements.ModElement.Tag
public class Crystlized_gold_toolsShovelItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:crystlized_gold_tools_shovel")
	public static final Item block = null;
	public Crystlized_gold_toolsShovelItem(FeatureTest01ModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrystlizedgoldingotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("crystlized_gold_tools_shovel"));
	}
}

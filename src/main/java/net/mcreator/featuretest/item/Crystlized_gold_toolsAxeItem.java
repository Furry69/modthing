
package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class Crystlized_gold_toolsAxeItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:crystlized_gold_tools_axe")
	public static final Item block = null;

	public Crystlized_gold_toolsAxeItem(FeatureTest01ModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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

		}.setRegistryName("crystlized_gold_tools_axe"));
	}

}

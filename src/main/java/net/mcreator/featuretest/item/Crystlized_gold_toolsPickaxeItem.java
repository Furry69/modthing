
package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class Crystlized_gold_toolsPickaxeItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:crystlized_gold_tools_pickaxe")
	public static final Item block = null;

	public Crystlized_gold_toolsPickaxeItem(FeatureTest01ModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}

		}.setRegistryName("crystlized_gold_tools_pickaxe"));
	}

}

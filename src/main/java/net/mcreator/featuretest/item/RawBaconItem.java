
package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class RawBaconItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:raw_bacon")
	public static final Item block = null;

	public RawBaconItem(FeatureTest01ModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.3f)

							.meat().build()));
			setRegistryName("raw_bacon");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}

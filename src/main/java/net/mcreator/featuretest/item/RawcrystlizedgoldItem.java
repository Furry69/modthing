
package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class RawcrystlizedgoldItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:rawcrystlizedgold")
	public static final Item block = null;

	public RawcrystlizedgoldItem(FeatureTest01ModElements instance) {
		super(instance, 27);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rawcrystlizedgold");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}

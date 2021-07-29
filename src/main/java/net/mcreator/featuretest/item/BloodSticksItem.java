
package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class BloodSticksItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:blood_sticks")
	public static final Item block = null;

	public BloodSticksItem(FeatureTest01ModElements instance) {
		super(instance, 69);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("blood_sticks");
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

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				BloodSticksLivingEntityIsHitWithItemProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

	}

}


package net.mcreator.featuretest.item;

@FeatureTest01ModElements.ModElement.Tag
public class LeechonastickItem extends FeatureTest01ModElements.ModElement {

	@ObjectHolder("feature_test_01:leechonastick")
	public static final Item block = null;

	public LeechonastickItem(FeatureTest01ModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

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

					EridiumLivingEntityIsHitWithItemProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

		}.setRegistryName("leechonastick"));
	}

}

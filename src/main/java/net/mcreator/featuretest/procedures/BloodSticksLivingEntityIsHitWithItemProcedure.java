package net.mcreator.featuretest.procedures;

@FeatureTest01ModElements.ModElement.Tag
public class BloodSticksLivingEntityIsHitWithItemProcedure extends FeatureTest01ModElements.ModElement {

	public BloodSticksLivingEntityIsHitWithItemProcedure(FeatureTest01ModElements instance) {
		super(instance, 69);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure BloodSticksLivingEntityIsHitWithItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 200, (int) 2));

	}

}

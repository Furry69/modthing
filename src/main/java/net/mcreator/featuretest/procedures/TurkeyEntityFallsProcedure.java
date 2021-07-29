package net.mcreator.featuretest.procedures;

@FeatureTest01ModElements.ModElement.Tag
public class TurkeyEntityFallsProcedure extends FeatureTest01ModElements.ModElement {

	public TurkeyEntityFallsProcedure(FeatureTest01ModElements instance) {
		super(instance, 42);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure TurkeyEntityFalls!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 60, (int) 1, (false), (false)));

	}

}

package net.mcreator.featuretest.procedures;

@FeatureTest01ModElements.ModElement.Tag
public class ThrowableleechBulletHitsPlayerProcedure extends FeatureTest01ModElements.ModElement {

	public ThrowableleechBulletHitsPlayerProcedure(FeatureTest01ModElements instance) {
		super(instance, 69);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency sourceentity for procedure ThrowableleechBulletHitsPlayer!");
			return;
		}

		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 100, (int) 1));

	}

}

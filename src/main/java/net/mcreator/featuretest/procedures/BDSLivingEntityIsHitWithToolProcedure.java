package net.mcreator.featuretest.procedures;

@FeatureTest01ModElements.ModElement.Tag
public class BDSLivingEntityIsHitWithToolProcedure extends FeatureTest01ModElements.ModElement {

	public BDSLivingEntityIsHitWithToolProcedure(FeatureTest01ModElements instance) {
		super(instance, 32);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure BDSLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 40, (int) 5));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 40, (int) 2));

	}

}

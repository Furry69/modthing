package net.mcreator.featuretest.procedures;

@FeatureTest01ModElements.ModElement.Tag
public class RawBaconFoodEatenProcedure extends FeatureTest01ModElements.ModElement {

	public RawBaconFoodEatenProcedure(FeatureTest01ModElements instance) {
		super(instance, 48);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure RawBaconFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity.getPersistentData().getDouble("BaconMagic")) == 1)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 3)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 4)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) >= 4)) {
			entity.getPersistentData().putDouble("BaconMagic", 1);
		}
		entity.getPersistentData().putDouble("BaconMagic", ((entity.getPersistentData().getDouble("BaconMagic")) + Math.round(Math.random())));
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 1)) {
			entity.getPersistentData().putDouble("EffectCount", 200);
		} else {
			entity.getPersistentData().putDouble("EffectCount", ((entity.getPersistentData().getDouble("EffectCount")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 2)) {
			entity.getPersistentData().putDouble("EffectCount", 200);
		} else {
			entity.getPersistentData().putDouble("EffectCount", ((entity.getPersistentData().getDouble("EffectCount")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 3)) {
			entity.getPersistentData().putDouble("EffectCount", 200);
		} else {
			entity.getPersistentData().putDouble("EffectCount", ((entity.getPersistentData().getDouble("EffectCount")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 4)) {
			entity.getPersistentData().putDouble("EffectCount", 200);
		} else {
			entity.getPersistentData().putDouble("EffectCount", ((entity.getPersistentData().getDouble("EffectCount")) - 1));
		}
		if (((entity.getPersistentData().getDouble("EffectCount")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.NIGHT_VISION);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.WATER_BREATHING);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.LEVITATION);
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.HEALTH_BOOST);
			}
		}

	}

}

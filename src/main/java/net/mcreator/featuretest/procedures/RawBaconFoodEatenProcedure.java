package net.mcreator.featuretest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

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
			entity.getPersistentData().putDouble("EffectCount1", 201);
		} else {
			entity.getPersistentData().putDouble("EffectCount1", ((entity.getPersistentData().getDouble("EffectCount1")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 2)) {
			entity.getPersistentData().putDouble("EffectCount2", 201);
		} else {
			entity.getPersistentData().putDouble("EffectCount2", ((entity.getPersistentData().getDouble("EffectCount2")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 3)) {
			entity.getPersistentData().putDouble("EffectCount3", 201);
		} else {
			entity.getPersistentData().putDouble("EffectCount3", ((entity.getPersistentData().getDouble("EffectCount3")) - 1));
		}
		if (((entity.getPersistentData().getDouble("BaconMagic")) == 4)) {
			entity.getPersistentData().putDouble("EffectCount4", 201);
		} else {
			entity.getPersistentData().putDouble("EffectCount4", ((entity.getPersistentData().getDouble("EffectCount4")) - 1));
		}
		if (((entity.getPersistentData().getDouble("EffectCount1")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.NIGHT_VISION);
			}
		}
		if (((entity.getPersistentData().getDouble("EffectCount2")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.WATER_BREATHING);
			}
		}
		if (((entity.getPersistentData().getDouble("EffectCount3")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.LEVITATION);
			}
		}
		if (((entity.getPersistentData().getDouble("EffectCount4")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.HEALTH_BOOST);
			}
		}
	}
}

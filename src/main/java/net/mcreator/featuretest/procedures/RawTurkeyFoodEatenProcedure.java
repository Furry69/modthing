package net.mcreator.featuretest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class RawTurkeyFoodEatenProcedure extends FeatureTest01ModElements.ModElement {
	public RawTurkeyFoodEatenProcedure(FeatureTest01ModElements instance) {
		super(instance, 44);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure RawTurkeyFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("TurkeyHunger", ((entity.getPersistentData().getDouble("TurkeyHunger")) + 1));
		if (((entity.getPersistentData().getDouble("TurkeyHunger")) == 8)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 200, (int) 1));
		}
		if (((entity.getPersistentData().getDouble("TurkeyHunger")) == 8)) {
			entity.getPersistentData().putDouble("TurkeyHunger", 0);
		}
		if (((entity.getPersistentData().getDouble("TurkeyHunger")) == 8)) {
			entity.getPersistentData().putDouble("Hungercount", 200);
		} else {
			entity.getPersistentData().putDouble("Hungercount", ((entity.getPersistentData().getDouble("Hungercount")) - 1));
		}
		if (((entity.getPersistentData().getDouble("Hungercount")) == 0)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(Effects.HUNGER);
			}
		}
	}
}

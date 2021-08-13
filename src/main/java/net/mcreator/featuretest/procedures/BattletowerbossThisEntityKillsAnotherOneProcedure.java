package net.mcreator.featuretest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class BattletowerbossThisEntityKillsAnotherOneProcedure extends FeatureTest01ModElements.ModElement {
	public BattletowerbossThisEntityKillsAnotherOneProcedure(FeatureTest01ModElements instance) {
		super(instance, 110);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency sourceentity for procedure BattletowerbossThisEntityKillsAnotherOne!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 5));
	}
}

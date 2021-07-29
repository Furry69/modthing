package net.mcreator.featuretest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class EridiumeffectOnPotionActiveTickProcedure extends FeatureTest01ModElements.ModElement {
	public EridiumeffectOnPotionActiveTickProcedure(FeatureTest01ModElements instance) {
		super(instance, 41);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure EridiumeffectOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 1200, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 1200, (int) 5));
	}
}

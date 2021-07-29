package net.mcreator.featuretest.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class SplintereffectOnPotionActiveTickProcedure extends FeatureTest01ModElements.ModElement {
	public SplintereffectOnPotionActiveTickProcedure(FeatureTest01ModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure SplintereffectOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("splinter_dmg_timer")) == 0)) {
			entity.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, (float) 1);
		}
		if (((entity.getPersistentData().getDouble("splinter_dmg_timer")) == 0)) {
			entity.getPersistentData().putDouble("splinter_dmg_timer", 60);
		} else {
			entity.getPersistentData().putDouble("splinter_dmg_timer", ((entity.getPersistentData().getDouble("splinter_dmg_timer")) - 1));
		}
	}
}

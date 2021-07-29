package net.mcreator.featuretest.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class EnrichedironthrowableRangedItemUsedProcedure extends FeatureTest01ModElements.ModElement {
	public EnrichedironthrowableRangedItemUsedProcedure(FeatureTest01ModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency itemstack for procedure EnrichedironthrowableRangedItemUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).shrink((int) 1);
	}
}

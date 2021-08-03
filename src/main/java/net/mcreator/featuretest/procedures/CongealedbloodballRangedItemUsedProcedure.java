package net.mcreator.featuretest.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;

@FeatureTest01ModElements.ModElement.Tag
public class CongealedbloodballRangedItemUsedProcedure extends FeatureTest01ModElements.ModElement {
	public CongealedbloodballRangedItemUsedProcedure(FeatureTest01ModElements instance) {
		super(instance, 98);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency itemstack for procedure CongealedbloodballRangedItemUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).shrink((int) 1);
	}
}

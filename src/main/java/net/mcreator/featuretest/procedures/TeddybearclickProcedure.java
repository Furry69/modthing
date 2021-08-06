package net.mcreator.featuretest.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModVariables;
import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Random;
import java.util.Map;
import java.util.Collections;

@FeatureTest01ModElements.ModElement.Tag
public class TeddybearclickProcedure extends FeatureTest01ModElements.ModElement {
	public TeddybearclickProcedure(FeatureTest01ModElements instance) {
		super(instance, 104);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure Teddybearclick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency itemstack for procedure Teddybearclick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency x for procedure Teddybearclick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency y for procedure Teddybearclick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency z for procedure Teddybearclick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency world for procedure Teddybearclick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((FeatureTest01ModVariables.WorldVariables.get(world).Spawnx),
					(FeatureTest01ModVariables.WorldVariables.get(world).Spawny), (FeatureTest01ModVariables.WorldVariables.get(world).Spawnz));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((FeatureTest01ModVariables.WorldVariables.get(world).Spawnx),
						(FeatureTest01ModVariables.WorldVariables.get(world).Spawny), (FeatureTest01ModVariables.WorldVariables.get(world).Spawnz),
						_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}

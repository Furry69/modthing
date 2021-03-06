package net.mcreator.featuretest.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;
import java.util.Collections;

@FeatureTest01ModElements.ModElement.Tag
public class OrderCrystalEntityCollidesInTheBlockProcedure extends FeatureTest01ModElements.ModElement {
	public OrderCrystalEntityCollidesInTheBlockProcedure(FeatureTest01ModElements instance) {
		super(instance, 80);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency entity for procedure OrderCrystalEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency x for procedure OrderCrystalEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency y for procedure OrderCrystalEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency z for procedure OrderCrystalEntityCollidesInTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency world for procedure OrderCrystalEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("teleportlocation", ((entity.getPersistentData().getDouble("teleportlocation")) + 1));
		if (((entity.getPersistentData().getDouble("teleportlocation")) == 5)) {
			entity.getPersistentData().putDouble("teleportlocation", ((entity.getPersistentData().getDouble("teleportlocation")) - 4));
		}
		if (((entity.getPersistentData().getDouble("teleportlocation")) == 1)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10, false);
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x + 5), y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 5), y, z, _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		}
		if (((entity.getPersistentData().getDouble("teleportlocation")) == 2)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10, false);
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(x, y, (z + 5));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + 5), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		}
		if (((entity.getPersistentData().getDouble("teleportlocation")) == 3)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10, false);
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x - 5), y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 5), y, z, _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		}
		if (((entity.getPersistentData().getDouble("teleportlocation")) == 4)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
						SoundCategory.NEUTRAL, (float) 10, (float) 10, false);
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(x, y, (z - 5));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - 5), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		}
	}
}

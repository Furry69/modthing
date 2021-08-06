package net.mcreator.featuretest.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.storage.ISpawnWorldInfo;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.featuretest.FeatureTest01ModVariables;
import net.mcreator.featuretest.FeatureTest01ModElements;
import net.mcreator.featuretest.FeatureTest01Mod;

import java.util.Map;
import java.util.HashMap;

@FeatureTest01ModElements.ModElement.Tag
public class TeddysavedataProcedure extends FeatureTest01ModElements.ModElement {
	public TeddysavedataProcedure(FeatureTest01ModElements instance) {
		super(instance, 103);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency x for procedure Teddysavedata!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency y for procedure Teddysavedata!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency z for procedure Teddysavedata!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FeatureTest01Mod.LOGGER.warn("Failed to load dependency world for procedure Teddysavedata!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		FeatureTest01ModVariables.WorldVariables.get(world).Spawnx = (double) x;
		FeatureTest01ModVariables.WorldVariables.get(world).syncData(world);
		FeatureTest01ModVariables.WorldVariables.get(world).Spawny = (double) y;
		FeatureTest01ModVariables.WorldVariables.get(world).syncData(world);
		FeatureTest01ModVariables.WorldVariables.get(world).Spawnz = (double) z;
		FeatureTest01ModVariables.WorldVariables.get(world).syncData(world);
		if (world.getWorldInfo() instanceof ISpawnWorldInfo)
			((ISpawnWorldInfo) world.getWorldInfo()).setSpawn(new BlockPos((int) (FeatureTest01ModVariables.WorldVariables.get(world).Spawnx),
					(int) (FeatureTest01ModVariables.WorldVariables.get(world).Spawny),
					(int) (FeatureTest01ModVariables.WorldVariables.get(world).Spawnz)), 0);
	}

	@SubscribeEvent
	public void onPlayerInBed(PlayerSleepInBedEvent event) {
		PlayerEntity entity = event.getPlayer();
		double i = event.getPos().getX();
		double j = event.getPos().getY();
		double k = event.getPos().getZ();
		World world = entity.world;
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}

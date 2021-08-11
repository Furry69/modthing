
package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.featuretest.procedures.PerceptionfilterItemInInventoryTickProcedure;
import net.mcreator.featuretest.itemgroup.BattleBornItemGroup;
import net.mcreator.featuretest.FeatureTest01ModElements;

import java.util.Map;
import java.util.HashMap;

@FeatureTest01ModElements.ModElement.Tag
public class PerceptionfilterItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:perceptionfilter")
	public static final Item block = null;
	public PerceptionfilterItem(FeatureTest01ModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BattleBornItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("perceptionfilter");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				PerceptionfilterItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}


package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.featuretest.procedures.FriedbloodFoodEatenProcedure;
import net.mcreator.featuretest.itemgroup.BattleBornItemGroup;
import net.mcreator.featuretest.FeatureTest01ModElements;

import java.util.Map;
import java.util.HashMap;

@FeatureTest01ModElements.ModElement.Tag
public class FriedbloodItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:friedblood")
	public static final Item block = null;
	public FriedbloodItem(FeatureTest01ModElements instance) {
		super(instance, 99);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(BattleBornItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(1f).setAlwaysEdible().build()));
			setRegistryName("friedblood");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				FriedbloodFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}

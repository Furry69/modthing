
package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.featuretest.procedures.TeddybearclickProcedure;
import net.mcreator.featuretest.itemgroup.BattleBornItemGroup;
import net.mcreator.featuretest.FeatureTest01ModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@FeatureTest01ModElements.ModElement.Tag
public class TeddybearItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:teddybear")
	public static final Item block = null;
	public TeddybearItem(FeatureTest01ModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BattleBornItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("teddybear");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 10;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\"no place like home\""));
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				TeddybearclickProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}

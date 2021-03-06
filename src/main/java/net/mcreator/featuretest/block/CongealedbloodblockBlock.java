
package net.mcreator.featuretest.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.featuretest.itemgroup.BattleBornItemGroup;
import net.mcreator.featuretest.FeatureTest01ModElements;

import java.util.List;
import java.util.Collections;

@FeatureTest01ModElements.ModElement.Tag
public class CongealedbloodblockBlock extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:congealedbloodblock")
	public static final Block block = null;
	public CongealedbloodblockBlock(FeatureTest01ModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BattleBornItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.SLIME).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("congealedbloodblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}


package net.mcreator.featuretest.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.featuretest.item.EridiumItem;
import net.mcreator.featuretest.FeatureTest01ModElements;

import java.util.List;
import java.util.Collections;

@FeatureTest01ModElements.ModElement.Tag
public class EridiumblockBlock extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:eridiumblock")
	public static final Block block = null;
	public EridiumblockBlock(FeatureTest01ModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public static final DirectionProperty FACING = DirectionalBlock.FACING;
		public CustomBlock() {
			super(Block.Properties.create(Material.PACKED_ICE).sound(SoundType.NETHER_GOLD).hardnessAndResistance(1f, 10f).setLightLevel(s -> 10)
					.harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));
			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
			setRegistryName("eridiumblock");
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			;
			return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
		}

		@Override
		public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
			return 1f;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(EridiumItem.block, (int) (9)));
		}
	}
}

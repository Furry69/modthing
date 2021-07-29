
package net.mcreator.featuretest.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.featuretest.FeatureTest01ModElements;

@FeatureTest01ModElements.ModElement.Tag
public class UnstableenrichedironarmorItem extends FeatureTest01ModElements.ModElement {
	@ObjectHolder("feature_test_01:unstableenrichedironarmor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("feature_test_01:unstableenrichedironarmor_chestplate")
	public static final Item body = null;
	@ObjectHolder("feature_test_01:unstableenrichedironarmor_leggings")
	public static final Item legs = null;
	@ObjectHolder("feature_test_01:unstableenrichedironarmor_boots")
	public static final Item boots = null;
	public UnstableenrichedironarmorItem(FeatureTest01ModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 12;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 20;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrystlizedgoldingotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "unstableenrichedironarmor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "feature_test_01:textures/models/armor/unstable_enriched_armor_img_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("unstableenrichedironarmor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "feature_test_01:textures/models/armor/unstable_enriched_armor_img_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("unstableenrichedironarmor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "feature_test_01:textures/models/armor/unstable_enriched_armor_img_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("unstableenrichedironarmor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "feature_test_01:textures/models/armor/unstable_enriched_armor_img_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}
		}.setRegistryName("unstableenrichedironarmor_boots"));
	}
}

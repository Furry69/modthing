package net.mcreator.featuretest.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.featuretest.entity.HellHoundEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HellHoundRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HellHoundEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("feature_test_01:textures/hellhound.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_rotation;
		private final ModelRenderer mane;
		private final ModelRenderer mane_rotation;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, 13.5F, -7.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(0.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 14).addBox(-4.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 10).addBox(-2.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 2.0F);
			body_rotation = new ModelRenderer(this);
			body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_rotation);
			setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
			body_rotation.setTextureOffset(18, 14).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			mane = new ModelRenderer(this);
			mane.setRotationPoint(1.0F, 14.0F, 2.0F);
			mane_rotation = new ModelRenderer(this);
			mane_rotation.setRotationPoint(-1.0F, 2.5F, -2.5F);
			mane.addChild(mane_rotation);
			setRotationAngle(mane_rotation, 1.5708F, 0.0F, 0.0F);
			mane_rotation.setTextureOffset(21, 0).addBox(-4.0F, -5.5F, -0.5F, 8.0F, 6.0F, 7.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(2.5F, 16.0F, 7.0F);
			leg1.setTextureOffset(0, 18).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-0.5F, 16.0F, 7.0F);
			leg2.setTextureOffset(0, 18).addBox(1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(2.5F, 16.0F, -4.0F);
			leg3.setTextureOffset(0, 18).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-0.5F, 16.0F, -4.0F);
			leg4.setTextureOffset(0, 18).addBox(1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(1.0F, 12.0F, 10.0F);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(-1.0F, 12.0F, -10.0F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, 2.5744F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(9, 18).addBox(-1.0F, 12.0F, -3.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			mane.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			leg4.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}

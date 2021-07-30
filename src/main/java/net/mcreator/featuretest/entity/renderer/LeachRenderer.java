package net.mcreator.featuretest.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class LeachRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LeachEntity.entity,
					renderManager -> new MobRenderer(renderManager, new SilverfishModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("feature_test_01:textures/silverfish.png");
						}
					});

		}
	}

}

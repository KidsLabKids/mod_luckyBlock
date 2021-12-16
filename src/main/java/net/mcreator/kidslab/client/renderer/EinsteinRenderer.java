package net.mcreator.kidslab.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.kidslab.entity.EinsteinEntity;

public class EinsteinRenderer extends MobRenderer<EinsteinEntity, PigModel<EinsteinEntity>> {
	public EinsteinRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EinsteinEntity entity) {
		return new ResourceLocation("kidslab:textures/pig.png");
	}
}

package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.client.model.DeepCrawlerModel;
import com.peeko32213.unusualfishmod.common.entity.DeepCrawlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DeepCrawlerRenderer extends MobRenderer<DeepCrawlerEntity, DeepCrawlerModel<DeepCrawlerEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/deepcrawler.png");

	public DeepCrawlerRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new DeepCrawlerModel<>(renderManagerIn.bakeLayer(DeepCrawlerModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(DeepCrawlerEntity entity) {
		return TEXTURE;
	}

}

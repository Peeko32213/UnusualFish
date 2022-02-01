package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.renderer.model.BarbedSkateModel;
import com.peeko32213.unusualfishmod.common.entity.BarbedSkateEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BarbedSkateRenderer extends MobRenderer<BarbedSkateEntity, BarbedSkateModel<BarbedSkateEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/barbedskate.png");

	public BarbedSkateRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new BarbedSkateModel<>(renderManagerIn.bakeLayer(BarbedSkateModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(BarbedSkateEntity entity) {
		return TEXTURE;
	}

}

package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.client.renderer.model.SeaSpiderModel;

import com.peeko32213.unusualfishmod.common.entity.SeaSpiderEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SeaSpiderRenderer extends MobRenderer<SeaSpiderEntity, SeaSpiderModel<SeaSpiderEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/seaspider.png");

	public SeaSpiderRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new SeaSpiderModel<>(renderManagerIn.bakeLayer(SeaSpiderModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(SeaSpiderEntity entity) {
		return TEXTURE;
	}

}

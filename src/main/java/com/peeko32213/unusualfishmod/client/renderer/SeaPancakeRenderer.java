package com.peeko32213.unusualfishmod.client.renderer;



import com.peeko32213.unusualfishmod.client.renderer.model.SeaPancakeModel;
import com.peeko32213.unusualfishmod.common.entity.SeaPancakeEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SeaPancakeRenderer extends MobRenderer<SeaPancakeEntity, SeaPancakeModel<SeaPancakeEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/seapancake.png");

	public SeaPancakeRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new SeaPancakeModel<>(renderManagerIn.bakeLayer(SeaPancakeModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(SeaPancakeEntity entity) {
		return TEXTURE;
	}

}

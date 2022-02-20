package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.client.renderer.model.PorcupineLobsterModel;
import com.peeko32213.unusualfishmod.client.renderer.model.SeaSpiderModel;
import com.peeko32213.unusualfishmod.common.entity.PorcupineLobsterEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PorcupineLobsterRenderer extends MobRenderer<PorcupineLobsterEntity, PorcupineLobsterModel<PorcupineLobsterEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/porcupinelobster.png");

	public PorcupineLobsterRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new PorcupineLobsterModel<>(renderManagerIn.bakeLayer(PorcupineLobsterModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(PorcupineLobsterEntity entity) {
		return TEXTURE;
	}

}

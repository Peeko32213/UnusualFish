package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.TripleTwirlPlecoModel;
import com.peeko32213.unusualfishmod.common.entity.TripleTwirlPlecoEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TripleTwirlPlecoRenderer extends MobRenderer<TripleTwirlPlecoEntity, TripleTwirlPlecoModel<TripleTwirlPlecoEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/tripletwirlpleco.png");

	public TripleTwirlPlecoRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new TripleTwirlPlecoModel<>(renderManagerIn.bakeLayer(TripleTwirlPlecoModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(TripleTwirlPlecoEntity entity) {
		return TEXTURE;
	}

}

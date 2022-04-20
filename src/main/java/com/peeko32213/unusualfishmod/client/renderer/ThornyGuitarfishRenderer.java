package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.ThornyGuitarfishModel;
import com.peeko32213.unusualfishmod.common.entity.ThornyGuitarfishEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ThornyGuitarfishRenderer extends MobRenderer<ThornyGuitarfishEntity, ThornyGuitarfishModel<ThornyGuitarfishEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/thornyguitarfish.png");

	public ThornyGuitarfishRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new ThornyGuitarfishModel<>(renderManagerIn.bakeLayer(ThornyGuitarfishModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(ThornyGuitarfishEntity entity) {
		return TEXTURE;
	}

}

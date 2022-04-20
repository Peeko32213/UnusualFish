package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.MudPigModel;
import com.peeko32213.unusualfishmod.common.entity.MudPigEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MudPigRenderer extends MobRenderer<MudPigEntity, MudPigModel<MudPigEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/mudpig.png");

	public MudPigRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new MudPigModel<>(renderManagerIn.bakeLayer(MudPigModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(MudPigEntity entity) {
		return TEXTURE;
	}

}

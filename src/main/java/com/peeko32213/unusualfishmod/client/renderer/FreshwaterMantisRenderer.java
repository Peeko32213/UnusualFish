package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.renderer.model.BarbedSkateModel;
import com.peeko32213.unusualfishmod.client.renderer.model.FreshwaterMantisModel;
import com.peeko32213.unusualfishmod.common.entity.BarbedSkateEntity;
import com.peeko32213.unusualfishmod.common.entity.FreshwaterMantisEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FreshwaterMantisRenderer extends MobRenderer<FreshwaterMantisEntity, FreshwaterMantisModel<FreshwaterMantisEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/freshwatermantis.png");

	public FreshwaterMantisRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new FreshwaterMantisModel<>(renderManagerIn.bakeLayer(FreshwaterMantisModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(FreshwaterMantisEntity entity) {
		return TEXTURE;
	}

}

package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.HandyGouramiModel;
import com.peeko32213.unusualfishmod.common.entity.HandyGouramiEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class HandyGouramiRenderer<Type extends HandyGouramiEntity> 
		extends MobRenderer<Type, HandyGouramiModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/handygourami.png");

	public HandyGouramiRenderer(Context context) {
		super(context, new HandyGouramiModel<>(context.bakeLayer(HandyGouramiModel.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.SailorBarbModel;
import com.peeko32213.unusualfishmod.common.entity.SailorBarbEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class SailorBarbRenderer<Type extends SailorBarbEntity> extends MobRenderer<Type, SailorBarbModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/sailorbarb.png");

	public SailorBarbRenderer(Context context) {
		super(context, new SailorBarbModel<>(context.bakeLayer(SailorBarbModel.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}
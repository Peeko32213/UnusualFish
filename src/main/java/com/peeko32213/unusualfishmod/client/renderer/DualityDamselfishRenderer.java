package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.DualityDamselfishModel;
import com.peeko32213.unusualfishmod.common.entity.DualityDamselfishEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DualityDamselfishRenderer<Type extends DualityDamselfishEntity>
		extends MobRenderer<Type, DualityDamselfishModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/dualitydamsel.png");

	public DualityDamselfishRenderer(Context context) {
		super(context, new DualityDamselfishModel<>(context.bakeLayer(DualityDamselfishModel.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

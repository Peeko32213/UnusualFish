package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.SailorBarbModel;
import com.peeko32213.unusualfishmod.client.renderer.model.SeaSpiderModel;
import com.peeko32213.unusualfishmod.common.entity.SailorBarbEntity;
import com.peeko32213.unusualfishmod.common.entity.SeaSpiderEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class SeaSpiderRenderer<Type extends SeaSpiderEntity> extends MobRenderer<Type, SeaSpiderModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/seaspider.png");

	public SeaSpiderRenderer(Context context) {
		super(context, new SeaSpiderModel<>(context.bakeLayer(SeaSpiderModel.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

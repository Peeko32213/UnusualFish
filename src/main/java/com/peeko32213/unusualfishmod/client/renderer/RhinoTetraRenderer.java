package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.RhinoTetraModel;
import com.peeko32213.unusualfishmod.common.entity.RhinoTetraEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class RhinoTetraRenderer<Type extends RhinoTetraEntity> extends MobRenderer<Type, RhinoTetraModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/rhinotetra.png");

	public RhinoTetraRenderer(Context context) {
		super(context, new RhinoTetraModel<>(context.bakeLayer(RhinoTetraModel.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

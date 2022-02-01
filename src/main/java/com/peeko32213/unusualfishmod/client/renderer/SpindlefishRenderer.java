package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.SpindlefishModel;
import com.peeko32213.unusualfishmod.common.entity.SpindlefishEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class SpindlefishRenderer<Type extends SpindlefishEntity> extends MobRenderer<Type,SpindlefishModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,"textures/entities/spindlefish.png");
	
	public SpindlefishRenderer(Context context) {
		super(context, new SpindlefishModel<>(context.bakeLayer(SpindlefishModel.LAYER_LOCATION)), 0.4f);
	
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		
		return TEXTURE;
	}

	
	
}
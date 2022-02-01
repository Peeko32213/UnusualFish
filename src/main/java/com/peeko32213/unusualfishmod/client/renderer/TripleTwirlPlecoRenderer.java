package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.TripleTwirlPlecoModel;
import com.peeko32213.unusualfishmod.common.entity.TripleTwirlPlecoEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class TripleTwirlPlecoRenderer<Type extends TripleTwirlPlecoEntity> extends MobRenderer<Type,TripleTwirlPlecoModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,"textures/entities/tripletwirlpleco.png");
	
	public TripleTwirlPlecoRenderer(Context context) {
		super(context, new TripleTwirlPlecoModel<>(context.bakeLayer(TripleTwirlPlecoModel.LAYER_LOCATION)), 0.4f);
	
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		
		return TEXTURE;
	}

	
	
}

package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.MossthornModel;
import com.peeko32213.unusualfishmod.common.entity.MossthornEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class MossthornRenderer<Type extends MossthornEntity> 
		extends MobRenderer<Type, MossthornModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/mossthorn.png");

	public MossthornRenderer(Context context) {
		super(context, new MossthornModel<>(context.bakeLayer(MossthornModel.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

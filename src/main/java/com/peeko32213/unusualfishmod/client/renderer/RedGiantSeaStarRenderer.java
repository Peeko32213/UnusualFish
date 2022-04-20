package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.RedGiantSeaStarModel;
import com.peeko32213.unusualfishmod.common.entity.RedGiantSeaStarEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RedGiantSeaStarRenderer extends MobRenderer<RedGiantSeaStarEntity, RedGiantSeaStarModel<RedGiantSeaStarEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/redgiantseastar.png");

	public RedGiantSeaStarRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new RedGiantSeaStarModel<>(renderManagerIn.bakeLayer(RedGiantSeaStarModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(RedGiantSeaStarEntity entity) {
		return TEXTURE;
	}

}

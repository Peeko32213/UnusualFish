package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.WhiskeredWhaleSharkModel;
import com.peeko32213.unusualfishmod.common.entity.WhiskeredWhaleSharkEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WhiskeredWhaleSharkRenderer extends MobRenderer<WhiskeredWhaleSharkEntity, WhiskeredWhaleSharkModel<WhiskeredWhaleSharkEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/whiskeredwhaleshark.png");

	public WhiskeredWhaleSharkRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new WhiskeredWhaleSharkModel<>(renderManagerIn.bakeLayer(WhiskeredWhaleSharkModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(WhiskeredWhaleSharkEntity entity) {
		return TEXTURE;
	}

}

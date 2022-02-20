package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.renderer.model.BrickSnailModel;
import com.peeko32213.unusualfishmod.common.entity.BrickSnailEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BrickSnailRenderer extends MobRenderer<BrickSnailEntity, BrickSnailModel<BrickSnailEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/bricksnail.png");

	public BrickSnailRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new BrickSnailModel<>(renderManagerIn.bakeLayer(BrickSnailModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(BrickSnailEntity entity) {
		return TEXTURE;
	}

}

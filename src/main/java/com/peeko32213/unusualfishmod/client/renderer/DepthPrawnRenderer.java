package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.DepthPrawnModel;
import com.peeko32213.unusualfishmod.common.entity.DepthPrawnEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DepthPrawnRenderer extends MobRenderer<DepthPrawnEntity, DepthPrawnModel<DepthPrawnEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/depth_prawn.png");

	public DepthPrawnRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new DepthPrawnModel<>(renderManagerIn.bakeLayer(DepthPrawnModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(DepthPrawnEntity entity) {
		return TEXTURE;
	}

}

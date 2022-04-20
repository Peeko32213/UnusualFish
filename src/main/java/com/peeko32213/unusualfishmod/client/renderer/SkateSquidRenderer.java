package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.SkateSquidModel;
import com.peeko32213.unusualfishmod.common.entity.SkateSquidEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SkateSquidRenderer extends MobRenderer<SkateSquidEntity, SkateSquidModel<SkateSquidEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/skatesquid.png");

	public SkateSquidRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new SkateSquidModel<>(renderManagerIn.bakeLayer(SkateSquidModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(SkateSquidEntity entity) {
		return TEXTURE;
	}

}

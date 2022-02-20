package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.renderer.model.TrumpetSquidModel;
import com.peeko32213.unusualfishmod.common.entity.TrumpetSquidEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TrumpetSquidRenderer extends MobRenderer<TrumpetSquidEntity, TrumpetSquidModel<TrumpetSquidEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/trumpetsquid.png");

	public TrumpetSquidRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new TrumpetSquidModel<>(renderManagerIn.bakeLayer(TrumpetSquidModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(TrumpetSquidEntity entity) {
		return TEXTURE;
	}

}

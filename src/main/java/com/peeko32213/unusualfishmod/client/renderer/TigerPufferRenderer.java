package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.TigerPufferModel;
import com.peeko32213.unusualfishmod.common.entity.TigerPufferEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TigerPufferRenderer extends MobRenderer<TigerPufferEntity, TigerPufferModel<TigerPufferEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/tigerpuffer.png");

	public TigerPufferRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new TigerPufferModel<>(renderManagerIn.bakeLayer(TigerPufferModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(TigerPufferEntity entity) {
		return TEXTURE;
	}

}


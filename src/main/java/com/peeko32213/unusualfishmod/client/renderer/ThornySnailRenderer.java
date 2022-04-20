package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.ThornySnailModel;
import com.peeko32213.unusualfishmod.common.entity.ThornySnailEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ThornySnailRenderer extends MobRenderer<ThornySnailEntity, ThornySnailModel<ThornySnailEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/thornysnail.png");

	public ThornySnailRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new ThornySnailModel<>(renderManagerIn.bakeLayer(ThornySnailModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(ThornySnailEntity entity) {
		return TEXTURE;
	}

}

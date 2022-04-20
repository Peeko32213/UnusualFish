package com.peeko32213.unusualfishmod.client.renderer;


import com.mojang.blaze3d.vertex.PoseStack;
import com.peeko32213.unusualfishmod.client.model.RootballModel;
import com.peeko32213.unusualfishmod.common.entity.RootballEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class RootballRenderer extends MobRenderer<RootballEntity, RootballModel<RootballEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/rootball.png");

	public RootballRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new RootballModel<>(renderManagerIn.bakeLayer(RootballModel.LAYER_LOCATION)), 0.2F);

		this.shadowRadius = 0.6F;
	}

	protected void scale(RootballEntity p_114046_, PoseStack p_114047_, float p_114048_) {
		float f = p_114046_.getSwelling(p_114048_);
		float f1 = 1.0F + Mth.sin(f * 100.0F) * f * 0.01F;
		f = Mth.clamp(f, 0.0F, 1.0F);
		f *= f;
		f *= f;
		float f2 = (1.0F + f * 0.4F) * f1;
		float f3 = (1.0F + f * 0.1F) / f1;
		p_114047_.scale(f2, f3, f2);
	}

	protected float getWhiteOverlayProgress(RootballEntity p_114043_, float p_114044_) {
		float f = p_114043_.getSwelling(p_114044_);
		return (int)(f * 10.0F) % 2 == 0 ? 0.0F : Mth.clamp(f, 0.5F, 1.0F);
	}

	@Override
	public ResourceLocation getTextureLocation(RootballEntity entity) {
		return TEXTURE;
	}

}

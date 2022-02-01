package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.SailorBarbModel;
import com.peeko32213.unusualfishmod.common.entity.SailorBarbEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class SailorBarbRenderer<Type extends SailorBarbEntity> extends MobRenderer<Type, SailorBarbModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/sailorbarb.png");

	public SailorBarbRenderer(Context context) {
		super(context, new SailorBarbModel<>(context.bakeLayer(SailorBarbModel.LAYER_LOCATION)), 0.4f);

	}
					//this code right here is what you insert when you want to give side flop to your fish \/
	 protected void setupRotations(SailorBarbEntity p_116226_, PoseStack p_116227_, float p_116228_, float p_116229_, float p_116230_) {
      super.setupRotations(p_116226_, p_116227_, p_116228_, p_116229_, p_116230_);
      float f = 4.3F * Mth.sin(0.6F * p_116228_);
      p_116227_.mulPose(Vector3f.YP.rotationDegrees(f));
      if (!p_116226_.isInWater()) {
         p_116227_.translate((double)0.2F, (double)0.1F, 0.0D);
         p_116227_.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
      }

   }
	@Override
	public ResourceLocation getTextureLocation(Type entity) {

		return TEXTURE;
	}

}

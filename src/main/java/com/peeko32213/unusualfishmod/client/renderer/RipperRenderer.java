package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.RipperModel;
import com.peeko32213.unusualfishmod.common.entity.RipperEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class RipperRenderer<Type extends RipperEntity> extends MobRenderer<Type, RipperModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
			"textures/entities/ripper.png");

	public RipperRenderer(Context context) {
		super(context, new RipperModel<>(context.bakeLayer(RipperModel.LAYER_LOCATION)), 0.5f);

	}
				//this code right here is what you insert when you want to give side flop to your fish \/
	 protected void setupRotations(RipperEntity p_116226_, PoseStack p_116227_, float p_116228_, float p_116229_, float p_116230_) {
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

package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.GravelFlounderModel;
import com.peeko32213.unusualfishmod.common.entity.GravelFlounderEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GravelFlounderRenderer extends MobRenderer<GravelFlounderEntity, GravelFlounderModel<GravelFlounderEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/gravel_flounder.png");

	public GravelFlounderRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new GravelFlounderModel<>(renderManagerIn.bakeLayer(GravelFlounderModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(GravelFlounderEntity entity) {
		return TEXTURE;
	}

}

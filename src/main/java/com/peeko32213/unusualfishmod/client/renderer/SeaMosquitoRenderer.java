package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.SeaMosquitoModel;
import com.peeko32213.unusualfishmod.common.entity.SeaMosquitoEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SeaMosquitoRenderer extends MobRenderer<SeaMosquitoEntity, SeaMosquitoModel<SeaMosquitoEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/seamosquito.png");

	public SeaMosquitoRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new SeaMosquitoModel<>(renderManagerIn.bakeLayer(SeaMosquitoModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(SeaMosquitoEntity entity) {
		return TEXTURE;
	}

}

package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.renderer.model.BarbedSkateModel;
import com.peeko32213.unusualfishmod.client.renderer.model.KalappaModel;
import com.peeko32213.unusualfishmod.common.entity.BarbedSkateEntity;
import com.peeko32213.unusualfishmod.common.entity.KalappaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class KalappaRenderer extends MobRenderer<KalappaEntity, KalappaModel<KalappaEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entities/kalappa.png");

	public KalappaRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new KalappaModel<>(renderManagerIn.bakeLayer(KalappaModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(KalappaEntity entity) {
		return TEXTURE;
	}

}

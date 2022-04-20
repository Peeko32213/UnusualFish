package com.peeko32213.unusualfishmod.client.renderer;


import com.peeko32213.unusualfishmod.client.model.HumpbackPogglingModel;
import com.peeko32213.unusualfishmod.common.entity.HumpbackPogglingEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HumpbackPogglingRenderer extends MobRenderer<HumpbackPogglingEntity, HumpbackPogglingModel<HumpbackPogglingEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/humpback_poggling.png");

	public HumpbackPogglingRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new HumpbackPogglingModel<>(renderManagerIn.bakeLayer(HumpbackPogglingModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(HumpbackPogglingEntity entity) {
		return TEXTURE;
	}

}

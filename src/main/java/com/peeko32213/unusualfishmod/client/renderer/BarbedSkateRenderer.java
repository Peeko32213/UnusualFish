package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.BarbedSkateModel;
import com.peeko32213.unusualfishmod.common.entity.BarbedSkateEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class BarbedSkateRenderer<Type extends BarbedSkateEntity>
extends MobRenderer<Type, BarbedSkateModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/barbedskate.png");

public BarbedSkateRenderer(Context context) {
super(context, new BarbedSkateModel<>(context.bakeLayer(BarbedSkateModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

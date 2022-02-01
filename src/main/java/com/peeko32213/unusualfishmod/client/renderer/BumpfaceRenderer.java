package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.BumpfaceModel;
import com.peeko32213.unusualfishmod.common.entity.BumpfaceEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BumpfaceRenderer<Type extends BumpfaceEntity>
extends MobRenderer<Type, BumpfaceModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/bumpface.png");

public BumpfaceRenderer(Context context) {
super(context, new BumpfaceModel<>(context.bakeLayer(BumpfaceModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

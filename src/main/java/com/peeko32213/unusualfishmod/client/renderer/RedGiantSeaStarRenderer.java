package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.RedGiantSeaStarModel;
import com.peeko32213.unusualfishmod.common.entity.RedGiantSeaStarEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class RedGiantSeaStarRenderer<Type extends RedGiantSeaStarEntity>
extends MobRenderer<Type, RedGiantSeaStarModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/redgiantseastar.png");

public RedGiantSeaStarRenderer(Context context) {
super(context, new RedGiantSeaStarModel<>(context.bakeLayer(RedGiantSeaStarModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

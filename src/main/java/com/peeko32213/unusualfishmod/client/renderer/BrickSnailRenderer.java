package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.AeroMonoModel;
import com.peeko32213.unusualfishmod.client.renderer.model.BrickSnailModel;
import com.peeko32213.unusualfishmod.common.entity.AeroMonoEntity;
import com.peeko32213.unusualfishmod.common.entity.BrickSnailEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BrickSnailRenderer<Type extends BrickSnailEntity>
extends MobRenderer<Type, BrickSnailModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/bricksnail.png");

public BrickSnailRenderer(Context context) {
super(context, new BrickSnailModel<>(context.bakeLayer(BrickSnailModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

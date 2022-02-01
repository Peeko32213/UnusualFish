package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.ClownthornSharkModel;
import com.peeko32213.unusualfishmod.common.entity.ClownthornSharkEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class ClownthornSharkRenderer<Type extends ClownthornSharkEntity>
extends MobRenderer<Type, ClownthornSharkModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/clownthornshark.png");

public ClownthornSharkRenderer(Context context) {
super(context, new ClownthornSharkModel<>(context.bakeLayer(ClownthornSharkModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

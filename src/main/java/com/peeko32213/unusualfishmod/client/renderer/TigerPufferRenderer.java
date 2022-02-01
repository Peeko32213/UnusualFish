package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.AeroMonoModel;
import com.peeko32213.unusualfishmod.client.renderer.model.TigerPufferModel;
import com.peeko32213.unusualfishmod.common.entity.AeroMonoEntity;
import com.peeko32213.unusualfishmod.common.entity.TigerPufferEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TigerPufferRenderer<Type extends TigerPufferEntity>
extends MobRenderer<Type, TigerPufferModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/tigerpuffer.png");

public TigerPufferRenderer(Context context) {
super(context, new TigerPufferModel<>(context.bakeLayer(TigerPufferModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

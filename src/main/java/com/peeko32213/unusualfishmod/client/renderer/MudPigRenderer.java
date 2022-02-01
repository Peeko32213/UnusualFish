package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.MudPigModel;
import com.peeko32213.unusualfishmod.common.entity.MudPigEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class MudPigRenderer<Type extends MudPigEntity>
extends MobRenderer<Type, MudPigModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/mudpig.png");

public MudPigRenderer(Context context) {
super(context, new MudPigModel<>(context.bakeLayer(MudPigModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

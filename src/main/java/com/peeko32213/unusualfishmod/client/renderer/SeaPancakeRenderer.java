package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.AeroMonoModel;
import com.peeko32213.unusualfishmod.client.renderer.model.AhmarIdolModel;
import com.peeko32213.unusualfishmod.client.renderer.model.MudPigModel;
import com.peeko32213.unusualfishmod.client.renderer.model.SeaPancakeModel;
import com.peeko32213.unusualfishmod.common.entity.AeroMonoEntity;
import com.peeko32213.unusualfishmod.common.entity.AhmarIdolEntity;
import com.peeko32213.unusualfishmod.common.entity.MudPigEntity;
import com.peeko32213.unusualfishmod.common.entity.SeaPancakeEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class SeaPancakeRenderer<Type extends SeaPancakeEntity>
extends MobRenderer<Type, SeaPancakeModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/seapancake.png");

public SeaPancakeRenderer(Context context) {
super(context, new SeaPancakeModel<>(context.bakeLayer(SeaPancakeModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

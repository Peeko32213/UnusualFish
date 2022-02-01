package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.AeroMonoModel;
import com.peeko32213.unusualfishmod.client.renderer.model.AhmarIdolModel;
import com.peeko32213.unusualfishmod.common.entity.AeroMonoEntity;
import com.peeko32213.unusualfishmod.common.entity.AhmarIdolEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class AhmarIdolRenderer<Type extends AhmarIdolEntity>
extends MobRenderer<Type, AhmarIdolModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/ahmaridol.png");

public AhmarIdolRenderer(Context context) {
super(context, new AhmarIdolModel<>(context.bakeLayer(AhmarIdolModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

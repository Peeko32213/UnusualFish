package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.AeroMonoModel;
import com.peeko32213.unusualfishmod.common.entity.AeroMonoEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class AeroMonoRenderer<Type extends AeroMonoEntity>
extends MobRenderer<Type, AeroMonoModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/aeromono.png");

public AeroMonoRenderer(Context context) {
super(context, new AeroMonoModel<>(context.bakeLayer(AeroMonoModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

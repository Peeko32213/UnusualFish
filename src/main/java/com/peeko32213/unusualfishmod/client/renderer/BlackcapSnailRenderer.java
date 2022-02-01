package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.BlackcapSnailModel;
import com.peeko32213.unusualfishmod.common.entity.BlackCapSnailEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlackcapSnailRenderer<Type extends BlackCapSnailEntity>
extends MobRenderer<Type, BlackcapSnailModel<Type>> {

private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,
	"textures/entities/blackcapsnail.png");

public BlackcapSnailRenderer(Context context) {
super(context, new BlackcapSnailModel<>(context.bakeLayer(BlackcapSnailModel.LAYER_LOCATION)), 0.4f);

}

@Override
public ResourceLocation getTextureLocation(Type entity) {

return TEXTURE;
}

}

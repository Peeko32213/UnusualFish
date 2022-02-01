package com.peeko32213.unusualfishmod.client.renderer;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.model.TripleTwirlPlecoModel;
import com.peeko32213.unusualfishmod.client.renderer.model.ZebraCornetfishModel;
import com.peeko32213.unusualfishmod.common.entity.TripleTwirlPlecoEntity;
import com.peeko32213.unusualfishmod.common.entity.ZebraCornetfishEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ZebraCornetfishRenderer<Type extends ZebraCornetfishEntity> extends MobRenderer<Type, ZebraCornetfishModel<Type>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MODID,"textures/entities/zebracornetfish.png");

	public ZebraCornetfishRenderer(Context context) {
		super(context, new ZebraCornetfishModel<>(context.bakeLayer(ZebraCornetfishModel.LAYER_LOCATION)), 0.4f);
	
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		
		return TEXTURE;
	}

	
	
}

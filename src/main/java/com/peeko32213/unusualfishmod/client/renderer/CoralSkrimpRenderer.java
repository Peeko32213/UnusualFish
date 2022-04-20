package com.peeko32213.unusualfishmod.client.renderer;


import com.google.common.collect.Maps;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.model.CoralSkrimpModel;
import com.peeko32213.unusualfishmod.common.entity.CoralSkrimpEntity;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class CoralSkrimpRenderer extends MobRenderer<CoralSkrimpEntity, CoralSkrimpModel<CoralSkrimpEntity>> {
	public static final Map<Integer, ResourceLocation> TEXTURES = Util.make(Maps.newHashMap(), (hashMap) -> {
		hashMap.put(0, new ResourceLocation(UnusualFishMod.MODID, "textures/entity/purple_skrimp.png"));
		hashMap.put(1, new ResourceLocation(UnusualFishMod.MODID, "textures/entity/red_skrimp.png"));
		hashMap.put(2, new ResourceLocation(UnusualFishMod.MODID, "textures/entity/yellow_skrimp.png"));
	});

	public CoralSkrimpRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new CoralSkrimpModel<>(renderManagerIn.bakeLayer(CoralSkrimpModel.LAYER_LOCATION)), 0.2F);
		this.shadowRadius = 0.6F;
	}

	@Override
	public ResourceLocation getTextureLocation(CoralSkrimpEntity entity) {
		return TEXTURES.getOrDefault(entity.getVariant(), TEXTURES.get(0));
	}


}

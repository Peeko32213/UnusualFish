package com.peeko32213.unusualfishmod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.peeko32213.unusualfishmod.client.model.CelestialFishModel;
import com.peeko32213.unusualfishmod.common.entity.CelestialFishEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class CelestialFishRenderer extends MobRenderer<CelestialFishEntity, CelestialFishModel<CelestialFishEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualfishmod:textures/entity/celestial_fish.png");

    public CelestialFishRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new CelestialFishModel<>(renderManagerIn.bakeLayer(CelestialFishModel.LAYER_LOCATION)), 0.2F);
        this.shadowRadius = 0.6F;
    }



    @Override
    public ResourceLocation getTextureLocation(CelestialFishEntity entity) {
        return TEXTURE;
    }

    //this code right here is what you insert when you want to give side flop to your fish \/
    protected void setupRotations(CelestialFishEntity p_116226_, PoseStack p_116227_, float p_116228_, float p_116229_, float p_116230_) {
        super.setupRotations(p_116226_, p_116227_, p_116228_, p_116229_, p_116230_);
        float f = 2.3F * Mth.sin(0.2F * p_116228_);
        p_116227_.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!p_116226_.isInWater()) {
            p_116227_.translate((double) 0.2F, (double) 0.1F, 0.0D);
            p_116227_.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }
    }

    protected int getBlockLightLevel(CelestialFishEntity entity, BlockPos partialTicks) {
        return 15;
    }

}

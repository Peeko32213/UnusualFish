package com.peeko32213.unusualfishmod.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;

import com.peeko32213.unusualfishmod.common.entity.MudPigEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class MudPigModel<Type extends MudPigEntity> extends ListModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "mud_pig"), "main");
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart SideWhisker1;
	private final ModelPart SideWhisker2;
	private final ModelPart Tail;
	private final ModelPart Body;

	public MudPigModel(ModelPart root) {
		this.Body = root.getChild("body");
		this.Tail = this.Body.getChild("tail");
		this.Fin1 = this.Body.getChild("fin1");
		this.Fin2 = this.Body.getChild("fin2");
		this.SideWhisker1 = this.Body.getChild("whisker1");
		this.SideWhisker2 = this.Body.getChild("whisker2");
		this.BackFin1 = this.Body.getChild("backfin1");
		this.BackFin2 = this.Body.getChild("backfin2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 20).addBox(0.0F, -9.0F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, -6.0F, -6.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 1).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.0F));

		PartDefinition SideWhisker2 = Body.addOrReplaceChild("whisker2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 0.0F, -4.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0F, -4.0F, 0.0F, -0.1745F, -0.48F));

		PartDefinition SideWhisker1 = Body.addOrReplaceChild("whisker1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0F, -4.0F, 0.0F, 0.1745F, 0.48F));

		PartDefinition BackFin2 = Body.addOrReplaceChild("backfin2", CubeListBuilder.create().texOffs(22, 24).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0F, 4.0F, 0.0F, 0.1745F, -0.3491F));

		PartDefinition BackFin1 = Body.addOrReplaceChild("backfin1", CubeListBuilder.create().texOffs(22, 24).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0F, 4.0F, 0.0F, -0.1745F, 0.3491F));

		PartDefinition Fin2 = Body.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 4.0F, -2.0F, 0.0F, 0.0873F, -0.1745F));

		PartDefinition Fin1 = Body.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0F, -2.0F, 0.0F, -0.0873F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.20F * Mth.sin(0.4F * ageInTicks);
		this.Fin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		
	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of( this.Body);
	}
}
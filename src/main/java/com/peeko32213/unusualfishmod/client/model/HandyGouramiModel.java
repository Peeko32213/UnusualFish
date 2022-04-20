package com.peeko32213.unusualfishmod.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.HandyGouramiEntity;

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

public class HandyGouramiModel<Type extends HandyGouramiEntity> extends ListModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "handy_gourami"), "main");
	private final ModelPart Whiskers1;
	private final ModelPart Whiskers2;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart Feeler1;
	private final ModelPart Finger1;
	private final ModelPart Finger2;
	private final ModelPart Feeler2;
	private final ModelPart Finger3;
	private final ModelPart Finger4;
	private final ModelPart Tail;
	private final ModelPart Body;

	public HandyGouramiModel(ModelPart root) {

		this.Body = root.getChild("body");

		this.Whiskers1 = this.Body.getChild("whiskers1");
		this.Whiskers2 = this.Body.getChild("whiskers2");

		this.Fin1 = this.Body.getChild("fin1");
		this.Fin2 = this.Body.getChild("fin2");

		this.Feeler1 = this.Body.getChild("feeler1");
		this.Finger1 = this.Feeler1.getChild("finger1");
		this.Finger2 = this.Feeler1.getChild("finger2");

		this.Feeler2 = this.Body.getChild("feeler2");
		this.Finger3 = this.Feeler2.getChild("finger3");
		this.Finger4 = this.Feeler2.getChild("finger4");

		this.Tail = this.Body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -5.0F, 6.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-2.5F, -4.0F, -9.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(0.0F, -7.0F, 0.0F, 0.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition Whiskers1 = Body.addOrReplaceChild("whiskers1", CubeListBuilder.create().texOffs(14, 33).addBox(0.0F, -4.0F, -2.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.0F, -9.0F));

		PartDefinition Whiskers2 = Body.addOrReplaceChild("whiskers2", CubeListBuilder.create().texOffs(14, 33).mirror().addBox(0.0F, -4.0F, -2.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 2.0F, -9.0F));

		PartDefinition Fin1 = Body.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(0, 30).addBox(0.05F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, -3.0F, -0.2618F, 0.48F, 0.0F));

		PartDefinition Fin2 = Body.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-0.05F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, -3.0F, -0.2618F, -0.48F, 0.0F));

		PartDefinition Feeler1 = Body.addOrReplaceChild("feeler1", CubeListBuilder.create().texOffs(20, 15).addBox(0.0F, 0.0F, -1.0F, 0.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.0F, -2.0F, 0.2182F, 0.0F, -0.2618F));

		PartDefinition Finger1 = Feeler1.addOrReplaceChild("finger1", CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, 0.3491F, 0.0F));

		PartDefinition Finger2 = Feeler1.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, -0.3491F, 0.0F));

		PartDefinition Feeler2 = Body.addOrReplaceChild("feeler2", CubeListBuilder.create().texOffs(20, 15).mirror().addBox(0.0F, 0.0F, -1.0F, 0.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 6.0F, -2.0F, 0.2182F, 0.0F, 0.2618F));

		PartDefinition Finger3 = Feeler2.addOrReplaceChild("finger3", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, -0.3491F, 0.0F));

		PartDefinition Finger4 = Feeler2.addOrReplaceChild("finger4", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, 0.3491F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 8.0F, 0.0F, 0.3054F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.25F * Mth.sin(0.5F * ageInTicks);
		this.Fin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Feeler1.xRot = Mth.cos(limbSwing * 0.3F + (float)Math.PI) * 0.7F * limbSwingAmount;
		this.Feeler2.xRot = Mth.cos(limbSwing * 0.3F) * 0.7F * limbSwingAmount;

	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of( this.Body);
	}

}
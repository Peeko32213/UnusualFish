package com.peeko32213.unusualfishmod.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;

import net.minecraft.client.model.EntityModel;
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

public class SeaSpiderModel<Type extends Entity> extends EntityModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "sea_spider"), "main");
	private final ModelPart Body;
	private final ModelPart Mouth;
	private final ModelPart Graspy1;
	private final ModelPart Graspy2;
	private final ModelPart Leg1;
	private final ModelPart Leg2;
	private final ModelPart Leg3;
	private final ModelPart Leg4;
	private final ModelPart Leg5;
	private final ModelPart Leg6;
	private final ModelPart Leg7;
	private final ModelPart Leg8;

	public SeaSpiderModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Mouth = root.getChild("Mouth");
		this.Graspy1 = root.getChild("Graspy1");
		this.Graspy2 = root.getChild("Graspy2");
		this.Leg1 = root.getChild("Leg1");
		this.Leg2 = root.getChild("Leg2");
		this.Leg3 = root.getChild("Leg3");
		this.Leg4 = root.getChild("Leg4");
		this.Leg5 = root.getChild("Leg5");
		this.Leg6 = root.getChild("Leg6");
		this.Leg7 = root.getChild("Leg7");
		this.Leg8 = root.getChild("Leg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 18.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Mouth = partdefinition
				.addOrReplaceChild("Mouth",
						CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, 0.0F, -5.0F, 0.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Graspy1 = partdefinition.addOrReplaceChild("Graspy1",
				CubeListBuilder.create().texOffs(15, 9).addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 17.0F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Graspy2 = partdefinition.addOrReplaceChild("Graspy2",
				CubeListBuilder.create().texOffs(15, 9).mirror()
						.addBox(0.0F, 0.0F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Leg1 = partdefinition
				.addOrReplaceChild("Leg1",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 17.0F, 1.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition Leg2 = partdefinition
				.addOrReplaceChild("Leg2",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 17.0F, 1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Leg3 = partdefinition.addOrReplaceChild("Leg3",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 17.0F, 1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Leg4 = partdefinition.addOrReplaceChild("Leg4",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 17.0F, 1.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition Leg5 = partdefinition.addOrReplaceChild("Leg5",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-20.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 17.0F, 1.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition Leg6 = partdefinition.addOrReplaceChild("Leg6",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-20.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 17.0F, 1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Leg7 = partdefinition.addOrReplaceChild("Leg7",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-20.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 17.0F, 1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Leg8 = partdefinition.addOrReplaceChild("Leg8",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-20.0F, -5.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 17.0F, 1.0F, 0.0F, 0.9163F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}
		this.Leg7.zRot = Mth.cos(limbSwing * 0.5F) * 1.7F * limbSwingAmount;
		this.Leg5.zRot = Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 1.7F * limbSwingAmount;
		this.Leg4.zRot = Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 1.7F * limbSwingAmount;
		this.Leg1.zRot = Mth.cos(limbSwing * 0.5F) * 1.7F * limbSwingAmount;
		this.Leg8.zRot = Mth.cos(limbSwing * 0.5F) * 1.7F * limbSwingAmount;
		this.Leg2.zRot = Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 1.7F * limbSwingAmount;
		this.Leg3.zRot = Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 1.7F * limbSwingAmount;
		this.Leg6.zRot = Mth.cos(limbSwing * 0.5F) * 1.7F * limbSwingAmount;
		this.Graspy1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Graspy2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Mouth.render(poseStack, buffer, packedLight, packedOverlay);
		Graspy1.render(poseStack, buffer, packedLight, packedOverlay);
		Graspy2.render(poseStack, buffer, packedLight, packedOverlay);
		Leg1.render(poseStack, buffer, packedLight, packedOverlay);
		Leg2.render(poseStack, buffer, packedLight, packedOverlay);
		Leg3.render(poseStack, buffer, packedLight, packedOverlay);
		Leg4.render(poseStack, buffer, packedLight, packedOverlay);
		Leg5.render(poseStack, buffer, packedLight, packedOverlay);
		Leg6.render(poseStack, buffer, packedLight, packedOverlay);
		Leg7.render(poseStack, buffer, packedLight, packedOverlay);
		Leg8.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
package com.peeko32213.unusualfishmod.client.renderer.model;// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class TrumpetSquidModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "trumpetsquidmodel"), "main");
	private final ModelPart Body;
	private final ModelPart TopArms;
	private final ModelPart BottomArms;
	private final ModelPart LeftArms;
	private final ModelPart RightArms;
	private final ModelPart FeederArm1;
	private final ModelPart FeederArm2;

	public TrumpetSquidModel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TopArms = root.getChild("TopArms");
		this.BottomArms = root.getChild("BottomArms");
		this.LeftArms = root.getChild("LeftArms");
		this.RightArms = root.getChild("RightArms");
		this.FeederArm1 = root.getChild("FeederArm1");
		this.FeederArm2 = root.getChild("FeederArm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 34).addBox(-2.5F, -5.0F, 4.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.5F, -8.0F, 0.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(18, 34).addBox(-1.5F, -7.0F, -35.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -11.0F, -15.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(-1.0F, -10.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-1.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.5F, -8.0F, -29.0F, 5.0F, 5.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition TopArms = partdefinition.addOrReplaceChild("TopArms", CubeListBuilder.create().texOffs(0, 8).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 21.0F, 8.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition BottomArms = partdefinition.addOrReplaceChild("BottomArms", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 8.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition LeftArms = partdefinition.addOrReplaceChild("LeftArms", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 21.0F, 8.0F, -0.4371F, -0.0849F, -0.3816F));

		PartDefinition RightArms = partdefinition.addOrReplaceChild("RightArms", CubeListBuilder.create().texOffs(10, 28).addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 21.0F, 8.0F, -0.4371F, 0.0849F, 0.3816F));

		PartDefinition FeederArm1 = partdefinition.addOrReplaceChild("FeederArm1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 22.0F, 8.0F, -0.3494F, 0.041F, -0.0149F));

		PartDefinition FeederArm2 = partdefinition.addOrReplaceChild("FeederArm2", CubeListBuilder.create().texOffs(10, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 22.0F, 8.0F, -0.3494F, -0.041F, 0.0149F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.FeederArm1.yRot = -Mth.cos(limbSwing * 0.3F) * 0.6F * limbSwingAmount;
		this.FeederArm2.yRot = -Mth.cos(limbSwing * 0.3F + (float) Math.PI) * 0.6F * limbSwingAmount;
		this.LeftArms.yRot = -Mth.cos(limbSwing * 0.5F) * 1.0F * limbSwingAmount;
		this.RightArms.yRot = -Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 1.0F * limbSwingAmount;
		this.TopArms.xRot = -Mth.cos(limbSwing * 0.5F + (float) Math.PI) * 0.5F * limbSwingAmount;

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		TopArms.render(poseStack, buffer, packedLight, packedOverlay);
		BottomArms.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArms.render(poseStack, buffer, packedLight, packedOverlay);
		RightArms.render(poseStack, buffer, packedLight, packedOverlay);
		FeederArm1.render(poseStack, buffer, packedLight, packedOverlay);
		FeederArm2.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
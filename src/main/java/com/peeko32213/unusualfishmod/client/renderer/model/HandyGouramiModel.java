package com.peeko32213.unusualfishmod.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.HandyGouramiEntity;

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

public class HandyGouramiModel<Type extends HandyGouramiEntity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "handy_gourami"), "main");
	private final ModelPart Whiskers1;
	private final ModelPart Whiskers2;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart Feeler1;
	private final ModelPart Feeler2;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public HandyGouramiModel(ModelPart root) {
		this.Whiskers1 = root.getChild("Whiskers1");
		this.Whiskers2 = root.getChild("Whiskers2");
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.Feeler1 = root.getChild("Feeler1");
		this.Feeler2 = root.getChild("Feeler2");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Whiskers1 = partdefinition.addOrReplaceChild("Whiskers1", CubeListBuilder.create()
				.texOffs(14, 33).addBox(0.0F, -4.0F, -2.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 20.0F, -9.0F));

		PartDefinition Whiskers2 = partdefinition.addOrReplaceChild("Whiskers2",
				CubeListBuilder.create().texOffs(14, 33).mirror()
						.addBox(0.0F, -4.0F, -2.0F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 20.0F, -9.0F));

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(0, 30).addBox(0.05F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 18.0F, -3.0F, -0.2618F, 0.48F, 0.0F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(0, 30).mirror()
						.addBox(-0.05F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 18.0F, -3.0F, -0.2618F, -0.48F, 0.0F));

		PartDefinition Feeler1 = partdefinition.addOrReplaceChild("Feeler1",
				CubeListBuilder.create().texOffs(20, 15).addBox(0.0F, 0.0F, -1.0F, 0.0F, 16.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 24.0F, -2.0F, 0.2182F, 0.0F, -0.2618F));

		PartDefinition Finger1 = Feeler1.addOrReplaceChild("Finger1",
				CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, 0.3491F, 0.0F));

		PartDefinition Finger2 = Feeler1.addOrReplaceChild("Finger2",
				CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, -0.3491F, 0.0F));

		PartDefinition Feeler2 = partdefinition.addOrReplaceChild("Feeler2",
				CubeListBuilder.create().texOffs(20, 15).mirror()
						.addBox(0.0F, 0.0F, -1.0F, 0.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 24.0F, -2.0F, 0.2182F, 0.0F, 0.2618F));

		PartDefinition Finger3 = Feeler2.addOrReplaceChild("Finger3",
				CubeListBuilder.create().texOffs(0, 3).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, -0.3491F, 0.0F));

		PartDefinition Finger4 = Feeler2.addOrReplaceChild("Finger4",
				CubeListBuilder.create().texOffs(0, 3).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, -0.2618F, 0.3491F, 0.0F));

		PartDefinition Tail = partdefinition
				.addOrReplaceChild("Tail",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 18.5F, 8.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -11.0F, -5.0F, 6.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-2.5F, -10.0F, -9.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(0.0F, -13.0F, 0.0F, 0.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Whiskers1.render(poseStack, buffer, packedLight, packedOverlay);
		Whiskers2.render(poseStack, buffer, packedLight, packedOverlay);
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		Feeler1.render(poseStack, buffer, packedLight, packedOverlay);
		Feeler2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
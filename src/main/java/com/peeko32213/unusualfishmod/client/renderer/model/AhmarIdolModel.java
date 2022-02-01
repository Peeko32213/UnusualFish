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

public class AhmarIdolModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "ahmar_idol"), "main");
	private final ModelPart Mouth;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public AhmarIdolModel(ModelPart root) {
		this.Mouth = root.getChild("Mouth");
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Mouth = partdefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(30, 4)
				.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 20.0F, -12.0F));

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.425F, 17.0F, -3.0F, 0.6807F, 0.7471F, 0.5031F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.425F, 17.0F, -3.0F, 0.6807F, -0.7471F, -0.5031F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(32, 0).addBox(
				0.0F, -6.0F, 0.0F, 0.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 6.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -18.0F, -5.0F, 5.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-2.5F, -12.0F, -9.0F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-1.5F, -6.0F, -12.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 24)
						.addBox(-1.5F, -6.0F, -15.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -27.0F, -4.0F, 0.0F, 37.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Mouth.render(poseStack, buffer, packedLight, packedOverlay);
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
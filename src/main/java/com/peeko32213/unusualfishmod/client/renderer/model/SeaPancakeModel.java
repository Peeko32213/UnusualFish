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

public class SeaPancakeModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "sea_pancake"), "main");
	private final ModelPart Tail;
	private final ModelPart Eye1;
	private final ModelPart Eye2;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart bb_main;

	public SeaPancakeModel(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.Eye1 = root.getChild("Eye1");
		this.Eye2 = root.getChild("Eye2");
		this.BackFin1 = root.getChild("BackFin1");
		this.BackFin2 = root.getChild("BackFin2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 1)
				.addBox(0.0F, -6.0F, 0.0F, 0.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 22.0F, 29.0F));

		PartDefinition Eye1 = partdefinition.addOrReplaceChild("Eye1", CubeListBuilder.create().texOffs(0, 0).addBox(
				0.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 20.0F, -8.0F));

		PartDefinition Eye2 = partdefinition.addOrReplaceChild("Eye2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-4.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.5F, 20.0F, -8.0F));

		PartDefinition BackFin1 = partdefinition.addOrReplaceChild("BackFin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 22.5F, 23.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition BackFin2 = partdefinition.addOrReplaceChild("BackFin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, 22.5F, 23.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-22.5F, -4.0F, -23.0F, 45.0F, 4.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-8.0F, -3.0F, 22.0F, 16.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -8.0F, 22.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.BackFin1.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.BackFin2.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.Tail.yRot = -f * 0.2F * Mth.sin(0.6F * ageInTicks);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Eye1.render(poseStack, buffer, packedLight, packedOverlay);
		Eye2.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin1.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
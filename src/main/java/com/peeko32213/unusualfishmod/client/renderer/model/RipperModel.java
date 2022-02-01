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

public class RipperModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "ripper"), "main");
	private final ModelPart FrontFin1;
	private final ModelPart FrontFin2;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart Tail;
	private final ModelPart Jaw;
	private final ModelPart bb_main;

	public RipperModel(ModelPart root) {
		this.FrontFin1 = root.getChild("FrontFin1");
		this.FrontFin2 = root.getChild("FrontFin2");
		this.BackFin1 = root.getChild("BackFin1");
		this.BackFin2 = root.getChild("BackFin2");
		this.Tail = root.getChild("Tail");
		this.Jaw = root.getChild("Jaw");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("FrontFin1",
				CubeListBuilder.create().texOffs(11, 26).addBox(0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 23.0F, -4.0F, 0.0F, -0.1309F, 0.6109F));

		partdefinition.addOrReplaceChild("FrontFin2",
				CubeListBuilder.create().texOffs(11, 26).mirror()
						.addBox(-7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 23.0F, -4.0F, 0.0F, 0.1309F, -0.6109F));

		partdefinition.addOrReplaceChild("BackFin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 23.0F, 5.0F, 0.0F, -0.1309F, 0.7418F));

		partdefinition.addOrReplaceChild("BackFin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 23.0F, 5.0F, 0.0F, 0.1309F, -0.7418F));

		partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.25F, 0.0F, 0.0F,
				7.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.25F, 9.0F));

		partdefinition.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(26, 27)
						.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -2.0F, -6.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, -4.0F));

		partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -5.0F, -4.0F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(-1.5F, -5.0F, -11.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(0.0F, -11.0F, -3.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
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

		this.Tail.yRot = -f * 0.20F * Mth.sin(0.4F * ageInTicks);
		this.FrontFin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.FrontFin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Jaw.xRot = Mth.cos(limbSwing * 0.2F) * 0.7F * limbSwingAmount;

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		FrontFin1.render(poseStack, buffer, packedLight, packedOverlay);
		FrontFin2.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin1.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Jaw.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
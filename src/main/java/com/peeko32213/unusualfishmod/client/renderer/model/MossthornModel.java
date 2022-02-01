package com.peeko32213.unusualfishmod.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.MossthornEntity;

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

public class MossthornModel<T extends MossthornEntity> extends EntityModel<T> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "mossthorn"), "main");
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart Tail;
	private final ModelPart LowerFin1;
	private final ModelPart LowerFin2;
	private final ModelPart bb_main;

	public MossthornModel(ModelPart root) {
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.Tail = root.getChild("Tail");
		this.LowerFin1 = root.getChild("LowerFin1");
		this.LowerFin2 = root.getChild("LowerFin2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(26, 22).addBox(0.05F, 0.0F, 0.0F, 0.0F, 9.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 16.0F, -2.0F, 0.0F, 0.8727F, 0.0F));

		partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(26, 22).mirror()
						.addBox(-0.05F, 0.0F, 0.0F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, 16.0F, -2.0F, 0.0F, -0.8727F, 0.0F));

		partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(26, 33).addBox(0.0F, -5.0F, -1.0F,
				0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 8.0F));

		partdefinition.addOrReplaceChild("LowerFin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 24.0F, -2.0F, 0.1309F, 0.0F, -0.4363F));

		partdefinition.addOrReplaceChild("LowerFin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 24.0F, -2.0F, 0.1309F, 0.0F, 0.4363F));

		partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -16.0F, -8.0F, 8.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(0.0F, -19.0F, 0.0F, 0.0F, 22.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-2.5F, -11.0F, -12.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.20F * Mth.sin(0.4F * ageInTicks);
		this.Fin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.LowerFin1.xRot = -f * 0.05F * Mth.sin(0.1F * ageInTicks);
		this.LowerFin2.xRot = -f * 0.05F * Mth.sin(0.1F * ageInTicks);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		LowerFin1.render(poseStack, buffer, packedLight, packedOverlay);
		LowerFin2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
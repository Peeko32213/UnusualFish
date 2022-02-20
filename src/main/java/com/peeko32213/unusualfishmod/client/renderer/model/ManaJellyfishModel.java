package com.peeko32213.unusualfishmod.client.renderer.model;// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ManaJellyfishModel<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "wizard_jelly"), "main");
	private final ModelPart Arms1;
	private final ModelPart Arms2;
	private final ModelPart SideArms1;
	private final ModelPart SideArms2;
	private final ModelPart OverallInsideThing;
	private final ModelPart bb_main;

	public ManaJellyfishModel(ModelPart root) {
		this.Arms1 = root.getChild("Arms1");
		this.Arms2 = root.getChild("Arms2");
		this.SideArms1 = root.getChild("SideArms1");
		this.SideArms2 = root.getChild("SideArms2");
		this.OverallInsideThing = root.getChild("OverallInsideThing");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Arms1 = partdefinition.addOrReplaceChild("Arms1", CubeListBuilder.create().texOffs(0, 16).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 4.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Arms2 = partdefinition.addOrReplaceChild("Arms2", CubeListBuilder.create().texOffs(0, 16).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, -4.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition SideArms1 = partdefinition.addOrReplaceChild("SideArms1", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, 0.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition SideArms2 = partdefinition.addOrReplaceChild("SideArms2", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(0.0F, 0.0F, -4.5F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition OverallInsideThing = partdefinition.addOrReplaceChild("OverallInsideThing", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition InsideThing2 = OverallInsideThing.addOrReplaceChild("InsideThing2", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(0.0F, -3.0F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition InsideThing1 = OverallInsideThing.addOrReplaceChild("InsideThing1", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -3.0F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -5.0F, -4.5F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}
		this.Arms2.xRot = Mth.cos(limbSwing * 0.4F) * 2.5F * limbSwingAmount;
		this.Arms1.xRot = -Mth.cos(limbSwing * 0.4F) * 2.5F * limbSwingAmount;
		this.SideArms1.zRot = Mth.cos(limbSwing * 0.4F) * 2.5F * limbSwingAmount;
		this.SideArms2.zRot = -Mth.cos(limbSwing * 0.4F) * 2.5F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Arms1.render(poseStack, buffer, packedLight, packedOverlay);
		Arms2.render(poseStack, buffer, packedLight, packedOverlay);
		SideArms1.render(poseStack, buffer, packedLight, packedOverlay);
		SideArms2.render(poseStack, buffer, packedLight, packedOverlay);
		OverallInsideThing.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
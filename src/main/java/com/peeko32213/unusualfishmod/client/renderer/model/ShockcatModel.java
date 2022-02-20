package com.peeko32213.unusualfishmod.client.renderer.model;// Made with Blockbench 4.1.5
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

public class ShockcatModel<T extends Entity> extends EntityModel<T> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "shockcatmodel"), "main");
	private final ModelPart Tail;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart SideWhisker1;
	private final ModelPart SideWhisker2;
	private final ModelPart Whisker1;
	private final ModelPart Whisker2;
	private final ModelPart bb_main;

	public ShockcatModel(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.BackFin1 = root.getChild("BackFin1");
		this.BackFin2 = root.getChild("BackFin2");
		this.SideWhisker1 = root.getChild("SideWhisker1");
		this.SideWhisker2 = root.getChild("SideWhisker2");
		this.Whisker1 = root.getChild("Whisker1");
		this.Whisker2 = root.getChild("Whisker2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -4.0F, 7.0F, 0.0F, 11.0F, 19.0F, new CubeDeformation(0.01F))
		.texOffs(12, 43).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 17.0F, 16.0F));

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1", CubeListBuilder.create().texOffs(26, 0).addBox(0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition BackFin1 = partdefinition.addOrReplaceChild("BackFin1", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 24.0F, 10.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition BackFin2 = partdefinition.addOrReplaceChild("BackFin2", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 24.0F, 10.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition SideWhisker1 = partdefinition.addOrReplaceChild("SideWhisker1", CubeListBuilder.create().texOffs(36, 10).addBox(-14.0F, -1.0F, 0.0F, 14.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 24.0F, -10.0F, -0.6902F, 1.0515F, -0.7603F));

		PartDefinition SideWhisker2 = partdefinition.addOrReplaceChild("SideWhisker2", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(0.0F, -1.0F, 0.0F, 14.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 24.0F, -10.0F, -0.6902F, -1.0515F, 0.7603F));

		PartDefinition Whisker1 = partdefinition.addOrReplaceChild("Whisker1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 24.0F, -10.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Whisker2 = partdefinition.addOrReplaceChild("Whisker2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5F, 24.0F, -10.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -7.0F, 0.0F, 10.0F, 7.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(30, 31).addBox(-8.0F, -4.0F, -10.0F, 16.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(0.0F, -14.0F, 4.0F, 0.0F, 7.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.45F * Mth.sin(0.2F * ageInTicks);
		this.Fin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Whisker1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Whisker2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.SideWhisker1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.SideWhisker2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin1.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin2.render(poseStack, buffer, packedLight, packedOverlay);
		SideWhisker1.render(poseStack, buffer, packedLight, packedOverlay);
		SideWhisker2.render(poseStack, buffer, packedLight, packedOverlay);
		Whisker1.render(poseStack, buffer, packedLight, packedOverlay);
		Whisker2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
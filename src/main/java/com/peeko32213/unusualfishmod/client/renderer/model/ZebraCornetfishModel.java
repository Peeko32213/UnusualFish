package com.peeko32213.unusualfishmod.client.renderer.model;// Made with Blockbench 4.1.3
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

public class ZebraCornetfishModel<T extends Entity> extends EntityModel<T> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "zebra_cornetfish"), "main");
	private final ModelPart Mouth;
	private final ModelPart Tail;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart MidFin1;
	private final ModelPart MidFin2;
	private final ModelPart bb_main;

	public ZebraCornetfishModel(ModelPart root) {
		this.Mouth = root.getChild("Mouth");
		this.Tail = root.getChild("Tail");
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.MidFin1 = root.getChild("MidFin1");
		this.MidFin2 = root.getChild("MidFin2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Mouth = partdefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 24.0F, -28.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 17.0F));

		PartDefinition BackFin1 = Tail.addOrReplaceChild("BackFin1", CubeListBuilder.create().texOffs(10, 6).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition BackFin2 = Tail.addOrReplaceChild("BackFin2", CubeListBuilder.create().texOffs(10, 6).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1", CubeListBuilder.create().texOffs(10, 0).addBox(0.075F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 21.0F, -6.0F, -0.1309F, 0.6109F, 0.0F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-0.075F, 0.0F, 0.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 21.0F, -6.0F, -0.1309F, -0.6109F, 0.0F));

		PartDefinition MidFin1 = partdefinition.addOrReplaceChild("MidFin1", CubeListBuilder.create().texOffs(10, 0).addBox(0.075F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 23.0F, 4.0F, -0.3054F, 0.3054F, 0.0F));

		PartDefinition MidFin2 = partdefinition.addOrReplaceChild("MidFin2", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-0.075F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 23.0F, 4.0F, -0.3054F, -0.3054F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 33).addBox(-1.5F, -3.0F, -29.0F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -4.0F, -10.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -10.0F, 12.0F, 0.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.Fin1.xRot = -f * 0.30F * Mth.sin(0.4F * ageInTicks);
		this.Fin2.xRot = -f * 0.30F * Mth.sin(0.4F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Mouth.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		MidFin1.render(poseStack, buffer, packedLight, packedOverlay);
		MidFin2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
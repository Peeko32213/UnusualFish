package com.peeko32213.unusualfishmod.client.model;// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.DeepCrawlerEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class DeepCrawlerModel<T extends DeepCrawlerEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "deep_crawler"), "main");
	private final ModelPart Tail;
	private final ModelPart Legs1;
	private final ModelPart Legs2;
	private final ModelPart bb_main;

	public DeepCrawlerModel(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.Legs1 = root.getChild("Legs1");
		this.Legs2 = root.getChild("Legs2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 4.0F));

		PartDefinition Legs1 = partdefinition.addOrReplaceChild("Legs1", CubeListBuilder.create().texOffs(13, 9).addBox(0.0F, 0.0F, -3.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition Legs2 = partdefinition.addOrReplaceChild("Legs2", CubeListBuilder.create().texOffs(13, 9).mirror().addBox(0.0F, 0.0F, -3.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {


		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}
		this.Tail.yRot = Mth.cos(limbSwing * 0.5F) * 1.7F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Legs1.render(poseStack, buffer, packedLight, packedOverlay);
		Legs2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
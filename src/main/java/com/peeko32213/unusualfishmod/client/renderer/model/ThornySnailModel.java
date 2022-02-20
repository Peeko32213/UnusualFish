package com.peeko32213.unusualfishmod.client.renderer.model;// Made with Blockbench 4.1.5
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

public class ThornySnailModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "thorn_snail"), "main");
	private final ModelPart Feeler1;
	private final ModelPart Feeler2;
	private final ModelPart Shell;
	private final ModelPart bb_main;

	public ThornySnailModel(ModelPart root) {
		this.Feeler1 = root.getChild("Feeler1");
		this.Feeler2 = root.getChild("Feeler2");
		this.Shell = root.getChild("Shell");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Feeler1 = partdefinition.addOrReplaceChild("Feeler1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 21.5F, -6.0F, 0.3927F, -0.7854F, 0.0F));

		PartDefinition Feeler2 = partdefinition.addOrReplaceChild("Feeler2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.5F, -3.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 21.5F, -6.0F, 0.3927F, 0.7854F, 0.0F));

		PartDefinition Shell = partdefinition.addOrReplaceChild("Shell", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -9.0F, 0.0F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -6.0F));

		PartDefinition Spikes1 = Shell.addOrReplaceChild("Spikes1", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -3.0F, -6.0F, 0.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 6.0F));

		PartDefinition Spikes2 = Shell.addOrReplaceChild("Spikes2", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -3.0F, -6.0F, 0.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -9.0F, 6.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Spikes3 = Shell.addOrReplaceChild("Spikes3", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(0.0F, -3.0F, -6.0F, 0.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -9.0F, 6.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(16, 20).addBox(-3.0F, -4.0F, -2.5F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.5F, -3.0F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Feeler1.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.Feeler2.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.Shell.xRot = -f * 0.20F * Mth.sin(0.01F * ageInTicks);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Feeler1.render(poseStack, buffer, packedLight, packedOverlay);
		Feeler2.render(poseStack, buffer, packedLight, packedOverlay);
		Shell.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
package com.peeko32213.unusualfishmod.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;

import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.PhantomModel;
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

public class BarbedSkateModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "barbed_skate"), "main");
	private final ModelPart Tail;
	private final ModelPart BigWing1;
	private final ModelPart BigWing2;
	private final ModelPart LittleWing1;
	private final ModelPart LittleWing2;
	private final ModelPart bb_main;

	public BarbedSkateModel(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.BigWing1 = root.getChild("BigWing1");
		this.BigWing2 = root.getChild("BigWing2");
		this.LittleWing1 = root.getChild("LittleWing1");
		this.LittleWing2 = root.getChild("LittleWing2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(9, 8)
						.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 5.0F));

		PartDefinition BigWing1 = partdefinition.addOrReplaceChild("BigWing1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 23.0F, -3.0F));

		PartDefinition BigWing2 = partdefinition.addOrReplaceChild("BigWing2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 23.0F, -3.0F));

		PartDefinition LittleWing1 = partdefinition
				.addOrReplaceChild("LittleWing1",
						CubeListBuilder.create().texOffs(16, 8).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 23.5F, 4.5F, 0.0F, 0.0F, 0.6981F));

		PartDefinition LittleWing2 = partdefinition.addOrReplaceChild("LittleWing2",
				CubeListBuilder.create().texOffs(16, 8).mirror()
						.addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 23.5F, 4.5F, 0.0F, 0.0F, -0.6981F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
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

		this.BigWing1.zRot = -f * 0.3F * Mth.sin(0.4F * ageInTicks);
		this.BigWing2.zRot = f * 0.3F * Mth.sin(0.4F * ageInTicks);
		this.Tail.yRot = -f * 0.2F * Mth.sin(0.6F * ageInTicks);

	}



	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		BigWing1.render(poseStack, buffer, packedLight, packedOverlay);
		BigWing2.render(poseStack, buffer, packedLight, packedOverlay);
		LittleWing1.render(poseStack, buffer, packedLight, packedOverlay);
		LittleWing2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
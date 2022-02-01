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

public class SpindlefishModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "spindlefish"), "main");
	private final ModelPart Fin1;
	private final ModelPart Tail;
	private final ModelPart Whiskers1;
	private final ModelPart Fin2;
	private final ModelPart Whiskers2;
	private final ModelPart bb_main;

	public SpindlefishModel(ModelPart root) {
		this.Fin1 = root.getChild("Fin1");
		this.Tail = root.getChild("Tail");
		this.Whiskers1 = root.getChild("Whiskers1");
		this.Fin2 = root.getChild("Fin2");
		this.Whiskers2 = root.getChild("Whiskers2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("Fin1",
						CubeListBuilder.create().texOffs(0, 19).addBox(0.05F, -5.0F, 0.0F, 0.0F, 10.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.5F, 22.0F, 0.0F, 0.0F, 1.1781F, 0.0F));

		partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 24).addBox(0.0F, -2.0F, 0.0F,
				0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 6.0F));

		partdefinition.addOrReplaceChild("Whiskers1",
				CubeListBuilder.create().texOffs(30, 5).addBox(0.0F, 0.0F, -2.0F, 0.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 20.0F, -5.0F, 0.0F, 0.0F, -0.2618F));

		partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(0, 19).mirror()
						.addBox(-0.05F, -5.0F, 0.0F, 0.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5F, 22.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

		partdefinition.addOrReplaceChild("Whiskers2",
				CubeListBuilder.create().texOffs(30, 5).mirror()
						.addBox(0.0F, 0.0F, -2.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 20.0F, -5.0F, 0.0F, 0.0F, 0.2618F));

		partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -7.0F, -2.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -5.0F, -5.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -12.0F, -4.0F, 0.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)),
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
		this.Fin1.xRot = -f * 0.30F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.30F * Mth.sin(0.1F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Whiskers1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		Whiskers2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
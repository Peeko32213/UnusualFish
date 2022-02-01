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

public class ClownthornSharkModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "clownthorn_shark"), "main");
	private final ModelPart BackBody;
	private final ModelPart Body;
	private final ModelPart Fin1;
	private final ModelPart Fin2;

	public ClownthornSharkModel(ModelPart root) {
		this.BackBody = root.getChild("BackBody");
		this.Body = root.getChild("Body");
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition BackBody = partdefinition.addOrReplaceChild("BackBody",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(0.0F, -4.0F, 3.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 7.0F));

		PartDefinition Tail = BackBody.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F,
				-5.0F, 0.0F, 0.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 11.0F));

		PartDefinition BackFin1 = BackBody.addOrReplaceChild("BackFin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0F, 3.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.0F, 4.0F, -0.0844F, 0.1002F, -0.0042F));

		PartDefinition BackFin2 = BackBody.addOrReplaceChild("BackFin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, 0.0F, -2.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 4.0F, -0.0844F, -0.1002F, 0.0042F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(21, 14)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(22, 25)
						.addBox(0.0F, -13.0F, -1.0F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-3.0F, -6.0F, -9.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Eye1 = Body.addOrReplaceChild("Eye1",
				CubeListBuilder.create().texOffs(20, 8)
						.addBox(0.5F, -8.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 5)
						.addBox(0.5F, -7.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Eye2 = Body.addOrReplaceChild("Eye2", CubeListBuilder.create().texOffs(20, 8).mirror()
				.addBox(-2.5F, -8.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 5)
				.mirror().addBox(-2.5F, -7.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 23.0F, 0.0F, -0.0579F, 0.2555F, 0.1671F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(12, 0).mirror()
						.addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, 23.0F, 0.0F, -0.0579F, -0.2555F, -0.1671F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.BackBody.yRot = -f * 0.3F * Mth.sin(0.4F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		BackBody.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
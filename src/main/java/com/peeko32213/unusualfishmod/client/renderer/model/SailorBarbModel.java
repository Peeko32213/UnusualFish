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



public class SailorBarbModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "sailor_barb"), "main");
	private final ModelPart Fin1;
	private final ModelPart Sailfin;
	private final ModelPart Tail;
	private final ModelPart Fin2;
	private final ModelPart bb_main;

	public SailorBarbModel(ModelPart root) {
		this.Fin1 = root.getChild("Fin1");
		this.Sailfin = root.getChild("Sailfin");
		this.Tail = root.getChild("Tail");
		this.Fin2 = root.getChild("Fin2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(15, 0).addBox(0.075F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 21.0F, -1.0F, 0.2182F, 0.6545F, 0.0F));

		PartDefinition Sailfin = partdefinition.addOrReplaceChild("Sailfin",
				CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -7.0F, 0.0F, 0.0F, 8.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(
				0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 3.0F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(15, 0).mirror()
						.addBox(-0.075F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.75F, 21.0F, -1.0F, 0.2182F, -0.6545F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -5.0F, -4.0F, 4.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-1.5F, -3.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.45F * Mth.sin(0.6F * ageInTicks);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Sailfin.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
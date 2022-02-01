package com.peeko32213.unusualfishmod.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.DualityDamselfishEntity;

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

public class DualityDamselfishModel<Type extends DualityDamselfishEntity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "duality_damselfish"), "main");
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart LowerFin1;
	private final ModelPart LowerFin2;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public DualityDamselfishModel(ModelPart root) {
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.LowerFin1 = root.getChild("LowerFin1");
		this.LowerFin2 = root.getChild("LowerFin2");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(14, 0).addBox(0.025F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 20.0F, -1.0F, -0.3491F, 1.0472F, 0.0F));

		partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(14, 0).mirror()
						.addBox(-0.025F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 20.0F, -1.0F, -0.3491F, -1.0472F, 0.0F));

		partdefinition.addOrReplaceChild("LowerFin1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 24.0F, -2.0F, 0.1745F, 0.0F, -0.3054F));

		partdefinition.addOrReplaceChild("LowerFin2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 24.0F, -2.0F, 0.1745F, 0.0F, 0.3054F));

		partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(10, 12).addBox(0.0F, -1.5F, 0.0F,
				0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.5F, 4.0F));

		partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, -8.0F, -4.0F, 3.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(0.0F, -11.0F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, -1)
						.addBox(0.0F, 0.0F, 2.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		LowerFin1.render(poseStack, buffer, packedLight, packedOverlay);
		LowerFin2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);

	}

	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Tail.yRot = -f * 0.45F * Mth.sin(0.6F * ageInTicks);
	}
}
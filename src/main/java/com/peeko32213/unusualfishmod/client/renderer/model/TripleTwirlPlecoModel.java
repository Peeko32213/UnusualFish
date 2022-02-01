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

public class TripleTwirlPlecoModel<Type extends Entity> extends EntityModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "triple_twirl_pleco"), "main");
	private final ModelPart Tail;
	private final ModelPart BigWhisker;
	private final ModelPart Whisker1;
	private final ModelPart Whisker2;
	private final ModelPart BigFin1;
	private final ModelPart BigFin2;
	private final ModelPart LittleFin1;
	private final ModelPart LittleFin2;
	private final ModelPart bb_main;

	public TripleTwirlPlecoModel(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.BigWhisker = root.getChild("BigWhisker");
		this.Whisker1 = root.getChild("Whisker1");
		this.Whisker2 = root.getChild("Whisker2");
		this.BigFin1 = root.getChild("BigFin1");
		this.BigFin2 = root.getChild("BigFin2");
		this.LittleFin1 = root.getChild("LittleFin1");
		this.LittleFin2 = root.getChild("LittleFin2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 17).addBox(
				0.0F, -5.0F, 0.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 4.0F));

		PartDefinition BigWhisker = partdefinition.addOrReplaceChild("BigWhisker",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.5F, 0.0F, -4.0F, 25.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, -5.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Whisker1 = partdefinition.addOrReplaceChild("Whisker1",
				CubeListBuilder.create().texOffs(18, 11).addBox(0.0F, 0.0F, -4.0F, 5.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 22.0F, -6.0F, 0.0F, -0.3491F, 0.1309F));

		PartDefinition Whisker2 = partdefinition.addOrReplaceChild("Whisker2",
				CubeListBuilder.create().texOffs(18, 11).mirror()
						.addBox(-5.0F, 0.0F, -4.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 22.0F, -6.0F, 0.0F, 0.3491F, -0.1309F));

		PartDefinition BigFin1 = partdefinition.addOrReplaceChild("BigFin1",
				CubeListBuilder.create().texOffs(16, 5).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 23.0F, -4.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition BigFin2 = partdefinition.addOrReplaceChild("BigFin2",
				CubeListBuilder.create().texOffs(16, 5).mirror()
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 23.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition LittleFin1 = partdefinition.addOrReplaceChild("LittleFin1",
				CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 23.0F, 2.0F, -0.0945F, -0.2909F, 0.3193F));

		PartDefinition LittleFin2 = partdefinition.addOrReplaceChild("LittleFin2",
				CubeListBuilder.create().texOffs(0, 5).mirror()
						.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 23.0F, 2.0F, -0.0945F, 0.2909F, -0.3193F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.0F, -11.0F, -4.0F, 0.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
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
		this.BigWhisker.yRot = -f * 0.30F * Mth.sin(0.1F * ageInTicks);
		this.Whisker1.xRot = -f * 0.30F * Mth.sin(0.1F * ageInTicks);
		this.Whisker2.xRot = -f * 0.30F * Mth.sin(0.1F * ageInTicks);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		BigWhisker.render(poseStack, buffer, packedLight, packedOverlay);
		Whisker1.render(poseStack, buffer, packedLight, packedOverlay);
		Whisker2.render(poseStack, buffer, packedLight, packedOverlay);
		BigFin1.render(poseStack, buffer, packedLight, packedOverlay);
		BigFin2.render(poseStack, buffer, packedLight, packedOverlay);
		LittleFin1.render(poseStack, buffer, packedLight, packedOverlay);
		LittleFin2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
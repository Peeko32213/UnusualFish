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

public class MudPigModel<Type extends Entity> extends EntityModel<Type> {

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "mud_pig"), "main");
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart SideWhisker1;
	private final ModelPart SideWhisker2;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public MudPigModel(ModelPart root) {
		this.Fin1 = root.getChild("Fin1");
		this.Fin2 = root.getChild("Fin2");
		this.BackFin1 = root.getChild("BackFin1");
		this.BackFin2 = root.getChild("BackFin2");
		this.SideWhisker1 = root.getChild("SideWhisker1");
		this.SideWhisker2 = root.getChild("SideWhisker2");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fin1 = partdefinition.addOrReplaceChild("Fin1",
				CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, -2.0F, 0.0F, -0.0873F, 0.1745F));

		PartDefinition Fin2 = partdefinition.addOrReplaceChild("Fin2",
				CubeListBuilder.create().texOffs(0, 24).mirror()
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 23.0F, -2.0F, 0.0F, 0.0873F, -0.1745F));

		PartDefinition BackFin1 = partdefinition.addOrReplaceChild("BackFin1",
				CubeListBuilder.create().texOffs(22, 24).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, 4.0F, 0.0F, -0.1745F, 0.3491F));

		PartDefinition BackFin2 = partdefinition.addOrReplaceChild("BackFin2",
				CubeListBuilder.create().texOffs(22, 24).mirror()
						.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 23.0F, 4.0F, 0.0F, 0.1745F, -0.3491F));

		PartDefinition SideWhisker1 = partdefinition.addOrReplaceChild("SideWhisker1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -4.0F, 3.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, -4.0F, 0.0F, 0.1745F, 0.48F));

		PartDefinition SideWhisker2 = partdefinition.addOrReplaceChild("SideWhisker2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.0F, 0.0F, -4.0F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 23.0F, -4.0F, 0.0F, -0.1745F, -0.48F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 1).addBox(
				0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 7.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -6.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(0.0F, -14.0F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
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
		this.Fin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fin1.render(poseStack, buffer, packedLight, packedOverlay);
		Fin2.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin1.render(poseStack, buffer, packedLight, packedOverlay);
		BackFin2.render(poseStack, buffer, packedLight, packedOverlay);
		SideWhisker1.render(poseStack, buffer, packedLight, packedOverlay);
		SideWhisker2.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
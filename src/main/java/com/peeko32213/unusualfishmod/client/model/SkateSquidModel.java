package com.peeko32213.unusualfishmod.client.model;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.SkateSquidEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class SkateSquidModel<T extends SkateSquidEntity> extends ListModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "skate_squid"), "main");
	private final ModelPart Eye1;
	private final ModelPart Eye2;
	private final ModelPart Fin1;
	private final ModelPart Fin2;
	private final ModelPart UpperArm1;
	private final ModelPart UpperArm2;
	private final ModelPart BigArm1;
	private final ModelPart BigArm2;
	private final ModelPart SideArm1;
	private final ModelPart SideArm3;
	private final ModelPart SideArm2;
	private final ModelPart SideArm4;
	private final ModelPart LowerArm1;
	private final ModelPart LowerArm2;
	private final ModelPart Body;
	private final ModelPart Cube_r1;


	public SkateSquidModel(ModelPart root) {
		this.Body = root.getChild("body");
		this.Cube_r1 = this.Body.getChild("cube_r1");
		this.Eye1 = this.Body.getChild("eye1");
		this.Eye2 = this.Body.getChild("eye2");
		this.Fin1 = this.Body.getChild("fin1");
		this.Fin2 = this.Body.getChild("fin2");
		this.UpperArm1 = this.Body.getChild("upperarm1");
		this.UpperArm2 = this.Body.getChild("upperarm2");
		this.BigArm1 = this.Body.getChild("bigarm1");
		this.BigArm2 = this.Body.getChild("bigarm2");
		this.SideArm1 = this.Body.getChild("sidearm1");
		this.SideArm3 = this.Body.getChild("sidearm3");
		this.SideArm2 = this.Body.getChild("sidearm2");
		this.SideArm4 = this.Body.getChild("sidearm4");
		this.LowerArm1 = this.Body.getChild("lowerarm1");
		this.LowerArm2 = this.Body.getChild("lowerarm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 35).addBox(-4.5F, 0.0F, -29.0F, 9.0F, 2.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -1.0F, 8.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 2.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 42).addBox(-4.5F, -9.0F, -8.0F, 9.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Eye1 = Body.addOrReplaceChild("eye1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.75F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, 3.0F, 11.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Eye2 = Body.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.25F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.75F, 3.0F, 11.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Fin1 = Body.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 0.0F, -20.0F, 9.0F, 2.0F, 33.0F, new CubeDeformation(0.01F))
				.texOffs(51, 0).addBox(-20.0F, 0.0F, 3.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offset(-4.5F, 0.0F, -9.0F));

		PartDefinition Fin2 = Body.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -20.0F, 9.0F, 2.0F, 33.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(51, 0).mirror().addBox(9.0F, 0.0F, 3.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(4.5F, 0.0F, -9.0F));

		PartDefinition UpperArm1 = Body.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(11, 10).addBox(-0.5F, -1.5F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 19).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.5F, 13.0F));

		PartDefinition UpperArm2 = Body.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(11, 10).mirror().addBox(-0.5F, -1.5F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 19).mirror().addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 0.5F, 13.0F));

		PartDefinition BigArm1 = Body.addOrReplaceChild("bigarm1", CubeListBuilder.create().texOffs(15, 0).addBox(-1.5F, -0.5F, 15.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(51, 12).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 2.5F, 13.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition BigArm2 = Body.addOrReplaceChild("bigarm2", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-0.5F, -0.5F, 15.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 12).mirror().addBox(-0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.25F, 2.5F, 13.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition SideArm1 = Body.addOrReplaceChild("sidearm1", CubeListBuilder.create().texOffs(9, 19).addBox(-0.5F, -0.5F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 11).addBox(-0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 13.0F, 0.1309F, -0.3927F, 0.0F));

		PartDefinition SideArm3 = Body.addOrReplaceChild("sidearm3", CubeListBuilder.create().texOffs(9, 19).mirror().addBox(-1.5F, -0.5F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 11).mirror().addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 1.0F, 13.0F, 0.1309F, 0.3927F, 0.0F));

		PartDefinition SideArm2 = Body.addOrReplaceChild("sidearm2", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -0.5F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.5F, 13.0F, -0.1309F, -0.3054F, 0.0F));

		PartDefinition SideArm4 = Body.addOrReplaceChild("sidearm4", CubeListBuilder.create().texOffs(18, 8).mirror().addBox(-1.5F, -0.5F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 3.5F, 13.0F, -0.1309F, 0.3054F, 0.0F));

		PartDefinition LowerArm2 = Body.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, -1.5F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 18).mirror().addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.5F, 13.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LowerArm1 = Body.addOrReplaceChild("lowerarm1", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -1.5F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.5F, 13.0F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.LowerArm1.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.LowerArm2.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.SideArm1.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.SideArm3.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.SideArm2.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.SideArm4.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.UpperArm1.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.UpperArm2.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.BigArm1.xRot = -f * 0.10F * Mth.sin(0.1F * ageInTicks);
		this.BigArm2.xRot = f * 0.10F * Mth.sin(0.1F * ageInTicks);

		this.Fin1.zRot = -f * 0.3F * Mth.sin(0.1F * ageInTicks);
		this.Fin2.zRot = f * 0.3F * Mth.sin(0.1F * ageInTicks);

		this.Body.xRot = headPitch * ((float)Math.PI / 180F);
		this.Body.yRot = netHeadYaw * ((float)Math.PI / 180F);
		if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
		}
	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of( this.Body);
	}
}
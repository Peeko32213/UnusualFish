package com.peeko32213.unusualfishmod.client.model;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.GnasherEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.RavagerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class GnasherModel<T extends GnasherEntity> extends ListModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "gnasher"), "main");
	private final ModelPart Body;
	private final ModelPart LowerJaw;
	private final ModelPart FrontFin1;
	private final ModelPart FrontFin2;
	private final ModelPart BackBody;
	private final ModelPart BackFin1;
	private final ModelPart BackFin2;
	private final ModelPart TailFin;

	public GnasherModel(ModelPart root) {
		this.Body = root.getChild("body");
		this.LowerJaw = this.Body.getChild("lowerjaw");
		this.FrontFin1 = this.Body.getChild("frontfin1");
		this.FrontFin2 = this.Body.getChild("frontfin2");
		this.BackBody = this.Body.getChild("backbody");
		this.BackFin1 = this.Body.getChild("backfin1");
		this.BackFin2 = this.Body.getChild("backfin2");
		this.TailFin = this.BackBody.getChild("tailfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(77, 90).addBox(-8.5F, -17.0F, -21.0F, 17.0F, 17.0F, 45.0F, new CubeDeformation(0.0F))
				.texOffs(73, 14).addBox(-4.5F, -13.0F, -44.0F, 9.0F, 8.0F, 23.0F, new CubeDeformation(0.01F))
				.texOffs(0, 0).addBox(-4.5F, -5.0F, -35.0F, 9.0F, 3.0F, 15.0F, new CubeDeformation(0.01F))
				.texOffs(73, 14).addBox(-1.0F, -37.0F, -10.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -42.0F, -10.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.0F, -40.0F, -8.0F, 0.0F, 23.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -14.0F));

		PartDefinition LowerJaw = Body.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(0, 36).addBox(-4.5F, -3.0F, -13.0F, 9.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-4.5F, 0.0F, -13.0F, 9.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, -21.0F));

		PartDefinition FrontFin1 = Body.addOrReplaceChild("frontfin1", CubeListBuilder.create().texOffs(88, 106).addBox(0.5F, 0.0F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(1.5F, 1.0F, -2.0F, 33.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -6.0F, -12.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition FrontFin2 = Body.addOrReplaceChild("frontfin2", CubeListBuilder.create().texOffs(88, 106).mirror().addBox(-10.5F, 0.0F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 0).mirror().addBox(-34.5F, 1.0F, -2.0F, 33.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -6.0F, -12.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition BackFin1 = Body.addOrReplaceChild("backfin1", CubeListBuilder.create().texOffs(31, 18).addBox(-0.5F, 0.0F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(56, 104).addBox(0.5F, 1.0F, -2.0F, 15.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -4.0F, 21.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition BackFin2 = Body.addOrReplaceChild("backfin2", CubeListBuilder.create().texOffs(31, 18).mirror().addBox(-5.5F, 0.0F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 104).mirror().addBox(-15.5F, 1.0F, -2.0F, 15.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0F, -4.0F, 21.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition BackBody = Body.addOrReplaceChild("backbody", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, 0.0F, 11.0F, 11.0F, 51.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -10.0F, 0.0F, 0.0F, 22.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -9.0F, 24.0F));

		PartDefinition TailFin = BackBody.addOrReplaceChild("tailfin", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -7.0F, 0.0F, 0.0F, 14.0F, 61.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -2.0F, 68.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.BackBody.yRot = -f * 0.45F * Mth.sin(0.2F * ageInTicks);
		this.TailFin.yRot = -f * 0.45F * Mth.sin(0.2F * ageInTicks);

		this.FrontFin1.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);
		this.FrontFin2.xRot = -f * 0.20F * Mth.sin(0.1F * ageInTicks);

		this.Body.xRot = headPitch * ((float)Math.PI / 180F);
		this.Body.yRot = netHeadYaw * ((float)Math.PI / 180F);
		if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
		}

	}

	public void prepareMobModel (T p_102957_, float p_102958_, float p_102959_, float p_102960_) {
		super.prepareMobModel(p_102957_, p_102958_, p_102959_, p_102960_);
		int l = p_102957_.getAttackAnimationTick();
		if (l > 0) {
			float f4 = Mth.sin(((float) l - p_102960_) / 10.0F * (float) Math.PI * 0.25F);
			this.LowerJaw.xRot = ((float) Math.PI / 2F) * f4;
			if (l > 5) {
				this.LowerJaw.xRot = Mth.sin(((float) (-4 + l) - p_102960_) / 4.0F) * (float) Math.PI * 0.4F;
			} else {
				this.LowerJaw.xRot = 0.15707964F * Mth.sin((float) Math.PI * ((float) l - p_102960_) / 10.0F);
			}
		}
	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of( this.Body);
	}
}
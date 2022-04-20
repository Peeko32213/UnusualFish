package com.peeko32213.unusualfishmod.client.model;// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.ThornyGuitarfishEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ThornyGuitarfishModel<T extends ThornyGuitarfishEntity> extends ListModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(UnusualFishMod.MODID, "thorny_guitarfish"), "main");
	private final ModelPart Tail;
	private final ModelPart Body;
	private final ModelPart Thorns1;
	private final ModelPart Thorns2;
	private final ModelPart Thorns3;
	private final ModelPart Thorns4;
	private final ModelPart Wing1;
	private final ModelPart Wing2;
	private final ModelPart Fin1;
	private final ModelPart Fin2;

	public ThornyGuitarfishModel(ModelPart root) {
		this.Body = root.getChild("body");
		this.Thorns1 = this.Body.getChild("thorns1");
		this.Thorns2 = this.Body.getChild("thorns2");
		this.Thorns3 = this.Body.getChild("thorns3");
		this.Thorns4 = this.Body.getChild("thorns4");
		this.Tail = this.Body.getChild("tail");
		this.Fin1 = this.Tail.getChild("fin1");
		this.Fin2 = this.Tail.getChild("fin2");
		this.Wing1 = this.Body.getChild("wing1");
		this.Wing2 = this.Body.getChild("wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0F, -6.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(14, 18).addBox(-1.5F, -3.0F, -10.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Thorns4 = Body.addOrReplaceChild("thorns4", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(0.0F, -1.0F, -6.0F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -5.0F, -2.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Thorns3 = Body.addOrReplaceChild("thorns3", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(0.0F, -1.0F, -6.0F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -5.0F, -3.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Thorns2 = Body.addOrReplaceChild("thorns2", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -1.0F, -6.0F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -5.0F, -3.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Thorns1 = Body.addOrReplaceChild("thorns1", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -1.0F, -6.0F, 0.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -5.0F, -2.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Wing1 = Body.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, 0.0F, -5.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Wing2 = Body.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-4.0F, 0.0F, -5.0F, 4.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5F, -2.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Tail = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 4.0F));

		PartDefinition Fin1 = Tail.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, -0.0873F, 0.4363F));

		PartDefinition Fin2 = Tail.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.0F, 0.0873F, -0.4363F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f = 1.0F;
		if (!entity.isInWater()) {
			f = 1.5F;
		}

		this.Wing1.zRot = -f * 0.3F * Mth.sin(0.1F * ageInTicks);
		this.Wing2.zRot = f * 0.3F * Mth.sin(0.1F * ageInTicks);
		this.Tail.yRot = -f * 0.2F * Mth.sin(0.4F * ageInTicks);

	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of( this.Body);
	}
}
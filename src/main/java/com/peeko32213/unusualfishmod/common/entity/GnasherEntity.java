package com.peeko32213.unusualfishmod.common.entity;


import com.peeko32213.unusualfishmod.common.entity.util.WaterMoveController;
import com.peeko32213.unusualfishmod.core.init.EntityInit;
import com.peeko32213.unusualfishmod.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class GnasherEntity extends WaterAnimal {
	protected int attackCooldown = 0;
	private int attackAnimationTick;

	public GnasherEntity(EntityType<? extends WaterAnimal> entityType, Level level) {
		super(entityType, level);
		this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
		this.lookControl = new SmoothSwimmingLookControl(this, 10);
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 60.0D).add(Attributes.MOVEMENT_SPEED, (double) 1.0D)
				.add(Attributes.ATTACK_DAMAGE, 8.0D);
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.5D, false));
		this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Animal.class, true));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Villager.class, true));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Squid.class, true));
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1.0D, 1) {
			@Override
			public boolean canUse() {
				return super.canUse() && isInWater();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0D, 15) {
			@Override
			public boolean canUse() {
				return !this.mob.isInWater() && super.canUse();
			}
		});
	}

	@Override
	public boolean doHurtTarget(Entity entityIn) {
		this.attackAnimationTick = 10;
		this.level.broadcastEntityEvent(this, (byte)4);
		float f = this.getAttackDamage();
		float f1 = (int)f > 0 ? f / 2.0F + (float)this.random.nextInt((int)f) : f;
		boolean flag = entityIn.hurt(DamageSource.mobAttack(this), f1);
		if (flag) {
			entityIn.setDeltaMovement(entityIn.getDeltaMovement().add(0.0D, (double)0.4F, 0.0D));
			this.doEnchantDamageEffects(this, entityIn);
		}
		return flag;
	}



	public void tick() {
		super.tick();

		if (this.attackCooldown > 0) {
			this.attackCooldown--;
		}

		if (this.level.isClientSide && this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.03D) {
			Vec3 vec3 = this.getViewVector(0.0F);
			float f = Mth.cos(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;
			float f1 = Mth.sin(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;

		}

		if(random.nextInt(15) == 0 && this.getTarget() instanceof SkateSquidEntity){
			this.spawnAtLocation(ItemInit.GNASHER_TOOTH.get());
		}

	}


	public void aiStep() {
		if (!this.isInWater() && this.onGround && this.verticalCollision) {
			this.setDeltaMovement(this.getDeltaMovement().add((double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F), (double)0.4F, (double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F)));
			this.onGround = false;
			this.hasImpulse = true;
			this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
		}

		super.aiStep();
		if (this.attackAnimationTick > 0) {
			--this.attackAnimationTick;
		}
	}

	protected PathNavigation createNavigation(Level p_27480_) {
		return new WaterBoundPathNavigation(this, p_27480_);
	}


	private float getAttackDamage() {
		return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
	}

	public void handleEntityEvent(byte p_28844_) {
		if (p_28844_ == 4) {
			this.attackAnimationTick = 10;
		}
	}

	public int getAttackAnimationTick() {
		return this.attackAnimationTick;
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.COD_AMBIENT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.COD_DEATH;
	}

	protected SoundEvent getHurtSound(DamageSource p_28281_) {
		return SoundEvents.COD_HURT;
	}

	protected SoundEvent getFlopSound() {
		return SoundEvents.COD_FLOP;
	}


	public static boolean canSpawn(EntityType<GnasherEntity> entityType, ServerLevelAccessor iServerWorld, MobSpawnType reason, BlockPos pos, Random random) {
		return reason == MobSpawnType.SPAWNER || iServerWorld.getBlockState(pos).getMaterial() == Material.WATER && iServerWorld.getBlockState(pos.above()).getMaterial() == Material.WATER && isLightLevelOk(pos, iServerWorld);
	}

	private static boolean isLightLevelOk(BlockPos pos, ServerLevelAccessor iServerWorld) {
		float time = iServerWorld.getTimeOfDay(1.0F);
		int light = iServerWorld.getMaxLocalRawBrightness(pos);
		return light <= 4 && time > 0.27F && time <= 0.8F;
	}

}

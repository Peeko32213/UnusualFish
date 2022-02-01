package com.peeko32213.unusualfishmod.common.entity;

import com.peeko32213.unusualfishmod.common.entity.util.BottomStrollGoal;
import com.peeko32213.unusualfishmod.core.init.Iteminit;


import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Random;


public class BarbedSkateEntity extends AbstractFish {
	protected int attackCooldown = 0;

	public BarbedSkateEntity(EntityType<? extends AbstractFish> entityType, Level level) {
		super(entityType, level);
	}
	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 5).add(Attributes.ATTACK_DAMAGE, 2);
	}

	public void registerGoals() {

		this.goalSelector.addGoal(3, new BottomStrollGoal(this, 0.8F, 7));
		this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)));
	}



	@Override
	public void tick() {
		super.tick();
		if (this.attackCooldown > 0) {
			this.attackCooldown--;
		}
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		if (!entity.isCreative() && this.attackCooldown == 0 && entity.level.getDifficulty() != Difficulty.PEACEFUL) {
			entity.hurt(DamageSource.mobAttack(this), 2.0F);
			this.attackCooldown = 80;
		}
	}

	@Override
	public ItemStack getBucketItemStack() {
		return new ItemStack(Iteminit.BARBED_BUCKET.get());
	}

	public SoundEvent getAmbientSound() {
		return SoundEvents.COD_AMBIENT;
	}

	public SoundEvent getDeathSound() {
		return SoundEvents.COD_DEATH;
	}

	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.COD_HURT;
	}

	public SoundEvent getFlopSound() {
		return SoundEvents.COD_FLOP;
	}

	public static boolean canSpawn(EntityType<BarbedSkateEntity> entity, LevelAccessor levelAccess, MobSpawnType spawnType, BlockPos pos, Random random ) {
		return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(entity, levelAccess, spawnType, pos, random);
	}

}


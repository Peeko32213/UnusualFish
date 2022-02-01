package com.peeko32213.unusualfishmod.common.entity;

import com.peeko32213.unusualfishmod.common.entity.util.BottomStrollGoal;
import com.peeko32213.unusualfishmod.core.init.Iteminit;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Random;

public class TripleTwirlPlecoEntity extends AbstractFish {

	public TripleTwirlPlecoEntity(EntityType<? extends AbstractFish> entityType, Level level) {
		super(entityType, level);

	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 2.0D).add(Attributes.ARMOR, 2.0D);
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(3, new BottomStrollGoal(this, 1.0F, 7));
	}

	protected boolean canRandomSwim() {
		return true;
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

	@Override
	public ItemStack getBucketItemStack() {
        return new ItemStack(Iteminit.TRIPLE_TWIRL_PLECO_BUCKET.get());

	}

	public static boolean canSpawn(EntityType<TripleTwirlPlecoEntity> entity, LevelAccessor levelAccess, MobSpawnType spawnType, BlockPos pos, Random random ) {
		return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(entity, levelAccess, spawnType, pos, random);
	}

}

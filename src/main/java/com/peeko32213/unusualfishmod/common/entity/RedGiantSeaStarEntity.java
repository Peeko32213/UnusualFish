package com.peeko32213.unusualfishmod.common.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.Random;

public class RedGiantSeaStarEntity extends WaterAnimal{
	
	public RedGiantSeaStarEntity(EntityType<? extends WaterAnimal> entityType, Level level) {
		super(entityType, level);
		this.moveControl = new RedGiantSeaStarEntity.MoveHelperController(this);
		this.maxUpStep = 0.7f;
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 30.0D).add(Attributes.MOVEMENT_SPEED, (double) 0.2F).add(Attributes.ATTACK_DAMAGE, 5.0D).add(Attributes.ARMOR, 3.0D);
	}
	
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.3D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, SeaSpiderEntity.class, 20F, 0.3F, 1.0F));
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.5F));
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 0.2F));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
    }

	protected PathNavigation createNavigation(Level p_27480_) {
		return new GroundPathNavigation(this, level);
	}

	@Override
	public float getWaterSlowDown() {
		return 0.9f;
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.COD_AMBIENT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.COD_DEATH;
	}

	protected SoundEvent getHurtSound(DamageSource p_28281_) {
		return SoundEvents.SLIME_BLOCK_HIT;
	}

	static class MoveHelperController extends MoveControl {
		private final Mob star;

		MoveHelperController(Mob star) {
			super(star);
			this.star = star;
		}

		public void tick() {
			if (this.star.isEyeInFluid(FluidTags.WATER)) {
				this.star.setDeltaMovement(this.star.getDeltaMovement().add(0.0D, 0.0D, 0.0D));
			}

			if (this.operation == MoveControl.Operation.MOVE_TO && !this.star.getNavigation().isDone()) {
				double d0 = this.wantedX - this.star.getX();
				double d1 = this.wantedY - this.star.getY();
				double d2 = this.wantedZ - this.star.getZ();
				double d3 = Mth.sqrt((float) (d0 * d0 + d1 * d1 + d2 * d2));
				d1 = d1 / d3;
				float f = (float) (Mth.atan2(d2, d0) * (double) (180F / (float) Math.PI)) - 90.0F;
				this.star.yRot = this.rotlerp(this.star.yRot, f, 90.0F);
				this.star.yBodyRot = this.star.yRot;
				float f1 = (float) (this.speedModifier * this.star.getAttributeValue(Attributes.MOVEMENT_SPEED));
				this.star.setSpeed(Mth.lerp(0.125F, this.star.getSpeed(), f1));
				this.star.setDeltaMovement(this.star.getDeltaMovement().add(0.0D, (double) this.star.getSpeed() * d1 * 0.1D, 0.0D));
			} else {
				this.star.setSpeed(0.0F);
			}
		}
	}

	public static boolean canSpawn(EntityType<RedGiantSeaStarEntity> entity, LevelAccessor levelAccess, MobSpawnType spawnType, BlockPos pos, Random random ) {
		return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(entity, levelAccess, spawnType, pos, random);
	}

}

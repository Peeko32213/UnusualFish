package com.peeko32213.unusualfishmod.common.item;

import java.util.function.Supplier;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.DistExecutor;

public class ItemModFishBucket extends BucketItem {
	private final boolean hasTooltip;
	private final Supplier<? extends Fluid> fluid;
	private final Item item;

	public ItemModFishBucket(Supplier<? extends EntityType<?>> entityType, Supplier<? extends Fluid> fluid, Item item,
			boolean hasTooltip, Properties builder) {
		super(fluid, builder);
		this.fluid = fluid;
		this.hasTooltip = hasTooltip;
		this.entityTypeSupplier = entityType;
		this.item = item;
		DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> UnusualFishMod.CALLBACKS.add(() -> ItemProperties.register(this, new ResourceLocation(UnusualFishMod.MODID, "variant"), (stack, world, player, i) -> stack.hasTag() ? stack.getTag().getInt("Variant") : 0)));

	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
		ItemStack itemstack = playerIn.getItemInHand(handIn);
		BlockHitResult raytraceresult = getPlayerPOVHitResult(worldIn, playerIn, ClipContext.Fluid.NONE);
		InteractionResultHolder<ItemStack> ret = ForgeEventFactory.onBucketUse(playerIn, worldIn, itemstack,
				raytraceresult);
		if (ret != null)
			return ret;
		if (raytraceresult.getType() == BlockHitResult.Type.MISS) {
			return InteractionResultHolder.pass(itemstack);
		} else if (raytraceresult.getType() != BlockHitResult.Type.BLOCK) {
			return InteractionResultHolder.pass(itemstack);
		} else {
			BlockPos blockpos = raytraceresult.getBlockPos();
			Direction direction = raytraceresult.getDirection();
			BlockPos blockpos1 = blockpos.relative(direction);
			if (worldIn.mayInteract(playerIn, blockpos) && playerIn.mayUseItemAt(blockpos1, direction, itemstack)) {
				BlockState blockstate = worldIn.getBlockState(blockpos);
				BlockPos blockpos2 = blockstate.getBlock() instanceof LiquidBlockContainer
						&& ((LiquidBlockContainer) blockstate.getBlock()).canPlaceLiquid(worldIn, blockpos, blockstate,
								fluid.get()) ? blockpos : blockpos1;
				this.emptyContents(playerIn, worldIn, blockpos2, raytraceresult);
				if (worldIn instanceof ServerLevel)
					this.placeEntity((ServerLevel) worldIn, itemstack, blockpos2);
				if (playerIn instanceof ServerPlayer) {
					CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) playerIn, blockpos2, itemstack);
				}

				playerIn.awardStat(Stats.ITEM_USED.get(this));
				return InteractionResultHolder.sidedSuccess(this.getEmptySuccessItem(itemstack, playerIn),
						worldIn.isClientSide());
			} else {
				return InteractionResultHolder.fail(itemstack);
			}
		}
	}



	private void placeEntity(ServerLevel worldIn, ItemStack stack, BlockPos pos) {
		Entity entity = this.entityTypeSupplier.get().spawn(worldIn, stack, null, pos, MobSpawnType.BUCKET, true,
				false);
		if (entity != null) {
			if (entity instanceof AbstractFish) {
				((AbstractFish) entity).setFromBucket(true);
			}
		}
	}

	private final Supplier<? extends EntityType<?>> entityTypeSupplier;

	protected EntityType<?> getEntityType() {
		return entityTypeSupplier.get();
	}
}
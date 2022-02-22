package com.peeko32213.unusualfishmod.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;

import java.util.function.Supplier;

public class ItemModFishBucket extends MobBucketItem {

	public ItemModFishBucket(Supplier<? extends EntityType<?>> entityType) {
		super(entityType, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1));
	}

}
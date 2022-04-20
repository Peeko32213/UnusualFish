package com.peeko32213.unusualfishmod.core;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.function.Supplier;

public class DepthScytheMaterial implements Tier {

    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public DepthScytheMaterial(float attackDamageBonus, int enchantability, int harvestLevel, float speed,
                            int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.speed = speed;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getUses() {
        return this.durability;
    }

    public static float getSweepingDamageRatio(int p_45194_) {
        return 1.0F - 1.0F / (float)(p_45194_ + 1);
    }
}

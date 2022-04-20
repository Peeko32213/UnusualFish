package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.core.DepthScytheMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class BaseMaterialInit {
    private BaseMaterialInit(){
    }

    protected static final Tier PRAWN = new DepthScytheMaterial(2.0f,10,2,0.01f, 1000,
            () -> Ingredient.of(ItemInit.DEPTH_SCYTHE.get()));

}

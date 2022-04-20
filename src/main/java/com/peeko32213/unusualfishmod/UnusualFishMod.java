package com.peeko32213.unusualfishmod;

import com.peeko32213.unusualfishmod.core.init.BlockInit;
import com.peeko32213.unusualfishmod.core.init.EntityInit;

import com.peeko32213.unusualfishmod.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

@Mod(UnusualFishMod.MODID)
public class UnusualFishMod {
public static final String MODID = "unusualfishmod";
public static final List<Runnable> CALLBACKS = new ArrayList<>();


public UnusualFishMod() {

	var bus = FMLJavaModLoadingContext.get().getModEventBus();

	ItemInit.ITEMS.register(bus);
	EntityInit.ENTITIES.register(bus);
	BlockInit.BLOCKS.register(bus);


}

public static final CreativeModeTab UNUSUAL_TAB = new CreativeModeTab(MODID) {
	@Override
	public ItemStack makeIcon() {
		return ItemInit.RAW_RHINO_TETRA.get().getDefaultInstance();
	}
};

}
 
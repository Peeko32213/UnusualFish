package com.peeko32213.unusualfishmod;

import com.peeko32213.unusualfishmod.core.init.EntityInit;

import com.peeko32213.unusualfishmod.core.init.Iteminit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnusualFishMod.MODID)
public class UnusualFishMod {
public static final String MODID = "unusualfishmod";

public UnusualFishMod() {
	
	var bus = FMLJavaModLoadingContext.get().getModEventBus();
	
	Iteminit.ITEMS.register(bus);
	EntityInit.ENTITIES.register(bus);
	
}

}
 
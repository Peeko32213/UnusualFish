package com.peeko32213.unusualfishmod.core.event;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.*;
import com.peeko32213.unusualfishmod.core.init.EntityInit;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = UnusualFishMod.MODID, bus = Bus.MOD)
public class CommonModEvents {

	@SubscribeEvent
	public static void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpawnPlacements.register(EntityInit.AERO_MONO.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, AeroMonoEntity::canSpawn);

			SpawnPlacements.register(EntityInit.AHMAR_IDOL.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, AhmarIdolEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BARBED_SKATE.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, BarbedSkateEntity::canSpawn);

			SpawnPlacements.register(EntityInit.CLOWNTHORN_SHARK.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, ClownthornSharkEntity::canSpawn);

			SpawnPlacements.register(EntityInit.DUALITY_DAMSELFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, DualityDamselfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.HANDY_GOURAMI.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, HandyGouramiEntity::canSpawn);

			SpawnPlacements.register(EntityInit.MOSSTHORN.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, MossthornEntity::canSpawn);

			SpawnPlacements.register(EntityInit.MUD_PIG.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, MudPigEntity::canSpawn);

			SpawnPlacements.register(EntityInit.REDGIANT_SEASTAR.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, RedGiantSeaStarEntity::canSpawn);

			SpawnPlacements.register(EntityInit.RHINO_TETRA.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, RhinoTetraEntity::canSpawn);

			SpawnPlacements.register(EntityInit.RIPPER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, RipperEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SAILOR_BARB.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, SailorBarbEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SEA_PANCAKE.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, SeaPancakeEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SEA_SPIDER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, SeaSpiderEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SPINDLEFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, SpindlefishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.TRIPLE_TWIRL_PLECO.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, TripleTwirlPlecoEntity::canSpawn);

			SpawnPlacements.register(EntityInit.ZEBRA_CORNETFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, ZebraCornetfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.TIGER_PUFFER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, TigerPufferEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BUMPFACE.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, BumpfaceEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BRICK_SNAIL.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, BrickSnailEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BLACKCAP_SNAIL.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, BlackCapSnailEntity::canSpawn);
		});

	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {

		event.put(EntityInit.DUALITY_DAMSELFISH.get(), DualityDamselfishEntity.createAttributes().build());

		event.put(EntityInit.MOSSTHORN.get(), MossthornEntity.createAttributes().build());

		event.put(EntityInit.RIPPER.get(), RipperEntity.createAttributes().build());

		event.put(EntityInit.SPINDLEFISH.get(), SpindlefishEntity.createAttributes().build());

		event.put(EntityInit.RHINO_TETRA.get(), RhinoTetraEntity.createAttributes().build());

		event.put(EntityInit.HANDY_GOURAMI.get(), HandyGouramiEntity.createAttributes().build());

		event.put(EntityInit.SAILOR_BARB.get(), SailorBarbEntity.createAttributes().build());

		event.put(EntityInit.SEA_SPIDER.get(), SeaSpiderEntity.createAttributes().build());

		event.put(EntityInit.TRIPLE_TWIRL_PLECO.get(), TripleTwirlPlecoEntity.createAttributes().build());

		event.put(EntityInit.AERO_MONO.get(), AeroMonoEntity.createAttributes().build());

		event.put(EntityInit.CLOWNTHORN_SHARK.get(), ClownthornSharkEntity.createAttributes().build());

		event.put(EntityInit.BARBED_SKATE.get(), BarbedSkateEntity.createAttributes().build());

		event.put(EntityInit.REDGIANT_SEASTAR.get(), RedGiantSeaStarEntity.createAttributes().build());

		event.put(EntityInit.AHMAR_IDOL.get(), AhmarIdolEntity.createAttributes().build());

		event.put(EntityInit.MUD_PIG.get(), MudPigEntity.createAttributes().build());

		event.put(EntityInit.SEA_PANCAKE.get(), SeaPancakeEntity.createAttributes().build());

		event.put(EntityInit.BRICK_SNAIL.get(), BrickSnailEntity.createAttributes().build());

		event.put(EntityInit.ZEBRA_CORNETFISH.get(), ZebraCornetfishEntity.createAttributes().build());

		event.put(EntityInit.TIGER_PUFFER.get(), TigerPufferEntity.createAttributes().build());

		event.put(EntityInit.BLACKCAP_SNAIL.get(), BlackCapSnailEntity.createAttributes().build());

		event.put(EntityInit.BUMPFACE.get(), BumpfaceEntity.createAttributes().build());

	}

}

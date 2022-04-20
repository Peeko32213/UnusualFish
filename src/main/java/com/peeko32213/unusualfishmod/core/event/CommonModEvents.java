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

			SpawnPlacements.register(EntityInit.THORNY_GUITARFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, ThornyGuitarfishEntity::canSpawn);

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

			SpawnPlacements.register(EntityInit.DEEP_CRAWLER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, DeepCrawlerEntity::canSpawn);

			SpawnPlacements.register(EntityInit.FRESHWATER_MANTIS.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, FreshwaterMantisEntity::canSpawn);

			SpawnPlacements.register(EntityInit.PORCUPINE_LOBSTA.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, PorcupineLobsterEntity::canSpawn);

			SpawnPlacements.register(EntityInit.WIZARD_JELLY.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, ManaJellyfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.TRUMPET_SQUID.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, TrumpetSquidEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BARK_ANGELFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, BarkAngelfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.DRAGON_BICHIR.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, DragonBichirEntity::canSpawn);

			SpawnPlacements.register(EntityInit.KALAPPA.get(), SpawnPlacements.Type.ON_GROUND,
					Heightmap.Types.WORLD_SURFACE, KalappaEntity::canSpawn);

			SpawnPlacements.register(EntityInit.LOBED_SKIPPER.get(), SpawnPlacements.Type.ON_GROUND,
					Heightmap.Types.WORLD_SURFACE, LobedSkipperEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SHOCKCAT.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, ShockcatEntity::canSpawn);

			SpawnPlacements.register(EntityInit.THORN_SNAIL.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, ThornySnailEntity::canSpawn);

			//New Stuff

			SpawnPlacements.register(EntityInit.BEAKED_HERRING.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, BeakedHerringEntity::canSpawn);

			SpawnPlacements.register(EntityInit.PICKLEFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, PicklefishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.CAVE_LOACH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, CaveLoachEntity::canSpawn);

			SpawnPlacements.register(EntityInit.DEMON_HERRING.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, DemonHerringEntity::canSpawn);

			SpawnPlacements.register(EntityInit.YELLOW_GOBY.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, YellowWhipGobyEntity::canSpawn);

			SpawnPlacements.register(EntityInit.FALSE_SWORD.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, FalseSwordfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.COPPERFLAME.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, CopperflameAnthiasEntity::canSpawn);

			SpawnPlacements.register(EntityInit.POGGLING.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, HumpbackPogglingEntity::canSpawn);

			SpawnPlacements.register(EntityInit.GRAVEL_FLOUNDER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, GravelFlounderEntity::canSpawn);

			SpawnPlacements.register(EntityInit.ROOTBALL.get(), SpawnPlacements.Type.ON_GROUND,
					Heightmap.Types.WORLD_SURFACE, RootballEntity::canSpawn);

			SpawnPlacements.register(EntityInit.CELESTIAL_FISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, CelestialFishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.GNASHER.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, GnasherEntity::canSpawn);

			SpawnPlacements.register(EntityInit.DEPTH_PRAWN.get(), SpawnPlacements.Type.ON_GROUND,
					Heightmap.Types.WORLD_SURFACE, DepthPrawnEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SQUODDLE.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, SquoddleEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SEA_MOSQUITO.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, SeaMosquitoEntity::canSpawn);

			SpawnPlacements.register(EntityInit.FORKFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, ForkfishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SPOON_SHARK.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, SpoonSharkEntity::canSpawn);

			SpawnPlacements.register(EntityInit.CORAL_SKRIMP.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.OCEAN_FLOOR, CoralSkrimpEntity::canSpawn);

			SpawnPlacements.register(EntityInit.SKATE_SQUID.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, SkateSquidEntity::canSpawn);

			SpawnPlacements.register(EntityInit.CIRCUSFISH.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, CircusFishEntity::canSpawn);

			SpawnPlacements.register(EntityInit.BLIZZARDFIN.get(), SpawnPlacements.Type.IN_WATER,
					Heightmap.Types.WORLD_SURFACE, BlizzardfinTunaEntity::canSpawn);
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

		event.put(EntityInit.THORNY_GUITARFISH.get(), ThornyGuitarfishEntity.createAttributes().build());

		event.put(EntityInit.REDGIANT_SEASTAR.get(), RedGiantSeaStarEntity.createAttributes().build());

		event.put(EntityInit.AHMAR_IDOL.get(), AhmarIdolEntity.createAttributes().build());

		event.put(EntityInit.MUD_PIG.get(), MudPigEntity.createAttributes().build());

		event.put(EntityInit.SEA_PANCAKE.get(), SeaPancakeEntity.createAttributes().build());

		event.put(EntityInit.BRICK_SNAIL.get(), BrickSnailEntity.createAttributes().build());

		event.put(EntityInit.ZEBRA_CORNETFISH.get(), ZebraCornetfishEntity.createAttributes().build());

		event.put(EntityInit.TIGER_PUFFER.get(), TigerPufferEntity.createAttributes().build());

		event.put(EntityInit.BLACKCAP_SNAIL.get(), BlackCapSnailEntity.createAttributes().build());

		event.put(EntityInit.BUMPFACE.get(), BumpfaceEntity.createAttributes().build());

		event.put(EntityInit.DEEP_CRAWLER.get(), DeepCrawlerEntity.createAttributes().build());

		event.put(EntityInit.WIZARD_JELLY.get(), ManaJellyfishEntity.createAttributes().build());

		event.put(EntityInit.PORCUPINE_LOBSTA.get(), PorcupineLobsterEntity.createAttributes().build());

		event.put(EntityInit.TRUMPET_SQUID.get(), TrumpetSquidEntity.createAttributes().build());

		event.put(EntityInit.FRESHWATER_MANTIS.get(), FreshwaterMantisEntity.createAttributes().build());

		event.put(EntityInit.BARK_ANGELFISH.get(), BarkAngelfishEntity.createAttributes().build());

		event.put(EntityInit.SHOCKCAT.get(), ShockcatEntity.createAttributes().build());

		event.put(EntityInit.THORN_SNAIL.get(), ThornySnailEntity.createAttributes().build());

		event.put(EntityInit.KALAPPA.get(), KalappaEntity.createAttributes().build());

		event.put(EntityInit.LOBED_SKIPPER.get(), LobedSkipperEntity.createAttributes().build());

		event.put(EntityInit.DRAGON_BICHIR.get(), DragonBichirEntity.createAttributes().build());

		//New Stuff

		event.put(EntityInit.BEAKED_HERRING.get(), BeakedHerringEntity.createAttributes().build());

		event.put(EntityInit.PICKLEFISH.get(), PicklefishEntity.createAttributes().build());

		event.put(EntityInit.CAVE_LOACH.get(), CaveLoachEntity.createAttributes().build());

		event.put(EntityInit.DEMON_HERRING.get(), DemonHerringEntity.createAttributes().build());

		event.put(EntityInit.YELLOW_GOBY.get(), YellowWhipGobyEntity.createAttributes().build());

		event.put(EntityInit.HATCHET_FISH.get(), HatchetFishEntity.createAttributes().build());

		event.put(EntityInit.FALSE_SWORD.get(), FalseSwordfishEntity.createAttributes().build());

		event.put(EntityInit.COPPERFLAME.get(), CopperflameAnthiasEntity.createAttributes().build());

		event.put(EntityInit.POGGLING.get(), HumpbackPogglingEntity.createAttributes().build());

		event.put(EntityInit.GRAVEL_FLOUNDER.get(), GravelFlounderEntity.createAttributes().build());

		event.put(EntityInit.ROOTBALL.get(), RootballEntity.createAttributes().build());

		event.put(EntityInit.CELESTIAL_FISH.get(), CelestialFishEntity.createAttributes().build());

		event.put(EntityInit.GNASHER.get(), GnasherEntity.createAttributes().build());

		event.put(EntityInit.DEPTH_PRAWN.get(), DepthPrawnEntity.createAttributes().build());

		event.put(EntityInit.SQUODDLE.get(), SquoddleEntity.createAttributes().build());

		event.put(EntityInit.SEA_MOSQUITO.get(), SeaMosquitoEntity.createAttributes().build());

		event.put(EntityInit.FORKFISH.get(), ForkfishEntity.createAttributes().build());

		event.put(EntityInit.SPOON_SHARK.get(), SpoonSharkEntity.createAttributes().build());

		event.put(EntityInit.CORAL_SKRIMP.get(), CoralSkrimpEntity.createAttributes().build());

		event.put(EntityInit.SKATE_SQUID.get(), SkateSquidEntity.createAttributes().build());

		event.put(EntityInit.CIRCUSFISH.get(), CircusFishEntity.createAttributes().build());

		event.put(EntityInit.BLIZZARDFIN.get(), BlizzardfinTunaEntity.createAttributes().build());

		event.put(EntityInit.WHISKERED.get(), WhiskeredWhaleSharkEntity.createAttributes().build());

	}

}

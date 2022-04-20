package com.peeko32213.unusualfishmod.core.event;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.core.init.EntityInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnusualFishMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class CommonForgeEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {

        if (event.getName().equals(new ResourceLocation("minecraft:frozen_river"))) {
            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.AERO_MONO.get(), 5, 3, 9));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLACKCAP_SNAIL.get(), 2, 2, 3));
        }

        if (event.getName().equals(new ResourceLocation("minecraft:deep_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_SPIDER.get(), 4, 4, 5));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.SKATE_SQUID.get(), 5, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SQUODDLE.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.DEMON_HERRING.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.GNASHER.get(), 5, 1, 2));
        }

        if (event.getName().equals(new ResourceLocation("minecraft:warm_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.CLOWNTHORN_SHARK.get(), 3, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.DUALITY_DAMSELFISH.get(), 2, 2, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SPINDLEFISH.get(), 3, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.TIGER_PUFFER.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.ZEBRA_CORNETFISH.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BUMPFACE.get(), 10, 3, 4));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.PICKLEFISH.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.CORAL_SKRIMP.get(), 3, 3, 4));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_MOSQUITO.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.FORKFISH.get(), 3, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:lukewarm_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_PANCAKE.get(), 10, 1, 1));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.CLOWNTHORN_SHARK.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.PORCUPINE_LOBSTA.get(), 1, 3, 4));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 8, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SPOON_SHARK.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.CIRCUSFISH.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.COPPERFLAME.get(), 3, 2, 4));
        }

        if (event.getName().equals(new ResourceLocation("minecraft:deep_lukewarm_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_PANCAKE.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.AHMAR_IDOL.get(), 2, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 8, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.PORCUPINE_LOBSTA.get(), 2, 4, 6));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.TRUMPET_SQUID.get(), 1, 1, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.COPPERFLAME.get(), 5, 4, 5));
        }

        if (event.getName().equals(new ResourceLocation("minecraft:river"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.RHINO_TETRA.get(), 5, 3, 9));

            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(EntityInit.RIPPER.get(), 2, 5, 7));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.TRIPLE_TWIRL_PLECO.get(), 3, 2, 4));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLACKCAP_SNAIL.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.THORN_SNAIL.get(), 2, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:swamp"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.THORNY_GUITARFISH.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.HANDY_GOURAMI.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.MUD_PIG.get(), 2, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SAILOR_BARB.get(), 5, 3, 9));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLACKCAP_SNAIL.get(), 5, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.FRESHWATER_MANTIS.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.LOBED_SKIPPER.get(), 5, 3, 4));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.DRAGON_BICHIR.get(), 3, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BARK_ANGELFISH.get(), 5, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:lush_caves"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.MOSSTHORN.get(), 5, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:cold_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.REDGIANT_SEASTAR.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 2, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.POGGLING.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLIZZARDFIN.get(), 5, 3, 5));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:frozen_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.REDGIANT_SEASTAR.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 2, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.POGGLING.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLIZZARDFIN.get(), 5, 3, 5));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.WIZARD_JELLY.get(), 1, 3, 5));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.CELESTIAL_FISH.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BEAKED_HERRING.get(), 1, 3, 5));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.GRAVEL_FLOUNDER.get(), 1, 3, 5));
        }

        if (event.getName().equals(new ResourceLocation("minecraft:mushroom_fields"))) {

            event.getSpawns().addSpawn(MobCategory.AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.KALAPPA.get(), 5, 2, 3));

        }

        event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                new MobSpawnSettings.SpawnerData(EntityInit.DEEP_CRAWLER.get(), 1, 2, 3));

        event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                new MobSpawnSettings.SpawnerData(EntityInit.SHOCKCAT.get(), 20, 1, 2));

        event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                new MobSpawnSettings.SpawnerData(EntityInit.FALSE_SWORD.get(), 3, 2, 3));

        event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                new MobSpawnSettings.SpawnerData(EntityInit.CAVE_LOACH.get(), 3, 1, 2));

        event.getSpawns().addSpawn(MobCategory.MONSTER,
                new MobSpawnSettings.SpawnerData(EntityInit.DEPTH_PRAWN.get(), 100, 1, 2));
    }

    }



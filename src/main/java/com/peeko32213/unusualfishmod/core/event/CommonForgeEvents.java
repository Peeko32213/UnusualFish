package com.peeko32213.unusualfishmod.core.event;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.core.init.EntityInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
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

        }

        if (event.getName().equals(new ResourceLocation("minecraft:lukewarm_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_PANCAKE.get(), 5, 1, 1));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.CLOWNTHORN_SHARK.get(), 3, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 5, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:deep_lukewarm_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.SEA_PANCAKE.get(), 5, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.AHMAR_IDOL.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 5, 2, 3));

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

        }

        if (event.getName().equals(new ResourceLocation("minecraft:swamp"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BARBED_SKATE.get(), 1, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.HANDY_GOURAMI.get(), 3, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.MUD_PIG.get(), 2, 2, 3));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.SAILOR_BARB.get(), 5, 3, 9));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BLACKCAP_SNAIL.get(), 5, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:lush_caves"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.MOSSTHORN.get(), 25, 2, 3));

        }

        if (event.getName().equals(new ResourceLocation("minecraft:cold_ocean"))) {

            event.getSpawns().addSpawn(MobCategory.WATER_CREATURE,
                    new MobSpawnSettings.SpawnerData(EntityInit.REDGIANT_SEASTAR.get(), 10, 1, 2));

            event.getSpawns().addSpawn(MobCategory.WATER_AMBIENT,
                    new MobSpawnSettings.SpawnerData(EntityInit.BRICK_SNAIL.get(), 2, 2, 3));
        }

    }

    }



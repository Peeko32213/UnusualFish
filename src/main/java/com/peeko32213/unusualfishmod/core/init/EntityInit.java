package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.entity.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

	private EntityInit() {

	}

	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			UnusualFishMod.MODID);

	public static final RegistryObject<EntityType<DualityDamselfishEntity>> DUALITY_DAMSELFISH = ENTITIES.register("duality_damselfish",
			() -> EntityType.Builder.of(DualityDamselfishEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "duality_damselfish").toString()));

	public static final RegistryObject<EntityType<MossthornEntity>> MOSSTHORN = ENTITIES.register("mossthorn",
			() -> EntityType.Builder.of(MossthornEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).sized(0.5f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "mossthorn").toString()));

	public static final RegistryObject<EntityType<RipperEntity>> RIPPER = ENTITIES.register("ripper",
			() -> EntityType.Builder.of(RipperEntity::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.7f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "ripper").toString()));

	public static final RegistryObject<EntityType<SpindlefishEntity>> SPINDLEFISH = ENTITIES.register("spindlefish",
			() -> EntityType.Builder.of(SpindlefishEntity::new, MobCategory.WATER_AMBIENT).sized(0.6f, 0.7f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "spindlefish").toString()));

	public static final RegistryObject<EntityType<RhinoTetraEntity>> RHINO_TETRA = ENTITIES.register("rhino_tetra",
			() -> EntityType.Builder.of(RhinoTetraEntity::new, MobCategory.WATER_CREATURE).sized(0.2f, 0.2f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "rhino_tetra").toString()));

	public static final RegistryObject<EntityType<HandyGouramiEntity>> HANDY_GOURAMI = ENTITIES
			.register("handy_gourami", () -> EntityType.Builder.of(HandyGouramiEntity::new, MobCategory.WATER_AMBIENT)
					.sized(0.9f, 0.9f).build(new ResourceLocation(UnusualFishMod.MODID, "handy_gourami").toString()));

	public static final RegistryObject<EntityType<SailorBarbEntity>> SAILOR_BARB = ENTITIES.register("sailor_barb",
			() -> EntityType.Builder.of(SailorBarbEntity::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "sailor_barb").toString()));

	public static final RegistryObject<EntityType<SeaSpiderEntity>> SEA_SPIDER = ENTITIES.register("sea_spider",
			() -> EntityType.Builder.of(SeaSpiderEntity::new, MobCategory.WATER_AMBIENT).sized(0.9f, 0.9f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "sea_spider").toString()));

	public static final RegistryObject<EntityType<TripleTwirlPlecoEntity>> TRIPLE_TWIRL_PLECO = ENTITIES.register("triple_twirl_pleco",
			() -> EntityType.Builder.of(TripleTwirlPlecoEntity::new, MobCategory.WATER_AMBIENT).sized(0.9f, 0.9f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "triple_twirl_pleco").toString()));

	public static final RegistryObject<EntityType<AeroMonoEntity>> AERO_MONO = ENTITIES.register("aero_mono",
			() -> EntityType.Builder.of(AeroMonoEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "aero_mono").toString()));

	public static final RegistryObject<EntityType<ClownthornSharkEntity>> CLOWNTHORN_SHARK = ENTITIES.register("clownthorn_shark",
			() -> EntityType.Builder.of(ClownthornSharkEntity::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.6f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "clownthorn_shark").toString()));

	public static final RegistryObject<EntityType<ThornyGuitarfishEntity>> THORNY_GUITARFISH = ENTITIES.register("thorny_guitarfish",
			() -> EntityType.Builder.of(ThornyGuitarfishEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "thorny_guitarfish").toString()));

	public static final RegistryObject<EntityType<RedGiantSeaStarEntity>> REDGIANT_SEASTAR = ENTITIES.register("redgiant_seastar",
			() -> EntityType.Builder.of(RedGiantSeaStarEntity::new, MobCategory.WATER_CREATURE).sized(2.0f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "redgiant_seastar").toString()));

	public static final RegistryObject<EntityType<SeaPancakeEntity>> SEA_PANCAKE = ENTITIES.register("sea_pancake",
			() -> EntityType.Builder.of(SeaPancakeEntity::new, MobCategory.WATER_CREATURE).sized(3.0f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "sea_pancake").toString()));

	public static final RegistryObject<EntityType<MudPigEntity>> MUD_PIG = ENTITIES.register("mud_pig",
			() -> EntityType.Builder.of(MudPigEntity::new, MobCategory.WATER_AMBIENT).sized(0.7f, 0.7f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "mud_pig").toString()));

	public static final RegistryObject<EntityType<AhmarIdolEntity>> AHMAR_IDOL = ENTITIES.register("ahmar_idol",
			() -> EntityType.Builder.of(AhmarIdolEntity::new, MobCategory.WATER_CREATURE).sized(1.0f, 1.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "ahmar_idol").toString()));

	public static final RegistryObject<EntityType<BrickSnailEntity>> BRICK_SNAIL = ENTITIES.register("brick_snail",
			() -> EntityType.Builder.of(BrickSnailEntity::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "brick_snail").toString()));

	public static final RegistryObject<EntityType<ZebraCornetfishEntity>> ZEBRA_CORNETFISH = ENTITIES.register("zebra_cornetfish",
			() -> EntityType.Builder.of(ZebraCornetfishEntity::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "zebra_cornetfish").toString()));

	public static final RegistryObject<EntityType<TigerPufferEntity>> TIGER_PUFFER = ENTITIES.register("tiger_puffer",
			() -> EntityType.Builder.of(TigerPufferEntity::new, MobCategory.WATER_CREATURE).sized(0.8f, 0.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "tiger_puffer").toString()));

	public static final RegistryObject<EntityType<BlackCapSnailEntity>> BLACKCAP_SNAIL = ENTITIES.register("blackcap_snail",
			() -> EntityType.Builder.of(BlackCapSnailEntity::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "blackcap_snail").toString()));

	public static final RegistryObject<EntityType<BumpfaceEntity>> BUMPFACE = ENTITIES.register("bumpface",
			() -> EntityType.Builder.of(BumpfaceEntity::new, MobCategory.WATER_AMBIENT).sized(0.3f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "bumpface").toString()));

	public static final RegistryObject<EntityType<DeepCrawlerEntity>> DEEP_CRAWLER = ENTITIES.register("deep_crawler",
			() -> EntityType.Builder.of(DeepCrawlerEntity::new, MobCategory.WATER_CREATURE).sized(0.3f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "deep_crawler").toString()));

	public static final RegistryObject<EntityType<ManaJellyfishEntity>> WIZARD_JELLY = ENTITIES.register("wizard_jelly",
			() -> EntityType.Builder.of(ManaJellyfishEntity::new, MobCategory.WATER_CREATURE).sized(0.6f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "wizard_jelly").toString()));

	public static final RegistryObject<EntityType<PorcupineLobsterEntity>> PORCUPINE_LOBSTA = ENTITIES.register("porcupine_lobsta",
			() -> EntityType.Builder.of(PorcupineLobsterEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.6f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "porcupine_lobsta").toString()));

	public static final RegistryObject<EntityType<TrumpetSquidEntity>> TRUMPET_SQUID = ENTITIES.register("trumpet_squid",
			() -> EntityType.Builder.of(TrumpetSquidEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.6f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "trumpet_squid").toString()));

	public static final RegistryObject<EntityType<FreshwaterMantisEntity>> FRESHWATER_MANTIS = ENTITIES.register("freshwater_mantis",
			() -> EntityType.Builder.of(FreshwaterMantisEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.6f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "freshwater_mantis").toString()));

	public static final RegistryObject<EntityType<BarkAngelfishEntity>> BARK_ANGELFISH = ENTITIES.register("bark_angelfish",
			() -> EntityType.Builder.of(BarkAngelfishEntity::new, MobCategory.WATER_AMBIENT).sized(0.2f, 0.2f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "bark_angelfish").toString()));

	public static final RegistryObject<EntityType<ShockcatEntity>> SHOCKCAT = ENTITIES.register("shockcat",
			() -> EntityType.Builder.of(ShockcatEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.7f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "shockcat").toString()));

	public static final RegistryObject<EntityType<ThornySnailEntity>> THORN_SNAIL = ENTITIES.register("thorn_snail",
			() -> EntityType.Builder.of(ThornySnailEntity::new, MobCategory.WATER_CREATURE).sized(0.9f, 0.9f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "thorn_snail").toString()));

	public static final RegistryObject<EntityType<KalappaEntity>> KALAPPA = ENTITIES.register("kalappa",
			() -> EntityType.Builder.of(KalappaEntity::new, MobCategory.CREATURE).sized(1.2f, 1.2f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "kalappa").toString()));

	public static final RegistryObject<EntityType<LobedSkipperEntity>> LOBED_SKIPPER = ENTITIES.register("skipper",
			() -> EntityType.Builder.of(LobedSkipperEntity::new, MobCategory.CREATURE).sized(0.5f, 0.6f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "skipper").toString()));

	public static final RegistryObject<EntityType<DragonBichirEntity>> DRAGON_BICHIR = ENTITIES.register("dragonfish",
			() -> EntityType.Builder.of(DragonBichirEntity::new, MobCategory.WATER_CREATURE).sized(4.0f, 1.0f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "dragonfish").toString()));

	public static final RegistryObject<EntityType<BeakedHerringEntity>> BEAKED_HERRING = ENTITIES.register("beaked_herring",
			() -> EntityType.Builder.of(BeakedHerringEntity::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "beaked_herring").toString()));

	public static final RegistryObject<EntityType<PicklefishEntity>> PICKLEFISH = ENTITIES.register("picklefish",
			() -> EntityType.Builder.of(PicklefishEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "picklefish").toString()));

	public static final RegistryObject<EntityType<CaveLoachEntity>> CAVE_LOACH = ENTITIES.register("cave_loach",
			() -> EntityType.Builder.of(CaveLoachEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "cave_loach").toString()));

	public static final RegistryObject<EntityType<DemonHerringEntity>> DEMON_HERRING = ENTITIES.register("demon_herring",
			() -> EntityType.Builder.of(DemonHerringEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "demon_herring").toString()));

	public static final RegistryObject<EntityType<YellowWhipGobyEntity>> YELLOW_GOBY = ENTITIES.register("yellow_goby",
			() -> EntityType.Builder.of(YellowWhipGobyEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "yellow_goby").toString()));

	public static final RegistryObject<EntityType<HatchetFishEntity>> HATCHET_FISH = ENTITIES.register("hatchet_fish",
			() -> EntityType.Builder.of(HatchetFishEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "hatchet_fish").toString()));

	public static final RegistryObject<EntityType<FalseSwordfishEntity>> FALSE_SWORD = ENTITIES.register("false_sword",
			() -> EntityType.Builder.of(FalseSwordfishEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "false_sword").toString()));

	public static final RegistryObject<EntityType<CopperflameAnthiasEntity>> COPPERFLAME = ENTITIES.register("copperflame",
			() -> EntityType.Builder.of(CopperflameAnthiasEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "copperflame").toString()));

	public static final RegistryObject<EntityType<HumpbackPogglingEntity>> POGGLING = ENTITIES.register("pog",
			() -> EntityType.Builder.of(HumpbackPogglingEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "pog").toString()));

	public static final RegistryObject<EntityType<GravelFlounderEntity>> GRAVEL_FLOUNDER = ENTITIES.register("gravel_flounder",
			() -> EntityType.Builder.of(GravelFlounderEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "pog").toString()));

	public static final RegistryObject<EntityType<RootballEntity>> ROOTBALL = ENTITIES.register("rootball",
			() -> EntityType.Builder.of(RootballEntity::new, MobCategory.MONSTER).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "rootball").toString()));

	public static final RegistryObject<EntityType<CelestialFishEntity>> CELESTIAL_FISH = ENTITIES.register("celestial",
			() -> EntityType.Builder.of(CelestialFishEntity::new, MobCategory.WATER_CREATURE).sized(1.0f, 1.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "celestial").toString()));

	public static final RegistryObject<EntityType<GnasherEntity>> GNASHER = ENTITIES.register("gnasher",
			() -> EntityType.Builder.of(GnasherEntity::new, MobCategory.WATER_CREATURE).sized(4.0f, 1.0f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "gnasher").toString()));

	public static final RegistryObject<EntityType<DepthPrawnEntity>> DEPTH_PRAWN = ENTITIES.register("depth_prawn",
			() -> EntityType.Builder.of(DepthPrawnEntity::new, MobCategory.MONSTER).sized(2.0f, 1.0f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "depth_prawn").toString()));

	public static final RegistryObject<EntityType<SquoddleEntity>> SQUODDLE = ENTITIES.register("squoddle",
			() -> EntityType.Builder.of(SquoddleEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "squoddle").toString()));

	public static final RegistryObject<EntityType<SeaMosquitoEntity>> SEA_MOSQUITO = ENTITIES.register("sea_mosquito",
			() -> EntityType.Builder.of(SeaMosquitoEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "sea_mosquito").toString()));

	public static final RegistryObject<EntityType<ForkfishEntity>> FORKFISH = ENTITIES.register("forkfish",
			() -> EntityType.Builder.of(ForkfishEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "forkfish").toString()));

	public static final RegistryObject<EntityType<SpoonSharkEntity>> SPOON_SHARK = ENTITIES.register("spoon_shark",
			() -> EntityType.Builder.of(SpoonSharkEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "spoon_shark").toString()));

	public static final RegistryObject<EntityType<CoralSkrimpEntity>> CORAL_SKRIMP = ENTITIES.register("coral_skrimp",
			() -> EntityType.Builder.of(CoralSkrimpEntity::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "coral_skrimp").toString()));

	public static final RegistryObject<EntityType<SkateSquidEntity>> SKATE_SQUID = ENTITIES.register("skate_squid",
			() -> EntityType.Builder.of(SkateSquidEntity::new, MobCategory.WATER_AMBIENT).sized(2.0f, 0.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "skate_squid").toString()));

	public static final RegistryObject<EntityType<CircusFishEntity>> CIRCUSFISH = ENTITIES.register("circus",
			() -> EntityType.Builder.of(CircusFishEntity::new, MobCategory.WATER_AMBIENT).sized(0.4f, 0.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "circus").toString()));

	public static final RegistryObject<EntityType<BlizzardfinTunaEntity>> BLIZZARDFIN = ENTITIES.register("blizzardfin",
			() -> EntityType.Builder.of(BlizzardfinTunaEntity::new, MobCategory.WATER_AMBIENT).sized(0.8f, 0.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "blizzardfin").toString()));

	public static final RegistryObject<EntityType<WhiskeredWhaleSharkEntity>> WHISKERED = ENTITIES.register("whiskered",
			() -> EntityType.Builder.of(WhiskeredWhaleSharkEntity::new, MobCategory.WATER_CREATURE).sized(2.5f, 0.8f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "whiskered").toString()));
}

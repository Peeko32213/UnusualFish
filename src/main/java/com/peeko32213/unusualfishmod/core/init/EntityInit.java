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
			() -> EntityType.Builder.of(MossthornEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).sized(1.0f, 1.0f)
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

	public static final RegistryObject<EntityType<BarbedSkateEntity>> BARBED_SKATE = ENTITIES.register("barbed_skate",
			() -> EntityType.Builder.of(BarbedSkateEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.3f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "barbed_skate").toString()));

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
			() -> EntityType.Builder.of(ManaJellyfishEntity::new, MobCategory.WATER_CREATURE).sized(0.5f, 0.3f)
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
			() -> EntityType.Builder.of(DragonBichirEntity::new, MobCategory.WATER_CREATURE).sized(1.0f, 0.5f)
					.build(new ResourceLocation(UnusualFishMod.MODID, "dragonfish").toString()));

}

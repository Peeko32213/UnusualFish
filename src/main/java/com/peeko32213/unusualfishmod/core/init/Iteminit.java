package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.item.ItemModFishBucket;

import com.peeko32213.unusualfishmod.common.item.ItemModFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			UnusualFishMod.MODID);

	//Foods

	public static final RegistryObject<Item> RAW_MOSSTHORN = ITEMS.register("raw_mossthorn",
			() -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).food(null)));

	public static final RegistryObject<Item> RAW_RIPPER = ITEMS.register("raw_ripper",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_RIPPER).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_AERO_MONO = ITEMS.register("raw_aero_mono",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_AERO_MONO_STICK = ITEMS.register("raw_aero_mono_stick",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BUMPFACE = ITEMS.register("raw_bumpface",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_RHINO_TETRA = ITEMS.register("raw_rhino_tetra",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SAILOR_BARB = ITEMS.register("raw_sailor_barb",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BARK_ANGEL = ITEMS.register("raw_bark_angel",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BARK_ANGEL).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_SPINDLEFISH = ITEMS.register("raw_spindlefish",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_SPINDLEFISH).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_BLIZZARD_TUNA = ITEMS.register("raw_blizzard_tuna",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> RAW_VEIL_TENTACLE = ITEMS.register("raw_veil_tentacle",
			() -> new Item(new Item.Properties().food(ItemModFoods.RAW_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));

	//Cooked Foods

	public static final RegistryObject<Item> COOKED_AERO_MONO_STICK = ITEMS.register("cooked_aero_mono_stick",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_BUMPFACE = ITEMS.register("cooked_bumpface",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_RHINO_TETRA = ITEMS.register("cooked_rhino_tetra",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_SAILOR_BARB = ITEMS.register("cooked_sailor_barb",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_BLIZZARD_TUNA = ITEMS.register("cooked_blizzard_tuna",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> COOKED_VEIL_TENTACLE = ITEMS.register("cooked_veil_tentacle",
			() -> new Item(new Item.Properties().food(ItemModFoods.COOKED_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));

	//Drops

	public static final RegistryObject<Item> GNASHER_TOOTH = ITEMS.register("gnasher_tooth",
			() -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<Item> MANA_JELLY = ITEMS.register("mana_jelly",
			() -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	//Tools & Weapons

	public static final RegistryObject<SwordItem> DEPTH_SCYTHE = ITEMS.register("depth_scythe",
			() -> new SwordItem(BaseMaterialInit.PRAWN, 6,-3.4F,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	//Spawn Eggs

	public static final RegistryObject<ForgeSpawnEggItem> AERO_MONO_SPAWN_EGG = ITEMS.register("aero_mono_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.AERO_MONO, 0x8ea6af, 0x5b78ac,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> AHMAR_IDOL_SPAWN_EGG = ITEMS.register("ahmar_idol_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.AHMAR_IDOL, 0xb02132, 0x69040d,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BARBED_SPAWN_EGG = ITEMS.register("guitar_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.THORNY_GUITARFISH, 0x7d5e32, 0x612d1a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CLOWNTHORN_SPAWN_EGG = ITEMS.register("clownthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CLOWNTHORN_SHARK, 0xd46c1d, 0xa21e00,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DUALITY_SPAWN_EGG = ITEMS.register("duality_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DUALITY_DAMSELFISH, 0xd7e7f0, 0x090719,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> HANDY_SPAWN_EGG = ITEMS.register("handy_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.HANDY_GOURAMI , 0x54291f, 0x52121f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MOSSTHORN_SPAWN_EGG = ITEMS.register("mossthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.MOSSTHORN , 0x26a529, 0x034223,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MUD_SPAWN_EGG = ITEMS.register("mud_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.MUD_PIG , 0x2d170a, 0x653116,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> REDGIANT_SPAWN_EGG = ITEMS.register("redgiant_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.REDGIANT_SEASTAR , 0xbe420f, 0xe19431,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> RHINO_TETRA_SPAWN_EGG = ITEMS.register("rhino_tetra_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.RHINO_TETRA , 0x50b9ad, 0x216687,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> RIPPER_SPAWN_EGG = ITEMS.register("ripper_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.RIPPER , 0x98aa58, 0x746825,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SAILOR_SPAWN_EGG = ITEMS.register("sailor_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SAILOR_BARB , 0x77a439, 0x4b580c,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PANCAKE_SPAWN_EGG = ITEMS.register("pancake_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SEA_PANCAKE , 0x9e6229, 0x551908,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SEA_SPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SEA_SPIDER , 0xc58a21, 0x7f0d00,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SPINDLEFISH_SPAWN_EGG = ITEMS.register("spindlefish_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SPINDLEFISH , 0xe07d76, 0x78064a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TRIPLE_SPAWN_EGG = ITEMS.register("triple_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TRIPLE_TWIRL_PLECO , 0xc1923a, 0x903113,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BRICK_SNAIL_EGG = ITEMS.register("brick_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BRICK_SNAIL , 0x4b0c16, 0x7c5955,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> ZEBRA_EGG = ITEMS.register("zebra_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.ZEBRA_CORNETFISH , 0xa088b4, 0x472e63,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TIGER_EGG = ITEMS.register("tiger_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TIGER_PUFFER , 0x4b0f0b, 0xc26715,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BLACKCAP_EGG = ITEMS.register("blackcap_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BLACKCAP_SNAIL , 0x211c1e, 0x603d36,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BUMPFACE_EGG = ITEMS.register("bumpface_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BUMPFACE , 0x404a7b, 0x779aa8,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DEEP_EGG = ITEMS.register("deep_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DEEP_CRAWLER , 0x1a1825, 0x434751,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> WIZARD_EGG = ITEMS.register("wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.WIZARD_JELLY , 0x1e134c, 0x8b55a6,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PORCUPINE_EGG = ITEMS.register("porcupine_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.PORCUPINE_LOBSTA , 0x460121, 0x8d2c3f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> TRUMPET_EGG = ITEMS.register("trumpet_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TRUMPET_SQUID , 0x6a061a, 0xe9b142,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MANTIS_EGG = ITEMS.register("mantis_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.FRESHWATER_MANTIS , 0x4b2f1a, 0x7c8b44,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BARK_EGG = ITEMS.register("bark_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BARK_ANGELFISH , 0x3b0e08, 0x6b3f21,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SHOCKCAT_EGG = ITEMS.register("shockcat_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SHOCKCAT , 0x222c58, 0x4595ba,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> THORN_EGG = ITEMS.register("thorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.THORN_SNAIL , 0x316b6e, 0x2e582d,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> KRABULON_EGG = ITEMS.register("krabulon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.KALAPPA , 0x624051, 0x886d86,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SKIPPER_EGG = ITEMS.register("skipper_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.LOBED_SKIPPER , 0x4b2618, 0x9e632f,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DRAGON_EGG = ITEMS.register("dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DRAGON_BICHIR , 0x07331c, 0x3c7834,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BEAKED_EGG = ITEMS.register("beaked_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BEAKED_HERRING , 0x516881, 0x6e9298,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> PICKLE_EGG = ITEMS.register("pickle_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.PICKLEFISH , 0x235806, 0x99970d,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CAVELOACH_EGG = ITEMS.register("caveloach_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CAVE_LOACH , 0xb1717c, 0xc5a9a5,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DEMON_EGG = ITEMS.register("demon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DEMON_HERRING , 0x1a1a3b, 0x757a84,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> YELLOW_EGG = ITEMS.register("yellow_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.YELLOW_GOBY , 0xa22902, 0xcf9123,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> HATCHET_EGG = ITEMS.register("hatchet_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.HATCHET_FISH , 0x361361, 0x582171,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> FALSE_EGG = ITEMS.register("false_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.FALSE_SWORD , 0x18112c, 0x34384e,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> COPPERFLAME_EGG = ITEMS.register("copperflame_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.COPPERFLAME , 0x44950f, 0xa5c033,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> POG_EGG = ITEMS.register("pog_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.POGGLING , 0xbe3016, 0xde7e3e,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> GRAVEL_EGG = ITEMS.register("gravel_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.GRAVEL_FLOUNDER , 0x2f3344, 0x576067,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> ROOTBALL_EGG = ITEMS.register("root_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.ROOTBALL , 0x4c6e11, 0xbebb17,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CELESTIAL_EGG = ITEMS.register("celestial_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CELESTIAL_FISH , 0x242552, 0xdd9518,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> GNASHER_EGG = ITEMS.register("gnasher_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.GNASHER , 0x1c0c12, 0x483342,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> DEPTH_EGG = ITEMS.register("depth_prawn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DEPTH_PRAWN , 0x0c0a26, 0x1c2444,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SQUODDLE_EGG = ITEMS.register("squoddle_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SQUODDLE , 0xc6630a, 0xc6b0c7,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> MOSQUITO_EGG = ITEMS.register("mosquito_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SEA_MOSQUITO , 0x374c1e, 0x651d2a,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> FORK_EGG = ITEMS.register("fork_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.FORKFISH , 0xb07835, 0xccb05b,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SPOON_EGG = ITEMS.register("spoon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SPOON_SHARK , 0x955a33, 0x82523e,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SKRIMP_EGG = ITEMS.register("skrimp_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CORAL_SKRIMP , 0x711683, 0xb34aa2,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> SKATESQUID_EGG = ITEMS.register("veil_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SKATE_SQUID , 0x66405a, 0x896f78,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> CIRCUS_EGG = ITEMS.register("circus_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CIRCUSFISH , 0x852f25, 0xc0a575,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> BLIZZARD_EGG = ITEMS.register("blizzard_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BLIZZARDFIN , 0x033d9a, 0x25bcce,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	public static final RegistryObject<ForgeSpawnEggItem> WHISKER_EGG = ITEMS.register("whisker_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.WHISKERED , 0x592a12, 0x794f2b,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	//Buckets

	public static final RegistryObject<Item> AERO_MONO_BUCKET = ITEMS.register("aero_mono_bucket",
			() -> new ItemModFishBucket(EntityInit.AERO_MONO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> RHINO_TETRA_BUCKET = ITEMS.register("rhino_tetra_bucket",
			() -> new ItemModFishBucket(EntityInit.RHINO_TETRA, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DUALITY_DAMSELFISH_BUCKET = ITEMS.register("duality_damselfish_bucket",
			() -> new ItemModFishBucket(EntityInit.DUALITY_DAMSELFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> HANDY_GOURAMI_BUCKET = ITEMS.register("handy_gourami_bucket",
			() -> new ItemModFishBucket(EntityInit.HANDY_GOURAMI, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MOSSTHORN_BUCKET = ITEMS.register("mossthorn_bucket",
			() -> new ItemModFishBucket(EntityInit.MOSSTHORN, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SAILOR_BARB_BUCKET = ITEMS.register("sailor_barb_bucket",
			() -> new ItemModFishBucket(EntityInit.SAILOR_BARB, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> TRIPLE_TWIRL_PLECO_BUCKET = ITEMS.register("triple_twirl_pleco_bucket",
			() -> new ItemModFishBucket(EntityInit.TRIPLE_TWIRL_PLECO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SPINDLEFISH_BUCKET = ITEMS.register("spindlefish_bucket",
			() -> new ItemModFishBucket(EntityInit.SPINDLEFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> RIPPER_BUCKET = ITEMS.register("ripper_bucket",
			() -> new ItemModFishBucket(EntityInit.RIPPER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SEA_SPIDER_BUCKET = ITEMS.register("sea_spider_bucket",
			() -> new ItemModFishBucket(EntityInit.SEA_SPIDER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> CLOWNTHORN_BUCKET = ITEMS.register("clownthorn_bucket",
			() -> new ItemModFishBucket(EntityInit.CLOWNTHORN_SHARK, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BARBED_BUCKET = ITEMS.register("guitar_bucket",
			() -> new ItemModFishBucket(EntityInit.THORNY_GUITARFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MUDPIG_BUCKET = ITEMS.register("mudpig_bucket",
			() -> new ItemModFishBucket(EntityInit.MUD_PIG, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BUMPFACE_BUCKET = ITEMS.register("bumpface_bucket",
			() -> new ItemModFishBucket(EntityInit.BUMPFACE, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BLACKCAP_BUCKET = ITEMS.register("blackcap_bucket",
			() -> new ItemModFishBucket(EntityInit.BLACKCAP_SNAIL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BRICK_BUCKET = ITEMS.register("brick_bucket",
			() -> new ItemModFishBucket(EntityInit.BRICK_SNAIL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DEEP_BUCKET = ITEMS.register("deep_bucket",
			() -> new ItemModFishBucket(EntityInit.DEEP_CRAWLER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> WIZARD_BUCKET = ITEMS.register("wizard_bucket",
			() -> new ItemModFishBucket(EntityInit.WIZARD_JELLY, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> PORCUPINE_BUCKET = ITEMS.register("porcupine_bucket",
			() -> new ItemModFishBucket(EntityInit.PORCUPINE_LOBSTA, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MANTIS_BUCKET = ITEMS.register("mantis_bucket",
			() -> new ItemModFishBucket(EntityInit.FRESHWATER_MANTIS, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BARK_BUCKET = ITEMS.register("bark_bucket",
			() -> new ItemModFishBucket(EntityInit.BARK_ANGELFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SKIPPER_BUCKET = ITEMS.register("skipper_bucket",
			() -> new ItemModFishBucket(EntityInit.LOBED_SKIPPER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BEAKED_BUCKET = ITEMS.register("beaked_bucket",
			() -> new ItemModFishBucket(EntityInit.BEAKED_HERRING, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> PICKLEFISH_BUCKET = ITEMS.register("picklefish_bucket",
			() -> new ItemModFishBucket(EntityInit.PICKLEFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BLIND_BUCKET = ITEMS.register("blind_bucket",
			() -> new ItemModFishBucket(EntityInit.CAVE_LOACH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> DEMON_BUCKET = ITEMS.register("demon_bucket",
			() -> new ItemModFishBucket(EntityInit.DEMON_HERRING, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> YELLOW_BUCKET = ITEMS.register("yellow_bucket",
			() -> new ItemModFishBucket(EntityInit.YELLOW_GOBY, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> HATCHET_BUCKET = ITEMS.register("hatchet_bucket",
			() -> new ItemModFishBucket(EntityInit.HATCHET_FISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> FALSE_BUCKET = ITEMS.register("false_bucket",
			() -> new ItemModFishBucket(EntityInit.FALSE_SWORD, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> COPPERFLAME_BUCKET = ITEMS.register("copperflame_bucket",
			() -> new ItemModFishBucket(EntityInit.COPPERFLAME, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> POG_BUCKET = ITEMS.register("pog_bucket",
			() -> new ItemModFishBucket(EntityInit.POGGLING, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> GRAVEL_BUCKET = ITEMS.register("gravel_bucket",
			() -> new ItemModFishBucket(EntityInit.GRAVEL_FLOUNDER, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ROOTBALL_BUCKET = ITEMS.register("rootball_bucket",
			() -> new ItemModFishBucket(EntityInit.ROOTBALL, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SQUODDLE_BUCKET = ITEMS.register("squoddle_bucket",
			() -> new ItemModFishBucket(EntityInit.SQUODDLE, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> MOSQUITO_BUCKET = ITEMS.register("mosquito_bucket",
			() -> new ItemModFishBucket(EntityInit.SEA_MOSQUITO, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> FORK_BUCKET = ITEMS.register("fork_bucket",
			() -> new ItemModFishBucket(EntityInit.FORKFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SPOON_BUCKET = ITEMS.register("spoon_bucket",
			() -> new ItemModFishBucket(EntityInit.SPOON_SHARK, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> SKRIMP_BUCKET = ITEMS.register("skrimp_bucket",
			() -> new ItemModFishBucket(EntityInit.CORAL_SKRIMP, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	public static final RegistryObject<Item> CIRCUS_BUCKET = ITEMS.register("circus_bucket",
			() -> new ItemModFishBucket(EntityInit.CIRCUSFISH, () -> Fluids.WATER, Items.BUCKET, false,
					new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
}

package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.item.ItemModFishBucket;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Iteminit {
	private Iteminit() {
	}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			UnusualFishMod.MODID);

	//Drops
	
	public static final RegistryObject<Item> RAW_MOSSTHORN = ITEMS.register("raw_mossthorn",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(null)));

	public static final RegistryObject<Item> RAW_RIPPER = ITEMS.register("raw_ripper",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

	public static final RegistryObject<Item> PERILOUS_SPINES = ITEMS.register("perilous_spines",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

	//Spawn Eggs
	
	public static final RegistryObject<ForgeSpawnEggItem> AERO_MONO_SPAWN_EGG = ITEMS.register("aero_mono_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.AERO_MONO, 0x8ea6af, 0x5b78ac,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> AHMAR_IDOL_SPAWN_EGG = ITEMS.register("ahmar_idol_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.AHMAR_IDOL, 0xb02132, 0x69040d,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> BARBED_SPAWN_EGG = ITEMS.register("barbed_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BARBED_SKATE, 0x7d5e32, 0x612d1a,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> CLOWNTHORN_SPAWN_EGG = ITEMS.register("clownthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CLOWNTHORN_SHARK, 0xd46c1d, 0xa21e00,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> DUALITY_SPAWN_EGG = ITEMS.register("duality_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DUALITY_DAMSELFISH, 0xd7e7f0, 0x090719,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> HANDY_SPAWN_EGG = ITEMS.register("handy_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.HANDY_GOURAMI , 0x54291f, 0x52121f,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> MOSSTHORN_SPAWN_EGG = ITEMS.register("mossthorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.MOSSTHORN , 0x26a529, 0x034223,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> MUD_SPAWN_EGG = ITEMS.register("mud_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.MUD_PIG , 0x2d170a, 0x653116,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> REDGIANT_SPAWN_EGG = ITEMS.register("redgiant_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.REDGIANT_SEASTAR , 0xbe420f, 0xe19431,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> RHINO_TETRA_SPAWN_EGG = ITEMS.register("rhino_tetra_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.RHINO_TETRA , 0x50b9ad, 0x216687,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> RIPPER_SPAWN_EGG = ITEMS.register("ripper_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.RIPPER , 0x98aa58, 0x746825,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> SAILOR_SPAWN_EGG = ITEMS.register("sailor_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SAILOR_BARB , 0x77a439, 0x4b580c,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> PANCAKE_SPAWN_EGG = ITEMS.register("pancake_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SEA_PANCAKE , 0x9e6229, 0x551908,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> SEA_SPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SEA_SPIDER , 0xc58a21, 0x7f0d00,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> SPINDLEFISH_SPAWN_EGG = ITEMS.register("spindlefish_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SPINDLEFISH , 0xe07d76, 0x78064a,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<ForgeSpawnEggItem> TRIPLE_SPAWN_EGG = ITEMS.register("triple_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TRIPLE_TWIRL_PLECO , 0xc1923a, 0x903113,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> BRICK_SNAIL_EGG = ITEMS.register("brick_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BRICK_SNAIL , 0x4b0c16, 0x7c5955,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> ZEBRA_EGG = ITEMS.register("zebra_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.ZEBRA_CORNETFISH , 0xa088b4, 0x472e63,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> TIGER_EGG = ITEMS.register("tiger_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TIGER_PUFFER , 0x4b0f0b, 0xc26715,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> BLACKCAP_EGG = ITEMS.register("blackcap_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BLACKCAP_SNAIL , 0x211c1e, 0x603d36,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> BUMPFACE_EGG = ITEMS.register("bumpface_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BUMPFACE , 0x404a7b, 0x779aa8,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> DEEP_EGG = ITEMS.register("deep_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DEEP_CRAWLER , 0x1a1825, 0x434751,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> WIZARD_EGG = ITEMS.register("wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.WIZARD_JELLY , 0x1e134c, 0x8b55a6,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> PORCUPINE_EGG = ITEMS.register("porcupine_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.PORCUPINE_LOBSTA , 0x460121, 0x8d2c3f,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> TRUMPET_EGG = ITEMS.register("trumpet_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.TRUMPET_SQUID , 0x6a061a, 0xe9b142,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> MANTIS_EGG = ITEMS.register("mantis_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.FRESHWATER_MANTIS , 0x4b2f1a, 0x7c8b44,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> BARK_EGG = ITEMS.register("bark_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.BARK_ANGELFISH , 0x3b0e08, 0x6b3f21,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> SHOCKCAT_EGG = ITEMS.register("shockcat_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.SHOCKCAT , 0x222c58, 0x4595ba,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> THORN_EGG = ITEMS.register("thorn_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.THORN_SNAIL , 0x316b6e, 0x2e582d,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> KRABULON_EGG = ITEMS.register("krabulon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.KALAPPA , 0x624051, 0x886d86,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> SKIPPER_EGG = ITEMS.register("skipper_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.LOBED_SKIPPER , 0x4b2618, 0x9e632f,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> DRAGON_EGG = ITEMS.register("dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.DRAGON_BICHIR , 0x07331c, 0x3c7834,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	//Buckets

	public static final RegistryObject<Item> AERO_MONO_BUCKET = ITEMS.register("aero_mono_bucket",
			() -> new ItemModFishBucket(EntityInit.AERO_MONO));

	public static final RegistryObject<Item> RHINO_TETRA_BUCKET = ITEMS.register("rhino_tetra_bucket",
			() -> new ItemModFishBucket(EntityInit.RHINO_TETRA));

	public static final RegistryObject<Item> DUALITY_DAMSELFISH_BUCKET = ITEMS.register("duality_damselfish_bucket",
			() -> new ItemModFishBucket(EntityInit.DUALITY_DAMSELFISH));

	public static final RegistryObject<Item> HANDY_GOURAMI_BUCKET = ITEMS.register("handy_gourami_bucket",
			() -> new ItemModFishBucket(EntityInit.HANDY_GOURAMI));

	public static final RegistryObject<Item> MOSSTHORN_BUCKET = ITEMS.register("mossthorn_bucket",
			() -> new ItemModFishBucket(EntityInit.MOSSTHORN));

	public static final RegistryObject<Item> SAILOR_BARB_BUCKET = ITEMS.register("sailor_barb_bucket",
			() -> new ItemModFishBucket(EntityInit.SAILOR_BARB));

	public static final RegistryObject<Item> TRIPLE_TWIRL_PLECO_BUCKET = ITEMS.register("triple_twirl_pleco_bucket",
			() -> new ItemModFishBucket(EntityInit.TRIPLE_TWIRL_PLECO));

	public static final RegistryObject<Item> SPINDLEFISH_BUCKET = ITEMS.register("spindlefish_bucket",
			() -> new ItemModFishBucket(EntityInit.SPINDLEFISH));

	public static final RegistryObject<Item> RIPPER_BUCKET = ITEMS.register("ripper_bucket",
			() -> new ItemModFishBucket(EntityInit.RIPPER));

	public static final RegistryObject<Item> SEA_SPIDER_BUCKET = ITEMS.register("sea_spider_bucket",
			() -> new ItemModFishBucket(EntityInit.SEA_SPIDER));

	public static final RegistryObject<Item> CLOWNTHORN_BUCKET = ITEMS.register("clownthorn_bucket",
			() -> new ItemModFishBucket(EntityInit.CLOWNTHORN_SHARK));

	public static final RegistryObject<Item> BARBED_BUCKET = ITEMS.register("barbed_bucket",
			() -> new ItemModFishBucket(EntityInit.BARBED_SKATE));

	public static final RegistryObject<Item> MUDPIG_BUCKET = ITEMS.register("mudpig_bucket",
			() -> new ItemModFishBucket(EntityInit.MUD_PIG));

	public static final RegistryObject<Item> BUMPFACE_BUCKET = ITEMS.register("bumpface_bucket",
			() -> new ItemModFishBucket(EntityInit.BUMPFACE));

	public static final RegistryObject<Item> BLACKCAP_BUCKET = ITEMS.register("blackcap_bucket",
			() -> new ItemModFishBucket(EntityInit.BLACKCAP_SNAIL));

	public static final RegistryObject<Item> BRICK_BUCKET = ITEMS.register("brick_bucket",
			() -> new ItemModFishBucket(EntityInit.BRICK_SNAIL));

	public static final RegistryObject<Item> DEEP_BUCKET = ITEMS.register("deep_bucket",
			() -> new ItemModFishBucket(EntityInit.DEEP_CRAWLER));

	public static final RegistryObject<Item> WIZARD_BUCKET = ITEMS.register("wizard_bucket",
			() -> new ItemModFishBucket(EntityInit.WIZARD_JELLY));

	public static final RegistryObject<Item> PORCUPINE_BUCKET = ITEMS.register("porcupine_bucket",
			() -> new ItemModFishBucket(EntityInit.PORCUPINE_LOBSTA));

	public static final RegistryObject<Item> MANTIS_BUCKET = ITEMS.register("mantis_bucket",
			() -> new ItemModFishBucket(EntityInit.FRESHWATER_MANTIS));

	public static final RegistryObject<Item> BARK_BUCKET = ITEMS.register("bark_bucket",
			() -> new ItemModFishBucket(EntityInit.BARK_ANGELFISH));

	public static final RegistryObject<Item> SKIPPER_BUCKET = ITEMS.register("skipper_bucket",
			() -> new ItemModFishBucket(EntityInit.LOBED_SKIPPER));
}

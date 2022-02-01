package com.peeko32213.unusualfishmod.client.event;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.client.renderer.*;
import com.peeko32213.unusualfishmod.client.renderer.model.*;
import com.peeko32213.unusualfishmod.core.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = UnusualFishMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents { 

	private ClientModEvents() {}
		
		@SubscribeEvent
		public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
			event.registerLayerDefinition(DualityDamselfishModel.LAYER_LOCATION, DualityDamselfishModel::createBodyLayer);
			event.registerLayerDefinition(MossthornModel.LAYER_LOCATION, MossthornModel::createBodyLayer);
			event.registerLayerDefinition(RipperModel.LAYER_LOCATION, RipperModel::createBodyLayer);
			event.registerLayerDefinition(SpindlefishModel.LAYER_LOCATION, SpindlefishModel::createBodyLayer);
			event.registerLayerDefinition(RhinoTetraModel.LAYER_LOCATION, RhinoTetraModel::createBodyLayer);
			event.registerLayerDefinition(HandyGouramiModel.LAYER_LOCATION, HandyGouramiModel::createBodyLayer);
			event.registerLayerDefinition(SailorBarbModel.LAYER_LOCATION, SailorBarbModel::createBodyLayer);
			event.registerLayerDefinition(SeaSpiderModel.LAYER_LOCATION, SeaSpiderModel::createBodyLayer);
			event.registerLayerDefinition(TripleTwirlPlecoModel.LAYER_LOCATION, TripleTwirlPlecoModel::createBodyLayer);
			event.registerLayerDefinition(AeroMonoModel.LAYER_LOCATION, AeroMonoModel::createBodyLayer);
			event.registerLayerDefinition(ClownthornSharkModel.LAYER_LOCATION, ClownthornSharkModel::createBodyLayer);
			event.registerLayerDefinition(BarbedSkateModel.LAYER_LOCATION, BarbedSkateModel::createBodyLayer);
			event.registerLayerDefinition(RedGiantSeaStarModel.LAYER_LOCATION, RedGiantSeaStarModel::createBodyLayer);
			event.registerLayerDefinition(AhmarIdolModel.LAYER_LOCATION, AhmarIdolModel::createBodyLayer);
			event.registerLayerDefinition(MudPigModel.LAYER_LOCATION, MudPigModel::createBodyLayer);
			event.registerLayerDefinition(SeaPancakeModel.LAYER_LOCATION, SeaPancakeModel::createBodyLayer);
			event.registerLayerDefinition(BrickSnailModel.LAYER_LOCATION, BrickSnailModel::createBodyLayer);
			event.registerLayerDefinition(ZebraCornetfishModel.LAYER_LOCATION, ZebraCornetfishModel::createBodyLayer);
			event.registerLayerDefinition(TigerPufferModel.LAYER_LOCATION, TigerPufferModel::createBodyLayer);
			event.registerLayerDefinition(BlackcapSnailModel.LAYER_LOCATION, BlackcapSnailModel::createBodyLayer);
			event.registerLayerDefinition(BumpfaceModel.LAYER_LOCATION, BumpfaceModel::createBodyLayer);

			
		}
		
		@SubscribeEvent
		public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
			event.registerEntityRenderer(EntityInit.DUALITY_DAMSELFISH.get(), DualityDamselfishRenderer::new);
			event.registerEntityRenderer(EntityInit.MOSSTHORN.get(), MossthornRenderer::new);
			event.registerEntityRenderer(EntityInit.RIPPER.get(), RipperRenderer::new);
			event.registerEntityRenderer(EntityInit.SPINDLEFISH.get(), SpindlefishRenderer::new);
			event.registerEntityRenderer(EntityInit.RHINO_TETRA.get(), RhinoTetraRenderer::new);
			event.registerEntityRenderer(EntityInit.HANDY_GOURAMI.get(), HandyGouramiRenderer::new);
			event.registerEntityRenderer(EntityInit.SAILOR_BARB.get(), SailorBarbRenderer::new);
			event.registerEntityRenderer(EntityInit.SEA_SPIDER.get(), SeaSpiderRenderer::new);
			event.registerEntityRenderer(EntityInit.TRIPLE_TWIRL_PLECO.get(), TripleTwirlPlecoRenderer::new);
			event.registerEntityRenderer(EntityInit.AERO_MONO.get(), AeroMonoRenderer::new);
			event.registerEntityRenderer(EntityInit.CLOWNTHORN_SHARK.get(), ClownthornSharkRenderer::new);
			event.registerEntityRenderer(EntityInit.BARBED_SKATE.get(), BarbedSkateRenderer::new);
			event.registerEntityRenderer(EntityInit.REDGIANT_SEASTAR.get(), RedGiantSeaStarRenderer::new);
			event.registerEntityRenderer(EntityInit.AHMAR_IDOL.get(), AhmarIdolRenderer::new);
			event.registerEntityRenderer(EntityInit.MUD_PIG.get(), MudPigRenderer::new);
			event.registerEntityRenderer(EntityInit.SEA_PANCAKE.get(), SeaPancakeRenderer::new);
			event.registerEntityRenderer(EntityInit.BRICK_SNAIL.get(), BrickSnailRenderer::new);
			event.registerEntityRenderer(EntityInit.ZEBRA_CORNETFISH.get(), ZebraCornetfishRenderer::new);
			event.registerEntityRenderer(EntityInit.TIGER_PUFFER.get(), TigerPufferRenderer::new);
			event.registerEntityRenderer(EntityInit.BLACKCAP_SNAIL.get(), BlackcapSnailRenderer::new);
			event.registerEntityRenderer(EntityInit.BUMPFACE.get(), BumpfaceRenderer::new);




		}
	
		
		
}


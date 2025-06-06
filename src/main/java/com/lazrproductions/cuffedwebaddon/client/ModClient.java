package com.lazrproductions.cuffedwebaddon;

import com.lazrproductions.cuffedwebaddon.restraints.custom.WebFeetRestraintRenderer;
import com.lazrproductions.cuffedwebaddon.restraints.custom.WebHandsRestraintRenderer;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CuffedWebAddon.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModClient {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // Register the restraint renderers here
        
        // These classes will handle rendering the restraints as 2D layers on players
        event.registerEntityRenderer(WebFeetRestraintRenderer.RESTRAINT_TYPE, WebFeetRestraintRenderer::new);
        event.registerEntityRenderer(WebHandsRestraintRenderer.RESTRAINT_TYPE, WebHandsRestraintRenderer::new);
    }
}

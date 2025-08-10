package dev.flwn.fabric.client;

import dev.felnull.specialmodelloader.api.event.SpecialModelLoaderEvents;
import dev.flwn.MaxwellMod;
import dev.flwn.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public final class MaxwellModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Without this code, special models will not be loaded!
        SpecialModelLoaderEvents.LOAD_SCOPE.register(() -> {
            return (resourceManager, location) -> MaxwellMod.MOD_ID.equals(location.getNamespace());
        });

        // TODO: Maybe find a better way to do this? NNNN NAURRR
        // Register blocks to use the cutout render layer.
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAXWELL_BLOCK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MARS_BLOCK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VALENOK_BLOCK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VASILISA_BLOCK.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POOMBA_BLOCK.get(), RenderType.cutout());
    }
}

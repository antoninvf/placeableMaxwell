package dev.flwn.fabric.client;

import dev.felnull.specialmodelloader.api.event.SpecialModelLoaderEvents;
import dev.flwn.MaxwellMod;
import net.fabricmc.api.ClientModInitializer;

public final class MaxwellModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SpecialModelLoaderEvents.LOAD_SCOPE.register(location -> MaxwellMod.MOD_ID.equals(location.getNamespace()));
    }
}

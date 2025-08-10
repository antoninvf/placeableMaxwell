package dev.flwn.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.flwn.MaxwellMod;

@Mod(MaxwellMod.MOD_ID)
public final class MaxwellModForge {
    public MaxwellModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(MaxwellMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        MaxwellMod.init();
    }
}

package dev.flwn.neoforge;

import net.neoforged.fml.common.Mod;

import dev.flwn.MaxwellMod;

@Mod(MaxwellMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        MaxwellMod.init();
    }
}

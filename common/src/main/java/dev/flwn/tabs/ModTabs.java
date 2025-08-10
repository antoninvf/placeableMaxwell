package dev.flwn.tabs;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.flwn.MaxwellMod;
import dev.flwn.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MaxwellMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static RegistrySupplier<CreativeModeTab> MAXWELL_TAB;

    public static void init() {
        MAXWELL_TAB = TABS.register("maxwell_tab", () -> CreativeTabRegistry.create(Component.translatable("category.placeablemaxwell_tab"), () -> new ItemStack(ModItems.MAXWELL_BLOCK.get())));

        TABS.register();
    }
}

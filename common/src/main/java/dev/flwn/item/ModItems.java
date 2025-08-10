package dev.flwn.item;


import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.flwn.MaxwellMod;
import dev.flwn.block.ModBlocks;
import dev.flwn.tabs.ModTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MaxwellMod.MOD_ID, Registries.ITEM);

    public static RegistrySupplier<Item> MAXWELL_BLOCK;
    public static RegistrySupplier<Item> MARS_BLOCK;
    public static RegistrySupplier<Item> VALENOK_BLOCK;
    public static RegistrySupplier<Item> VASILISA_BLOCK;
    public static RegistrySupplier<Item> POOMBA_BLOCK;

    public static void init() {
        MAXWELL_BLOCK = registerItem("maxwell", () -> new BlockItem(ModBlocks.MAXWELL_BLOCK.get(), baseCatProperties("maxwell")));
        MARS_BLOCK = registerItem("mars", () -> new BlockItem(ModBlocks.MARS_BLOCK.get(), baseCatProperties("mars")));
        VALENOK_BLOCK = registerItem("valenok", () -> new BlockItem(ModBlocks.VALENOK_BLOCK.get(), baseCatProperties("valenok")));
        VASILISA_BLOCK = registerItem("vasilisa", () -> new BlockItem(ModBlocks.VASILISA_BLOCK.get(), baseCatProperties("vasilisa")));
        POOMBA_BLOCK = registerItem("poomba", () -> new BlockItem(ModBlocks.POOMBA_BLOCK.get(), baseCatProperties("poomba")));

        ITEMS.register();
    }

    public static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(new ResourceLocation(MaxwellMod.MOD_ID, name), item);
    }

    public static Item.Properties baseCatProperties(String name) {
        // For some reason in this version, I'm unable to make the Maxwell tab show up.
        if (Platform.isFabric()) return new Item.Properties().arch$tab(CreativeModeTabs.BUILDING_BLOCKS);
            else return new Item.Properties().arch$tab(ModTabs.MAXWELL_TAB);

    }
}

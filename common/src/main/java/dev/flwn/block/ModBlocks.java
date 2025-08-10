package dev.flwn.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.flwn.MaxwellMod;
import dev.flwn.block.custom.MaxwellBlock;
import net.minecraft.client.renderer.entity.DisplayRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(MaxwellMod.MOD_ID, Registries.BLOCK);

    public static RegistrySupplier<Block> MAXWELL_BLOCK;
    public static RegistrySupplier<Block> MARS_BLOCK;
    public static RegistrySupplier<Block> VALENOK_BLOCK;
    public static RegistrySupplier<Block> VASILISA_BLOCK;
    public static RegistrySupplier<Block> POOMBA_BLOCK;

    public static void init() {
        MAXWELL_BLOCK = registerBlock("maxwell", () -> new MaxwellBlock(baseCatProperties("maxwell")));
        MARS_BLOCK = registerBlock("mars", () -> new MaxwellBlock(baseCatProperties("mars")));
        VALENOK_BLOCK = registerBlock("valenok", () -> new MaxwellBlock(baseCatProperties("valenok")));
        VASILISA_BLOCK = registerBlock("vasilisa", () -> new MaxwellBlock(baseCatProperties("vasilisa")));
        POOMBA_BLOCK = registerBlock("poomba", () -> new MaxwellBlock(baseCatProperties("poomba")));

        BLOCKS.register();
    }

    public static RegistrySupplier<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(ResourceLocation.fromNamespaceAndPath(MaxwellMod.MOD_ID, name), block);
    }

    public static BlockBehaviour.Properties baseCatProperties(String name) {
        return BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MaxwellMod.MOD_ID, name)))
                .strength(0.8f)
                .sound(SoundType.WOOL)
                .noOcclusion();
    }
}

package dev.flwn;

import dev.flwn.block.ModBlocks;
import dev.flwn.item.ModItems;
import dev.flwn.tabs.ModTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MaxwellMod {
    public static final String MOD_ID = "placeablemaxwell";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        // Write common init code here.
        LOGGER.info("Initializing Maxwell the placeable cat mod!");

        ModBlocks.init();
        ModItems.init();
        ModTabs.init();
    }
}

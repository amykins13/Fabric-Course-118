package net.amykins.mccourse;

import net.amykins.mccourse.block.ModBlocks;
import net.amykins.mccourse.item.ModItems;
import net.amykins.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final String MOD_ID = "mccourse"; //NO UPPERCASE CHARS ALLOWED
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

//		LOGGER.info("Hello Fabric world!");
	}
}

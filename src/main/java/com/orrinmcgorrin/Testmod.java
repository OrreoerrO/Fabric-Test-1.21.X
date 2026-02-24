package com.orrinmcgorrin;

import com.orrinmcgorrin.block.ModBlocks;
import com.orrinmcgorrin.item.ModItemGroups;
import com.orrinmcgorrin.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testmod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
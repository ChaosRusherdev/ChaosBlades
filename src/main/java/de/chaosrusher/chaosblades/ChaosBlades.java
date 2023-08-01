package de.chaosrusher.chaosblades;

import de.chaosrusher.chaosblades.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import de.chaosrusher.chaosblades.block.ModBlocks;
import de.chaosrusher.chaosblades.item.ModItemGroup;
import de.chaosrusher.chaosblades.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class ChaosBlades implements ModInitializer {
	public static final String MOD_ID = "chaosblades";
	public static final Logger LOGGER = LoggerFactory.getLogger("chaosblades");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}

}
package de.chaosrusher.chaosblades;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import de.chaosrusher.chaosblades.data.ModLootTableGenerator;
import de.chaosrusher.chaosblades.data.ModModelProvider;
import de.chaosrusher.chaosblades.data.ModRecipeGenerator;

public class ChaosBladesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
	}
}

package de.chaosrusher.chaosblades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import de.chaosrusher.chaosblades.block.ModBlocks;
import de.chaosrusher.chaosblades.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANIMONIUM_ORE,oreDrops(ModBlocks.ANIMONIUM_ORE,ModItems.RAW_ANIMONIUM));
        addDrop(ModBlocks.ANIMONIUM_BLOCK,drops(ModBlocks.ANIMONIUM_BLOCK));
    }
}

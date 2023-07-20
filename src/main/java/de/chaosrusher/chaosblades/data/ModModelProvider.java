package de.chaosrusher.chaosblades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import de.chaosrusher.chaosblades.block.ModBlocks;
import de.chaosrusher.chaosblades.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANIMONIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANIMONIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ANIMONIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANIMONIUM, Models.GENERATED);
    }
}

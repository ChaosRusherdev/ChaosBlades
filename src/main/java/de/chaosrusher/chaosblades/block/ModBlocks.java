package de.chaosrusher.chaosblades.block;

import de.chaosrusher.chaosblades.ChaosBlades;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import de.chaosrusher.chaosblades.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ANIMONIUM_ORE = registerBlock("animonium_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroup.CHAOSBLADES);
    public static final Block ANIMONIUM_BLOCK = registerBlock("animonium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()), ModItemGroup.CHAOSBLADES);





    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ChaosBlades.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ChaosBlades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        ChaosBlades.LOGGER.info("Registering ModBlocks for " + ChaosBlades.MOD_ID);
    }
}

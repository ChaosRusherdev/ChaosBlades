package de.chaosrusher.chaosblades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import de.chaosrusher.chaosblades.block.ModBlocks;
import de.chaosrusher.chaosblades.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_ANIMONIUM), RecipeCategory.MISC, ModItems.ANIMONIUM,
                0.7f, 200, "animonium");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ANIMONIUM, RecipeCategory.DECORATIONS,
                ModBlocks.ANIMONIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YORU)
                .pattern("FSF")
                .pattern("CXC")
                .pattern("FSF")
                .input('X', Items.IRON_SWORD)
                .input('C', Items.INK_SAC)
                .input('S',ModItems.ANIMONIUM)
                .input('F',ModBlocks.ANIMONIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.INK_SAC),
                        FabricRecipeProvider.conditionsFromItem(Items.INK_SAC))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ANIMONIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANIMONIUM))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANIMONIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANIMONIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.YORU)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MOIR_KATANA)
                .pattern("FSF")
                .pattern("CXD")
                .pattern("FSF")
                .input('X', Items.IRON_SWORD)
                .input('C', Items.ORANGE_DYE)
                .input('D', Items.CARROT)
                .input('S',ModItems.ANIMONIUM)
                .input('F',ModBlocks.ANIMONIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .criterion(FabricRecipeProvider.hasItem(Items.CARROT),
                        FabricRecipeProvider.conditionsFromItem(Items.CARROT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ANIMONIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANIMONIUM))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANIMONIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANIMONIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MOIR_KATANA)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLORATANA)
                .pattern("FSF")
                .pattern("CXC")
                .pattern("FSF")
                .input('X', Items.IRON_SWORD)
                .input('C', Items.FIREWORK_ROCKET)
                .input('S',ModItems.ANIMONIUM)
                .input('F',ModBlocks.ANIMONIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.FIREWORK_ROCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.FIREWORK_ROCKET))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ANIMONIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANIMONIUM))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANIMONIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANIMONIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.FLORATANA)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MIHAWKS_TASCHENMESSER)
                .pattern("FSF")
                .pattern("CXC")
                .pattern("FSF")
                .input('X', Items.IRON_SWORD)
                .input('C', Items.IRON_INGOT)
                .input('S',ModItems.ANIMONIUM)
                .input('F',ModBlocks.ANIMONIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ANIMONIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANIMONIUM))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANIMONIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANIMONIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MIHAWKS_TASCHENMESSER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OMEGA_BONK)
                .pattern("FSF")
                .pattern("CXC")
                .pattern("FSF")
                .input('X', Items.IRON_SWORD)
                .input('C', Items.NETHERITE_INGOT)
                .input('S',ModItems.ANIMONIUM)
                .input('F',ModBlocks.ANIMONIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_SWORD),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ANIMONIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANIMONIUM))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANIMONIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANIMONIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.OMEGA_BONK)));
    }
}

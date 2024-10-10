package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.tempo.qualore.block.QualoreBlocks;
import net.tempo.qualore.item.QualoreItems;

import java.util.concurrent.CompletableFuture;

public class QualoreRecipeProvider extends FabricRecipeProvider {
    public QualoreRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreItems.PINK_GARNET, RecipeCategory.DECORATIONS, QualoreBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, QualoreBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', QualoreItems.RAW_PINK_GARNET)
                .criterion(hasItem(QualoreItems.RAW_PINK_GARNET), conditionsFromItem(QualoreItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, QualoreItems.RAW_PINK_GARNET, 9)
                .input(QualoreBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(QualoreBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(QualoreBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter);
//Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_STONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.SMOOTH_STONE).criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.CUT_SANDSTONE).criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.CUT_RED_SANDSTONE).criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
//Gates
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.NETHER_BRICK_FENCE_GATE, 1).pattern("#W#").pattern("#W#").input('#', Items.STICK).input('W', Blocks.NETHER_BRICKS).criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE, 1).pattern("#W#").pattern("#W#").input('#', Items.STICK).input('W', Blocks.RED_NETHER_BRICKS).criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
//Fences
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_NETHER_BRICK_FENCE, 3).pattern("#W#").pattern("#W#").input('#', Blocks.RED_NETHER_BRICKS).input('W', Items.RED_NETHER_BRICKS).criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
//Slabs
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_SLAB, 6).pattern("###").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
//Walls
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_STONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.SMOOTH_STONE).criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.STONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.STONE).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_ANDESITE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.POLISHED_ANDESITE).criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DIORITE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.POLISHED_DIORITE).criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_GRANITE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.POLISHED_GRANITE).criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_SANDSTONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.SMOOTH_SANDSTONE).criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.SMOOTH_RED_SANDSTONE).criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.CUT_SANDSTONE).criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.CUT_RED_SANDSTONE).criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PRISMARINE_BRICK_WALL, 6).pattern("###").pattern("###").input('#', Blocks.PRISMARINE_BRICKS).criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DARK_PRISMARINE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.DARK_PRISMARINE).criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PURPUR_WALL, 6).pattern("###").pattern("###").input('#', Blocks.PURPUR_BLOCK).criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.QUARTZ_WALL, 6).pattern("###").pattern("###").input('#', Blocks.QUARTZ_BLOCK).criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_QUARTZ_WALL, 6).pattern("###").pattern("###").input('#', Blocks.SMOOTH_QUARTZ).criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_WALL, 6).pattern("###").pattern("###").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
    }
}

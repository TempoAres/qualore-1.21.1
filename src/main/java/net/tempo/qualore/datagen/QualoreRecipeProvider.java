package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.tempo.qualore.block.QualoreBlocks;

import java.util.concurrent.CompletableFuture;

public class QualoreRecipeProvider extends FabricRecipeProvider {
    public QualoreRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
//Trapdoors
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.ANDESITE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.ANDESITE).criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.BLACKSTONE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.BLACKSTONE).criterion(hasItem(Blocks.BLACKSTONE), conditionsFromItem(Blocks.BLACKSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.DEEPSLATE_TILES).criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DIORITE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.DIORITE).criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.GRANITE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.GRANITE).criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.POLISHED_DEEPSLATE).criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PRISMARINE_BRICK_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.PRISMARINE_BRICKS).criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PURPUR_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.PURPUR_BLOCK).criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.QUARTZ_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.QUARTZ_BLOCK).criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_SANDSTONE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.RED_SANDSTONE).criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SANDSTONE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.SANDSTONE).criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.STONE_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.STONE).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.TUFF_TRAPDOOR, 2).pattern(" ##").pattern(" ##").pattern(" ##").input('#', Blocks.TUFF).criterion(hasItem(Blocks.TUFF), conditionsFromItem(Blocks.TUFF)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.ANDESITE_TRAPDOOR, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.BLACKSTONE_TRAPDOOR, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR, Blocks.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DIORITE_TRAPDOOR, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_TRAPDOOR, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.GRANITE_TRAPDOOR, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PRISMARINE_BRICK_TRAPDOOR, Blocks.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PURPUR_TRAPDOOR, Blocks.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.QUARTZ_TRAPDOOR, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_SANDSTONE_TRAPDOOR, Blocks.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SANDSTONE_TRAPDOOR, Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.STONE_TRAPDOOR, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.TUFF_TRAPDOOR, Blocks.TUFF);

//Stairs
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_STONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.SMOOTH_STONE).criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.CUT_SANDSTONE).criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', Blocks.CUT_RED_SANDSTONE).criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_STAIRS, Blocks.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);

//Gates
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.NETHER_BRICK_FENCE_GATE, 1).pattern("#W#").pattern("#W#").input('#', Items.STICK).input('W', Blocks.NETHER_BRICKS).criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE, 1).pattern("#W#").pattern("#W#").input('#', Items.STICK).input('W', Blocks.RED_NETHER_BRICKS).criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
//Fences
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.RED_NETHER_BRICK_FENCE, 3).pattern("#W#").pattern("#W#").input('#', Blocks.RED_NETHER_BRICKS).input('W', Items.RED_NETHER_BRICKS).criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS)).offerTo(exporter);
//Slabs
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_SLAB, 6).pattern("###").input('#', Blocks.END_STONE).criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE)).offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_SLAB, Blocks.END_STONE);

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
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.STONE_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, QualoreBlocks.END_STONE_WALL, Blocks.END_STONE);
    }
}

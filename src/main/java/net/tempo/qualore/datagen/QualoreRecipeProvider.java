package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
    }
}

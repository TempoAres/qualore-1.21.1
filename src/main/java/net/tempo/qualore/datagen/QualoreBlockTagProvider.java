package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.tempo.qualore.block.QualoreBlocks;

import java.util.concurrent.CompletableFuture;

public class QualoreBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public QualoreBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.PINK_GARNET_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.END_STONE_SLAB);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.END_STONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.SMOOTH_STONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.CUT_SANDSTONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.FENCES).add(QualoreBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(QualoreBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.SMOOTH_STONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.STONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.POLISHED_ANDESITE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.POLISHED_DIORITE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.POLISHED_GRANITE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.SMOOTH_SANDSTONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.CUT_SANDSTONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.CUT_RED_SANDSTONE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.PRISMARINE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.DARK_PRISMARINE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.PURPUR_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.QUARTZ_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.SMOOTH_QUARTZ_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.END_STONE_WALL);
        getOrCreateTagBuilder(BlockTags.SLABS).add(QualoreBlocks.END_STONE_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(QualoreBlocks.END_STONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(QualoreBlocks.SMOOTH_STONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(QualoreBlocks.CUT_SANDSTONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.FENCES).add(QualoreBlocks.RED_NETHER_BRICK_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(QualoreBlocks.NETHER_BRICK_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE);
    }
}

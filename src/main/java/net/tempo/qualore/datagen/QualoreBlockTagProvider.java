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
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.WAXED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.EXPOSED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.WAXED_EXPOSED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.WEATHERED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.WAXED_WEATHERED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.OXIDIZED_COPPER_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(QualoreBlocks.WAXED_OXIDIZED_COPPER_WALL);
    }
}

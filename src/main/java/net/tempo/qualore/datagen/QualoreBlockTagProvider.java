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
    }
}

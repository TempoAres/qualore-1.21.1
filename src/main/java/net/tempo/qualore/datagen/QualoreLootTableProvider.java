package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.tempo.qualore.block.QualoreBlocks;

import java.util.concurrent.CompletableFuture;

public class QualoreLootTableProvider extends FabricBlockLootTableProvider {
    public QualoreLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(QualoreBlocks.RAW_PINK_GARNET_BLOCK);
        addDrop(QualoreBlocks.PINK_GARNET_BLOCK);
        addDrop(QualoreBlocks.PINK_GARNET_STAIRS);
        addDrop(QualoreBlocks.PINK_GARNET_SLAB, slabDrops(QualoreBlocks.PINK_GARNET_SLAB));
        addDrop(QualoreBlocks.PINK_GARNET_BUTTON);
        addDrop(QualoreBlocks.PINK_GARNET_PRESSURE_PLATE);
        addDrop(QualoreBlocks.PINK_GARNET_FENCE);
        addDrop(QualoreBlocks.PINK_GARNET_FENCE_GATE);
        addDrop(QualoreBlocks.PINK_GARNET_WALL);
        addDrop(QualoreBlocks.PINK_GARNET_DOOR, doorDrops(QualoreBlocks.PINK_GARNET_DOOR));
        addDrop(QualoreBlocks.PINK_GARNET_TRAPDOOR);
    }
}

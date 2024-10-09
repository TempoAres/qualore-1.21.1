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
//Test Blocks
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
//Qualore Blocks
        addDrop(QualoreBlocks.SMOOTH_STONE_STAIRS);
        addDrop(QualoreBlocks.SMOOTH_STONE_WALL);
        addDrop(QualoreBlocks.STONE_WALL);
        addDrop(QualoreBlocks.POLISHED_ANDESITE_WALL);
        addDrop(QualoreBlocks.POLISHED_DIORITE_WALL);
        addDrop(QualoreBlocks.POLISHED_GRANITE_WALL);
        addDrop(QualoreBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(QualoreBlocks.CUT_SANDSTONE_WALL);
        addDrop(QualoreBlocks.CUT_RED_SANDSTONE_WALL);
        addDrop(QualoreBlocks.PRISMARINE_BRICK_WALL);
        addDrop(QualoreBlocks.DARK_PRISMARINE_WALL);
        addDrop(QualoreBlocks.PURPUR_WALL);
        addDrop(QualoreBlocks.QUARTZ_WALL);
        addDrop(QualoreBlocks.SMOOTH_QUARTZ_WALL);
        addDrop(QualoreBlocks.END_STONE_WALL);
        addDrop(QualoreBlocks.COPPER_WALL);
        addDrop(QualoreBlocks.WAXED_COPPER_WALL);
        addDrop(QualoreBlocks.EXPOSED_COPPER_WALL);
        addDrop(QualoreBlocks.WAXED_EXPOSED_COPPER_WALL);
        addDrop(QualoreBlocks.WEATHERED_COPPER_WALL);
        addDrop(QualoreBlocks.WAXED_WEATHERED_COPPER_WALL);
        addDrop(QualoreBlocks.OXIDIZED_COPPER_WALL);
        addDrop(QualoreBlocks.WAXED_OXIDIZED_COPPER_WALL);
    }
}

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
//Qualore Walls
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
//Qualore Stairs
        addDrop(QualoreBlocks.SMOOTH_STONE_STAIRS);
        addDrop(QualoreBlocks.END_STONE_STAIRS);
        addDrop(QualoreBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);
//Qualore Slabs
        addDrop(QualoreBlocks.END_STONE_SLAB, slabDrops(QualoreBlocks.END_STONE_SLAB));
//Qualore Gates
        addDrop(QualoreBlocks.NETHER_BRICK_FENCE_GATE);
        addDrop(QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE);
//Qualore Fences
        addDrop(QualoreBlocks.RED_NETHER_BRICK_FENCE);
//Qualore Trapdoors
        addDrop(QualoreBlocks.ANDESITE_TRAPDOOR);
        addDrop(QualoreBlocks.BLACKSTONE_TRAPDOOR);
        addDrop(QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR);
        addDrop(QualoreBlocks.DIORITE_TRAPDOOR);
        addDrop(QualoreBlocks.END_STONE_TRAPDOOR);
        addDrop(QualoreBlocks.GRANITE_TRAPDOOR);
        addDrop(QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
        addDrop(QualoreBlocks.PRISMARINE_BRICK_TRAPDOOR);
        addDrop(QualoreBlocks.PURPUR_TRAPDOOR);
        addDrop(QualoreBlocks.QUARTZ_TRAPDOOR);
        addDrop(QualoreBlocks.RED_SANDSTONE_TRAPDOOR);
        addDrop(QualoreBlocks.SANDSTONE_TRAPDOOR);
        addDrop(QualoreBlocks.STONE_TRAPDOOR);
        addDrop(QualoreBlocks.TUFF_TRAPDOOR);
    }
}

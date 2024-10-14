package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.tempo.qualore.block.QualoreBlocks;

public class QualoreModelProvider extends FabricModelProvider {
    public QualoreModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//Qualore Trapdoors
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.ANDESITE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.BLACKSTONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.DIORITE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.END_STONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.GRANITE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.PRISMARINE_BRICK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.PURPUR_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.QUARTZ_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.RED_SANDSTONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.SANDSTONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.STONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.TUFF_TRAPDOOR);
//Qualore Blocks
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        smoothStonePool.stairs(QualoreBlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(QualoreBlocks.SMOOTH_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        stonePool.wall(QualoreBlocks.STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(QualoreBlocks.POLISHED_ANDESITE_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        polishedDioritePool.wall(QualoreBlocks.POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        polishedGranitePool.wall(QualoreBlocks.POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        smoothSandstonePool.wall(QualoreBlocks.SMOOTH_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        smoothRedSandstonePool.wall(QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        prismarineBrickPool.wall(QualoreBlocks.PRISMARINE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        darkPrismarinePool.wall(QualoreBlocks.DARK_PRISMARINE_WALL);

        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        purpurPool.wall(QualoreBlocks.PURPUR_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        smoothQuartzPool.wall(QualoreBlocks.SMOOTH_QUARTZ_WALL);

        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endStonePool.wall(QualoreBlocks.END_STONE_WALL);
        endStonePool.stairs(QualoreBlocks.END_STONE_STAIRS);
        endStonePool.slab(QualoreBlocks.END_STONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool netherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHER_BRICKS);
        netherBrickPool.fenceGate(QualoreBlocks.NETHER_BRICK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);
        redNetherBrickPool.fenceGate(QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE);
        redNetherBrickPool.fence(QualoreBlocks.RED_NETHER_BRICK_FENCE);

        BlockStateModelGenerator.BlockTexturePool cutSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_SANDSTONE);
        cutSandstonePool.stairs(QualoreBlocks.CUT_SANDSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cutRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_RED_SANDSTONE);
        cutRedSandstonePool.stairs(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}

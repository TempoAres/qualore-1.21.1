package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.tempo.qualore.block.QualoreBlocks;
import net.tempo.qualore.item.QualoreItems;

public class QualoreModelProvider extends FabricModelProvider {
    public QualoreModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(QualoreBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(QualoreBlocks.RAW_PINK_GARNET_BLOCK);
//Test Blocks
        pinkGarnetPool.stairs(QualoreBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(QualoreBlocks.PINK_GARNET_SLAB);
        pinkGarnetPool.button(QualoreBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(QualoreBlocks.PINK_GARNET_PRESSURE_PLATE);
        pinkGarnetPool.fence(QualoreBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(QualoreBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(QualoreBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(QualoreBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.PINK_GARNET_TRAPDOOR);
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

        //BlockStateModelGenerator.BlockTexturePool cutSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_SANDSTONE);
        //cutSandstonePool.wall(QualoreBlocks.CUT_SANDSTONE_WALL);

        //BlockStateModelGenerator.BlockTexturePool cutRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_RED_SANDSTONE);
        //cutRedSandstonePool.wall(QualoreBlocks.CUT_RED_SANDSTONE_WALL);

        //New Pools

        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        prismarineBrickPool.wall(QualoreBlocks.PRISMARINE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        darkPrismarinePool.wall(QualoreBlocks.DARK_PRISMARINE_WALL);

        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        purpurPool.wall(QualoreBlocks.PURPUR_WALL);

        //BlockStateModelGenerator.BlockTexturePool quartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BLOCK);
        //quartzPool.wall(QualoreBlocks.QUARTZ_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        smoothQuartzPool.wall(QualoreBlocks.SMOOTH_QUARTZ_WALL);

        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endStonePool.wall(QualoreBlocks.END_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool copperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        copperPool.wall(QualoreBlocks.COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool waxedCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WAXED_COPPER_BLOCK);
        waxedCopperPool.wall(QualoreBlocks.WAXED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool exposedCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        exposedCopperPool.wall(QualoreBlocks.EXPOSED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool waxedExposedCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WAXED_EXPOSED_COPPER);
        waxedExposedCopperPool.wall(QualoreBlocks.WAXED_EXPOSED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool weatheredCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        weatheredCopperPool.wall(QualoreBlocks.WEATHERED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool waxedWeatheredCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WAXED_WEATHERED_COPPER);
        waxedWeatheredCopperPool.wall(QualoreBlocks.WAXED_WEATHERED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool oxidizedCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        oxidizedCopperPool.wall(QualoreBlocks.OXIDIZED_COPPER_WALL);

        BlockStateModelGenerator.BlockTexturePool waxedOxidizedCopperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WAXED_OXIDIZED_COPPER);
        waxedOxidizedCopperPool.wall(QualoreBlocks.WAXED_OXIDIZED_COPPER_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(QualoreItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(QualoreItems.RAW_PINK_GARNET, Models.GENERATED);
    }
}

package net.tempo.qualore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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

        pinkGarnetPool.stairs(QualoreBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(QualoreBlocks.PINK_GARNET_SLAB);
        pinkGarnetPool.button(QualoreBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(QualoreBlocks.PINK_GARNET_PRESSURE_PLATE);
        pinkGarnetPool.fence(QualoreBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(QualoreBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(QualoreBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(QualoreBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(QualoreBlocks.PINK_GARNET_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(QualoreItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(QualoreItems.RAW_PINK_GARNET, Models.GENERATED);
    }
}

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
        blockStateModelGenerator.registerSimpleCubeAll(QualoreBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(QualoreBlocks.RAW_PINK_GARNET_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(QualoreItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(QualoreItems.RAW_PINK_GARNET, Models.GENERATED);
    }
}

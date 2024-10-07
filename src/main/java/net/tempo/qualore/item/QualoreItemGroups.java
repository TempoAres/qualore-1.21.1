package net.tempo.qualore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tempo.qualore.QualoreMod;
import net.tempo.qualore.block.QualoreBlocks;

public class QualoreItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualoreMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(QualoreItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.qualore.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(QualoreItems.PINK_GARNET);
                        entries.add(QualoreItems.RAW_PINK_GARNET);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualoreMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(QualoreBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.qualore.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(QualoreBlocks.PINK_GARNET_BLOCK);
                        entries.add(QualoreBlocks.RAW_PINK_GARNET_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        QualoreMod.LOGGER.info("Registering Item Groups for " + QualoreMod.MOD_ID);
    }
}
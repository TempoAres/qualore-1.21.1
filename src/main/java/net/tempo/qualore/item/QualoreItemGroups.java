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
    public static final ItemGroup QUALORE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(QualoreMod.MOD_ID, "qualore"),
            FabricItemGroup.builder().icon(() -> new ItemStack(QualoreBlocks.QUARTZ_WALL))
                    .displayName(Text.translatable("itemgroup.qualore.Qualore"))
                    .entries((displayContext, entries) -> {
                        entries.add(QualoreBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(QualoreBlocks.SMOOTH_STONE_WALL);
                        entries.add(QualoreBlocks.STONE_WALL);
                        entries.add(QualoreBlocks.STONE_TRAPDOOR);
                        entries.add(QualoreBlocks.POLISHED_GRANITE_WALL);
                        entries.add(QualoreBlocks.GRANITE_TRAPDOOR);
                        entries.add(QualoreBlocks.POLISHED_DIORITE_WALL);
                        entries.add(QualoreBlocks.DIORITE_TRAPDOOR);
                        entries.add(QualoreBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(QualoreBlocks.ANDESITE_TRAPDOOR);
                        entries.add(QualoreBlocks.DEEPSLATE_TILE_TRAPDOOR);
                        entries.add(QualoreBlocks.POLISHED_DEEPSLATE_TRAPDOOR);
                        entries.add(QualoreBlocks.TUFF_TRAPDOOR);
                        entries.add(QualoreBlocks.BLACKSTONE_TRAPDOOR);
                        entries.add(QualoreBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(QualoreBlocks.CUT_SANDSTONE_WALL);
                        entries.add(QualoreBlocks.SANDSTONE_TRAPDOOR);
                        entries.add(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(QualoreBlocks.CUT_RED_SANDSTONE_WALL);
                        entries.add(QualoreBlocks.RED_SANDSTONE_TRAPDOOR);
                        entries.add(QualoreBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(QualoreBlocks.PRISMARINE_BRICK_WALL);
                        entries.add(QualoreBlocks.PRISMARINE_BRICK_TRAPDOOR);
                        entries.add(QualoreBlocks.DARK_PRISMARINE_WALL);
                        entries.add(QualoreBlocks.PURPUR_WALL);
                        entries.add(QualoreBlocks.PURPUR_TRAPDOOR);
                        entries.add(QualoreBlocks.QUARTZ_WALL);
                        entries.add(QualoreBlocks.QUARTZ_TRAPDOOR);
                        entries.add(QualoreBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(QualoreBlocks.END_STONE_STAIRS);
                        entries.add(QualoreBlocks.END_STONE_SLAB);
                        entries.add(QualoreBlocks.END_STONE_WALL);
                        entries.add(QualoreBlocks.END_STONE_TRAPDOOR);
                        entries.add(QualoreBlocks.NETHER_BRICK_FENCE_GATE);
                        entries.add(QualoreBlocks.RED_NETHER_BRICK_FENCE);
                        entries.add(QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE);
                    }).build());

    public static void registerItemGroups() {
        QualoreMod.LOGGER.info("Registering Item Groups for " + QualoreMod.MOD_ID);
    }
}
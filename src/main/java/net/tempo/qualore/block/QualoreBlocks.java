package net.tempo.qualore.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tempo.qualore.QualoreMod;

public class QualoreBlocks {
//Test Blocks
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block", new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs", new StairsBlock(QualoreBlocks.PINK_GARNET_BLOCK.getDefaultState(),AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door", new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor", new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
//Qualore Walls
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block STONE_WALL = registerBlock("stone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
//Qualore Stairs
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs", new StairsBlock(Blocks.END_STONE.getDefaultState(),AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
//Qualore Slabs
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(3f).requiresTool()));
//Qualore Gates
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
//Qualore Fences
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence", new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));


    //RegisterBlock Method
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(QualoreMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(QualoreMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        QualoreMod.LOGGER.info("Registering Mod Blocks for " + QualoreMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(QualoreBlocks.PINK_GARNET_BLOCK);
            entries.add(QualoreBlocks.RAW_PINK_GARNET_BLOCK);
            entries.add(QualoreBlocks.PINK_GARNET_STAIRS);
            entries.add(QualoreBlocks.PINK_GARNET_SLAB);
            entries.add(QualoreBlocks.PINK_GARNET_BUTTON);
            entries.add(QualoreBlocks.PINK_GARNET_PRESSURE_PLATE);
            entries.add(QualoreBlocks.PINK_GARNET_FENCE);
            entries.add(QualoreBlocks.PINK_GARNET_FENCE_GATE);
            entries.add(QualoreBlocks.PINK_GARNET_WALL);
            entries.add(QualoreBlocks.PINK_GARNET_DOOR);
            entries.add(QualoreBlocks.PINK_GARNET_TRAPDOOR);
//Qualore Walls
            entries.add(QualoreBlocks.SMOOTH_STONE_WALL);
            entries.add(QualoreBlocks.STONE_WALL);
            entries.add(QualoreBlocks.POLISHED_ANDESITE_WALL);
            entries.add(QualoreBlocks.POLISHED_DIORITE_WALL);
            entries.add(QualoreBlocks.POLISHED_GRANITE_WALL);
            entries.add(QualoreBlocks.SMOOTH_SANDSTONE_WALL);
            entries.add(QualoreBlocks.SMOOTH_RED_SANDSTONE_WALL);
            entries.add(QualoreBlocks.CUT_SANDSTONE_WALL);
            entries.add(QualoreBlocks.CUT_RED_SANDSTONE_WALL);
            entries.add(QualoreBlocks.PRISMARINE_BRICK_WALL);
            entries.add(QualoreBlocks.DARK_PRISMARINE_WALL);
            entries.add(QualoreBlocks.PURPUR_WALL);
            entries.add(QualoreBlocks.QUARTZ_WALL);
            entries.add(QualoreBlocks.SMOOTH_QUARTZ_WALL);
            entries.add(QualoreBlocks.END_STONE_WALL);
//Qualore Stairs
            entries.add(QualoreBlocks.SMOOTH_STONE_STAIRS);
            entries.add(QualoreBlocks.END_STONE_STAIRS);
            entries.add(QualoreBlocks.CUT_SANDSTONE_STAIRS);
            entries.add(QualoreBlocks.CUT_RED_SANDSTONE_STAIRS);
//Qualore Slabs
            entries.add(QualoreBlocks.END_STONE_SLAB);
//Qualore Gates
            entries.add(QualoreBlocks.NETHER_BRICK_FENCE_GATE);
            entries.add(QualoreBlocks.RED_NETHER_BRICK_FENCE_GATE);
//Qualore Fences
            entries.add(QualoreBlocks.RED_NETHER_BRICK_FENCE);
        });
    }
}

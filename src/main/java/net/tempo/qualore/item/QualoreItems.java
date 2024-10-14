package net.tempo.qualore.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tempo.qualore.QualoreMod;

public class QualoreItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(QualoreMod.MOD_ID, name), item);
    }

    public static void registerQualoreItems(){
        QualoreMod.LOGGER.info("Registering Mod Items for " + QualoreMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}

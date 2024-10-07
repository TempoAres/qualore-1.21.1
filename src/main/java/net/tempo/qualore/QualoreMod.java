package net.tempo.qualore;

import net.fabricmc.api.ModInitializer;

import net.tempo.qualore.block.QualoreBlocks;
import net.tempo.qualore.item.QualoreItemGroups;
import net.tempo.qualore.item.QualoreItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QualoreMod implements ModInitializer {
	public static final String MOD_ID = "qualore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		QualoreItemGroups.registerItemGroups();

		QualoreItems.registerQualoreItems();
		QualoreBlocks.registerModBlocks();
	}
}
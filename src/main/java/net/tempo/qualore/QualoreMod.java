package net.tempo.qualore;

import net.fabricmc.api.ModInitializer;

import net.tempo.item.QualoreItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QualoreMod implements ModInitializer {
	public static final String MOD_ID = "qualore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		QualoreItems.registerQualoreItems();
	}
}
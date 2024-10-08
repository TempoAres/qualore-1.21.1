package net.tempo.qualore;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.tempo.qualore.datagen.*;

public class QualoreModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(QualoreBlockTagProvider::new);
		pack.addProvider(QualoreItemTagProvider::new);
		pack.addProvider(QualoreLootTableProvider::new);
		pack.addProvider(QualoreModelProvider::new);
		pack.addProvider(QualoreRecipeProvider::new);
	}
}

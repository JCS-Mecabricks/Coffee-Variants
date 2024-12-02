package github.jcsmecabricks.coffeevariants;

import github.jcsmecabricks.coffeevariants.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CoffeeVariantsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(CoffeeVariantsEnglishLanguageProvider::new);
		pack.addProvider(CoffeeVariantsModelProvider::new);
		pack.addProvider(CoffeeVariantsRecipeProvider::new);
		pack.addProvider(CoffeeVariantsBlockTagProvider::new);
		pack.addProvider(CoffeeVariantsBlockLootTableProvider::new);
		pack.addProvider(ModPoiTagProvider::new);


	}
}

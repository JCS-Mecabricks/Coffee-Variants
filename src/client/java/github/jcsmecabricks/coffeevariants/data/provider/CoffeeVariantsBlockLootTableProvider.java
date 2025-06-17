package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CoffeeVariantsBlockLootTableProvider extends FabricBlockLootTableProvider {
    public CoffeeVariantsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.COFFEE_STATION);

    }
}

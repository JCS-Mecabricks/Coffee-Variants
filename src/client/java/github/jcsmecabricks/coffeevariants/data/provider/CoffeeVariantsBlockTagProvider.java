package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CoffeeVariantsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public CoffeeVariantsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(BlockInit.COFFEE_STATION);
    }
}

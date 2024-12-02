package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.init.BlockInit;
import github.jcsmecabricks.coffeevariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CoffeeVariantsModelProvider extends FabricModelProvider {
    public CoffeeVariantsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ItemInit.COFFEE_ITEM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.COFFEE_CUP, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MOCHA, Models.GENERATED);
        itemModelGenerator.register(ItemInit.LATTE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CAPPUCCINO, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ESPRESSO, Models.GENERATED);
        itemModelGenerator.register(ItemInit.AFFOGATO, Models.GENERATED);
    }
}

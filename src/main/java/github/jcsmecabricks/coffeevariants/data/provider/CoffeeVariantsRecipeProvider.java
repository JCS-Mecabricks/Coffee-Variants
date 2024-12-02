package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.init.BlockInit;
import github.jcsmecabricks.coffeevariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class CoffeeVariantsRecipeProvider extends FabricRecipeProvider {
    public CoffeeVariantsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.FOOD, ItemInit.COFFEE_CUP)
                        .input('P', Items.PAPER)
                        .pattern("P P")
                        .pattern(" P ")
                        .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                        .offerTo(exporter);

                createShaped(RecipeCategory.FOOD, ItemInit.ESPRESSO)
                        .input('S', Items.SUGAR)
                        .input('P', ItemInit.COFFEE_ITEM)
                        .input('M', Items.MILK_BUCKET)
                        .pattern(" P ")
                        .pattern("SMS")
                        .pattern(" P ")
                        .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                        .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                        .criterion(hasItem(ItemInit.COFFEE_ITEM), conditionsFromItem(ItemInit.COFFEE_ITEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.FOOD, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.OAK_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, ItemInit.LATTE)
                        .input(Items.MILK_BUCKET, 2)
                        
                        .input(Items.COCOA_BEANS)
                        .input(ItemInit.COFFEE_ITEM)
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                        .criterion(hasItem(ItemInit.COFFEE_ITEM), conditionsFromItem(ItemInit.COFFEE_ITEM))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.OAK_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "oak_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.SPRUCE_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "spruce_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.PALE_OAK_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.PALE_OAK_PLANKS), conditionsFromItem(Items.PALE_OAK_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "pale_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.JUNGLE_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "jungle_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.ACACIA_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "acacia_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.BAMBOO_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.BAMBOO_PLANKS), conditionsFromItem(Items.BAMBOO_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "bamboo_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.CHERRY_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "cherry_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.DARK_OAK_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "dark_oak_coffee_station")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.COFFEE_STATION)
                        .input('C', ItemInit.COFFEE_CUP)
                        .input('O', Items.MANGROVE_PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter, String.valueOf(Identifier.of("coffee_variants", "mangrove_coffee_station")));

                createShapeless(RecipeCategory.FOOD, ItemInit.CAPPUCCINO)
                        .input(Items.MILK_BUCKET)
                        .input(Items.SUGAR)
                        .input(Items.COCOA_BEANS)
                        .input(ItemInit.COFFEE_ITEM)
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                        .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                        .criterion(hasItem(ItemInit.COFFEE_ITEM), conditionsFromItem(ItemInit.COFFEE_ITEM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, ItemInit.MOCHA)
                        .input(Items.COOKIE)
                        .input(ItemInit.COFFEE_ITEM)
                        .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                        .criterion(hasItem(ItemInit.COFFEE_ITEM), conditionsFromItem(ItemInit.COFFEE_ITEM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.COMBAT, ItemInit.COFFEE_ITEM)
                        .input(Items.COCOA_BEANS)
                        .input(ItemInit.COFFEE_CUP)
                        .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                        .criterion(hasItem(ItemInit.COFFEE_CUP), conditionsFromItem(ItemInit.COFFEE_CUP))
                        .offerTo(exporter);


            }
        };
    }


    @Override
    public String getName() {
        return "Coffee Variants Recipes";
    }
}

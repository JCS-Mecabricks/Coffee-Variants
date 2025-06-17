package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.init.BlockInit;
import github.jcsmecabricks.coffeevariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
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
                        .input('O', ItemTags.PLANKS)
                        .pattern("OOO")
                        .pattern("OCO")
                        .pattern("OOO")
                        .criterion(hasTag(ItemTags.PLANKS), conditionsFromTag(ItemTags.PLANKS))
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
            private static String hasTag(TagKey < Item > tag) {
                return "has_" + tag.id().toString();
            }
        };
    }


    @Override
    public String getName() {
        return "Coffee Variants Recipes";
    }
}

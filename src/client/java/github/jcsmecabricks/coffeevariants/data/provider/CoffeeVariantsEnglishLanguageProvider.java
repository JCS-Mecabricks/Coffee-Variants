package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.init.BlockInit;
import github.jcsmecabricks.coffeevariants.init.ItemGroupInit;
import github.jcsmecabricks.coffeevariants.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CoffeeVariantsEnglishLanguageProvider extends FabricLanguageProvider {
    public CoffeeVariantsEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            CoffeeVariants.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.COFFEE_ITEM, "Coffee");
        translationBuilder.add(ItemInit.COFFEE_CUP, "Coffee Cup");
        translationBuilder.add(ItemInit.MOCHA, "Mocha");
        translationBuilder.add(ItemInit.LATTE, "Latte");
        translationBuilder.add(BlockInit.COFFEE_STATION, "Coffee Station");
        translationBuilder.add(ItemInit.CAPPUCCINO, "Cappuccino");
        translationBuilder.add(ItemInit.ESPRESSO, "Espresso");
        translationBuilder.add(ItemInit.AFFOGATO, "Affogato");
        addText(translationBuilder, ItemGroupInit.COFFEE_TITLE, "Coffee Variants");
    }
}

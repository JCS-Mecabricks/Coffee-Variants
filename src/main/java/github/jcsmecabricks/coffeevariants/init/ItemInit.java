package github.jcsmecabricks.coffeevariants.init;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.custom.CoffeeItem;
import github.jcsmecabricks.coffeevariants.custom.ModConsumableComponents;
import github.jcsmecabricks.coffeevariants.custom.ModFoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final Item COFFEE_CUP = register("coffee_cup", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "coffee_cup")))));

    public static final Item COFFEE_ITEM = register("coffee_item", new CoffeeItem(new Item.Settings()
            .food(ModFoodComponents.COFFEE_FOOD, ModConsumableComponents.COFFEE_DRINK)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "coffee_item")))));

    public static final Item LATTE = register("latte", new CoffeeItem(new Item.Settings()
            .food(ModFoodComponents.LATTE, ModConsumableComponents.COFFEE_DRINK)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "latte")))));

    public static final Item CAPPUCCINO = register("cappuccino", new CoffeeItem(new Item.Settings()
            .food(ModFoodComponents.CAPPUCCINO, ModConsumableComponents.COFFEE_DRINK)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "cappuccino")))));

    public static final Item MOCHA = register("mocha", new CoffeeItem(new Item.Settings()
            .food(ModFoodComponents.MOCHA, ModConsumableComponents.COFFEE_DRINK)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "mocha")))));

    public static final Item ESPRESSO = register("espresso", new CoffeeItem(new Item.Settings()
            .food(ModFoodComponents.ESPRESSO, ModFoodComponents.CAFFEINE_EFFECT)
            .maxCount(1)
            .food(ModFoodComponents.ESPRESSO, ModConsumableComponents.ESPRESSO_DRINK)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "espresso")))));

    public static final Item AFFOGATO = register("affogato", new Item(new Item.Settings()
            .food(ModFoodComponents.AFFOGATO_FOOD, ModConsumableComponents.COFFEE_DRINK)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, "affogato")))));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, CoffeeVariants.id(name), item);
    }

    public static void load() {}
}

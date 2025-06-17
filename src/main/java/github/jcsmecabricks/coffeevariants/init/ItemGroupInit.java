package github.jcsmecabricks.coffeevariants.init;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text COFFEE_TITLE = Text.translatable("itemGroup." + CoffeeVariants.MOD_ID + ".coffee_group");
    public static final ItemGroup COFFEE_GROUP = register("coffee_group", FabricItemGroup.builder()
            .displayName(COFFEE_TITLE)
            .icon(ItemInit.COFFEE_ITEM::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(CoffeeVariants.MOD_ID))
                    .map(Registries.ITEM::getOptionalValue)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());
    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, CoffeeVariants.id(name), itemGroup);
    }
    public static void load() {

    }
}

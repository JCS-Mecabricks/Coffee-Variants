package github.jcsmecabricks.coffeevariants.init;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class BlockInit {

    public static final Block COFFEE_STATION = registerWithItem("coffee_station", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CoffeeVariants.MOD_ID, "coffee_station")))));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, CoffeeVariants.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, name))));
    }
    public static void load() {}
}

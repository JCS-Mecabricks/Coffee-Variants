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

    public static final Block COFFEE_STATION = registerBlock("coffee_station", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CoffeeVariants.MOD_ID, "coffee_station")))));

    public static <T extends Block> T register(String name, T block) {
        CoffeeVariants.LOGGER.info("Registering block and item for: {}", name);

        Identifier blockId = Identifier.of(CoffeeVariants.MOD_ID, name);
        Registry.register(Registries.BLOCK, blockId, block);
        return block;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CoffeeVariants.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CoffeeVariants.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CoffeeVariants.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }
    public static void load() {}
}

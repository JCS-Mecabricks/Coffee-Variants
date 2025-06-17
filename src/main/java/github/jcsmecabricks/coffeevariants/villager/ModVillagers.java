package github.jcsmecabricks.coffeevariants.villager;

import com.google.common.collect.ImmutableSet;
import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.init.BlockInit;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> BARISTA_POI_KEY = registerPoiKey("barista_poi");
    public static final PointOfInterestType BARISTA_POI = registerPOI("barista_poi", BlockInit.COFFEE_STATION);

    public static final VillagerProfession BARISTA = registerProfession(Text.of("barista"), "barista", BARISTA_POI_KEY);


    private static VillagerProfession registerProfession(Text text, String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(CoffeeVariants.MOD_ID, name),
                new VillagerProfession(text, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(CoffeeVariants.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(CoffeeVariants.MOD_ID, name));
    }

    public static void  loadVillagers() {
        CoffeeVariants.LOGGER.info("Loading Villagers for" + CoffeeVariants.MOD_ID);
    }
}

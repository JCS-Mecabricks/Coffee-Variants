package github.jcsmecabricks.coffeevariants.data.provider;

import github.jcsmecabricks.coffeevariants.villager.ModVillagers;
import net.minecraft.data.DataOutput;
import net.minecraft.data.tag.TagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.concurrent.CompletableFuture;

public class ModPoiTagProvider extends TagProvider<PointOfInterestType> {
    public ModPoiTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        this.getTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
                .add(ModVillagers.BARISTA_POI_KEY.getValue());
    }
}

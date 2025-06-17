package github.jcsmecabricks.coffeevariants.effect;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> CAFFEINE = registerStatusEffect("caffeine",
            new CaffeineEffect(StatusEffectCategory.NEUTRAL, 14270550)
                    .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED,
                            Identifier.of(CoffeeVariants.MOD_ID, "caffeine"), 4f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.JUMP_STRENGTH,
                            Identifier.of(CoffeeVariants.MOD_ID, "caffeine"), 1f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(CoffeeVariants.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        CoffeeVariants.LOGGER.info("Registering Mod Effects for " + CoffeeVariants.MOD_ID);
    }
}

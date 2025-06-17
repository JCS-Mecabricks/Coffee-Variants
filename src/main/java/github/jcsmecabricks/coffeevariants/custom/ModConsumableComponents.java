package github.jcsmecabricks.coffeevariants.custom;

import github.jcsmecabricks.coffeevariants.effect.ModEffects;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.sound.SoundEvents;

import static net.minecraft.component.type.ConsumableComponents.drink;

public class ModConsumableComponents {
    public static final ConsumableComponent COFFEE_DRINK = drink()
            .consumeSeconds(2.0F).sound(SoundEvents.ENTITY_GENERIC_DRINK)
            .build();

    public static final ConsumableComponent ESPRESSO_DRINK = drink()
            .consumeSeconds(2.0F)
            .sound(SoundEvents.ENTITY_GENERIC_DRINK)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(ModEffects.CAFFEINE, 1800)))
            .build();
}

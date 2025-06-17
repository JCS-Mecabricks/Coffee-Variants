package github.jcsmecabricks.coffeevariants.custom;

import github.jcsmecabricks.coffeevariants.effect.ModEffects;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
   public static final FoodComponent COFFEE_FOOD = new FoodComponent.Builder()
           .nutrition(5)
           .alwaysEdible()
           .saturationModifier(0.3f)
           .build();

   public static final FoodComponent MOCHA = new FoodComponent.Builder()
           .nutrition(7)
           .alwaysEdible()
           .saturationModifier(0.6f)
           .build();

   public static final FoodComponent LATTE = new FoodComponent.Builder()
           .nutrition(7)
           .alwaysEdible()
           .saturationModifier(0.7f)
           .build();

   public static final FoodComponent CAPPUCCINO = new FoodComponent.Builder()
           .nutrition(8)
           .alwaysEdible()
           .saturationModifier(0.6f)
           .build();

   public static final FoodComponent ESPRESSO = new FoodComponent.Builder()
           .nutrition(7)
           .alwaysEdible()
           .saturationModifier(1f)
           .build();

   public static final FoodComponent AFFOGATO_FOOD = new FoodComponent.Builder()
           .nutrition(13)
           .alwaysEdible()
           .saturationModifier(1f)
           .build();


   public static final ConsumableComponent CAFFEINE_EFFECT = ConsumableComponents.food()
           .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(ModEffects.CAFFEINE, 1800), 1f)).build();
}

package github.jcsmecabricks.coffeevariants.custom;

import github.jcsmecabricks.coffeevariants.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CoffeeItem extends Item {

    public CoffeeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            if (!player.getInventory().insertStack(new ItemStack(ItemInit.COFFEE_CUP))) {
                // Drop the coffee cup if inventory is full
                player.dropItem(new ItemStack(ItemInit.COFFEE_CUP), false);
            }
        }
        // Reduce the consumed item by 1
        return super.finishUsing(stack, world, user);
    }
}

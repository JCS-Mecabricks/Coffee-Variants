package github.jcsmecabricks.coffeevariants;

import github.jcsmecabricks.coffeevariants.effect.ModEffects;
import github.jcsmecabricks.coffeevariants.init.BlockInit;
import github.jcsmecabricks.coffeevariants.init.ItemGroupInit;
import github.jcsmecabricks.coffeevariants.init.ItemInit;
import github.jcsmecabricks.coffeevariants.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeVariants implements ModInitializer {
	public static final String MOD_ID = "coffee-variants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ModEffects.registerEffects();
		ItemGroupInit.load();
		ItemInit.load();
		BlockInit.load();
		ModVillagers.loadVillagers();
		System.out.println("Initializing CoffeeVariantsMod...");
		System.out.println("Items registered successfully!");
		registerCustomTrades();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.addAfter(Items.FURNACE, BlockInit.COFFEE_STATION);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.SPIDER_EYE, ItemInit.COFFEE_CUP);
			entries.addAfter(ItemInit.COFFEE_CUP, ItemInit.COFFEE_ITEM);
			entries.addAfter(ItemInit.COFFEE_ITEM, ItemInit.LATTE);
			entries.addAfter(ItemInit.LATTE, ItemInit.CAPPUCCINO);
			entries.addAfter(ItemInit.CAPPUCCINO, ItemInit.MOCHA);
			entries.addAfter(ItemInit.MOCHA, ItemInit.ESPRESSO);
			entries.addAfter(ItemInit.ESPRESSO, ItemInit.AFFOGATO);
		});
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
	private static void registerCustomTrades() {
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BARISTA, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 2),
					new ItemStack(ItemInit.COFFEE_ITEM, 1), 15, 3, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.COCOA_BEANS, 5),
					new ItemStack(Items.EMERALD, 2), 12, 3, 0.04f
			));
		});
				TradeOfferHelper.registerVillagerOffers(ModVillagers.BARISTA, 2, factories -> {
					factories.add((entity, random) -> new TradeOffer(
							new TradedItem(Items.EMERALD, 4),
							new ItemStack(ItemInit.LATTE, 1), 12, 3, 0.04f
					));
					factories.add((entity, random) -> new TradeOffer(
							new TradedItem(Items.MILK_BUCKET, 1),
							new ItemStack(Items.EMERALD, 3), 12, 3, 0.04f
					));
				});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BARISTA, 3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ItemInit.MOCHA, 1), 12, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.SUGAR, 8),
					new ItemStack(Items.EMERALD, 1), 12, 3, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 5),
					new ItemStack(ItemInit.CAPPUCCINO, 1), 12, 3, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BARISTA, 4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ItemInit.ESPRESSO, 1), 12, 5, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.COOKIE, 6),
					new ItemStack(Items.EMERALD, 1), 12, 3, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BARISTA, 5, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ItemInit.AFFOGATO, 1), 10, 7, 0.04f
			));
		});
	}
}
package io.github.bomb787.minute_rice.init;

import io.github.bomb787.minute_rice.MinuteRice;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemInit {
	
	public static final FoodProperties COOKED_MINUTE_RICE_PROPERTIES = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.2F).build();
	
	public static final Item MINUTE_RICE = Registry.register(
			Registry.ITEM, 
			new ResourceLocation(MinuteRice.MOD_ID, "minute_rice"), 
			new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
	
	public static final Item COOKED_MINUTE_RICE = Registry.register(
			Registry.ITEM, 
			new ResourceLocation(MinuteRice.MOD_ID, "cooked_minute_rice"), 
			new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(COOKED_MINUTE_RICE_PROPERTIES)));

}
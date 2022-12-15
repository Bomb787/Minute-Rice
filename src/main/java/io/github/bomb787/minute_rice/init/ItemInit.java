package io.github.bomb787.minute_rice.init;

import io.github.bomb787.minute_rice.MinuteRice;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinuteRice.MOD_ID);
	
	public static final FoodProperties COOKED_MINUTE_RICE_PROPERTIES = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.2F).build();
	
	public static final RegistryObject<Item> COOKED_MINUTE_RICE = ITEMS.register("cooked_minute_rice",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(COOKED_MINUTE_RICE_PROPERTIES)));
	
	public static final RegistryObject<Item> MINUTE_RICE = ITEMS.register("minute_rice",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

}
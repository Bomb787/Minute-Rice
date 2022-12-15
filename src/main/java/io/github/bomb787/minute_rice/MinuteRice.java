package io.github.bomb787.minute_rice;

import io.github.bomb787.minute_rice.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinuteRice.MOD_ID)
public class MinuteRice {
	
	public static final String MOD_ID = "minute_rice";
	
	public MinuteRice() {
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		
	}

}
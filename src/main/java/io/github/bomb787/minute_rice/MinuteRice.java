package io.github.bomb787.minute_rice;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import io.github.bomb787.minute_rice.init.ItemInit;
import io.github.bomb787.minute_rice.init.TradeInit;

public class MinuteRice implements ModInitializer {
	
	public static final String MOD_ID = "minute_rice";
	
	public static ItemInit ITEMS;

	@Override
	public void onInitialize(ModContainer mod) {

		ITEMS = new ItemInit();
		TradeInit.registerTrades();
		
	}

}
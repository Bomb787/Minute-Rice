package io.github.bomb787.minute_rice.init;

import org.quiltmc.qsl.villager.api.TradeOfferHelper;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;

//Thanks to KaupenJoe for his tutorial
public class TradeInit {
	
	public static void registerTrades() {
		
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
			
			factories.add((entity, random) -> 
				new MerchantOffer(new ItemStack(Items.EMERALD, 1),
							   new ItemStack(ItemInit.MINUTE_RICE, 2),
							   10, 4, 0.02F));
			
		});
		
	}

}
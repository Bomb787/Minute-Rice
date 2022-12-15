package io.github.bomb787.minute_rice.events;

import java.util.List;

import io.github.bomb787.minute_rice.MinuteRice;
import io.github.bomb787.minute_rice.init.ItemInit;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//Thanks to KaupenJoe for his guide
@Mod.EventBusSubscriber(modid = MinuteRice.MOD_ID)
public class ModEvents {
	
	@SubscribeEvent
	public static void addCustomTrade(VillagerTradesEvent event) {
		
		if(event.getType() == VillagerProfession.FARMER) {
			
			Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
			ItemStack stack = new ItemStack(ItemInit.MINUTE_RICE.get(), 2);
			
			trades.get(1).add((trader, rand) -> 
				new MerchantOffer(new ItemStack(Items.EMERALD), stack, 10, 4, 0.02F));
			
		}
		
	}

}
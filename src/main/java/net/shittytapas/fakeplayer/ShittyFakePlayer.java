package net.shittytapas.fakeplayer;

import net.fabricmc.api.ModInitializer;

import net.shittytapas.fakeplayer.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShittyFakePlayer implements ModInitializer {
	public static final String MOD_ID = "shitty_fake_player";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
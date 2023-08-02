package net.atticusjay.recipes_refreshed;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecipesRefreshed implements ModInitializer {
	public static final String MOD_ID = "recipes_refreshed";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Recipes Refreshed");
	}
}
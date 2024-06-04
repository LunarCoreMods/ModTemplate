package com.example.examplemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.util.log.Log;
import net.fabricmc.loader.impl.util.log.LogCategory;

public class ExampleMod implements ModInitializer {

    public static final String MOD_NAME = "ExampleMod";

    public static final LogCategory LOG_CATEGORY = LogCategory.create(MOD_NAME);

    @Override
    public void onInitialize() {
        Log.info(LOG_CATEGORY, "Initializing " + MOD_NAME);
    }
}

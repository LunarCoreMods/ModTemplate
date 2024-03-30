package com.example.examplemod;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class ExampleMod implements ModInitializer {

    public static final String MOD_NAME = "ExampleMod";
    public static final Logger LOGGER = Logger.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing " + MOD_NAME);
    }
}

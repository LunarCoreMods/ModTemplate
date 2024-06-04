package com.example.examplemod

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod : ModInitializer {
    companion object {
        const val MOD_NAME: String = "ExampleMod"

        val LOGGER: Logger = LoggerFactory.getLogger(MOD_NAME)
    }

    override fun onInitialize() {
        LOGGER.info("Initializing $MOD_NAME with Kotlin")
    }
}

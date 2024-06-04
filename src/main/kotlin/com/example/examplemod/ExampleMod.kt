package com.example.examplemod

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.impl.util.log.Log
import net.fabricmc.loader.impl.util.log.LogCategory

class ExampleMod : ModInitializer {
    companion object {
        const val MOD_NAME: String = "ExampleMod"

        val LOG_CATEGORY: LogCategory = LogCategory.create(MOD_NAME)
    }

    override fun onInitialize() {
        Log.info(LOG_CATEGORY,"Initializing $MOD_NAME with Kotlin")
    }
}

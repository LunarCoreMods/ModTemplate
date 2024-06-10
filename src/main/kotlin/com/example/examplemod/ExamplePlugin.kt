package com.example.examplemod

import emu.lunarcore.plugin.Plugin
import org.slf4j.Logger
import java.io.File
import java.net.URLClassLoader

@Suppress("unused")
class ExamplePlugin(identifier: Identifier, classLoader: URLClassLoader, dataFolder: File, logger: Logger) : Plugin(identifier, classLoader, dataFolder, logger) {
    override fun onEnable() {
    }

    override fun onDisable() {
    }
}
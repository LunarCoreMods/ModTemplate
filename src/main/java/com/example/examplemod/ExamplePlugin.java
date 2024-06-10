package com.example.examplemod;

import emu.lunarcore.plugin.Plugin;
import org.slf4j.Logger;

import java.io.File;
import java.net.URLClassLoader;

@SuppressWarnings("unused")
public class ExamplePlugin extends Plugin {
    public ExamplePlugin(Identifier identifier, URLClassLoader classLoader, File dataFolder, Logger logger) {
        super(identifier, classLoader, dataFolder, logger);
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }
}

# LunarCoreModTemplate
A mod template for LunarCore with Fabric Loader.

## Features
  - Source code injection with [Mixin](https://github.com/SpongePowered/Mixin) (and [MixinExtras](https://github.com/LlamaLad7/MixinExtras))
  - Run/Debug your mod with a single task
  - Supports [Access Wideners](https://www.fabricmc.net/wiki/tutorial:accesswideners)

## Get Started
  1. Click on the [![Use this template](https://img.shields.io/badge/-Use%20this%20template-brightgreen)](https://github.com/yuko1101/LunarCoreModTemplate/generate) to create a new repo starting from this template.
  2. Clone your repo and open it in your IDE (IntelliJ IDEA is recommended).
  3. Run the gradle task named `runServer` to generate server files to `run` dir. (You can stop the task after LunarCore has been started.)
  4. Just write some code.
  5. Run `runServer` to test your mod.

## What is Fabric Loader?
[Fabric Loader](https://github.com/FabricMC/fabric-loader) is a lightweight mod loader usually used for Minecraft which provide much useful features for creating mods. Fabric Loader recognizes a jar in the `mods` folder with a [fabric.mod.json](src/main/resources/fabric.mod.json) as a mod and loads it at startup.

**References**
- [Listed features of Fabric Loader](https://www.fabricmc.net/wiki/documentation:fabric_loader#features)
- [About fabric.mod.json](https://www.fabricmc.net/wiki/documentation:fabric_mod_json)

## And what is Mixin?
[Mixin](https://github.com/SpongePowered/Mixin) is a framework for Java which makes it easy to inject/hook into the runtime classloading with [ASM](https://asm.ow2.io). Mixin's config is usually named `*.mixins.json` ([examplemod.mixins.json](src/main/resources/examplemod.mixins.json) for this template) and specified by [fabric.mod.json](src/main/resources/fabric.mod.json) with Fabric Loader.

[MixinExtras](https://github.com/LlamaLad7/MixinExtras) is a plugin of Mixin which provides many useful injectors, and got bundled in Fabric Loader 0.15 or later.

**References**
- [Introduction and examples by FabricMC](https://www.fabricmc.net/wiki/tutorial:mixin_introduction)
- [Official Wiki](https://github.com/SpongePowered/Mixin/wiki)

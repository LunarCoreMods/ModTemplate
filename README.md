# LunarCoreModTemplate
A mod template for LunarCore with Fabric Loader.

## Features
  - Source code injection with [Mixin](https://github.com/SpongePowered/Mixin) (and [MixinExtras](https://github.com/LlamaLad7/MixinExtras))
  - Easy widen access modifiers with [access-widener](https://github.com/FabricMC/access-widener)
  - Run/Debug your mod with a single task

## Get Started
**Requires [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)**

  1. Click on the [![Use this template](https://img.shields.io/badge/-Use%20this%20template-brightgreen)](https://github.com/yuko1101/LunarCoreModTemplate/generate) to create a new repo starting from this template.
  2. Clone your repo and open it in your IDE (IntelliJ IDEA with [Minecraft Dev plugin](https://plugins.jetbrains.com/plugin/8327-minecraft-development) is recommended).
  3. Run the gradle task named `runServer` to generate server files to `run` dir. (You can stop the task after LunarCore has been started.)
  4. Put LunarCore resources into the `run` dir.
  5. Just write some code.
  6. Run `runServer` to test your mod.

## Running in Production Environment
You can just run the server in `run` dir by `java "@args.txt"` but with these steps you can run the server without setting up development environment.

**Requires [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)**
  1. Setup standard LunarCore by following [these steps](https://github.com/Melledy/LunarCore?tab=readme-ov-file#compiling-the-server).
  2. Make sure that LunarCore server starts up properly.
  3. Download build.zip from [LunarCoreGameProvider GitHub Actions](https://github.com/LunarCore-Mods/GameProvider/actions/workflows/build.yml) or directly download [here](https://nightly.link/LunarCore-Mods/GameProvider/workflows/build/main/build.zip).
  4. Unzip the build.zip and put the files into your LunarCore folder.
  6. Run `java "@args.txt"` instead of `java -jar LunarCore.jar` to launch your server with mods.

## What is Fabric Loader?
[Fabric Loader](https://github.com/FabricMC/fabric-loader) is a lightweight mod loader, usually used for Minecraft. Fabric Loader provides much useful features for creating mods. It recognizes a jar in the `mods` folder with a [fabric.mod.json](src/main/resources/fabric.mod.json) as a mod and loads it at startup.

**References**
- [Listed features of Fabric Loader](https://www.fabricmc.net/wiki/documentation:fabric_loader#features)
- [About fabric.mod.json](https://www.fabricmc.net/wiki/documentation:fabric_mod_json)

## And what is Mixin?
[Mixin](https://github.com/SpongePowered/Mixin) is a framework for Java which makes it easy to inject/hook into the runtime classloading with [ASM](https://asm.ow2.io). Mixin's config is usually named `*.mixins.json` ([examplemod.mixins.json](src/main/resources/examplemod.mixins.json) for this template) and specified by [fabric.mod.json](src/main/resources/fabric.mod.json) with Fabric Loader.

[MixinExtras](https://github.com/LlamaLad7/MixinExtras) is a plugin of Mixin which provides many useful injectors, and got bundled in Fabric Loader 0.15 or later.

**References**
- [Introduction and examples by FabricMC](https://www.fabricmc.net/wiki/tutorial:mixin_introduction)
- [Official Wiki](https://github.com/SpongePowered/Mixin/wiki)

## About access-widener
[access-widener](https://github.com/FabricMC/access-widener) is a tool to widen access modifiers of classes, fields, and methods. You may need to use a `private` (or `protected`) class, field, or method from your dependency. In that case, you can use access-widener to access it by modifying the access modifier to `public`.

This can also be done by Mixin, but access-widener is much easier to use and more efficient, and provides more clean code.

> [!TIP]
> With [Minecraft Dev plugin](https://plugins.jetbrains.com/plugin/8327-minecraft-development), you can easily get the access widener entry.
> Write code which accesses to the private declaration. Then, press `Alt + Enter` and just select `Copy AW entry`.

**References**
- [Tutorial by FabricMC](https://fabricmc.net/wiki/tutorial:accesswideners)
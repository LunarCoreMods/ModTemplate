plugins {
    kotlin("jvm") version "1.9.23"
    id("io.github.lunarcoremods.gradlerunner") version "724fd81236"
    java
}

version = property("mod_version")!!
group = property("maven_group")!!

val baseName = property("archive_base_name") as String

repositories {
    maven(url = "https://maven.fabricmc.net/")
    maven(url = "https://repo.spongepowered.org/repository/maven-public")
    maven(url = "https://jitpack.io")
    mavenCentral()
}

dependencies {
    // TODO: use gameprovider_version
    gameprovider("com.github.LunarCore-Mods:GameProvider:7026b233da")

    // TODO: use lunarcore_version
    lunarcore("com.github.Melledy:LunarCore:development-SNAPSHOT")

    val mixinVersion = property("mixin_version") as String
    implementation("org.spongepowered:mixin:$mixinVersion")
    annotationProcessor("org.spongepowered:mixin:$mixinVersion:processor")

    implementation("io.github.llamalad7:mixinextras-common:0.3.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

val props = mapOf(
    "version" to version,
    "lunarcore_version" to property("lunarcore_version"),
    "loader_version" to property("loader_version"),
)
tasks {
    processResources {
        filesMatching("fabric.mod.json") {
            expand(props)
        }
        filesMatching("plugin.json") {
            expand(props)
        }
    }

    jar {
        archiveBaseName.set(baseName)
        from("LICENSE")
    }
}

kotlin {
    jvmToolchain(17)
}

import kr.entree.spigradle.data.Load
import kr.entree.spigradle.kotlin.*

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle") version "2.1.1"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

tasks.compileJava.get().options.encoding = "UTF-8"

repositories {
    protocolLib()
    jitpack() // For vault
}

dependencies {
    implementation(kotlin("stdlib-jdk8")) // Maybe you need to apply the plugin 'shadowJar' for shading 'kotlin-stdlib'.
    compileOnly(spigot())
    compileOnly(protocolLib())
    compileOnly(vaultAll()) { // instead of vault() for the dependency resolve by debug task 'prepareSpigotPlugins'.
        isTransitive = false // No want to import vault's internal dependencies.
    }
    testImplementation("junit:junit:4.12")
    testImplementation(mockBukkit())
    testImplementation(kotlin("stdlib-jdk8"))
}

spigot {
    description = "A sample plugin"
    depends = listOf("ProtocolLib", "Vault")
    load = Load.STARTUP
    commands {
        create("give") {
            aliases = listOf("giv", "i")
            description = "A give command."
            permission = "sample.give"
            permissionMessage = "You do not have the permission!"
        }
    }
    permissions {
        create("sample.give") {
            description = "Allows give command"
            defaults = "true"
        }
        create("sample.*") {
            description = "Wildcard permission"
            defaults = "op"
            children = mapOf("test.foo" to true)
        }
    }
}

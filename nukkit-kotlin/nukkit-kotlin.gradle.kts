import kr.entree.spigradle.data.Load
import kr.entree.spigradle.kotlin.*

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle.nukkit") version "2.1.1"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

tasks.compileJava.get().options.encoding = "UTF-8"

dependencies {
    compileOnly(nukkit())
    implementation(kotlin("stdlib-jdk8")) // Maybe you need to apply the plugin 'shadowJar' for shading 'kotlin-stdlib'.
    testImplementation("junit:junit:4.12")
}

nukkit {
    description = "A sample NukitX plugin"
    load = Load.STARTUP
    api = listOf("1.0.5")
    commands {
        create("give") {
            aliases = listOf("giv", "i")
            description = "A give command."
            permission = "sample.give"
            permissionMessage = "You do not have the permission."
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
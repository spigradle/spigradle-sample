import kr.entree.spigradle.kotlin.*
import kr.entree.spigradle.data.*

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle") version "1.3.0"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
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
}

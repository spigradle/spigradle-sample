import kr.entree.spigradle.kotlin.*

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle.bungee") version "1.3.1"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

repositories {
    sonatype() // For Bungeecord
}

dependencies {
    compileOnly(bungeecord())
    implementation(kotlin("stdlib-jdk8")) // Maybe you need to apply the plugin 'shadowJar' for shading 'kotlin-stdlib'.
    testImplementation("junit:junit:4.12")
}

bungee {
    description = "A sample Bungeecord plugin"
    author = "Me"
    softDepends = listOf("DepPlugin", "DepPlugin2")
}
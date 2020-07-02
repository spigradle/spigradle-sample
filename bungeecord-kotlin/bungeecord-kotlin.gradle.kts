import kr.entree.spigradle.kotlin.*

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle.bungee") version "1.4.0"
}

group = "kr.entree"
version = "1.0-SNAPSHOT"

tasks.compileJava.get().options.encoding = "UTF-8"

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
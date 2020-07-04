package kr.entree.samplebungee

import kr.entree.spigradle.annotations.PluginMain
import net.md_5.bungee.api.plugin.Plugin

/**
 * Created by JunHyung Lim on 2020-06-28
 */
@PluginMain // Annotation is optional, but recommended in many cases
class SpigradleSample : Plugin() {
    override fun onEnable() {
        logger.info("This is Bungeecord plugin!")
    }
}
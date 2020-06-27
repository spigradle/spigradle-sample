package kr.entree.samplenukkit

import cn.nukkit.plugin.PluginBase
import kr.entree.spigradle.PluginMain

/**
 * Created by JunHyung Lim on 2020-06-28
 */
@PluginMain // Annotation is optional, but recommended in many cases
class SpigradleSample : PluginBase() {
    override fun onEnable() {
        logger.info("This is NukkitX plugin!")
    }
}
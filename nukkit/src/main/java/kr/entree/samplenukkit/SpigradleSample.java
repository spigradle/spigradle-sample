package kr.entree.samplenukkit;

import cn.nukkit.plugin.PluginBase;
import kr.entree.spigradle.PluginMain;

/**
 * Created by JunHyung Lim on 2020-06-18
 */
@PluginMain // Annotation is optional, but recommended in many cases
public class SpigradleSample extends PluginBase {
    @Override
    public void onEnable() {
        getLogger().info("This is NukkitX plugin!");
    }
}

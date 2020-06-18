package kr.entree.samplebungee;

import cn.nukkit.plugin.PluginBase;
import kr.entree.spigradle.PluginMain;

/**
 * Created by JunHyung Lim on 2020-06-18
 */
@PluginMain // Annotation is optional, but recommended for performance reason
public class SpigradleSample extends PluginBase {
    @Override
    public void onEnable() {
        getLogger().info("This is NukkitX plugin!");
    }
}

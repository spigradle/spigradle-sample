package kr.entree.samplebungee;

import kr.entree.spigradle.annotations.PluginMain;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by JunHyung Lim on 2020-06-18
 */
@PluginMain // Annotation is optional, but recommended in many cases
public class SpigradleSample extends Plugin {
    @Override
    public void onEnable() {
        getLogger().info("This is Bungeecord plugin!");
    }
}

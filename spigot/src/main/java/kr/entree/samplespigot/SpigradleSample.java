package kr.entree.samplespigot;

import kr.entree.spigradle.PluginMain;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by JunHyung Lim on 2020-06-18
 */
@PluginMain // Annotation is optional, but recommended for performance reason
public class SpigradleSample extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("This is Spigot plugin!");
    }
}

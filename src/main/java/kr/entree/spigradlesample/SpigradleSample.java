package kr.entree.spigradlesample;

import kr.entree.spigradle.PluginMain;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by JunHyung Lim on 2020-06-08
 */
@PluginMain
public class SpigradleSample extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Hello!");
    }
}

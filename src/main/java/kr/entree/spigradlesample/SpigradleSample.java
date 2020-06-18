package kr.entree.samplespigot;

import kr.entree.spigradle.PluginMain;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

/**
 * Created by JunHyung Lim on 2020-06-08
 */
@PluginMain
public class SpigradleSample extends JavaPlugin {
    public SpigradleSample() {
    }

    public SpigradleSample(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }

    @Override
    public void onEnable() {
        System.out.println("Hello!");
    }
}

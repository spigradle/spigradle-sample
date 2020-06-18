package spigradlepg;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import kr.entree.samplespigot.SpigradleSample;
import org.junit.Test;

/**
 * Created by JunHyung Lim on 2020-05-02
 */
public class SpigradleTest {

    @Test
    public void test() {
        System.out.println("HI!");
        ServerMock serverMock = MockBukkit.mock();
//        Main mockPlugin = MockBukkit.loadWith(Main.class, new File("build/tmp/spigotPluginYaml/plugin.yml"));
        SpigradleSample mockPlugin = MockBukkit.load(SpigradleSample.class);
        System.out.println(mockPlugin);
    }
}

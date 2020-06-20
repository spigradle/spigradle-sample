package kr.entree.samplespigot;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.Test;

/**
 * Created by JunHyung Lim on 2020-06-20
 */
public class SpigradleSampleTest {
    @Test
    public void test() {
        ServerMock serverMock = MockBukkit.mock();
        SpigradleSample mockPlugin = MockBukkit.load(SpigradleSample.class);
        mockPlugin.onEnable();
    }
}

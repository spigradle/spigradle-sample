package kr.entree.samplespigot

import be.seeseemelk.mockbukkit.MockBukkit
import org.junit.Test

/**
 * Created by JunHyung Lim on 2020-06-24
 */
class SpigradleSampleTest {
    @Test
    fun test() {
        val serverMock = MockBukkit.mock()
        val mockPlugin = MockBukkit.load(SpigradleSample::class.java)
        mockPlugin.onEnable()
    }
}
package com.marsRover

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

internal class RoverTest {
    @Test
    fun `should rotate rover to right`() {
        val rover = Rover()

        rover.execute("R") shouldBe "0:0:E"
    }
}
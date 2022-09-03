package com.marsRover

import io.kotlintest.shouldBe
import junitparams.JUnitParamsRunner
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class RoverTest {

    private lateinit var rover: Rover

    @BeforeEach
    fun initialise(){
        rover = Rover()
    }

    @ParameterizedTest(name = "should rotate rover to {1} if command given is {0}")
    @CsvSource(value = [
        "R, 0:0:E",
        "RR, 0:0:S",
        "RRR, 0:0:W",
        "RRRR, 0:0:N"
    ])
    fun `should rotate rover to right`(commands: String, position: String) {
        rover.execute(commands) shouldBe position
    }

    @ParameterizedTest(name = "should rotate rover to {1} if command given is {0}")
    @CsvSource(value = [
        "L, 0:0:W",
        "LL, 0:0:S",
        "LLL, 0:0:E",
        "LLLL, 0:0:N"
    ])
    fun `should rotate rover to left`(commands: String, position: String) {
        rover.execute(commands) shouldBe position
    }
}
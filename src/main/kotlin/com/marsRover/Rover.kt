package com.marsRover

class Rover {
    private var direction = Direction.NORTH
    fun execute(commands: String): String {
        commands.toCharArray().forEach { command ->
            direction = when (command) {
                'R' -> direction.right()
                else -> direction.left()
            }
        }
        return "0:0:${direction.value()}"
    }
}

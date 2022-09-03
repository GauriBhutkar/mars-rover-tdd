package com.marsRover

class Rover {
    private var direction = Direction.NORTH
    private var x = 0
    private var y = 0
    fun execute(commands: String): String {
        commands.toCharArray().forEach { command ->
            direction = when (command) {
                'R' -> direction.right()
                'L' -> direction.left()
                else -> {
                    y++
                    direction
                }
            }
        }
        return "$x:$y:${direction.value()}"
    }
}

package com.marsRover

class Rover {
    private var eDirection = Direction.NORTH
    fun execute(commands: String): String {
        commands.toCharArray().forEach { command ->
            eDirection = when (command) {
                'R' -> eDirection.right()
                else -> eDirection.left()
            }
        }
        return "0:0:${eDirection.value}"
    }
}

enum class Direction(val value: String, val left: String,val right: String) {
    NORTH("N", "W", "E"),
    WEST("W", "S", "N"),
    SOUTH("S", "E", "W"),
    EAST("E", "N", "S");

    fun right() : Direction {
        val nextDirection = this.right
        return rotate(nextDirection)
    }

    fun left() : Direction {
        val nextDirection = this.left
        return rotate(nextDirection)
    }

    private fun rotate(nextDirection: String): Direction {
        for (direction in values()) {
            if (direction.value == nextDirection) return direction
        }
        throw InvalidDirectionException()
    }
}

class InvalidDirectionException : RuntimeException()

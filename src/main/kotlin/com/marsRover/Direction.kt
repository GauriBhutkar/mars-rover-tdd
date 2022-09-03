package com.marsRover


enum class Direction(private val value: String, private val left: String,private val right: String) {
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

    fun value() = this.value

    private fun rotate(nextDirection: String): Direction {
        for (direction in values()) {
            if (direction.value == nextDirection) return direction
        }
        throw InvalidDirectionException()
    }
}

class InvalidDirectionException : RuntimeException()
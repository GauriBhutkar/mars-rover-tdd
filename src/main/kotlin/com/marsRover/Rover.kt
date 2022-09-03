package com.marsRover

class Rover {
    private var direction = Direction.NORTH
    private var coordinate = Coordinate(0, 0)
    fun execute(commands: String): String {
        commands.toCharArray().forEach { command ->
            when (command) {
                'R' -> direction = direction.right()
                'L' -> direction = direction.left()
                else -> coordinate = move()
            }
        }
        return "${coordinate.x}:${coordinate.y}:${direction.value()}"
    }

    private fun move(): Coordinate {
        var y = coordinate.y
        if(direction == Direction.NORTH) y = coordinate.y + 1
        return Coordinate(coordinate.x, y)
    }
}

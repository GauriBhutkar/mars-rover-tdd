package com.marsRover

class Rover {
    private var direction = "N"
    fun execute(commands: String): String {
        for (command in commands.toCharArray()) {
            if(command.toString() == "R") {
                direction = rotateRight()
            } else
                direction = rotateLeft()
        }
        return "0:0:$direction"
    }

    private fun rotateLeft() = if (direction == "N") "W"
        else if (direction == "W") "S"
        else if (direction == "S") "E"
        else "N"

    private fun rotateRight() = if (direction == "N") "E"
    else if (direction == "E") "S"
    else if (direction == "S") "W"
    else "N"
}
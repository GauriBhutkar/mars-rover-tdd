package com.marsRover

class Rover {
    private var direction = "N"
    fun execute(commands: String): String {
        for (command in commands.toCharArray()) {
            if (direction == "N") direction = "E"
            else if (direction == "E") direction = "S"
            else if (direction == "S") direction = "W"
            else direction = "N"
        }
        return "0:0:$direction"
    }
}
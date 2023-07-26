package com.example.diceroller

class Dice(val sides: Int){
    val range = 1..sides
    var color: String = ""

    fun roll(): Int{
        return range.random()
    }
}
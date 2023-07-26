package com.example.diceroller

class Coin {
    val range=1..2
    fun flip(): String {
        if(range.random()==1){
            return "Tails"
        }
        else {
            return "Heads"
        }
    }
}
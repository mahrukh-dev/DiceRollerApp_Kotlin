package com.example.diceroller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button) //links with UI button

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    fun rollDice(){

        val dice = Dice(6) //Creates a dice with six sides
        val diceTwo = Dice(6) //Creates a dice with six sides

        val resultDiceOne: TextView = findViewById(R.id.diceOne)
        val resultDiceTwo: TextView = findViewById(R.id.diceTwo)

        val imageDiceOne: ImageView = findViewById(R.id.imageDiceOne)
        val imageDiceTwo: ImageView = findViewById(R.id.imageDiceTwo)

        //calls this lamda function when button is clicked
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() //toast message
        resultDiceOne.text = dice.roll().toString() //rolls dice and returns a random number
        resultDiceTwo.text = diceTwo.roll().toString() //rolls dice and returns a random number
        when(resultDiceOne.text){
            "1" -> imageDiceOne.setImageResource(R.drawable.dice_1)
            "2" -> imageDiceOne.setImageResource(R.drawable.dice_2)
            "3" -> imageDiceOne.setImageResource(R.drawable.dice_3)
            "4" -> imageDiceOne.setImageResource(R.drawable.dice_4)
            "5" -> imageDiceOne.setImageResource(R.drawable.dice_5)
            "6" -> imageDiceOne.setImageResource(R.drawable.dice_6)
        }
        when(resultDiceTwo.text){
            "1" -> imageDiceTwo.setImageResource(R.drawable.dice_1)
            "2" -> imageDiceTwo.setImageResource(R.drawable.dice_2)
            "3" -> imageDiceTwo.setImageResource(R.drawable.dice_3)
            "4" -> imageDiceTwo.setImageResource(R.drawable.dice_4)
            "5" -> imageDiceTwo.setImageResource(R.drawable.dice_5)
            "6" -> imageDiceTwo.setImageResource(R.drawable.dice_6)
        }

    }
}


package com.example.diceroller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice = Dice(6) //Creates a dice with six sides
        val diceTwo = Dice(6) //Creates a dice with six sides
        val rollButton: Button = findViewById(R.id.button) //links with UI button
        val resultTextView: TextView = findViewById(R.id.diceOne)

        val resultTextViewTwo: TextView = findViewById(R.id.diceTwo)

        rollButton.setOnClickListener {//calls this lamda function when button is clicked
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() //toast message
            resultTextView.text = dice.roll().toString() //rolls dice and returns a random number
            resultTextViewTwo.text =
                diceTwo.roll().toString() //rolls dice and returns a random number
        }
    }
}
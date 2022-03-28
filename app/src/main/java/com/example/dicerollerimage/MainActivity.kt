package com.example.dicerollerimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoller: Button = findViewById(R.id.btnRoller)
        btnRoller.setOnClickListener {msgdDiceRoller()}
    }

    private fun msgdDiceRoller(){
        val numberSort = (1..6).random()

        val diceRoller: ImageView = findViewById(R.id.diceRoller)

        val drawableResource = when(numberSort){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceRoller.setImageResource(drawableResource)
    }
}
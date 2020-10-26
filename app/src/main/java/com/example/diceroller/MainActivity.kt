package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
//        val rollButton : Button = findViewById(R.id.roll_button)
        val view = binding.root
        setContentView(view)

        val rollButton = binding.rollButton
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceNumber = Random().nextInt(6) + 1
        binding.resultText.text = diceNumber.toString()
        binding.diceImage.setImageResource(
                when (diceNumber) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    6 -> R.drawable.dice_6
                    else -> R.drawable.empty_dice
                }
        )


    }
}
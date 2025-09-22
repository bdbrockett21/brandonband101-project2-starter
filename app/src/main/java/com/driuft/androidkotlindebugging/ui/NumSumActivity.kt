package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class NumSumActivity : AppCompatActivity() {

    // This is a good way to declare the TextView property
    private val resultText: TextView get() = findViewById(R.id.result_text)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_sum)

        // The input strings
        val number1String = "2"
        val number2String = "apple"

        // Use a nullable type to handle the potential for conversion failure
        val number1: Int? = number1String.toIntOrNull()
        val number2: Int? = number2String.toIntOrNull()

        // Use a single variable for the result text
        val resultMessage: String

        // Check if both numbers are not null
        if (number1 != null && number2 != null) {
            // Call sumOfTwo only when both numbers are valid
            val sum = sumOfTwo(number1, number2)
            resultMessage = "The sum of $number1 and $number2 is $sum"
        } else {
            resultMessage = "Error: Invalid input"
        }

        // Update the TextView with the final result message
        resultText.text = resultMessage
    }

    // The function is correctly defined
    private fun sumOfTwo(x: Int, y: Int) : Int {
        return x + y
    }
}
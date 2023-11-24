package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.ui.theme.CalculatorTheme
import com.google.android.material.textfield.TextInputEditText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val multi = findViewById<Button>(R.id.multi)
        val divide = findViewById<Button>(R.id.divide)

        plus.setOnClickListener {
            val eTInput1 = findViewById<TextInputEditText>(R.id.eTInput1)
            val input1 = eTInput1.text.toString().toInt()
            val eTInput2 = findViewById<TextInputEditText>(R.id.eTInput2)
            val input2 = eTInput1.text.toString().toInt()

            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = (input1 + input2).toString()
        }

        minus.setOnClickListener {
            val eTInput1 = findViewById<TextInputEditText>(R.id.eTInput1)
            val input1 = eTInput1.text.toString().toInt()
            val eTInput2 = findViewById<TextInputEditText>(R.id.eTInput2)
            val input2 = eTInput1.text.toString().toInt()

            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = (input1 - input2).toString()
        }

        multi.setOnClickListener {
            val eTInput1 = findViewById<TextInputEditText>(R.id.eTInput1)
            val input1 = eTInput1.text.toString().toInt()
            val eTInput2 = findViewById<TextInputEditText>(R.id.eTInput2)
            val input2 = eTInput1.text.toString().toInt()

            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = (input1 * input2).toString()
        }

        divide.setOnClickListener {
            val eTInput1 = findViewById<TextInputEditText>(R.id.eTInput1)
            val input1 = eTInput1.text.toString().toInt()
            val eTInput2 = findViewById<TextInputEditText>(R.id.eTInput2)
            val input2 = eTInput1.text.toString().toInt()

            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = (input1 / input2).toString()
        }



        }
    }




package com.vedprakash.wagh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)

        val editTextNumberOne: EditText = findViewById(R.id.numberOne)
        val editTextNumberTwo: EditText = findViewById(R.id.numberTwo)
        val editTextOperation: EditText = findViewById(R.id.operation)
        val calculateTheResult: Button = findViewById(R.id.calculate)
        val textViewResult: TextView = findViewById(R.id.result)

        calculateTheResult.setOnClickListener {
            val firstNumber = editTextNumberOne.text.toString().toDouble()
            val secondNumber = editTextNumberTwo.text.toString().toDouble()
            val operation = editTextOperation.text.toString()

            val calculator = Calculator(firstNumber, secondNumber, operation)
            textViewResult.text = "${calculator.result}"
        }


    }
}
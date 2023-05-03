package com.example.mycalculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNumbers()
        multiplication()
        division()
        subtraction()
    }

    fun addNumbers() {
        var num1 = findViewById<EditText>(R.id.Number1)
        var num2 = findViewById<EditText>(R.id.Number2)
        var button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }

    fun multiplication() {
        var num1 = findViewById<EditText>(R.id.Number1)
        var num2 = findViewById<EditText>(R.id.Number2)
        var button1 = findViewById<Button>(R.id.btn_mul)
        button1.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 * addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }

    fun division() {
        var num1 = findViewById<EditText>(R.id.Number1)
        var num2 = findViewById<EditText>(R.id.Number2)
        var button2= findViewById<Button>(R.id.btn_mul)
        button2.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 / addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }

    fun subtraction() {
        var num1 = findViewById<EditText>(R.id.Number1)
        var num2 = findViewById<EditText>(R.id.Number2)
        var button3 = findViewById<Button>(R.id.btn_mul)
        button3.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 - addNum2
            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
}





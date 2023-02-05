package com.abhishek.calculator

import android.widget.TextView
import android.widget.Toast
import com.abhishek.calculator.Opeator.ADD
import com.abhishek.calculator.Opeator.DIVIDE
import com.abhishek.calculator.Opeator.MULTIPLY
import com.abhishek.calculator.Opeator.SUBTRACT

class Calculate(private val applicationContext: MainActivity, private val resultTV: TextView, private val solutionTV: TextView) {
//    val applicationContext = mainActivity
//    val resultTV = resultTV


    fun calculate(numericWord: String) {
        try {
            val separatedNumberAndOperators = constructLiterals(numericWord)
            println(separatedNumberAndOperators)
            process(separatedNumberAndOperators)
        } catch (e: ArithmeticException) {
            val text = "Something wrong with the expression"
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
            println("$text: $e")
        }
    }

    fun constructLiterals(numericWord: String): List<String> {
        return HandleNumericWords().process(numericWord)
    }

    private fun process(separatedNumberAndOperators: List<String>) {
        var separatedNumberAndOperator = separatedNumberAndOperators.toMutableList()
        while (separatedNumberAndOperator.size != 1) {
            val firstNumber: Double = separatedNumberAndOperator[0].toDouble()
            val operator: String = separatedNumberAndOperator[1].toString()
            val secondNumber: Double = separatedNumberAndOperator[2].toDouble()

            separatedNumberAndOperator.removeFirst()
            separatedNumberAndOperator.removeFirst()

            val calc = when (operator) {
                ADD -> add(firstNumber, secondNumber)
                SUBTRACT -> subtract(firstNumber, secondNumber)
                MULTIPLY -> multiply(firstNumber, secondNumber)
                DIVIDE -> divide(firstNumber, secondNumber)
                else -> null
            }
            separatedNumberAndOperator[0] = calc.toString()
        }
        display(separatedNumberAndOperator[0])
    }

    private fun add(firstNumber: Double, secondNumber: Double): Double = firstNumber + secondNumber

    private fun subtract(firstNumber: Double, secondNumber: Double) = firstNumber - secondNumber

    private fun multiply(firstNumber: Double, secondNumber: Double) = firstNumber * secondNumber

    private fun divide(firstNumber: Double, secondNumber: Double) = firstNumber / secondNumber

    private fun display(number: String) {
        val textViewHandler = TextViewHandler(solutionTV, resultTV)
        textViewHandler.setResultTextView(number)
        textViewHandler.setSolutionTextView(number)
    }
}
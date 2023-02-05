package com.abhishek.calculator

object Opeator {
    const val ADD = "+"
    const val SUBTRACT = "-"
    const val MULTIPLY = "*"
    const val DIVIDE = "/"

    fun isCalculatorOperator(operator: String): Boolean {
        if (operator == ADD || operator == SUBTRACT || operator == MULTIPLY || operator == DIVIDE)
            return true
        return false
    }

    fun isCalculatorOperator(operator: Char): Boolean {
        return isCalculatorOperator(operator.toString())
    }
}
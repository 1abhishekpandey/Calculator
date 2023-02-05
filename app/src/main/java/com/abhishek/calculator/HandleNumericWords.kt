package com.abhishek.calculator

import com.abhishek.calculator.Opeator.isCalculatorOperator
import java.lang.ArithmeticException

class HandleNumericWords {

    fun process(numericWord: String): List<String> {
        isSafeToCalculateOrNot(numericWord)
        val numberAndOperators = mutableListOf<String>()
        var number = ""
        for (index in numericWord.indices) {
            if (isCalculatorOperator(numericWord[index])) {
                numberAndOperators.add(number)
                numberAndOperators.add(numericWord[index].toString())
                number = ""
            } else {
                number += numericWord[index]
            }
        }
        if (number != "") {
            numberAndOperators.add(number)
        }

        return numberAndOperators
    }

    private fun isSafeToCalculateOrNot(numericWord: String) {
        if (numericWord.isEmpty()) {
            throw ArithmeticException()
        }
        val firstCharacter: Char = numericWord[0]
        val lastCharacter: Char = numericWord.elementAt(numericWord.length - 1)
        if (isCalculatorOperator(firstCharacter) || isCalculatorOperator(lastCharacter))
            throw ArithmeticException()
    }
}
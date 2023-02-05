package com.abhishek.calculator

import android.widget.TextView

class TextViewHandler(solutionTV: TextView, resultTV: TextView) {
    private val resultTV: TextView = resultTV
    private val solutionTV: TextView = solutionTV

    fun clearView() {
        setSolutionTextView("")
        setResultTextView("")
    }

    fun setSolutionTextView(text: String?) {
        if (text == null || text.isEmpty()) {
            solutionTV.text = "0"
            return
        }
        solutionTV.text = text
    }
    fun setResultTextView(text: String?) {
        if (text == null || text.isEmpty()) {
            resultTV.text = "0"
            return
        }
        resultTV.text = text
    }
}
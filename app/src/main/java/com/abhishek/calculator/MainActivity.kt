package com.abhishek.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var resultTV: TextView
    private lateinit var solutionTV: TextView
    private lateinit var buttonC: MaterialButton
    private lateinit var buttonBrackOpen: MaterialButton
    private lateinit var buttonBrackClose: MaterialButton
    private lateinit var buttonDivide: MaterialButton
    private lateinit var buttonMultiply: MaterialButton
    private lateinit var buttonPlus: MaterialButton
    private lateinit var buttonMinus: MaterialButton
    private lateinit var buttonEquals: MaterialButton
    private lateinit var button0: MaterialButton
    private lateinit var button1: MaterialButton
    private lateinit var button2: MaterialButton
    private lateinit var button3: MaterialButton
    private lateinit var button4: MaterialButton
    private lateinit var button5: MaterialButton
    private lateinit var button6: MaterialButton
    private lateinit var button7: MaterialButton
    private lateinit var button8: MaterialButton
    private lateinit var button9: MaterialButton
    private lateinit var buttonAC: MaterialButton
    private lateinit var buttonDot: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignId()


    }

    fun assignId() {
        resultTV = findViewById(R.id.result_tv)
        solutionTV = findViewById(R.id.solution_tv)

        buttonC = findViewById(R.id.button_c)
        buttonC.setOnClickListener(this)

        buttonBrackOpen = findViewById(R.id.button_open_bracket)
        buttonBrackOpen.setOnClickListener(this)

        buttonBrackClose = findViewById(R.id.button_close_bracket)
        buttonBrackClose.setOnClickListener(this)

        buttonDivide = findViewById(R.id.button_divide)
        buttonDivide.setOnClickListener(this)

        buttonMultiply = findViewById(R.id.button_multiply)
        buttonMultiply.setOnClickListener(this)


        buttonPlus = findViewById(R.id.button_plus)
        buttonPlus.setOnClickListener(this)

        buttonMinus = findViewById(R.id.button_minus)
        buttonMinus.setOnClickListener(this)

        buttonEquals = findViewById(R.id.button_equals)
        buttonEquals.setOnClickListener(this)

        button0 = findViewById(R.id.button_0)
        button0.setOnClickListener(this)

        button1 = findViewById(R.id.button_1)
        button1.setOnClickListener(this)

        button2 = findViewById(R.id.button_2)
        button2.setOnClickListener(this)

        button3 = findViewById(R.id.button_3)
        button3.setOnClickListener(this)

        button4 = findViewById(R.id.button_4)
        button4.setOnClickListener(this)

        button5 = findViewById(R.id.button_5)
        button5.setOnClickListener(this)

        button6 = findViewById(R.id.button_6)
        button6.setOnClickListener(this)

        button7 = findViewById(R.id.button_7)
        button7.setOnClickListener(this)

        button8 = findViewById(R.id.button_8)
        button8.setOnClickListener(this)

        button9 = findViewById(R.id.button_9)
        button9.setOnClickListener(this)

        buttonAC = findViewById(R.id.button_ac)
        buttonAC.setOnClickListener(this)

        buttonDot = findViewById(R.id.button_dot)
        buttonDot.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var button: MaterialButton? = v as MaterialButton?

        var buttonText = button?.text.toString()
        solutionTV.text = buttonText
    }
}
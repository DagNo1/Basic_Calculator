package org.hyperskill.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var panel: EditText
    private val equation = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panel = findViewById(R.id.editText)

        findViewById<Button>(R.id.button0).setOnClickListener { appender("0") }
        findViewById<Button>(R.id.button1).setOnClickListener { appender("1") }
        findViewById<Button>(R.id.button2).setOnClickListener { appender("2") }
        findViewById<Button>(R.id.button3).setOnClickListener { appender("3") }
        findViewById<Button>(R.id.button4).setOnClickListener { appender("4") }
        findViewById<Button>(R.id.button5).setOnClickListener { appender("5") }
        findViewById<Button>(R.id.button6).setOnClickListener { appender("6") }
        findViewById<Button>(R.id.button7).setOnClickListener { appender("7") }
        findViewById<Button>(R.id.button8).setOnClickListener { appender("8") }
        findViewById<Button>(R.id.button9).setOnClickListener { appender("9") }
        findViewById<Button>(R.id.dotButton).setOnClickListener { appender(".") }
        findViewById<Button>(R.id.clearButton).setOnClickListener { cleanUp(); equation.clear() }
        findViewById<Button>(R.id.addButton).setOnClickListener { addOperator("+") }
        findViewById<Button>(R.id.multiplyButton).setOnClickListener { addOperator("*") }
        findViewById<Button>(R.id.divideButton).setOnClickListener { addOperator("/") }
        findViewById<Button>(R.id.subtractButton).setOnClickListener {
            if (panel.text.toString() == "0") appender("-") else addOperator("-")
        }
        findViewById<Button>(R.id.equalButton).setOnClickListener { calculate() }
    }
    private fun appender(value: String) {
        if (value == "0" && panel.text.matches("-?0".toRegex())) return
        else if (value == "." && panel.text.contains(".")) return
        else if ((panel.text.toString() == "0" && value != ".") || value == "-") {
            panel.text.clear()
            panel.text.append(value)
        } else if (panel.text.toString() == "-0" && value[0].isDigit()) {
            panel.text.clear()
            panel.text.append("-$value")
        }else if (value == "." && panel.text.toString() == "-"){
            panel.text.clear()
            panel.text.append("-0.")
        }else panel.text.append(value)
    }
    private fun cleanUp() {
        panel.text.clear()
        panel.text.append("0")
        panel.hint = "0"
    }
    private fun addOperator(operator: String) {
        equation.add(panel.text.toString())
        equation.add(operator)
        cleanUp()
        panel.text.clear()
        panel.hint = equation[0]
    }
    private fun calculate() {
        equation.add(panel.text.toString())
        var result = when (equation[1]) {
            "+" -> equation[0].toDouble() + equation[2].toDouble()
            "-" -> equation[0].toDouble() - equation[2].toDouble()
            "*" -> equation[0].toDouble() * equation[2].toDouble()
            "/" -> equation[0].toDouble() / equation[2].toDouble()
            else -> return
        }.toString()
        if (result.matches("-?\\d+\\.0+".toRegex())) {
            result = result.substringBefore('.')
        }
        equation.clear()
        panel.text.clear()
        panel.text.append(result)
    }

}

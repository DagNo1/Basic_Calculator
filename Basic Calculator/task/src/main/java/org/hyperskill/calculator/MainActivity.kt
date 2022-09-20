package org.hyperskill.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var panel: EditText
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
        findViewById<Button>(R.id.clearButton).setOnClickListener { panel.text.clear(); panel.text.append("0") }
    }
    private fun appender(number: String) {
        if (number == "0" && panel.text.contains("0")) return
        else if (number == "." && panel.text.contains(".")) return
        else if (panel.text.toString() == "0" && number != ".") {
            panel.text.clear()
            panel.text.append(number)
        } else panel.text.append(number)
    }
}
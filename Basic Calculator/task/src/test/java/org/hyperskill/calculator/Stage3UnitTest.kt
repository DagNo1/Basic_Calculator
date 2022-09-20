package org.hyperskill.calculator

import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Stage3UnitTest {

    private val activityController = Robolectric.buildActivity(MainActivity::class.java)

    @Test
    fun testShouldCheckCalculatorWaitsForTheNextValue() {
        val activity = activityController.setup().get()
        val addButton = activity.findViewById<Button>(R.id.addButton)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val button1 = activity.findViewById<Button>(R.id.button1)
        val editText = activity.findViewById<EditText>(R.id.editText)

        clearButton.performClick()
        button1.performClick()
        addButton.performClick()
        val actualText = editText.text.toString()


        val message = "Calculator didn't clear the first value. Did you follow the objectives?"
        assertEquals(message, "0", actualText)
    }

    @Test
    fun testShouldCheckCalculatorAdds() {
        val activity = activityController.setup().get()
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button2 = activity.findViewById<Button>(R.id.button2)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val addButton = activity.findViewById<Button>(R.id.addButton)

        clearButton.performClick()
        button1.performClick()
        button1.performClick()
        button1.performClick()
        addButton.performClick()
        button2.performClick()
        button2.performClick()
        button2.performClick()
        equalButton.performClick()

        val expected = 111 + 222
        val actualText = editText.text.toString().toDouble()

        val message = "Tried to add, got the wrong answer"
        assertEquals(message, expected.toDouble(), actualText, 0.0)
    }

    @Test
    fun testShouldCheckCalculatorSubtracts() {
        val activity = activityController.setup().get()
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button2 = activity.findViewById<Button>(R.id.button2)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)

        clearButton.performClick()
        button1.performClick()
        button1.performClick()
        button1.performClick()
        subtractButton.performClick()
        button2.performClick()
        button2.performClick()
        button2.performClick()
        equalButton.performClick()

        val expected = 111 - 222
        val actualText = editText.text.toString().toDouble()


        val message = "Tried to subtract, got the wrong answer"
        assertEquals(message, expected.toDouble(), actualText, 0.0)
    }

    @Test
    fun testShouldCheckCalculatorMultiplies() {
        val activity = activityController.setup().get()
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button2 = activity.findViewById<Button>(R.id.button2)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val multiplyButton = activity.findViewById<Button>(R.id.multiplyButton)

        clearButton.performClick()
        button1.performClick()
        button1.performClick()
        button1.performClick()
        multiplyButton.performClick()
        button2.performClick()
        button2.performClick()
        button2.performClick()
        equalButton.performClick()

        val expected = 111 * 222
        val actualText = editText.text.toString().toDouble()


        val message = "Tried to multiply, got the wrong answer"
        assertEquals(message, expected.toDouble(), actualText, 0.0)
    }

    @Test
    fun testShouldCheckCalculatorDivides() {
        val activity = activityController.setup().get()
        val button2 = activity.findViewById<Button>(R.id.button2)
        val button5 = activity.findViewById<Button>(R.id.button5)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val divideButton = activity.findViewById<Button>(R.id.divideButton)

        clearButton.performClick()
        button5.performClick()
        divideButton.performClick()
        button2.performClick()
        equalButton.performClick()

        val expected: Double = 5.0/2.0
        val actualText = editText.text.toString().toDouble()


        val message = "Tried to divide, got the wrong answer"
        assertEquals(message, expected.toDouble(), actualText, 0.0)
    }

    @Test
    fun testShouldCheckCalculatorSupportsNegativeNumbers() {
        val activity = activityController.setup().get()
        val button1 = activity.findViewById<Button>(R.id.button1)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)
        val editText = activity.findViewById<EditText>(R.id.editText)

        clearButton.performClick()
        subtractButton.performClick()
        button1.performClick()

        val actualText = editText.text.toString()


        val message = "Looks like your calculator does not support negative numbers."
        assertEquals(message, "-1", actualText)
    }

    @Test
    fun testShouldCheckCalculatorCanDoMultipleActions() {
        val activity = activityController.setup().get()
        val button0 = activity.findViewById<Button>(R.id.button0)
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button2 = activity.findViewById<Button>(R.id.button2)
        val button5 = activity.findViewById<Button>(R.id.button5)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val addButton = activity.findViewById<Button>(R.id.addButton)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)
        val multiplyButton = activity.findViewById<Button>(R.id.multiplyButton)
        val divideButton = activity.findViewById<Button>(R.id.divideButton)
        val editText = activity.findViewById<EditText>(R.id.editText)

        clearButton.performClick()
        button1.performClick()
        button0.performClick()
        button0.performClick()
        addButton.performClick()
        button2.performClick()
        button5.performClick()
        equalButton.performClick()
        divideButton.performClick()
        button5.performClick()
        equalButton.performClick()
        multiplyButton.performClick()
        button1.performClick()
        button0.performClick()
        equalButton.performClick()
        subtractButton.performClick()
        button5.performClick()
        button0.performClick()
        equalButton.performClick()

        val actualText = editText.text.toString().toDouble()


        val message = "Looks like your calculator can't handle doing action after action."
        assertEquals(message, 200.0, actualText, 0.0)
    }

    @Test
    fun testShouldCheckNoNegativeZeroesToTheLeft() {
        val activity = activityController.setup().get()
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button0 = activity.findViewById<Button>(R.id.button0)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)
        clearButton.performClick()
        subtractButton.performClick()
        button0.performClick()
        button1.performClick()
        val actualText = editText.text.toString()
        val message = "Clicked the subtract, zero and button1, got a wrong result."
        assertEquals(message, "-1", actualText)
    }

    @Test
    fun testShouldCheckNoNegativeDotsWithoutZero() {
        val activity = activityController.setup().get()
        val dotButton = activity.findViewById<Button>(R.id.dotButton)
        val button1 = activity.findViewById<Button>(R.id.button1)
        val editText = activity.findViewById<EditText>(R.id.editText)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        clearButton.performClick()
        subtractButton.performClick()
        dotButton.performClick()
        button1.performClick()
        val actualText = editText.text.toString()
        val message = "Clicked the subtract, dotButton and button1, got a wrong result."
        assertEquals(message, "-0.1", actualText)
    }


}
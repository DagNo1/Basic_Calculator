package org.hyperskill.calculator

import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Stage1UnitTest {

    private val idWarningMessage = "Can't find a View with this ID: "
    private val activityController = Robolectric.buildActivity(MainActivity::class.java)
    private val activity = activityController.setup().get()
    private val editTextID = activity.resources.getIdentifier("editText", "id", activity.packageName)
    private val button0ID = activity.resources.getIdentifier("button0", "id", activity.packageName)
    private val button1ID = activity.resources.getIdentifier("button1", "id", activity.packageName)
    private val button2ID = activity.resources.getIdentifier("button2", "id", activity.packageName)
    private val button3ID = activity.resources.getIdentifier("button3", "id", activity.packageName)
    private val button4ID = activity.resources.getIdentifier("button4", "id", activity.packageName)
    private val button5ID = activity.resources.getIdentifier("button5", "id", activity.packageName)
    private val button6ID = activity.resources.getIdentifier("button6", "id", activity.packageName)
    private val button7ID = activity.resources.getIdentifier("button7", "id", activity.packageName)
    private val button8ID = activity.resources.getIdentifier("button8", "id", activity.packageName)
    private val button9ID = activity.resources.getIdentifier("button9", "id", activity.packageName)
    private val clearButtonID = activity.resources.getIdentifier("clearButton", "id", activity.packageName)
    private val equalButtonID = activity.resources.getIdentifier("equalButton", "id", activity.packageName)
    private val addButtonID = activity.resources.getIdentifier("addButton", "id", activity.packageName)
    private val subtractButtonID = activity.resources.getIdentifier("subtractButton", "id", activity.packageName)
    private val multiplyButtonID = activity.resources.getIdentifier("multiplyButton", "id", activity.packageName)
    private val divideButtonID = activity.resources.getIdentifier("divideButton", "id", activity.packageName)
    private val dotButtonID = activity.resources.getIdentifier("dotButton", "id", activity.packageName)


    @Test
    fun testShouldCheckEditTextExist() {
        val typeMismatch = "editText doesn't seem to be an EditText. Make sure you've chosen a correct View type."
        assertFalse(idWarningMessage + "editText", 0 == editTextID)
        val editText = activity.findViewById<View?>(editTextID)
        assertTrue(typeMismatch, editText is EditText)
        val message = "Was view with id \"editText\" placed in activity?"
        assertNotNull(message, editText)

    }

    @Test
    fun testShouldCheckEditTextContainZero() {
        val typeMismatch = "editText doesn't seem to be an EditText. Make sure you've chosen a correct View type."
        val editTextAsView = activity.findViewById<View?>(editTextID)
        assertTrue(typeMismatch, editTextAsView is EditText)
        val editText = activity.findViewById<EditText>(editTextID)
        val text = editText.text.toString()
        val message = "The editText with id \"editText\" should contain \"0\" in the property text."
        assertEquals(message, "0", text)
    }

    @Test
    fun testShouldCheckEditTextHintIsSetToZero() {
        val typeMismatch = "editText doesn't seem to be an EditText. Make sure you've chosen a correct View type."
        val editTextAsView = activity.findViewById<View?>(editTextID)
        assertTrue(typeMismatch, editTextAsView is EditText)
        val editText = activity.findViewById<EditText>(editTextID)
        val hint = editText.hint.toString()
        val message = "Check whether editText with id \"editText\" has 0 set as a hint"
        assertEquals(message, "0", hint)
    }

    @Test
    fun testShouldCheckButtonsExist() {
        val button0 = activity.findViewById<View?>(button0ID)
        val button1 = activity.findViewById<View?>(button1ID)
        val button2 = activity.findViewById<View?>(button2ID)
        val button3 = activity.findViewById<View?>(button3ID)
        val button4 = activity.findViewById<View?>(button4ID)
        val button5 = activity.findViewById<View?>(button5ID)
        val button6 = activity.findViewById<View?>(button6ID)
        val button7 = activity.findViewById<View?>(button7ID)
        val button8 = activity.findViewById<View?>(button8ID)
        val button9 = activity.findViewById<View?>(button9ID)
        val clearButton = activity.findViewById<View?>(clearButtonID)
        val equalButton = activity.findViewById<View?>(equalButtonID)
        val addButton = activity.findViewById<View?>(addButtonID)
        val subtractButton = activity.findViewById<View?>(subtractButtonID)
        val multiplyButton = activity.findViewById<View?>(multiplyButtonID)
        val divideButton = activity.findViewById<View?>(divideButtonID)
        val dotButton = activity.findViewById<View?>(dotButtonID)
        val typeMismatch = " doesn't seem to be a Button. Make sure you've chosen a correct View type."
        val message = "is view with id \"button0\" placed in activity?"
        assertFalse(idWarningMessage + "button0", button0ID == 0)
        assertTrue("button0$typeMismatch", button0 is Button)
        assertNotNull(message, button0)
        val message1 = "is view with id \"button1\" placed in activity?"
        assertFalse(idWarningMessage + "button1", button1ID == 0)
        assertTrue("button1$typeMismatch", button1 is Button)
        assertNotNull(message1, button1)
        val message2 = "is view with id \"button2\" placed in activity?"
        assertFalse(idWarningMessage + "button2", button2ID == 0)
        assertTrue("button2$typeMismatch", button2 is Button)
        assertNotNull(message2, button2)
        val message3 = "is view with id \"button3\" placed in activity?"
        assertFalse(idWarningMessage + "button3", button3ID == 0)
        assertTrue("button3$typeMismatch", button3 is Button)
        assertNotNull(message3, button3)
        val message4 = "is view with id \"button4\" placed in activity?"
        assertFalse(idWarningMessage + "button4", button4ID == 0)
        assertTrue("button4$typeMismatch", button4 is Button)
        assertNotNull(message4, button4)
        val message5 = "is view with id \"button5\" placed in activity?"
        assertFalse(idWarningMessage + "button5", button5ID == 0)
        assertTrue("button5$typeMismatch", button5 is Button)
        assertNotNull(message5, button5)
        val message6 = "is view with id \"button6\" placed in activity?"
        assertFalse(idWarningMessage + "button6", button6ID == 0)
        assertTrue("button6$typeMismatch", button6 is Button)
        assertNotNull(message6, button6)
        val message7 = "is view with id \"button7\" placed in activity?"
        assertFalse(idWarningMessage + "button7", button7ID == 0)
        assertTrue("button7$typeMismatch", button7 is Button)
        assertNotNull(message7, button7)
        val message8 = "is view with id \"button8\" placed in activity?"
        assertFalse(idWarningMessage + "button8", button8ID == 0)
        assertTrue("button8$typeMismatch", button8 is Button)
        assertNotNull(message8, button8)
        val message9 = "is view with id \"button9\" placed in activity?"
        assertFalse(idWarningMessage + "button9", button9ID == 0)
        assertTrue("button9$typeMismatch", button9 is Button)
        assertNotNull(message9, button9)
        val message10 = "is view with id \"clearButton\" placed in activity?"
        assertFalse(idWarningMessage + "clearButton", clearButtonID == 0)
        assertTrue("clearButton$typeMismatch", clearButton is Button)
        assertNotNull(message10, clearButton)
        val message11 = "is view with id \"equalButton\" placed in activity?"
        assertFalse(idWarningMessage + "equalButton", equalButtonID == 0)
        assertTrue("equalButton$typeMismatch", equalButton is Button)
        assertNotNull(message11, equalButton)
        val message12 = "is view with id \"addButton\" placed in activity?"
        assertFalse(idWarningMessage + "addButton", addButtonID == 0)
        assertTrue("addButton$typeMismatch", addButton is Button)
        assertNotNull(message12, addButton)
        val message13 = "is view with id \"divideButton\" placed in activity?"
        assertFalse(idWarningMessage + "divideButton", divideButtonID == 0)
        assertTrue("divideButton$typeMismatch", divideButton is Button)
        assertNotNull(message13, divideButton)
        val message14 = "is view with id \"subtractButton\" placed in activity?"
        assertFalse(idWarningMessage + "subtractButton", subtractButtonID == 0)
        assertTrue("subtractButton$typeMismatch", subtractButton is Button)
        assertNotNull(message14, subtractButton)
        val message15 = "is view with id \"multiplyButton\" placed in activity?"
        assertFalse(idWarningMessage + "multiplyButton", multiplyButtonID == 0)
        assertTrue("multiplyButton$typeMismatch", multiplyButton is Button)
        assertNotNull(message15, multiplyButton)
        val message16 = "is view with id \"dotButton\" placed in activity?"
        assertFalse(idWarningMessage + "dotButton", dotButtonID == 0)
        assertTrue("dotButton$typeMismatch", dotButton is Button)
        assertNotNull(message16, dotButton)
    }

    @Test
    fun testShouldCheckButtonsText() {
        val message = "There's nothing in button0 property \"text\""
        assertEquals(message, "0", activity.findViewById<Button>(button0ID).text)
        val message1 = "There's nothing in button1 property \"text\""
        assertEquals(message1, "1", activity.findViewById<Button>(button1ID).text)
        val message2 = "There's nothing in button2 property \"text\""
        assertEquals(message2, "2", activity.findViewById<Button>(button2ID).text)
        val message3 = "There's nothing in button3 property \"text\""
        assertEquals(message3, "3", activity.findViewById<Button>(button3ID).text)
        val message4 = "There's nothing in button4 property \"text\""
        assertEquals(message4, "4", activity.findViewById<Button>(button4ID).text)
        val message5 = "There's nothing in button5 property \"text\""
        assertEquals(message5, "5", activity.findViewById<Button>(button5ID).text)
        val message6 = "There's nothing in button6 property \"text\""
        assertEquals(message6, "6", activity.findViewById<Button>(button6ID).text)
        val message7 = "There's nothing in button7 property \"text\""
        assertEquals(message7, "7", activity.findViewById<Button>(button7ID).text)
        val message8 = "There's nothing in button8 property \"text\""
        assertEquals(message8, "8", activity.findViewById<Button>(button8ID).text)
        val message9 = "There's nothing in button9 property \"text\""
        assertEquals(message9, "9", activity.findViewById<Button>(button9ID).text)
    }
}
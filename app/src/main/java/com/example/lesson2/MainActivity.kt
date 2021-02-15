package com.example.lesson2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p = Person("martin", 37)
        Log.d("Person", p.toString())


        var persons = ArrayList<Person>()
        val p1 = Person("Asger", 45)
        persons.add(p1)
        val p2 = Person("burhan", 34)
        persons.add(p2)
        val p3 = Person("rasmus", 34)
        persons.add(p3)

        for (person in persons) {
            Log.d("Person", p.toString())

        }
        val text = persons.toString()
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        val myButton = findViewById<Button>(R.id.button1)
        myButton.setOnClickListener {
            Toast.makeText(applicationContext, "Hello Burhan", Toast.LENGTH_LONG).show();

        }

        val myButton2 = findViewById<Button>(R.id.button2)
        myButton2.setOnClickListener {
            Toast.makeText(applicationContext, "Hello Burhan, button 2 is pressed", Toast.LENGTH_LONG).show();
        }

        // finding the button
        val showButton = findViewById<Button>(R.id.showInput)

        // finding the edit text
        val editText = findViewById<EditText>(R.id.editText)

        // Setting On Click Listener
        showButton.setOnClickListener {

            // Getting the user input
            val text = editText.text

            // Showing the user input
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}
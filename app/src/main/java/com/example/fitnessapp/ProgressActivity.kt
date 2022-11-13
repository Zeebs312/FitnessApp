package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.fitnessapp.R

class ThirdActivity : AppCompatActivity() {
    // private fields of the class
    private lateinit var _button: Button
    private lateinit var _edittext: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)
        // pull a reference to the edittext from the layout
        _edittext = findViewById<EditText>(R.id.edittext)
        // 17 code goes here
    }
}

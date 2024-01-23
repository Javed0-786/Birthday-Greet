package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        createBirthdayButton.setOnclickListener()
    }

    fun createBirthdayCard(view: View) {
//        var createBirthdayButton = findViewById<Button>(R.id.createBirthdayButton)
//        createBirthdayButton.setOnClickListener()
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.Name_EXTRA, name)
        startActivity(intent)

//        Toast.makeText(this,"Happy Birthday ", Toast.LENGTH_LONG).show()
    }
}
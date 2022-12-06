package com.example.kinopoiskpanov

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun perexod2(view: View) {
        var intent = Intent(this,podborka2::class.java)
        startActivity(intent)
    }
}
package com.example.kinopoiskpanov

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var shared: SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.Login)
        password = findViewById(R.id.Password)
        shared=getSharedPreferences("ACCOUNT_FILMS", MODE_PRIVATE)
        if(shared.contains("LOGIN") && shared.contains("PASSWORD")){
            var l = shared.getString("LOGIN", "NONE")
            var p = shared.getString("PASSWORD", "NONE")
            login.setText(l)
            password.setText(p)
        }


        super.onCreate(savedInstanceState)

    }

    fun perexod(view: View) {
        val log1 = findViewById<EditText>(R.id.Login)
        val pas1 = findViewById<EditText>(R.id.Password)
        if (log1.text.toString() == "" && pas1.text.toString() == "")
        {
            val alter = AlertDialog.Builder(this)
                .setTitle("Ошибка").setMessage("У Вас не заполнены поля").setPositiveButton("OK", null).create().show()
            //Toast.makeText(this, "Попробуйте снова", Toast.LENGTH_SHORT).show()
        }
        else
        {
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }


    }
}
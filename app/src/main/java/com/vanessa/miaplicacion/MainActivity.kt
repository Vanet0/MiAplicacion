package com.vanessa.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.btn1)
        boton.setOnClickListener {
            val intent: Intent = Intent(this, Formulario:: class.java)
            startActivity(intent)
        }
    }
}
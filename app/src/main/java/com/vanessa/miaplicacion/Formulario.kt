package com.vanessa.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Formulario : AppCompatActivity() {

    lateinit var Nombre: EditText;
    lateinit var Apellido: EditText;
    lateinit var Correo: EditText;
    lateinit var Password: EditText;
    lateinit var Enviar: Button;

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        Nombre = findViewById(R.id.txtName)
        Apellido = findViewById(R.id.txtLastName)
        Correo = findViewById(R.id.txtEmail)
        Password = findViewById(R.id.txtPassWord)
        Enviar = findViewById(R.id.btn2)

        Enviar.setOnClickListener {
            val intent: Intent = Intent(this, Informacion:: class.java)
            intent.putExtra("Nombre", Nombre.text.toString())
            intent.putExtra("Apellido", Apellido.text.toString())
            intent.putExtra("Correo", Correo.text.toString())
            intent.putExtra("Contraseña", Password.text.toString())
            startActivity(intent)
        }
    }
}
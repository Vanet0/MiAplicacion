package com.vanessa.miaplicacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Informacion : AppCompatActivity() {

    lateinit var Txtnombre: TextView;
    lateinit var Txtapellido: TextView;
    lateinit var Txtcorreo: TextView;
    lateinit var Txtpassword: TextView;

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val boton: Button = findViewById(R.id.btn3)
        boton.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        Txtnombre = findViewById(R.id.Name)
        Txtapellido = findViewById(R.id.LastName)
        Txtcorreo = findViewById(R.id.Email)
        Txtpassword = findViewById(R.id.Password)
        Datos()
    }

    fun Datos(){
        val blunde = intent.extras
        Txtnombre.setText(Txtnombre.text.toString() + blunde?.getString("Nombre"))
        Txtapellido.setText(Txtapellido.text.toString() + blunde?.getString("Apellido"))
        Txtcorreo.setText(Txtcorreo.text.toString() + blunde?.getString("Correo"))
        Txtpassword.setText(Txtpassword.text.toString() + blunde?.getString("Contraseña"))
    }
}
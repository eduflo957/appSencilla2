package com.example.appsencilla2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        txtSaludo = findViewById(R.id.txtSaludo)

        val saludo = intent.getStringExtra("NOMBRE")
        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo"
    }
}
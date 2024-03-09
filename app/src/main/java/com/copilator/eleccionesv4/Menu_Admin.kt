package com.copilator.eleccionesv4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu_Admin : AppCompatActivity() {

    var boton: Button? = null
    var boton2: Button? = null
    var boton3: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_admin)

        boton = findViewById(R.id.ReiniEleccion)
        boton2 = findViewById(R.id.ContElec)
        boton3 = findViewById(R.id.ConteoVotos)

        boton!!.setOnClickListener {
            getSharedPreferences("Grados", Context.MODE_PRIVATE).edit().clear().apply()
            getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).edit().clear().apply()
            getSharedPreferences("contador", Context.MODE_PRIVATE).edit().clear().apply()
            val intent = Intent(this, Seleccion_grado::class.java)
            startActivity(intent)
        }

        boton2!!.setOnClickListener {
            val intent = Intent(this, Seleccion_grado::class.java)
            startActivity(intent)
        }

        boton3!!.setOnClickListener {
            val conteo = Intent(this, Resultado_Personeria::class.java)
            startActivity(conteo)
        }
    }
}
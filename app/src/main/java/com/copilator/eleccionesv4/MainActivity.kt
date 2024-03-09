package com.copilator.eleccionesv4

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

public class MainActivity() : AppCompatActivity() {

    var boton: Button? = null
    var boton2: Button? = null
    var boton3: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.Bempeza)
        boton2 = findViewById(R.id.BContiElec1)
        boton3 = findViewById(R.id.Badministrado)

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
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}
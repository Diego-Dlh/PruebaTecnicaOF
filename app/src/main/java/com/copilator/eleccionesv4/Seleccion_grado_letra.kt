package com.copilator.eleccionesv4

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Seleccion_grado_letra : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_grado_letra)

        var ncurso = getSharedPreferences("Grados", Context.MODE_PRIVATE)
            .getString("Variables_grado_numero", "")

        val na = findViewById<Button>(R.id.NA) // Initialize na button
        val nb = findViewById<Button>(R.id.NB)
        val nc = findViewById<Button>(R.id.NC)

        na.setOnClickListener {
            val letraA= "a"
            var concatenar = concatenar(ncurso!!, letraA) // Use na.text
            onClickGrado(concatenar)
        }

        nb.setOnClickListener {
            val letraB= "b"
            var concatenar = concatenar(ncurso!!, letraB) // Use na.text
            onClickGrado(concatenar)
        }

        nc.setOnClickListener {
            if (ncurso == "7" || ncurso == "6"){
                val letraC= "c"
                var concatenar = concatenar(ncurso!!, letraC) // Use na.text
                onClickGrado(concatenar)
            }else{
                Toast.makeText(this, "VUELVE A SELECCIONAR TU GRADO", Toast.LENGTH_SHORT).show()
                val back = Intent(this, Seleccion_grado::class.java)
                startActivity(back)
            }
        }
    }

    fun concatenar(primero: String, segundo: String): String {
        return "$segundo$primero"
    }

    fun onClickGrado(grado: String) {
        val sharedPreferences = getSharedPreferences("Grados", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("Variables_grado", grado)
        editor.apply()
        val intent = Intent(this, Voto_Personeria::class.java)
        startActivity(intent)
    }
}

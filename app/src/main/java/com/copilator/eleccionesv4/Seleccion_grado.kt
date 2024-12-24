package com.copilator.eleccionesv4

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Seleccion_grado : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_grado)

        N0G = findViewById(R.id.N0)
        N1G = findViewById(R.id.N1)
        N2G = findViewById(R.id.N2)
        N3G = findViewById(R.id.N3)
        N4G = findViewById(R.id.N4)
        N5G = findViewById(R.id.N5)
        N6G = findViewById(R.id.N6)
        N7G = findViewById(R.id.N7)
        N8G = findViewById(R.id.N8)
        N9G = findViewById(R.id.N9)
        N10G = findViewById(R.id.N10)
        N11G = findViewById(R.id.N11)
        kinder = findViewById(R.id.kind)




        N0G?.setOnClickListener { onClickGrado("0") }
        N1G?.setOnClickListener { onClickGrado("1") }
        N2G?.setOnClickListener { onClickGrado("2") }
        N3G?.setOnClickListener { onClickGrado("3") }
        N4G?.setOnClickListener { onClickGrado("4") }
        N5G?.setOnClickListener { onClickGrado("5") }
        N6G?.setOnClickListener { onClickGrado("6") }
        N7G?.setOnClickListener { onClickGrado("7") }
        N8G?.setOnClickListener { onClickGrado("8") }
        N9G?.setOnClickListener { onClickGrado("9") }
        N10G?.setOnClickListener { onClickGrado("10")}
        N11G?.setOnClickListener { onClickGrado("11")}
        kinder?.setOnClickListener {onClickGradoK("kinder")  }


        botonMod = findViewById(R.id.Moderador)

        botonMod!!.setOnClickListener {
            navegarAInicioSesion()
        }

    }

    var N0G: Button? = null
    var N1G: Button? = null
    var N2G: Button? = null
    var N3G: Button? = null
    var N4G: Button? = null
    var N5G: Button? = null
    var N6G: Button? = null
    var N7G: Button? = null
    var N8G: Button? = null
    var N9G: Button? = null
    var N10G: Button? = null
    var N11G: Button? = null
    var kinder: Button? = null

    var botonMod: ImageButton? = null



    fun onClickGrado(grado: String) {
        val toast = Toast.makeText(this, grado, Toast.LENGTH_SHORT)
        toast.show()
        val sharedPreferences = getSharedPreferences("Grados", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("Variables_grado_numero", grado)
        editor.apply()
        val intent = Intent(this, Seleccion_grado_letra::class.java)
        startActivity(intent)

    }

    fun onClickGradoK(grado: String) {
        val toast = Toast.makeText(this, grado, Toast.LENGTH_SHORT)
        toast.show()
        val sharedPreferences = getSharedPreferences("Grados", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("Variables_grado", grado)
        editor.apply()
        val intent = Intent(this, Voto_Personeria::class.java)
        startActivity(intent)

    }


    private fun navegarAInicioSesion() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }


}
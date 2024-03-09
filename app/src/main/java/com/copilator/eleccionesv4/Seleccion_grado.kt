package com.copilator.eleccionesv4

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Seleccion_grado : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_grado)

        b1 = findViewById(R.id.G1b)
        b2 = findViewById(R.id.G2b)
        b3 = findViewById(R.id.G3b)
        b4 = findViewById(R.id.G4b)
        b5 = findViewById(R.id.G5b)
        b6 = findViewById(R.id.G6b)
        b7 = findViewById(R.id.G7b)
        b8 = findViewById(R.id.G8b)
        b9 = findViewById(R.id.G9b)
        b10 = findViewById(R.id.G10b)
        b11 = findViewById(R.id.G11b)
        a1 = findViewById(R.id.G1a)
        a2 = findViewById(R.id.G2a)
        a3 = findViewById(R.id.G3a)
        a4 = findViewById(R.id.G4a)
        a5 = findViewById(R.id.G5a)
        a6 = findViewById(R.id.G6a)
        a7 = findViewById(R.id.G7a)
        a8 = findViewById(R.id.G8a)
        a9 = findViewById(R.id.G9a)
        a10 = findViewById(R.id.G10a)
        a11 = findViewById(R.id.G11a)
        c7 = findViewById(R.id.G7c)




        a1?.setOnClickListener { onClickGrado("a1") }
        a2?.setOnClickListener { onClickGrado("a2") }
        a3?.setOnClickListener { onClickGrado("a3") }
        a4?.setOnClickListener { onClickGrado("a4") }
        a5?.setOnClickListener { onClickGrado("a5") }
        a6?.setOnClickListener { onClickGrado("a6") }
        a7?.setOnClickListener { onClickGrado("a7") }
        a8?.setOnClickListener { onClickGrado("a8") }
        a9?.setOnClickListener { onClickGrado("a9") }
        a10?.setOnClickListener { onClickGrado("a10") }
        a11?.setOnClickListener { onClickGrado("a11") }

        b1?.setOnClickListener { onClickGrado("b1") }
        b2?.setOnClickListener { onClickGrado("b2") }
        b3?.setOnClickListener { onClickGrado("b3") }
        b4?.setOnClickListener { onClickGrado("b4") }
        b5?.setOnClickListener { onClickGrado("b5") }
        b6?.setOnClickListener { onClickGrado("b6") }
        b7?.setOnClickListener { onClickGrado("b7") }
        c7?.setOnClickListener { onClickGrado("b7") }
        b8?.setOnClickListener { onClickGrado("b8") }
        b9?.setOnClickListener { onClickGrado("b9") }
        b10?.setOnClickListener { onClickGrado("b10") }
        b11?.setOnClickListener { onClickGrado("b11") }

        botonMod = findViewById(R.id.Moderador)

        botonMod!!.setOnClickListener {
            navegarAInicioSesion()
        }

    }
    var a1: Button? = null
    var a2: Button? = null
    var a3: Button? = null
    var a4: Button? = null
    var a5: Button? = null
    var a6: Button? = null
    var a7: Button? = null
    var a8: Button? = null
    var a9: Button? = null
    var a10: Button? = null
    var a11: Button? = null

    var b1: Button? = null
    var b2: Button? = null
    var b3: Button? = null
    var b4: Button? = null
    var b5: Button? = null
    var b6: Button? = null
    var b7: Button? = null
    var b8: Button? = null
    var b9: Button? = null
    var b10: Button? = null
    var b11: Button? = null
    var c7: Button? = null
    var SelecGrado: String = " "
    var botonMod: ImageButton? = null



    fun onClickGrado(grado: String) {
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
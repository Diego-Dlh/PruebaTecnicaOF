package com.copilator.eleccionesv4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Voto_Contraloria : AppCompatActivity() {

    var conCkinder1: Int = 0
    var conC0a1: Int = 0
    var conC1a1: Int = 0
    var conC2a1: Int = 0
    var conC3a1: Int = 0
    var conC4a1: Int = 0
    var conC5a1: Int = 0
    var conC6a1: Int = 0
    var conC7a1: Int = 0
    var conC8a1: Int = 0
    var conC9a1: Int = 0
    var conC10a1: Int = 0
    var conC11a1: Int = 0
    var conC0b1: Int = 0
    var conC1b1: Int = 0
    var conC2b1: Int = 0
    var conC3b1: Int = 0
    var conC4b1: Int = 0
    var conC5b1: Int = 0
    var conC6b1: Int = 0
    var conC7b1: Int = 0
    var conC7c1: Int = 0
    var conC8b1: Int = 0
    var conC9b1: Int = 0
    var conC10b1: Int = 0
    var conC11b1: Int = 0
    var conC6c1: Int = 0

    var conCkinder2: Int = 0
    var conC0a2: Int = 0
    var conC1a2: Int = 0
    var conC2a2: Int = 0
    var conC3a2: Int = 0
    var conC4a2: Int = 0
    var conC5a2: Int = 0
    var conC6a2: Int = 0
    var conC7a2: Int = 0
    var conC8a2: Int = 0
    var conC9a2: Int = 0
    var conC10a2: Int = 0
    var conC11a2: Int = 0
    var conC0b2: Int = 0
    var conC1b2: Int = 0
    var conC2b2: Int = 0
    var conC3b2: Int = 0
    var conC4b2: Int = 0
    var conC5b2: Int = 0
    var conC6b2: Int = 0
    var conC7b2: Int = 0
    var conC7c2: Int = 0
    var conC8b2: Int = 0
    var conC9b2: Int = 0
    var conC10b2: Int = 0
    var conC11b2: Int = 0
    var conC6c2: Int = 0

    var conCkinder3: Int = 0
    var conC0a3: Int = 0
    var conC1a3: Int = 0
    var conC2a3: Int = 0
    var conC3a3: Int = 0
    var conC4a3: Int = 0
    var conC5a3: Int = 0
    var conC6a3: Int = 0
    var conC7a3: Int = 0
    var conC8a3: Int = 0
    var conC9a3: Int = 0
    var conC10a3: Int = 0
    var conC11a3: Int = 0
    var conC0b3: Int = 0
    var conC1b3: Int = 0
    var conC2b3: Int = 0
    var conC3b3: Int = 0
    var conC4b3: Int = 0
    var conC5b3: Int = 0
    var conC6b3: Int = 0
    var conC7b3: Int = 0
    var conC7c3: Int = 0
    var conC8b3: Int = 0
    var conC9b3: Int = 0
    var conC10b3: Int = 0
    var conC11b3: Int = 0
    var conC6c3: Int = 0

    var conCkinder4: Int = 0
    var conC0a4: Int = 0
    var conC1a4: Int = 0
    var conC2a4: Int = 0
    var conC3a4: Int = 0
    var conC4a4: Int = 0
    var conC5a4: Int = 0
    var conC6a4: Int = 0
    var conC7a4: Int = 0
    var conC8a4: Int = 0
    var conC9a4: Int = 0
    var conC10a4: Int = 0
    var conC11a4: Int = 0
    var conC0b4: Int = 0
    var conC1b4: Int = 0
    var conC2b4: Int = 0
    var conC3b4: Int = 0
    var conC4b4: Int = 0
    var conC5b4: Int = 0
    var conC6b4: Int = 0
    var conC7b4: Int = 0
    var conC7c4: Int = 0
    var conC8b4: Int = 0
    var conC9b4: Int = 0
    var conC10b4: Int = 0
    var conC11b4: Int = 0
    var conC6c4: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voto_contraloria)



        val shared = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE)
        val editor = shared.edit()

        conCkinder1 = shared.getInt("conCkinder1", 0)
        conC0a1 = shared.getInt("conC0a1", 0)
        conC1a1 = shared.getInt("conC1a1", 0)
        conC2a1 = shared.getInt("conC2a1", 0)
        conC3a1 = shared.getInt("conC3a1", 0)
        conC4a1 = shared.getInt("conC4a1", 0)
        conC5a1 = shared.getInt("conC5a1", 0)
        conC6a1 = shared.getInt("conC6a1", 0)
        conC7a1 = shared.getInt("conC7a1", 0)
        conC8a1 = shared.getInt("conC8a1", 0)
        conC9a1 = shared.getInt("conC9a1", 0)
        conC10a1 = shared.getInt("conC10a1", 0)
        conC11a1 = shared.getInt("conC11a1", 0)
        conC0b1 = shared.getInt("conC0b1", 0)
        conC1b1 = shared.getInt("conC1b1", 0)
        conC2b1 = shared.getInt("conC2b1", 0)
        conC3b1 = shared.getInt("conC3b1", 0)
        conC4b1 = shared.getInt("conC4b1", 0)
        conC5b1 = shared.getInt("conC5b1", 0)
        conC6b1 = shared.getInt("conC6b1", 0)
        conC7b1 = shared.getInt("conC7b1", 0)
        conC7c1 = shared.getInt("conC7c1", 0)
        conC8b1 = shared.getInt("conC8b1", 0)
        conC9b1 = shared.getInt("conC9b1", 0)
        conC10b1 = shared.getInt("conC10b1", 0)
        conC11b1 = shared.getInt("conC11b1", 0)
        conC6c1 = shared.getInt("conC6c1", 0)

        conCkinder2 = shared.getInt("conCkinder2", 0)
        conC0a2 = shared.getInt("conC0a2", 0)
        conC1a2 = shared.getInt("conC1a2", 0)
        conC2a2 = shared.getInt("conC2a2", 0)
        conC3a2 = shared.getInt("conC3a2", 0)
        conC4a2 = shared.getInt("conC4a2", 0)
        conC5a2 = shared.getInt("conC5a2", 0)
        conC6a2 = shared.getInt("conC6a2", 0)
        conC7a2 = shared.getInt("conC7a2", 0)
        conC8a2 = shared.getInt("conC8a2", 0)
        conC9a2 = shared.getInt("conC9a2", 0)
        conC10a2 = shared.getInt("conC10a2", 0)
        conC11a2 = shared.getInt("conC11a2", 0)
        conC0b2 = shared.getInt("conC0b2", 0)
        conC1b2 = shared.getInt("conC1b2", 0)
        conC2b2 = shared.getInt("conC2b2", 0)
        conC3b2 = shared.getInt("conC3b2", 0)
        conC4b2 = shared.getInt("conC4b2", 0)
        conC5b2 = shared.getInt("conC5b2", 0)
        conC6b2 = shared.getInt("conC6b2", 0)
        conC7b2 = shared.getInt("conC7b2", 0)
        conC7c2 = shared.getInt("conC7c2", 0)
        conC8b2 = shared.getInt("conC8b2", 0)
        conC9b2 = shared.getInt("conC9b2", 0)
        conC10b2 = shared.getInt("conC10b2", 0)
        conC11b2 = shared.getInt("conC11b2", 0)
        conC6c2 = shared.getInt("conC6c2", 0)

        conCkinder3 = shared.getInt("conkinder3", 0)
        conC0a3 = shared.getInt("conC0a3", 0)
        conC1a3 = shared.getInt("conC1a3", 0)
        conC2a3 = shared.getInt("conC2a3", 0)
        conC3a3 = shared.getInt("conC3a3", 0)
        conC4a3 = shared.getInt("conC4a3", 0)
        conC5a3 = shared.getInt("conC5a3", 0)
        conC6a3 = shared.getInt("conC6a3", 0)
        conC7a3 = shared.getInt("conC7a3", 0)
        conC8a3 = shared.getInt("conC8a3", 0)
        conC9a3 = shared.getInt("conC9a3", 0)
        conC10a3 = shared.getInt("conC10a3", 0)
        conC11a3 = shared.getInt("conC11a3", 0)
        conC0b3 = shared.getInt("conC0b3", 0)
        conC1b3 = shared.getInt("conC1b3", 0)
        conC2b3 = shared.getInt("conC2b3", 0)
        conC3b3 = shared.getInt("conC3b3", 0)
        conC4b3 = shared.getInt("conC4b3", 0)
        conC5b3 = shared.getInt("conC5b3", 0)
        conC6b3 = shared.getInt("conC6b3", 0)
        conC7b3 = shared.getInt("conC7b3", 0)
        conC7c3 = shared.getInt("conC7c3", 0)
        conC8b3 = shared.getInt("conC8b3", 0)
        conC9b3 = shared.getInt("conC9b3", 0)
        conC10b3 = shared.getInt("conC10b3", 0)
        conC11b3 = shared.getInt("conC11b3", 0)
        conC6c3 = shared.getInt("conC6c3", 0)

        conCkinder4 = shared.getInt("conkinder4", 0)
        conC0a4 = shared.getInt("conC0a4", 0)
        conC1a4 = shared.getInt("conC1a4", 0)
        conC2a4 = shared.getInt("conC2a4", 0)
        conC3a4 = shared.getInt("conC3a4", 0)
        conC4a4 = shared.getInt("conC4a4", 0)
        conC5a4 = shared.getInt("conC5a4", 0)
        conC6a4 = shared.getInt("conC6a4", 0)
        conC7a4 = shared.getInt("conC7a4", 0)
        conC8a4 = shared.getInt("conC8a4", 0)
        conC9a4 = shared.getInt("conC9a4", 0)
        conC10a4 = shared.getInt("conC10a4", 0)
        conC11a4 = shared.getInt("conC11a4", 0)
        conC0b4 = shared.getInt("conC0b4", 0)
        conC1b4 = shared.getInt("conC1b4", 0)
        conC2b4 = shared.getInt("conC2b4", 0)
        conC3b4 = shared.getInt("conC3b4", 0)
        conC4b4 = shared.getInt("conC4b4", 0)
        conC5b4 = shared.getInt("conC5b4", 0)
        conC6b4 = shared.getInt("conC6b4", 0)
        conC7b4 = shared.getInt("conC7b4", 0)
        conC7c4 = shared.getInt("conC7c4", 0)
        conC8b4 = shared.getInt("conC8b4", 0)
        conC9b4 = shared.getInt("conC9b4", 0)
        conC10b4 = shared.getInt("conC10b4", 0)
        conC11b4 = shared.getInt("conC11b4", 0)
        conC6c4 = shared.getInt("conC6c4", 0)

        // Inicializar variables
        var candidato: Int = 0
        var boton: Button? = null
        var boton2: Button? = null
        var boton3: Button? = null
        var boton4: Button? = null
        var botonMod: ImageButton? = null


        // Recuperar preferencias compartidas para el grado
        val grado = getSharedPreferences("Grados", Context.MODE_PRIVATE)
            .getString("Variables_grado", null)

        // Buscar botones por ID
        boton = findViewById(R.id.Boton1)
        boton2 = findViewById(R.id.Boton2)
        boton3 = findViewById(R.id.Boton3)
        boton4 = findViewById(R.id.Boton4)
        botonMod = findViewById(R.id.Moderador)

        // Establecer oyentes de clic para los botones
        boton!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
                "a0" -> {
                    conC0a1++
                    editor.putInt("conC0a1", conC0a1)
                    editor.apply()
                }
                "a1" -> {
                    conC1a1++
                    editor.putInt("conC1a1", conC1a1)
                    editor.apply()
                }

                "a2" -> {
                    conC2a1++
                    editor.putInt("conC2a1", conC2a1)
                    editor.apply()
                }

                "a3" -> {
                    conC3a1++
                    editor.putInt("conC3a1", conC3a1)
                    editor.apply()
                }

                "a4" -> {
                    conC4a1++
                    editor.putInt("conC4a1", conC4a1)
                    editor.apply()
                }

                "a5" -> {
                    conC5a1++
                    editor.putInt("conC5a1", conC5a1)
                    editor.apply()
                }

                "a6" -> {
                    conC6a1++
                    editor.putInt("conC6a1", conC6a1)
                    editor.apply()
                }

                "a7" -> {
                    conC7a1++
                    editor.putInt("conC7a1", conC7a1)
                    editor.apply()
                }

                "a8" -> {
                    conC8a1++
                    editor.putInt("conC8a1", conC8a1)
                    editor.apply()
                }

                "a9" -> {
                    conC9a1++
                    editor.putInt("conC9a1", conC9a1)
                    editor.apply()
                }

                "a10" -> {
                    conC10a1++
                    editor.putInt("conC10a1", conC10a1)
                    editor.apply()
                }

                "a11" -> {
                    conC11a1++
                    editor.putInt("conC11a1", conC11a1)
                    editor.apply()
                }

                "b0" -> {
                    conC0b1++
                    editor.putInt("conC0b1", conC0b1)
                    editor.apply()
                }

                "b1" -> {
                    conC1b1++
                    editor.putInt("conC1b1", conC1b1)
                    editor.apply()
                }

                "b2" -> {
                    conC2b1++
                    editor.putInt("conC2b1", conC2b1)
                    editor.apply()
                }

                "b3" -> {
                    conC3b1++
                    editor.putInt("conC3b1", conC3b1)
                    editor.apply()
                }

                "b4" -> {
                    conC4b1++
                    editor.putInt("conC4b1", conC4b1)
                    editor.apply()
                }

                "b5" -> {
                    conC5b1++
                    editor.putInt("conC5b1", conC5b1)
                    editor.apply()
                }

                "b6" -> {
                    conC6b1++ // typo in original code, should be con6b1
                    editor.putInt("conC6b1", conC6b1)
                    editor.apply()
                }

                "b7" -> {
                    conC7b1++
                    editor.putInt("conC7b1", conC7b1)
                    editor.apply()
                }

                "c7" -> {
                    conC7c1++
                    editor.putInt("conC7c1", conC7c1)
                    editor.apply()
                }

                "b8" -> {
                    conC8b1++
                    editor.putInt("conC8b1", conC8b1)
                    editor.apply()
                }

                "b9" -> {
                    conC9b1++
                    editor.putInt("conC9b1", conC9b1)
                    editor.apply()
                }

                "b10" -> {
                    conC10b1++
                    editor.putInt("conC10b1", conC10b1)
                    editor.apply()
                }

                "b11" -> {
                    conC11b1++
                    editor.putInt("conC11b1", conC11b1)
                    editor.apply()
                }
                "kinder" -> {
                    conCkinder1++
                    editor.putInt("conCkinder1", conCkinder1)
                    editor.apply()
                }
                "c6" -> {
                    conC6c1++
                    editor.putInt("conC6c1", conC6c1)
                    editor.apply()
                }
            }
        }

        boton2!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
                "a0" -> {
                    conC0a2++
                    editor.putInt("conC0a2", conC0a2)
                    editor.apply()
                }

                "a1" -> {
                    conC1a2++
                    editor.putInt("conC1a2", conC1a2)
                    editor.apply()
                }

                "a2" -> {
                    conC2a2++
                    editor.putInt("conC2a2", conC2a2)
                    editor.apply()
                }

                "a3" -> {
                    conC3a2++
                    editor.putInt("conC3a2", conC3a2)
                    editor.apply()
                }

                "a4" -> {
                    conC4a2++
                    editor.putInt("conC4a2", conC4a2)
                    editor.apply()
                }

                "a5" -> {
                    conC5a2++
                    editor.putInt("conC5a2", conC5a2)
                    editor.apply()
                }

                "a6" -> {
                    conC6a2++
                    editor.putInt("conC6a2", conC6a2)
                    editor.apply()
                }

                "a7" -> {
                    conC7a2++
                    editor.putInt("conC7a2", conC7a2)
                    editor.apply()
                }

                "a8" -> {
                    conC8a2++
                    editor.putInt("conC8a2", conC8a2)
                    editor.apply()
                }

                "a9" -> {
                    conC9a2++
                    editor.putInt("conC9a2", conC9a2)
                    editor.apply()
                }

                "a10" -> {
                    conC10a2++
                    editor.putInt("conC10a2", conC10a2)
                    editor.apply()
                }

                "a11" -> {
                    conC11a2++
                    editor.putInt("conC11a2", conC11a2)
                    editor.apply()
                }

                "b0" -> {
                    conC0b2++
                    editor.putInt("conC0b2", conC0b2)
                    editor.apply()
                }

                "b1" -> {
                    conC1b2++
                    editor.putInt("conC1b2", conC1b2)
                    editor.apply()
                }

                "b2" -> {
                    conC2b2++
                    editor.putInt("conC2b2", conC2b2)
                    editor.apply()
                }

                "b3" -> {
                    conC3b2++
                    editor.putInt("conC3b2", conC3b2)
                    editor.apply()
                }

                "b4" -> {
                    conC4b2++
                    editor.putInt("conC4b2", conC4b2)
                    editor.apply()
                }

                "b5" -> {
                    conC5b2++
                    editor.putInt("conC5b2", conC5b2)
                    editor.apply()
                }

                "b6" -> {
                    conC6b2++
                    editor.putInt("conC6b2", conC6b2)
                    editor.apply()
                }

                "b7" -> {
                    conC7b2++
                    editor.putInt("conC7b2", conC7b2)
                    editor.apply()
                }

                "c7" -> {
                    conC7c2++
                    editor.putInt("conC7c2", conC7c2)
                    editor.apply()
                }

                "b8" -> {
                    conC8b2++
                    editor.putInt("conC8b2", conC8b2)
                    editor.apply()
                }

                "b9" -> {
                    conC9b2++
                    editor.putInt("conC9b2", conC9b2)
                    editor.apply()
                }

                "b10" -> {
                    conC10b2++
                    editor.putInt("conC10b2", conC10b2)
                    editor.apply()
                }

                "b11" -> {
                    conC11b2++
                    editor.putInt("conC11b2", conC11b2)
                    editor.apply()
                }
                "kinder" -> {
                    conCkinder2++
                    editor.putInt("conCkinder2", conCkinder2)
                    editor.apply()
                }
                "c6" -> {
                    conC6c2++
                    editor.putInt("conC6c2", conC6c2)
                    editor.apply()
                }
            }

        }

        boton3!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
                "a0" -> {
                    conC0a3++
                    editor.putInt("conC0a3", conC0a3)
                    editor.apply()
                }

                "a1" -> {
                    conC1a3++
                    editor.putInt("conC1a3", conC1a3)
                    editor.apply()
                }

                "a2" -> {
                    conC2a3++
                    editor.putInt("conC2a3", conC2a3)
                    editor.apply()
                }

                "a3" -> {
                    conC3a3++
                    editor.putInt("conC3a3", conC3a3)
                    editor.apply()
                }

                "a4" -> {
                    conC4a3++
                    editor.putInt("conC4a3", conC4a3)
                    editor.apply()
                }

                "a5" -> {
                    conC5a3++
                    editor.putInt("conC5a3", conC5a3)
                    editor.apply()
                }

                "a6" -> {
                    conC6a3++
                    editor.putInt("conC6a3", conC6a3)
                    editor.apply()
                }

                "a7" -> {
                    conC7a3++
                    editor.putInt("conC7a3", conC7a3)
                    editor.apply()
                }

                "a8" -> {
                    conC8a3++
                    editor.putInt("conC8a3", conC8a3)
                    editor.apply()
                }

                "a9" -> {
                    conC9a3++
                    editor.putInt("conC9a3", conC9a3)
                    editor.apply()
                }

                "a10" -> {
                    conC10a3++
                    editor.putInt("conC10a3", conC10a3)
                    editor.apply()
                }

                "a11" -> {
                    conC11a3++
                    editor.putInt("conC11a3", conC11a3)
                    editor.apply()
                }

                "b0" -> {
                    conC0b3++
                    editor.putInt("conC0b3", conC0b3)
                    editor.apply()
                }

                "b1" -> {
                    conC1b3++
                    editor.putInt("conC1b3", conC1b3)
                    editor.apply()
                }

                "b2" -> {
                    conC2b3++
                    editor.putInt("conC2b3", conC2b3)
                    editor.apply()
                }

                "b3" -> {
                    conC3b3++
                    editor.putInt("conC3b3", conC3b3)
                    editor.apply()
                }

                "b4" -> {
                    conC4b3++
                    editor.putInt("conC4b3", conC4b3)
                    editor.apply()
                }

                "b5" -> {
                    conC5b3++
                    editor.putInt("conC5b3", conC5b3)
                    editor.apply()
                }

                "b6" -> {
                    conC6b3++
                    editor.putInt("conC6b3", conC6b3)
                    editor.apply()
                }

                "b7" -> {
                    conC7b3++
                    editor.putInt("conC7b3", conC7b3)
                    editor.apply()
                }

                "c7" -> {
                    conC7c3++
                    editor.putInt("conC7c3", conC7c3)
                    editor.apply()
                }

                "b8" -> {
                    conC8b3++
                    editor.putInt("conC8b3", conC8b3)
                    editor.apply()
                }

                "b9" -> {
                    conC9b3++
                    editor.putInt("conC9b3", conC9b3)
                    editor.apply()
                }

                "b10" -> {
                    conC10b3++
                    editor.putInt("conC10b3", conC10b3)
                    editor.apply()
                }

                "b11" -> {
                    conC11b3++
                    editor.putInt("conC11b3", conC11b3)
                    editor.apply()
                }
                "kinder" -> {
                    conCkinder3++
                    editor.putInt("conCkinder3", conCkinder3)
                    editor.apply()
                }
                "c6" -> {
                    conC6c3++
                    editor.putInt("conC6c3", conC6c3)
                    editor.apply()
                }
            }

        }

        boton4!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
                "a0" -> {
                    conC0a4++
                    editor.putInt("conC0a4", conC0a4)
                    editor.apply()
                }

                "a1" -> {
                    conC1a4++
                    editor.putInt("conC1a4", conC1a4)
                    editor.apply()
                }

                "a2" -> {
                    conC2a4++
                    editor.putInt("conC2a4", conC2a4)
                    editor.apply()
                }

                "a3" -> {
                    conC3a4++
                    editor.putInt("conC3a4", conC3a4)
                    editor.apply()
                }

                "a4" -> {
                    conC4a4++
                    editor.putInt("conC4a4", conC4a4)
                    editor.apply()
                }

                "a5" -> {
                    conC5a4++
                    editor.putInt("conC5a4", conC5a4)
                    editor.apply()
                }

                "a6" -> {
                    conC6a4++
                    editor.putInt("conC6a4", conC6a4)
                    editor.apply()
                }

                "a7" -> {
                    conC7a4++
                    editor.putInt("conC7a4", conC7a4)
                    editor.apply()
                }

                "a8" -> {
                    conC8a4++
                    editor.putInt("conC8a4", conC8a4)
                    editor.apply()
                }

                "a9" -> {
                    conC9a4++
                    editor.putInt("conC9a4", conC9a4)
                    editor.apply()
                }

                "a10" -> {
                    conC10a4++
                    editor.putInt("conC10a4", conC10a4)
                    editor.apply()
                }

                "a11" -> {
                    conC11a4++
                    editor.putInt("conC11a4", conC11a4)
                    editor.apply()
                }

                "b0" -> {
                    conC0b4++
                    editor.putInt("conC0b4", conC0b4)
                    editor.apply()
                }

                "b1" -> {
                    conC1b4++
                    editor.putInt("conC1b4", conC1b4)
                    editor.apply()
                }

                "b2" -> {
                    conC2b4++
                    editor.putInt("conC2b4", conC2b4)
                    editor.apply()
                }

                "b3" -> {
                    conC3b4++
                    editor.putInt("conC3b4", conC3b4)
                    editor.apply()
                }

                "b4" -> {
                    conC4b4++
                    editor.putInt("conC4b4", conC4b4)
                    editor.apply()
                }

                "b5" -> {
                    conC5b4++
                    editor.putInt("conC5b4", conC5b4)
                    editor.apply()
                }

                "b6" -> {
                    conC6b4++
                    editor.putInt("conC6b4", conC6b4)
                    editor.apply()
                }

                "b7" -> {
                    conC7b4++
                    editor.putInt("conC7b4", conC7b4)
                    editor.apply()
                }

                "c7" -> {
                    conC7c4++
                    editor.putInt("conC7c4", conC7c4)
                    editor.apply()
                }

                "b8" -> {
                    conC8b4++
                    editor.putInt("conC8b4", conC8b4)
                    editor.apply()
                }

                "b9" -> {
                    conC9b4++
                    editor.putInt("conC9b4", conC9b4)
                    editor.apply()
                }

                "b10" -> {
                    conC10b4++
                    editor.putInt("conC10b4", conC10b4)
                    editor.apply()
                }

                "b11" -> {
                    conC11b4++
                    editor.putInt("conC11b4", conC11b4)
                    editor.apply()
                }
                "kinder" -> {
                    conCkinder4++
                    editor.putInt("conCkinder4", conCkinder4)
                    editor.apply()
                }
                "c6" -> {
                    conC6c4++
                    editor.putInt("conC6c4", conC6c4)
                    editor.apply()
                }
            }

        }

        botonMod!!.setOnClickListener {
            // Manejar inicio de sesión del moderador
            navegarAInicioSesion()
        }
    }


    private fun navegarAVotoContraloria() {
        val intent = Intent(this, Seleccion_grado::class.java)
        startActivity(intent)
    }

    private fun navegarAInicioSesion() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}

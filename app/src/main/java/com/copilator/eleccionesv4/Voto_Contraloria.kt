package com.copilator.eleccionesv4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Voto_Contraloria : AppCompatActivity() {
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voto_contraloria)



        val shared = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE)
        val editor = shared.edit()

        var conC1a1 = shared.getInt("conC1a1", 0)
        var conC2a1 = shared.getInt("conC2a1", 0)
        var conC3a1 = shared.getInt("conC3a1", 0)
        var conC4a1 = shared.getInt("conC4a1", 0)
        var conC5a1 = shared.getInt("conC5a1", 0)
        var conC6a1 = shared.getInt("conC6a1", 0)
        var conC7a1 = shared.getInt("conC7a1", 0)
        var conC8a1 = shared.getInt("conC8a1", 0)
        var conC9a1 = shared.getInt("conC9a1", 0)
        var conC10a1 = shared.getInt("conC10a1", 0)
        var conC11a1 = shared.getInt("conC11a1", 0)
        var conC1b1 = shared.getInt("conC1b1", 0)
        var conC2b1 = shared.getInt("conC2b1", 0)
        var conC3b1 = shared.getInt("conC3b1", 0)
        var conC4b1 = shared.getInt("conC4b1", 0)
        var conC5b1 = shared.getInt("conC5b1", 0)
        var conC6b1 = shared.getInt("conC6b1", 0)
        var conC7b1 = shared.getInt("conC7b1", 0)
        var conC7c1 = shared.getInt("conC7c1", 0)
        var conC8b1 = shared.getInt("conC8b1", 0)
        var conC9b1 = shared.getInt("conC9b1", 0)
        var conC10b1 = shared.getInt("conC10b1", 0)
        var conC11b1 = shared.getInt("conC11b1", 0)

        var conC1a2 = shared.getInt("conC1a1", 0)
        var conC2a2 = shared.getInt("conC2a1", 0)
        var conC3a2 = shared.getInt("conC3a1", 0)
        var conC4a2 = shared.getInt("conC4a1", 0)
        var conC5a2 = shared.getInt("conC5a1", 0)
        var conC6a2 = shared.getInt("conC6a1", 0)
        var conC7a2 = shared.getInt("conC7a1", 0)
        var conC8a2 = shared.getInt("conC8a1", 0)
        var conC9a2 = shared.getInt("conC9a1", 0)
        var conC10a2 = shared.getInt("conC10a1", 0)
        var conC11a2 = shared.getInt("conC11a1", 0)
        var conC1b2 = shared.getInt("conC1b1", 0)
        var conC2b2 = shared.getInt("conC2b1", 0)
        var conC3b2 = shared.getInt("conC3b1", 0)
        var conC4b2 = shared.getInt("conC4b1", 0)
        var conC5b2 = shared.getInt("conC5b1", 0)
        var conC6b2 = shared.getInt("conC6b1", 0)
        var conC7b2 = shared.getInt("conC7b1", 0)
        var conC7c2 = shared.getInt("conC7c1", 0)
        var conC8b2 = shared.getInt("conC8b1", 0)
        var conC9b2 = shared.getInt("conC9b1", 0)
        var conC10b2 = shared.getInt("conC10b1", 0)
        var conC11b2 = shared.getInt("conC11b1", 0)

        var conC1a3 = shared.getInt("conC1a1", 0)
        var conC2a3 = shared.getInt("conC2a1", 0)
        var conC3a3 = shared.getInt("conC3a1", 0)
        var conC4a3 = shared.getInt("conC4a1", 0)
        var conC5a3 = shared.getInt("conC5a1", 0)
        var conC6a3 = shared.getInt("conC6a1", 0)
        var conC7a3 = shared.getInt("conC7a1", 0)
        var conC8a3 = shared.getInt("conC8a1", 0)
        var conC9a3 = shared.getInt("conC9a1", 0)
        var conC10a3 = shared.getInt("conC10a1", 0)
        var conC11a3 = shared.getInt("conC11a1", 0)
        var conC1b3 = shared.getInt("conC1b1", 0)
        var conC2b3 = shared.getInt("conC2b1", 0)
        var conC3b3 = shared.getInt("conC3b1", 0)
        var conC4b3 = shared.getInt("conC4b1", 0)
        var conC5b3 = shared.getInt("conC5b1", 0)
        var conC6b3 = shared.getInt("conC6b1", 0)
        var conC7b3 = shared.getInt("conC7b1", 0)
        var conC7c3 = shared.getInt("conC7c1", 0)
        var conC8b3 = shared.getInt("conC8b1", 0)
        var conC9b3 = shared.getInt("conC9b1", 0)
        var conC10b3 = shared.getInt("conC10b1", 0)
        var conC11b3 = shared.getInt("conC11b1", 0)


        // Inicializar variables
        var candidato: Int = 0
        var boton: Button? = null
        var boton2: Button? = null
        var boton3: Button? = null
        var botonMod: ImageButton? = null


        // Recuperar preferencias compartidas para el grado
        val grado = getSharedPreferences("Grados", Context.MODE_PRIVATE)
            .getString("Variables_grado", null)

        // Buscar botones por ID
        boton = findViewById(R.id.Boton1)
        boton2 = findViewById(R.id.Boton2)
        boton3 = findViewById(R.id.Boton3)
        botonMod = findViewById(R.id.Moderador)

        // Establecer oyentes de clic para los botones
        boton!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
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
            }
        }

                    boton2!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
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
            }

        }

        boton3!!.setOnClickListener {

            navegarAVotoContraloria()
            when (grado) {
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

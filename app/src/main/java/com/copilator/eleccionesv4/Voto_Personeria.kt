package com.copilator.eleccionesv4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Voto_Personeria : AppCompatActivity() {
    var con1a1: Int = 0
    var con2a1: Int = 0
    var con3a1: Int = 0
    var con4a1: Int = 0
    var con5a1: Int = 0
    var con6a1: Int = 0
    var con7a1: Int = 0
    var con8a1: Int = 0
    var con9a1: Int = 0
    var con10a1: Int = 0
    var con11a1: Int = 0
    var con1b1: Int = 0
    var con2b1: Int = 0
    var con3b1: Int = 0
    var con4b1: Int = 0
    var con5b1: Int = 0
    var con6b1: Int = 0
    var con7b1: Int = 0
    var con7c1: Int = 0
    var con8b1: Int = 0
    var con9b1: Int = 0
    var con10b1: Int = 0
    var con11b1: Int = 0

    var con1a2: Int = 0
    var con2a2: Int = 0
    var con3a2: Int = 0
    var con4a2: Int = 0
    var con5a2: Int = 0
    var con6a2: Int = 0
    var con7a2: Int = 0
    var con8a2: Int = 0
    var con9a2: Int = 0
    var con10a2: Int = 0
    var con11a2: Int = 0
    var con1b2: Int = 0
    var con2b2: Int = 0
    var con3b2: Int = 0
    var con4b2: Int = 0
    var con5b2: Int = 0
    var con6b2: Int = 0
    var con7b2: Int = 0
    var con7c2: Int = 0
    var con8b2: Int = 0
    var con9b2: Int = 0
    var con10b2: Int = 0
    var con11b2: Int = 0

    var con1a3: Int = 0
    var con2a3: Int = 0
    var con3a3: Int = 0
    var con4a3: Int = 0
    var con5a3: Int = 0
    var con6a3: Int = 0
    var con7a3: Int = 0
    var con8a3: Int = 0
    var con9a3: Int = 0
    var con10a3: Int = 0
    var con11a3: Int = 0
    var con1b3: Int = 0
    var con2b3: Int = 0
    var con3b3: Int = 0
    var con4b3: Int = 0
    var con5b3: Int = 0
    var con6b3: Int = 0
    var con7b3: Int = 0
    var con7c3: Int = 0
    var con8b3: Int = 0
    var con9b3: Int = 0
    var con10b3: Int = 0
    var con11b3: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voto_personeria)



        val shared = getSharedPreferences("contador", Context.MODE_PRIVATE)
        val editor = shared.edit()

        con1a1 = shared.getInt("con1a1", 0)
        con2a1 = shared.getInt("con2a1", 0)
        con3a1 = shared.getInt("con3a1", 0)
        con4a1 = shared.getInt("con4a1", 0)
        con5a1 = shared.getInt("con5a1", 0)
        con6a1 = shared.getInt("con6a1", 0)
        con7a1 = shared.getInt("con7a1", 0)
        con8a1 = shared.getInt("con8a1", 0)
        con9a1 = shared.getInt("con9a1", 0)
        con10a1 = shared.getInt("con10a1", 0)
        con11a1 = shared.getInt("con11a1", 0)
        con1b1 = shared.getInt("con1b1", 0)
        con2b1 = shared.getInt("con2b1", 0)
        con3b1 = shared.getInt("con3b1", 0)
        con4b1 = shared.getInt("con4b1", 0)
        con5b1 = shared.getInt("con5b1", 0)
        con6b1 = shared.getInt("con6b1", 0)
        con7b1 = shared.getInt("con7b1", 0)
        con7c1 = shared.getInt("con7c1", 0)
        con8b1 = shared.getInt("con8b1", 0)
        con9b1 = shared.getInt("con9b1", 0)
        con10b1 = shared.getInt("con10b1", 0)
        con11b1 = shared.getInt("con11b1", 0)

        con1a2 = shared.getInt("con1a2", 0)
        con2a2 = shared.getInt("con2a2", 0)
        con3a2 = shared.getInt("con3a2", 0)
        con4a2 = shared.getInt("con4a2", 0)
        con5a2 = shared.getInt("con5a2", 0)
        con6a2 = shared.getInt("con6a2", 0)
        con7a2 = shared.getInt("con7a2", 0)
        con8a2 = shared.getInt("con8a2", 0)
        con9a2 = shared.getInt("con9a2", 0)
        con10a2 = shared.getInt("con10a2", 0)
        con11a2 = shared.getInt("con11a2", 0)
        con1b2 = shared.getInt("con1b2", 0)
        con2b2 = shared.getInt("con2b2", 0)
        con3b2 = shared.getInt("con3b2", 0)
        con4b2 = shared.getInt("con4b2", 0)
        con5b2 = shared.getInt("con5b2", 0)
        con6b2 = shared.getInt("con6b2", 0)
        con7b2 = shared.getInt("con7b2", 0)
        con7c2 = shared.getInt("con7c2", 0)
        con8b2 = shared.getInt("con8b2", 0)
        con9b2 = shared.getInt("con9b2", 0)
        con10b2 = shared.getInt("con10b2", 0)
        con11b2 = shared.getInt("con11b2", 0)

        con1a3 = shared.getInt("con1a3", 0)
        con2a3 = shared.getInt("con2a3", 0)
        con3a3 = shared.getInt("con3a3", 0)
        con4a3 = shared.getInt("con4a3", 0)
        con5a3 = shared.getInt("con5a3", 0)
        con6a3 = shared.getInt("con6a3", 0)
        con7a3 = shared.getInt("con7a3", 0)
        con8a3 = shared.getInt("con8a3", 0)
        con9a3 = shared.getInt("con9a3", 0)
        con10a3 = shared.getInt("con10a3", 0)
        con11a3 = shared.getInt("con11a3", 0)
        con1b3 = shared.getInt("con1b3", 0)
        con2b3 = shared.getInt("con2b3", 0)
        con3b3 = shared.getInt("con3b3", 0)
        con4b3 = shared.getInt("con4b3", 0)
        con5b3 = shared.getInt("con5b3", 0)
        con6b3 = shared.getInt("con6b3", 0)
        con7b3 = shared.getInt("con7b3", 0)
        con7c3 = shared.getInt("con7c3", 0)
        con8b3 = shared.getInt("con8b3", 0)
        con9b3 = shared.getInt("con9b3", 0)
        con10b3 = shared.getInt("con10b3", 0)
        con11b3 = shared.getInt("con11b3", 0)

        // Inicializar variables
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
                    con1a1++
                    editor.putInt("con1a1", con1a1)
                    editor.apply()
                }
                "a2" -> {
                    con2a1++
                    editor.putInt("con2a1", con2a1)
                    editor.apply()
                }
                "a3" -> {
                    con3a1++
                    editor.putInt("con3a1", con3a1)
                    editor.apply()
                }
                "a4" -> {
                    con4a1++
                    editor.putInt("con4a1", con4a1)
                    editor.apply()
                }
                "a5" -> {
                    con5a1++
                    editor.putInt("con5a1", con5a1)
                    editor.apply()
                }
                "a6" -> {
                    con6a1++
                    editor.putInt("con6a1", con6a1)
                    editor.apply()
                }
                "a7" -> {
                    con7a1++
                    editor.putInt("con7a1", con7a1)
                    editor.apply()
                }
                "a8" -> {
                    con8a1++
                    editor.putInt("con8a1", con8a1)
                    editor.apply()
                }
                "a9" -> {
                    con9a1++
                    editor.putInt("con9a1", con9a1)
                    editor.apply()
                }
                "a10" -> {
                    con10a1++
                    editor.putInt("con10a1", con10a1)
                    editor.apply()
                }
                "a11" -> {
                    con11a1++
                    editor.putInt("con11a1", con11a1)
                    editor.apply()
                }
                "b1" -> {
                    con1b1++
                    editor.putInt("con1b1", con1b1)
                    editor.apply()
                }
                "b2" -> {
                    con2b1++
                    editor.putInt("con2b1", con2b1)
                    editor.apply()
                }
                "b3" -> {
                    con3b1++
                    editor.putInt("con3b1", con3b1)
                    editor.apply()
                }
                "b4" -> {
                    con4b1++
                    editor.putInt("con4b1", con4b1)
                    editor.apply()
                }
                "b5" -> {
                    con5b1++
                    editor.putInt("con5b1", con5b1)
                    editor.apply()
                }
                "b6" -> {
                    con6b1++
                    editor.putInt("con6a1", con6b1)
                    editor.apply()
                }
                "b7" -> {
                    con7b1++
                    editor.putInt("con7b1", con7b1)
                    editor.apply()
                }
                "c7" -> {
                    con7c1++
                    editor.putInt("con7c1", con7c1)
                    editor.apply()
                }
                "b8" -> {
                    con8b1++
                    editor.putInt("con8b1", con8b1)
                    editor.apply()
                }
                "b9" -> {
                    con9b1++
                    editor.putInt("con9b1", con9b1)
                    editor.apply()
                }
                "b10" -> {
                    con10b1++
                    editor.putInt("con10b1", con10b1)
                    editor.apply()
                }
                "b11" -> {
                    con11b1++
                    editor.putInt("con11b1", con11b1)
                    editor.apply()
                }
            }
        }
        boton2!!.setOnClickListener {
            navegarAVotoContraloria()
            when (grado) {
                "a1" -> {
                    con1a2++
                    editor.putInt("con1a2", con1a2)
                    editor.apply()
                }

                "a2" -> {
                    con2a2++
                    editor.putInt("con2a2", con2a2)
                    editor.apply()
                }

                "a3" -> {
                    con3a2++
                    editor.putInt("con3a2", con3a2)
                    editor.apply()
                }

                "a4" -> {
                    con4a2++
                    editor.putInt("con4a2", con4a2)
                    editor.apply()
                }

                "a5" -> {
                    con5a2++
                    editor.putInt("con5a2", con5a2)
                    editor.apply()
                }

                "a6" -> {
                    con6a2++
                    editor.putInt("con6a2", con6a2)
                    editor.apply()
                }

                "a7" -> {
                    con7a2++
                    editor.putInt("con7a2", con7a2)
                    editor.apply()
                }

                "a8" -> {
                    con8a2++
                    editor.putInt("con8a2", con8a2)
                    editor.apply()
                }

                "a9" -> {
                    con9a2++
                    editor.putInt("con9a2", con9a2)
                    editor.apply()
                }

                "a10" -> {
                    con10a2++
                    editor.putInt("con10a2", con10a2)
                    editor.apply()
                }

                "a11" -> {
                    con11a2++
                    editor.putInt("con11a2", con11a2)
                    editor.apply()
                }

                "b1" -> {
                    con1b2++
                    editor.putInt("con1b2", con1b2)
                    editor.apply()
                }

                "b2" -> {
                    con2b2++
                    editor.putInt("con2b2", con2b2)
                    editor.apply()
                }

                "b3" -> {
                    con3b2++
                    editor.putInt("con3b2", con3b2)
                    editor.apply()
                }

                "b4" -> {
                    con4b2++
                    editor.putInt("con4b2", con4b2)
                    editor.apply()
                }

                "b5" -> {
                    con5b2++
                    editor.putInt("con5b2", con5b2)
                    editor.apply()
                }

                "b6" -> {
                    con6b2++
                    editor.putInt("con6a2", con6b2)
                    editor.apply()
                }

                "b7" -> {
                    con7b2++
                    editor.putInt("con7b2", con7b2)
                    editor.apply()
                }

                "c7" -> {
                    con7c2++
                    editor.putInt("con7c2", con7c2)
                    editor.apply()
                }

                "b8" -> {
                    con8b2++
                    editor.putInt("con8b2", con8b2)
                    editor.apply()
                }

                "b9" -> {
                    con9b2++
                    editor.putInt("con9b2", con9b2)
                    editor.apply()
                }

                "b10" -> {
                    con10b2++
                    editor.putInt("con10b2", con10b2)
                    editor.apply()
                }

                "b11" -> {
                    con11b2++
                    editor.putInt("con11b2", con11b2)
                    editor.apply()
                }
            }

        }

        boton3!!.setOnClickListener {
            // Manejar voto para el candidato 3

            navegarAVotoContraloria()
            when (grado) {
                "a1" -> {
                    con1a3++
                    editor.putInt("con1a3", con1a3)
                    editor.apply()
                }

                "a2" -> {
                    con2a3++
                    editor.putInt("con2a3", con2a3)
                    editor.apply()
                }

                "a3" -> {
                    con3a3++
                    editor.putInt("con3a3", con3a3)
                    editor.apply()
                }

                "a4" -> {
                    con4a3++
                    editor.putInt("con4a3", con4a3)
                    editor.apply()
                }

                "a5" -> {
                    con5a3++
                    editor.putInt("con5a3", con5a3)
                    editor.apply()
                }

                "a6" -> {
                    con6a3++
                    editor.putInt("con6a1", con6a3)
                    editor.apply()
                }

                "a7" -> {
                    con7a3++
                    editor.putInt("con7a3", con7a3)
                    editor.apply()
                }

                "a8" -> {
                    con8a3++
                    editor.putInt("con8a3", con8a3)
                    editor.apply()
                }

                "a9" -> {
                    con9a3++
                    editor.putInt("con9a3", con9a3)
                    editor.apply()
                }

                "a10" -> {
                    con10a3++
                    editor.putInt("con10a3", con10a3)
                    editor.apply()
                }

                "a11" -> {
                    con11a3++
                    editor.putInt("con11a3", con11a3)
                    editor.apply()
                }

                "b1" -> {
                    con1b3++
                    editor.putInt("con1b3", con1b3)
                    editor.apply()
                }

                "b2" -> {
                    con2b3++
                    editor.putInt("con2b3", con2b3)
                    editor.apply()
                }

                "b3" -> {
                    con3b3++
                    editor.putInt("con3b1", con3b3)
                    editor.apply()
                }

                "b4" -> {
                    con4b3++
                    editor.putInt("con4b3", con4b3)
                    editor.apply()
                }

                "b5" -> {
                    con5b3++
                    editor.putInt("con5b3", con5b3)
                    editor.apply()
                }

                "b6" -> {
                    con6b3++
                    editor.putInt("con6a3", con6b3)
                    editor.apply()
                }

                "b7" -> {
                    con7b3++
                    editor.putInt("con7b3", con7b3)
                    editor.apply()
                }

                "c7" -> {
                    con7c3++
                    editor.putInt("con7c3", con7c3)
                    editor.apply()
                }

                "b8" -> {
                    con8b3++
                    editor.putInt("con8b3", con8b3)
                    editor.apply()
                }

                "b9" -> {
                    con9b3++
                    editor.putInt("con9b3", con9b3)
                    editor.apply()
                }

                "b10" -> {
                    con10b3++
                    editor.putInt("con10b3", con10b3)
                    editor.apply()
                }

                "b11" -> {
                    con11b3++
                    editor.putInt("con11b3", con11b3)
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
        val intent = Intent(this, Voto_Contraloria::class.java)
        startActivity(intent)
    }

    private fun navegarAInicioSesion() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }
}

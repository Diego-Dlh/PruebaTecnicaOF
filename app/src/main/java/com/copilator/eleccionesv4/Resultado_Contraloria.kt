package com.copilator.eleccionesv4

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Resultado_Contraloria : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var boton: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_contraloria)
        var contaC1a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1a1", 0)
        var contaC2a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2a1", 0)
        var contaC3a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3a1", 0)
        var contaC4a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4a1", 0)
        var contaC5a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5a1", 0)
        var contaC6a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6a1", 0)
        var contaC7a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7a1", 0)
        var contaC8a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8a1", 0)
        var contaC9a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9a1", 0)
        var contaC10a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10a1", 0)
        var contaC11a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11a1", 0)
        var contaC1b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1b1", 0)
        var contaC2b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2b1", 0)
        var contaC3b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3b1", 0)
        var contaC4b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4b1", 0)
        var contaC5b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5b1", 0)
        var contaC6b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6b1", 0)
        var contaC7b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7b1", 0)
        var contaC7c1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7c1", 0)
        var contaC8b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8b1", 0)
        var contaC9b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9b1", 0)
        var contaC10b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10b1", 0)
        var contaC11b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11b1", 0)
        var totalcanC1: Int = contaC1a1 + contaC2a1 + contaC3a1 + contaC4a1 + contaC5a1 + contaC6a1 + contaC7a1 + contaC8a1 + contaC9a1 + contaC10a1 + contaC11a1
        + contaC1b1 + contaC2b1 + contaC3b1 + contaC4b1 + contaC5b1 + contaC6b1 + contaC7b1 + contaC7c1 + contaC8b1 + contaC9b1 + contaC10b1 + contaC11b1

        var contaC1a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1a2", 0)
        var contaC2a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2a2", 0)
        var contaC3a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3a2", 0)
        var contaC4a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4a2", 0)
        var contaC5a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5a2", 0)
        var contaC6a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6a2", 0)
        var contaC7a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7a2", 0)
        var contaC8a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8a2", 0)
        var contaC9a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9a2", 0)
        var contaC10a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10a2", 0)
        var contaC11a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11a2", 0)
        var contaC1b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1b2", 0)
        var contaC2b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2b2", 0)
        var contaC3b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3b2", 0)
        var contaC4b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4b2", 0)
        var contaC5b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5b2", 0)
        var contaC6b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6b2", 0)
        var contaC7b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7b2", 0)
        var contaC7c2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7c2", 0)
        var contaC8b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8b2", 0)
        var contaC9b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9b2", 0)
        var contaC10b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10b2", 0)
        var contaC11b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11b2", 0)
        var totalcanC2: Int = contaC1a2 + contaC2a2 + contaC3a2 + contaC4a2 + contaC5a2 + contaC6a2 + contaC7a2 + contaC8a2 + contaC9a2 + contaC10a2 + contaC11a2
        + contaC1b2 + contaC2b2 + contaC3b2 + contaC4b2 + contaC5b2 + contaC6b2 + contaC7b2 + contaC7c2 + contaC8b2 + contaC9b2 + contaC10b2 + contaC11b2



        var contaC1a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1a3", 0)
        var contaC2a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2a3", 0)
        var contaC3a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3a3", 0)
        var contaC4a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4a3", 0)
        var contaC5a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5a3", 0)
        var contaC6a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6a3", 0)
        var contaC7a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7a3", 0)
        var contaC8a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8a3", 0)
        var contaC9a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9a3", 0)
        var contaC10a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10a3", 0)
        var contaC11a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11a3", 0)
        var contaC1b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1b3", 0)
        var contaC2b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2b3", 0)
        var contaC3b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3b3", 0)
        var contaC4b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4b3", 0)
        var contaC5b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5b3", 0)
        var contaC6b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6b3", 0)
        var contaC7b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7b3", 0)
        var contaC7c3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7c3", 0)
        var contaC8b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8b3", 0)
        var contaC9b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9b3", 0)
        var contaC10b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10b3", 0)
        var contaC11b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11b3", 0)

        var totalcanC3: Int = contaC1a3 + contaC2a3 + contaC3a3 + contaC4a3 + contaC5a3 + contaC6a3 + contaC7a3 + contaC8a3 + contaC9a3 + contaC10a3 + contaC11a3
        + contaC1b3 + contaC2b3 + contaC3b3 + contaC4b3 + contaC5b3 + contaC6b3 + contaC7b3 + contaC7c3 + contaC8b3 + contaC9b3 + contaC10b3 + contaC11b3




        // Inicializar variables y encontrar vistas
        val atras = findViewById<ImageButton>(R.id.Atras1)


        // Mostrar resultados en los TextView correspondientes

        findViewById<TextView>(R.id.vC1a1).text = contaC1a1.toString()
        findViewById<TextView>(R.id.vC2a1).text = contaC2a1.toString()
        findViewById<TextView>(R.id.vC3a1).text = contaC3a1.toString()
        findViewById<TextView>(R.id.vC4a1).text = contaC4a1.toString()
        findViewById<TextView>(R.id.vC5a1).text = contaC5a1.toString()
        findViewById<TextView>(R.id.vC6a1).text = contaC6a1.toString()
        findViewById<TextView>(R.id.vC7a1).text = contaC7a1.toString()
        findViewById<TextView>(R.id.vC8a1).text = contaC8a1.toString()
        findViewById<TextView>(R.id.vC9a1).text = contaC9a1.toString()
        findViewById<TextView>(R.id.vC10a1).text = contaC10a1.toString()
        findViewById<TextView>(R.id.vC11a1).text = contaC11a1.toString()
        findViewById<TextView>(R.id.vC1b1).text = contaC1b1.toString()
        findViewById<TextView>(R.id.vC2b1).text = contaC2b1.toString()
        findViewById<TextView>(R.id.vC3b1).text = contaC3b1.toString()
        findViewById<TextView>(R.id.vC4b1).text = contaC4b1.toString()
        findViewById<TextView>(R.id.vC5b1).text = contaC5b1.toString()
        findViewById<TextView>(R.id.vC6b1).text = contaC6b1.toString()
        findViewById<TextView>(R.id.vC7b1).text = contaC7b1.toString()
        findViewById<TextView>(R.id.vC7c1).text = contaC7c1.toString()
        findViewById<TextView>(R.id.vC8b1).text = contaC8b1.toString()
        findViewById<TextView>(R.id.vC9b1).text = contaC9b1.toString()
        findViewById<TextView>(R.id.vC10b1).text = contaC10b1.toString()
        findViewById<TextView>(R.id.vC11b1).text = contaC11b1.toString()

        findViewById<TextView>(R.id.vC1a2).text = contaC1a2.toString()
        findViewById<TextView>(R.id.vC2a2).text = contaC2a2.toString()
        findViewById<TextView>(R.id.vC3a2).text = contaC3a2.toString()
        findViewById<TextView>(R.id.vC4a2).text = contaC4a2.toString()
        findViewById<TextView>(R.id.vC5a2).text = contaC5a2.toString()
        findViewById<TextView>(R.id.vC6a2).text = contaC6a2.toString()
        findViewById<TextView>(R.id.vC7a2).text = contaC7a2.toString()
        findViewById<TextView>(R.id.vC8a2).text = contaC8a2.toString()
        findViewById<TextView>(R.id.vC9a2).text = contaC9a2.toString()
        findViewById<TextView>(R.id.vC10a2).text = contaC10a2.toString()
        findViewById<TextView>(R.id.vC11a2).text = contaC11a2.toString()
        findViewById<TextView>(R.id.vC1b2).text = contaC1b2.toString()
        findViewById<TextView>(R.id.vC2b2).text = contaC2b2.toString()
        findViewById<TextView>(R.id.vC3b2).text = contaC3b2.toString()
        findViewById<TextView>(R.id.vC4b2).text = contaC4b2.toString()
        findViewById<TextView>(R.id.vC5b2).text = contaC5b2.toString()
        findViewById<TextView>(R.id.vC6b2).text = contaC6b2.toString()
        findViewById<TextView>(R.id.vC7b2).text = contaC7b2.toString()
        findViewById<TextView>(R.id.vC7c2).text = contaC7c2.toString()
        findViewById<TextView>(R.id.vC8b2).text = contaC8b2.toString()
        findViewById<TextView>(R.id.vC9b2).text = contaC9b2.toString()
        findViewById<TextView>(R.id.vC10b2).text = contaC10b2.toString()
        findViewById<TextView>(R.id.vC11b2).text = contaC11b2.toString()


        findViewById<TextView>(R.id.vC1a3).text = contaC1a3.toString()
        findViewById<TextView>(R.id.vC2a3).text = contaC2a3.toString()
        findViewById<TextView>(R.id.vC3a3).text = contaC3a3.toString()
        findViewById<TextView>(R.id.vC4a3).text = contaC4a3.toString()
        findViewById<TextView>(R.id.vC5a3).text = contaC5a3.toString()
        findViewById<TextView>(R.id.vC6a3).text = contaC6a3.toString()
        findViewById<TextView>(R.id.vC7a3).text = contaC7a3.toString()
        findViewById<TextView>(R.id.vC8a3).text = contaC8a3.toString()
        findViewById<TextView>(R.id.vC9a3).text = contaC9a3.toString()
        findViewById<TextView>(R.id.vC10a3).text = contaC10a3.toString()
        findViewById<TextView>(R.id.vC11a3).text = contaC11a3.toString()
        findViewById<TextView>(R.id.vC1b3).text = contaC1b3.toString()
        findViewById<TextView>(R.id.vC2b3).text = contaC2b3.toString()
        findViewById<TextView>(R.id.vC3b3).text = contaC3b3.toString()
        findViewById<TextView>(R.id.vC4b3).text = contaC4b3.toString()
        findViewById<TextView>(R.id.vC5b3).text = contaC5b3.toString()
        findViewById<TextView>(R.id.vC6b3).text = contaC6b3.toString()
        findViewById<TextView>(R.id.vC7b3).text = contaC7b3.toString()
        findViewById<TextView>(R.id.vC7c3).text = contaC7c3.toString()
        findViewById<TextView>(R.id.vC8b3).text = contaC8b3.toString()
        findViewById<TextView>(R.id.vC9b3).text = contaC9b3.toString()
        findViewById<TextView>(R.id.vC10b3).text = contaC10b3.toString()
        findViewById<TextView>(R.id.vC11b3).text = contaC11b3.toString()

        findViewById<TextView>(R.id.totalC1).text = totalcanC1.toString()
        findViewById<TextView>(R.id.totalC2).text = totalcanC2.toString()
        findViewById<TextView>(R.id.totalC3).text = totalcanC3.toString()



        // Establecer oyentes de clic para los botones
        atras.setOnClickListener {
            val intent = Intent(this, Resultado_Personeria::class.java)
            startActivity(intent)
        }
    }
}
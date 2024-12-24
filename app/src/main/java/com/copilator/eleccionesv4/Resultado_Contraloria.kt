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

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_contraloria)

        var contaC0a1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0a1", 0)
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
        var contaC0b1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0b1", 0)
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
        var contaCkinder1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conCkinder1", 0)
        var contaC6c1 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6c1", 0)
        // List of all vote counts (including new variables)
        var totalVotosC1 = 0
        val allVoteCounts1 = listOf(
            contaC6c1,contaCkinder1,contaC0b1,contaC0a1,contaC1a1, contaC2a1, contaC3a1, contaC4a1, contaC5a1, contaC6a1, contaC7a1, contaC8a1, contaC9a1, contaC10a1, contaC11a1,
            contaC1b1, contaC2b1, contaC3b1, contaC4b1, contaC5b1, contaC6b1, contaC7b1, contaC7c1, contaC8b1, contaC9b1, contaC10b1, contaC11b1,
            // Add more lists here if you have variables for other grades (e.g., conta1a2, conta2a2, ...)
        )
        totalVotosC1 = allVoteCounts1.sum()

        var contaC0a2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0a2", 0)
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
        var contaC0b2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0b2", 0)
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
        var contaCkinder2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conCkinder2", 0)
        var contaC6c2 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6c2", 0)

        // List of all vote counts (including new variables)
        var totalVotosC2 = 0
        val allVoteCounts2 = listOf(
            contaC6c2,contaCkinder2,contaC0b2,contaC0a2,contaC1a2, contaC2a2, contaC3a2, contaC4a2, contaC5a2, contaC6a2, contaC7a2, contaC8a2, contaC9a2, contaC10a2, contaC11a2,
            contaC1b2, contaC2b2, contaC3b2, contaC4b2, contaC5b2, contaC6b2, contaC7b2, contaC7c2, contaC8b2, contaC9b2, contaC10b2, contaC11b2,
            // Add more lists here if you have variables for other grades (e.g., conta1a2, conta2a2, ...)
        )

// Calculate total votes
        totalVotosC2 = allVoteCounts2.sum()

        var contaC0a3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0a3", 0)
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
        var contaC0b3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0b3", 0)
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
        var contaCkinder3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conCkinder3", 0)
        var contaC6c3 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6c2", 0)

        var totalVotosC3 = 0
        val allVoteCounts3 = listOf(
            contaC6c3,contaCkinder3,contaC0b3,contaC0a3,contaC1a3, contaC2a3, contaC3a3, contaC4a3, contaC5a3, contaC6a3, contaC7a3, contaC8a3, contaC9a3, contaC10a3, contaC11a3,
            contaC1b3, contaC2b3, contaC3b3, contaC4b3, contaC5b3, contaC6b3, contaC7b3, contaC7c3, contaC8b3, contaC9b3, contaC10b3, contaC11b3,
            // Add more lists here if you have variables for other grades (e.g., conta1a2, conta2a2, ...)
        )
// Calculate total votes
        totalVotosC3 = allVoteCounts3.sum()

        // Calculate total votes
        totalVotosC2 = allVoteCounts2.sum()

        var contaC0a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0a4", 0)
        var contaC1a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1a4", 0)
        var contaC2a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2a4", 0)
        var contaC3a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3a4", 0)
        var contaC4a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4a4", 0)
        var contaC5a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5a4", 0)
        var contaC6a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6a4", 0)
        var contaC7a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7a4", 0)
        var contaC8a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8a4", 0)
        var contaC9a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9a4", 0)
        var contaC10a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10a4", 0)
        var contaC11a4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11a4", 0)
        var contaC0b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC0b4", 0)
        var contaC1b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC1b4", 0)
        var contaC2b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC2b4", 0)
        var contaC3b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC3b4", 0)
        var contaC4b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC4b4", 0)
        var contaC5b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC5b4", 0)
        var contaC6b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6b4", 0)
        var contaC7b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7b4", 0)
        var contaC7c4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC7c4", 0)
        var contaC8b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC8b4", 0)
        var contaC9b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC9b4", 0)
        var contaC10b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC10b4", 0)
        var contaC11b4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC11b4", 0)
        var contaCkinder4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conCkinder4", 0)
        var contaC6c4 = getSharedPreferences("contadorContralor", Context.MODE_PRIVATE).getInt("conC6c4", 0)

        var totalVotosC4 = 0
        val allVoteCounts4 = listOf(
            contaC6c4,contaCkinder4,contaC0b4,contaC0a4,contaC1a4, contaC2a4, contaC3a4, contaC4a4, contaC5a4, contaC6a4, contaC7a4, contaC8a4, contaC9a4, contaC10a4, contaC11a4,
            contaC1b4, contaC2b4, contaC3b4, contaC4b4, contaC5b4, contaC6b4, contaC7b4, contaC7c4, contaC8b4, contaC9b4, contaC10b4, contaC11b4,

        )
// Calculate total votes
        totalVotosC4 = allVoteCounts4.sum()




        // Inicializar variables y encontrar vistas
        val atras = findViewById<ImageButton>(R.id.Atras1)


        // Mostrar resultados en los TextView correspondientes
        findViewById<TextView>(R.id.vC0a1).text = contaC0a1.toString()
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
        findViewById<TextView>(R.id.vC0b1).text = contaC0b1.toString()
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
        findViewById<TextView>(R.id.Ckin1).text = contaCkinder1.toString()
        findViewById<TextView>(R.id.vC6c1).text = contaC6c1.toString()

        findViewById<TextView>(R.id.vC0a2).text = contaC0a2.toString()
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
        findViewById<TextView>(R.id.vC0b2).text = contaC0b2.toString()
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
        findViewById<TextView>(R.id.Ckin2).text = contaCkinder2.toString()
        findViewById<TextView>(R.id.vC6c2).text = contaC6c2.toString()

        findViewById<TextView>(R.id.vC0a3).text = contaC0a3.toString()
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
        findViewById<TextView>(R.id.vC0b3).text = contaC0b3.toString()
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
        findViewById<TextView>(R.id.Ckin3).text = contaCkinder3.toString()
        findViewById<TextView>(R.id.vC6c3).text = contaC6c3.toString()

        findViewById<TextView>(R.id.vC0a4).text = contaC0a4.toString()
        findViewById<TextView>(R.id.vC1a4).text = contaC1a4.toString()
        findViewById<TextView>(R.id.vC2a4).text = contaC2a4.toString()
        findViewById<TextView>(R.id.vC3a4).text = contaC3a4.toString()
        findViewById<TextView>(R.id.vC4a4).text = contaC4a4.toString()
        findViewById<TextView>(R.id.vC5a4).text = contaC5a4.toString()
        findViewById<TextView>(R.id.vC6a4).text = contaC6a4.toString()
        findViewById<TextView>(R.id.vC7a4).text = contaC7a4.toString()
        findViewById<TextView>(R.id.vC8a4).text = contaC8a4.toString()
        findViewById<TextView>(R.id.vC9a4).text = contaC9a4.toString()
        findViewById<TextView>(R.id.vC10a4).text = contaC10a4.toString()
        findViewById<TextView>(R.id.vC11a4).text = contaC11a4.toString()
        findViewById<TextView>(R.id.vC0b4).text = contaC0b4.toString()
        findViewById<TextView>(R.id.vC1b4).text = contaC1b4.toString()
        findViewById<TextView>(R.id.vC2b4).text = contaC2b4.toString()
        findViewById<TextView>(R.id.vC3b4).text = contaC3b4.toString()
        findViewById<TextView>(R.id.vC4b4).text = contaC4b4.toString()
        findViewById<TextView>(R.id.vC5b4).text = contaC5b4.toString()
        findViewById<TextView>(R.id.vC6b4).text = contaC6b4.toString()
        findViewById<TextView>(R.id.vC7b4).text = contaC7b4.toString()
        findViewById<TextView>(R.id.vC7c4).text = contaC7c4.toString()
        findViewById<TextView>(R.id.vC8b4).text = contaC8b4.toString()
        findViewById<TextView>(R.id.vC9b4).text = contaC9b4.toString()
        findViewById<TextView>(R.id.vC10b4).text = contaC10b4.toString()
        findViewById<TextView>(R.id.vC11b4).text = contaC11b4.toString()
        findViewById<TextView>(R.id.Ckin4).text = contaCkinder4.toString()
        findViewById<TextView>(R.id.vC6c4).text = contaC6c4.toString()

        findViewById<TextView>(R.id.totalC1).text = totalVotosC1.toString()
        findViewById<TextView>(R.id.totalC2).text = totalVotosC2.toString()
        findViewById<TextView>(R.id.totalC3).text = totalVotosC3.toString()
        findViewById<TextView>(R.id.totalC4).text = totalVotosC4.toString()



        // Establecer oyentes de clic para los botones
        atras.setOnClickListener {
            val intent = Intent(this, Resultado_Personeria::class.java)
            startActivity(intent)
        }
    }
}
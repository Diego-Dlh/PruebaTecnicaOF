package com.copilator.eleccionesv4

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Resultado_Personeria : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_personeria)

        var conta1a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1a1", 0)
        var conta2a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2a1", 0)
        var conta3a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3a1", 0)
        var conta4a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4a1", 0)
        var conta5a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5a1", 0)
        var conta6a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6a1", 0)
        var conta7a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7a1", 0)
        var conta8a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8a1", 0)
        var conta9a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9a1", 0)
        var conta10a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10a1", 0)
        var conta11a1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11a1", 0)
        var conta1b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1b1", 0)
        var conta2b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2b1", 0)
        var conta3b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3b1", 0)
        var conta4b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4b1", 0)
        var conta5b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5b1", 0)
        var conta6b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6b1", 0)
        var conta7b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7b1", 0)
        var conta7c1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7c1", 0)
        var conta8b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8b1", 0)
        var conta9b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9b1", 0)
        var conta10b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10b1", 0)
        var conta11b1 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11b1", 0)

        var totalVotos1 = 0

// List of all vote counts (including new variables)
        val allVoteCounts1 = listOf(
            conta1a1, conta2a1, conta3a1, conta4a1, conta5a1, conta6a1, conta7a1, conta8a1, conta9a1, conta10a1, conta11a1,
            conta1b1, conta2b1, conta3b1, conta4b1, conta5b1, conta6b1, conta7b1, conta7c1, conta8b1, conta9b1, conta10b1, conta11b1,
            // Add more lists here if you have variables for other grades (e.g., conta1a2, conta2a2, ...)
        )

// Calculate total votes
        totalVotos1 = allVoteCounts1.sum()

// Print the total votes (optional)
        println("Total Votos: $totalVotos1")


        var conta1a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1a2", 0)
        var conta2a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2a2", 0)
        var conta3a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3a2", 0)
        var conta4a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4a2", 0)
        var conta5a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5a2", 0)
        var conta6a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6a2", 0)
        var conta7a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7a2", 0)
        var conta8a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8a2", 0)
        var conta9a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9a2", 0)
        var conta10a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10a2", 0)
        var conta11a2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11a2", 0)
        var conta1b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1b2", 0)
        var conta2b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2b2", 0)
        var conta3b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3b2", 0)
        var conta4b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4b2", 0)
        var conta5b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5b2", 0)
        var conta6b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6b2", 0)
        var conta7b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7b2", 0)
        var conta7c2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7c2", 0)
        var conta8b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8b2", 0)
        var conta9b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9b2", 0)
        var conta10b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10b2", 0)
        var conta11b2 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11b2", 0)

        var totalVotos2 = 0

// Lista de todas las variables de conteo de votos
        val allVoteCounts2: List<Int> = listOf(
            conta1a2, conta2a2, conta3a2, conta4a2, conta5a2, conta6a2, conta7a2, conta8a2, conta9a2, conta10a2, conta11a2,
            conta1b2, conta2b2, conta3b2, conta4b2, conta5b2, conta6b2, conta7b2, conta7c2, conta8b2, conta9b2, conta10b2, conta11b2
        )

// Recorre la lista y suma todos los conteos de votos
        totalVotos2 = allVoteCounts2.sum()

// Imprime los votos totales (opcional)
        println("Total Votos: $totalVotos2")




        var conta1a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1a3", 0)
        var conta2a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2a3", 0)
        var conta3a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3a3", 0)
        var conta4a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4a3", 0)
        var conta5a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5a3", 0)
        var conta6a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6a3", 0)
        var conta7a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7a3", 0)
        var conta8a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8a3", 0)
        var conta9a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9a3", 0)
        var conta10a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10a3", 0)
        var conta11a3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11a3", 0)
        var conta1b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con1b3", 0)
        var conta2b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con2b3", 0)
        var conta3b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con3b3", 0)
        var conta4b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con4b3", 0)
        var conta5b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con5b3", 0)
        var conta6b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con6b3", 0)
        var conta7b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7b3", 0)
        var conta7c3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con7c3", 0)
        var conta8b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con8b3", 0)
        var conta9b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con9b3", 0)
        var conta10b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con10b3", 0)
        var conta11b3 = getSharedPreferences("contador", Context.MODE_PRIVATE).getInt("con11b3", 0)

        var totalcan3: Int = conta1a3 + conta2a3 + conta3a3 + conta4a3 + conta5a3 + conta6a3 + conta7a3 + conta8a3 + conta9a3 + conta10a3 + conta11a3
        + conta1b3 + conta2b3 + conta3b3 + conta4b3 + conta5b3 + conta6b3 + conta7b3 + conta7c3 + conta8b3 + conta9b3 + conta10b3 + conta11b3

        var totalVotos3 = 0

// List of all vote counts (including new variables)
        val allVoteCounts3 = listOf(
            conta1a3,conta2a3,conta3a3,conta4a3,conta5a3,conta6a3,conta7a3,conta8a3,conta9a3,conta10a3,conta11a3,
            conta1b3,conta2b3,conta3b3,conta4b3,conta5b3,conta6b3,conta7b3,conta7c3,conta8b3,conta9b3,conta10b3,conta11b3,
        )
// Calculate total votes
        totalVotos3 = allVoteCounts3.sum()
// Print the total votes (optional)
        println("Total Votos: $totalVotos3")





        // Inicializar variables y encontrar vistas
        val siguiente = findViewById<ImageButton>(R.id.Siguien)
        val home = findViewById<ImageButton>(R.id.homePer)


        // Mostrar resultados en los TextView correspondientes

        findViewById<TextView>(R.id.v1a1).text = conta1a1.toString()
        findViewById<TextView>(R.id.v2a1).text = conta2a1.toString()
        findViewById<TextView>(R.id.v3a1).text = conta3a1.toString()
        findViewById<TextView>(R.id.v4a1).text = conta4a1.toString()
        findViewById<TextView>(R.id.v5a1).text = conta5a1.toString()
        findViewById<TextView>(R.id.v6a1).text = conta6a1.toString()
        findViewById<TextView>(R.id.v7a1).text = conta7a1.toString()
        findViewById<TextView>(R.id.v8a1).text = conta8a1.toString()
        findViewById<TextView>(R.id.v9a1).text = conta9a1.toString()
        findViewById<TextView>(R.id.v10a1).text = conta10a1.toString()
        findViewById<TextView>(R.id.v11a1).text = conta11a1.toString()
        findViewById<TextView>(R.id.v1b1).text = conta1b1.toString()
        findViewById<TextView>(R.id.v2b1).text = conta2b1.toString()
        findViewById<TextView>(R.id.v3b1).text = conta3b1.toString()
        findViewById<TextView>(R.id.v4b1).text = conta4b1.toString()
        findViewById<TextView>(R.id.v5b1).text = conta5b1.toString()
        findViewById<TextView>(R.id.v6b1).text = conta6b1.toString()
        findViewById<TextView>(R.id.v7b1).text = conta7b1.toString()
        findViewById<TextView>(R.id.v7c1).text = conta7c1.toString()
        findViewById<TextView>(R.id.v8b1).text = conta8b1.toString()
        findViewById<TextView>(R.id.v9b1).text = conta9b1.toString()
        findViewById<TextView>(R.id.v10b1).text = conta10b1.toString()
        findViewById<TextView>(R.id.v11b1).text = conta11b1.toString()

        findViewById<TextView>(R.id.v1a2).text = conta1a2.toString()
        findViewById<TextView>(R.id.v2a2).text = conta2a2.toString()
        findViewById<TextView>(R.id.v3a2).text = conta3a2.toString()
        findViewById<TextView>(R.id.v4a2).text = conta4a2.toString()
        findViewById<TextView>(R.id.v5a2).text = conta5a2.toString()
        findViewById<TextView>(R.id.v6a2).text = conta6a2.toString()
        findViewById<TextView>(R.id.v7a2).text = conta7a2.toString()
        findViewById<TextView>(R.id.v8a2).text = conta8a2.toString()
        findViewById<TextView>(R.id.v9a2).text = conta9a2.toString()
        findViewById<TextView>(R.id.v10a2).text = conta10a2.toString()
        findViewById<TextView>(R.id.v11a2).text = conta11a2.toString()
        findViewById<TextView>(R.id.v1b2).text = conta1b2.toString()
        findViewById<TextView>(R.id.v2b2).text = conta2b2.toString()
        findViewById<TextView>(R.id.v3b2).text = conta3b2.toString()
        findViewById<TextView>(R.id.v4b2).text = conta4b2.toString()
        findViewById<TextView>(R.id.v5b2).text = conta5b2.toString()
        findViewById<TextView>(R.id.v6b2).text = conta6b2.toString()
        findViewById<TextView>(R.id.v7b2).text = conta7b2.toString()
        findViewById<TextView>(R.id.v7c2).text = conta7c2.toString()
        findViewById<TextView>(R.id.v8b2).text = conta8b2.toString()
        findViewById<TextView>(R.id.v9b2).text = conta9b2.toString()
        findViewById<TextView>(R.id.v10b2).text = conta10b2.toString()
        findViewById<TextView>(R.id.v11b2).text = conta11b2.toString()


        findViewById<TextView>(R.id.v1a3).text = conta1a3.toString()
        findViewById<TextView>(R.id.v2a3).text = conta2a3.toString()
        findViewById<TextView>(R.id.v3a3).text = conta3a3.toString()
        findViewById<TextView>(R.id.v4a3).text = conta4a3.toString()
        findViewById<TextView>(R.id.v5a3).text = conta5a3.toString()
        findViewById<TextView>(R.id.v6a3).text = conta6a3.toString()
        findViewById<TextView>(R.id.v7a3).text = conta7a3.toString()
        findViewById<TextView>(R.id.v8a3).text = conta8a3.toString()
        findViewById<TextView>(R.id.v9a3).text = conta9a3.toString()
        findViewById<TextView>(R.id.v10a3).text = conta10a3.toString()
        findViewById<TextView>(R.id.v11a3).text = conta11a3.toString()
        findViewById<TextView>(R.id.v1b3).text = conta1b3.toString()
        findViewById<TextView>(R.id.v2b3).text = conta2b3.toString()
        findViewById<TextView>(R.id.v3b3).text = conta3b3.toString()
        findViewById<TextView>(R.id.v4b3).text = conta4b3.toString()
        findViewById<TextView>(R.id.v5b3).text = conta5b3.toString()
        findViewById<TextView>(R.id.v6b3).text = conta6b3.toString()
        findViewById<TextView>(R.id.v7b3).text = conta7b3.toString()
        findViewById<TextView>(R.id.v7c3).text = conta7c3.toString()
        findViewById<TextView>(R.id.v8b3).text = conta8b3.toString()
        findViewById<TextView>(R.id.v9b3).text = conta9b3.toString()
        findViewById<TextView>(R.id.v10b3).text = conta10b3.toString()
        findViewById<TextView>(R.id.v11b3).text = conta11b3.toString()

        findViewById<TextView>(R.id.total1).text = totalVotos1.toString()
        findViewById<TextView>(R.id.total2).text = totalVotos2.toString()
        findViewById<TextView>(R.id.total3).text = totalVotos3.toString()

        // Establecer oyentes de clic para los botones
        siguiente.setOnClickListener {
            val intent = Intent(this, Resultado_Contraloria::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            val intent = Intent(this, Menu_Admin::class.java)
            startActivity(intent)
        }



    }
}

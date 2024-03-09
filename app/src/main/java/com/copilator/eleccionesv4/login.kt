package com.copilator.eleccionesv4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class login : AppCompatActivity() {
    private lateinit var passwordEditText: EditText
    private var password = "1234" // Contraseña predeterminada

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        passwordEditText = findViewById(R.id.passwordEditText)

        passwordEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val enteredPassword = s.toString()

                if (enteredPassword == password) {
                    // La contraseña coincide, inicia la actividad Usuario
                    val intent = Intent(this@login, Menu_Admin::class.java)
                    startActivity(intent)
                } else {
                    // Mostrar mensaje de error
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }
}

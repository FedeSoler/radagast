package com.example.listado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalles.*

class detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val psicologo = intent.getSerializableExtra("psi") as Psicologo

        adtvnombre.text = getString(R.string.nombre, psicologo.nombre)
        adtvmatricula.text = getString(R.string.matricula, psicologo.matricula.toString())
    }
}

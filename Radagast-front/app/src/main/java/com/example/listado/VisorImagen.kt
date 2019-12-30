package com.example.listado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_visor_imagen.*

class VisorImagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val psicologo = intent.getSerializableExtra("psi") as Psicologo

        avivlpsicoloco.setImageResource(psicologo.idImagen)
    }
}

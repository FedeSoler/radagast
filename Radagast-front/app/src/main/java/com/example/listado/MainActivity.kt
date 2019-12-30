package com.example.listado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amRvPsicologos.layoutManager = LinearLayoutManager(this)
        amRvPsicologos.adapter = AdaptadorPsicologos(generarDatosPrueba(),this)
    }

    private fun generarDatosPrueba() :ArrayList<Psicologo>{
        val lista = ArrayList<Psicologo>()
        lista.add(Psicologo(R.drawable.nacho, "Ignacio Randazzo", 3.8,"Cordoba, Capital",45184))
        lista.add(Psicologo(R.drawable.fac, "Facundo Montenegro",4.5,"Cordoba, Capital",48474))
        lista.add(Psicologo(R.drawable.fed,"Federico Soler",3.8,"Cordoba, Capital",44870))
        lista.add(Psicologo(R.drawable.gonzalo,"Gonzalo Catrina",5.0,"Cordoba, Capital",23232))
        lista.add(Psicologo(R.drawable.pachi,"Agustin Arce",3.0,"Cordoba, Capital",54848))
        lista.add(Psicologo(R.drawable.renzo,"Renzo Andres",3.7,"Cordoba, Capital",44477))
        lista.add(Psicologo(R.drawable.hernan,"Hernan Escudero",1.0,"Cordoba, Capital",77111))
        return lista
    }
}

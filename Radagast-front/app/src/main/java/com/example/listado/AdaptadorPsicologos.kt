package com.example.listado

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.elemento_lista_psicologo.view.*

class AdaptadorPsicologos(private var lista: ArrayList<Psicologo>,private var contexto: Context) :RecyclerView.Adapter<AdaptadorPsicologos.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista_psicologo, parent, false), contexto)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }


    class ViewHolder(var vista: View, var contexto: Context) : RecyclerView.ViewHolder(vista){
        fun bind(psicologo: Psicologo){
            vista.elpivPsicologo.setImageResource(psicologo.idImagen)
            vista.elpNombre.text = psicologo.nombre
            vista.elpLocal.text = psicologo.localidad
            vista.elpCalif.rating = psicologo.calificacion.toFloat()

            vista.elpivPsicologo.setOnClickListener{
                contexto.startActivity(Intent(contexto, VisorImagen::class.java).putExtra("psi",psicologo))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, detalles::class.java).putExtra("psi",psicologo))
            }

        }

    }
}
package com.example.listado

import java.io.Serializable

data class Psicologo (
    var idImagen: Int,
    var nombre: String,
    var calificacion: Double,
    var localidad: String,
    var matricula: Int
    ) : Serializable

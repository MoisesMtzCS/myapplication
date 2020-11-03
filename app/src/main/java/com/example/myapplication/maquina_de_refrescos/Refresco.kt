package com.example.myapplication.maquina_de_refrescos

data class Refresco(
    val id: Int,
    val marca: String,
    val tamanio: String,
    var precio: Int
) {
    /**
     *calcula si el los id del los refrescos son los mismos
     */
    fun esElMismoRefresco(refresco: Refresco): Boolean {
        return id == refresco.id
    }

    /**
     * calcula si los refrescos son del mismo tipo
     */
    fun esElMismoTipoDeRefresco(refresco: Refresco): Boolean {
        val esLaMismaMarca: Boolean = marca == refresco.marca
        val esElMismoTamanio: Boolean = tamanio == refresco.tamanio
        val esElMismoTipo: Boolean = esLaMismaMarca && esElMismoTamanio
        return esElMismoTipo
    }

}
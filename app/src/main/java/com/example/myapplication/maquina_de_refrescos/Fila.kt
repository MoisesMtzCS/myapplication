package com.example.myapplication.maquina_de_refrescos

import kotlin.system.exitProcess

data class Fila(
    val codigo: Int,
    val maximoDeRefrescos: Int,
    var refresco: Refresco
) {
    private val refrescos: ArrayList<Refresco> = ArrayList(maximoDeRefrescos)

    val refrescosDisponibles: Int get() = refrescos.size
    val precioDelRefresco: Int get() = refresco.precio

    /**
     *muestra el precio de refresco
     */
    fun muestraPrecio() {
        println("El precio del refersco es: $precioDelRefresco")
    }

    public val codigos: ArrayList<Fila> = ArrayList(codigo)

    /**
     *impreme en patalla la lista de refrescos
     */
    fun muestraRefrescos() {
        println(refrescos)
    }

    /**
     *rellena una fila con una una lista de refersco
     */
    fun rellenar(refrescos: List<Refresco>) {
        val refrescoErroneo: Refresco? = refrescos.firstOrNull(::esUnRefrescoErroneo)
        if (refrescoErroneo == null) {
            // Quiere decir que todos los refrescos son del tipo que mi refresco de refencia
            this.refrescos.addAll(refrescos)
        } else {
            // Si al menos uno no fue del mismo tipo que mi refresco de refencia
            println("La lista de refrescos no fue aceptada")
            exitProcess(0)
        }
    }

    /**
     *Indica si un refresco es del mismo tipo que el de la refrerencia
     */
    private fun esUnRefrescoErroneo(refresco: Refresco): Boolean {
        val esDelMismoTipo: Boolean = this.refresco.esElMismoTipoDeRefresco(refresco)
        return !esDelMismoTipo
    }

    /**
     *Indica si hay almenos un refresco en el inventario.
     */
    fun hayRefrescoEnInventario(): Boolean {
        return refrescosDisponibles > 0
    }

    /**
     *Quita un refresco seleccionado del inventario
     */
    @ExperimentalStdlibApi
    fun darRefresco(refresco: Refresco) {
        val refrescoParaDar = refrescos.removeFirst()
    }

}
package com.example.myapplication.maquina_de_refrescos

class MaquinaDeRefrescos(
    val filas: List<Fila>,
    private val caja: Caja
) {

    /**
     *al ingresar un codigo, regresa una Fila
     */
    fun obtenerFilaPorCodigo(codigo: Int): Fila? {
        return filas.firstOrNull { fila: Fila ->
            codigo == fila.codigo
        }
    }

}
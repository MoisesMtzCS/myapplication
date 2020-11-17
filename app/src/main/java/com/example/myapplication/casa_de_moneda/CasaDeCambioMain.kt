package com.example.myapplication.casa_de_moneda

/**
 *
 */
fun main(args: Array<String>) {
    val cambio1: Cambio = Cambio(Divisa.USD, Divisa.MXN, 23.50)
    val casaDeCambio = CasaDeCambio()
    casaDeCambio.agregarUnCambio(cambio1)
    casaDeCambio.agregarUnCambio(cambio1)
    casaDeCambio.muestraCambiosDisponibles()
}
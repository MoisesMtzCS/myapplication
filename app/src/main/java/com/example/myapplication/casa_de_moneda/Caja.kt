package com.example.myapplication.casa_de_moneda

import kotlin.collections.HashMap

class Caja(
    var dolaresEnCaja: Double,
    var pesosEnCaja: Double,
    var eurosEnCaja: Double,
    var librasEnCaja: Double,
    var dolarescanadiensesEnCaja: Double,
    var dineroIngresado: Double
) {

    val map: HashMap<Currency, Double> = HashMap()

    /**
     *
     */
    fun recibirDinero(dinero: Double, requiredCurrency: Currency) {

        val dineroEnCajaFeo = when (requiredCurrency) {
            Currency.USD -> dolaresEnCaja
            Currency.MXN -> pesosEnCaja
            Currency.YEN -> TODO()
            Currency.CAN -> dolarescanadiensesEnCaja
            Currency.LIB -> librasEnCaja
        }


        val dineroEnCajaPorDivisa = map[requiredCurrency]
        
        dolaresEnCaja += dinero
        pesosEnCaja += dinero
        eurosEnCaja += dinero
        librasEnCaja += dinero
        dolarescanadiensesEnCaja += dinero
        dineroIngresado = dinero
    }

    /**
     *
     */
    fun haySuficienteDineroDeLaDivisa(dinero: Double): Boolean {
         return dineroIngresado <= dinero

    }

    /**
     *
     */
    fun devolverDinero(dinero: Double) {
        dolaresEnCaja -= dinero
        pesosEnCaja -= dinero
        eurosEnCaja -= dinero
        librasEnCaja -= dinero
        dolarescanadiensesEnCaja -= dinero
        dineroIngresado -= dinero
    }

    /**
     *
     */
    fun conversionDeUnaDivisaPorOtra(dinero: Double) {
        TODO()
    }
}
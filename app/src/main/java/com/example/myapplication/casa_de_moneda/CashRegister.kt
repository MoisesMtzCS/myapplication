package com.example.myapplication.casa_de_moneda

import kotlin.collections.HashMap

/**var dolaresEnCaja: Double,
var pesosEnCaja: Double,
var eurosEnCaja: Double,
var dolarescanadiensesEnCaja: Double,*/

/**
 *
 */
class CashRegister(
    private var dineroEnCaja: HashMap<Currency, Double> = hashMapOf()

) {

    lateinit var dineroIngresado: Money
/*
    /**
     *
     */
    fun recibirDinero(money: Money, requiredCurrency: Currency) {
        // TODO: Validar que sea del mismo currency.
        // TODO: Hacer la suma del dinero actual con el recibido
        dineroIngresado = money

        dineroEnCaja.getOrDefault(Currency.USD, 0.0)

        val dineroEnCajaFeo = when (requiredCurrency) {
            Currency.USD -> dolaresEnCaja
            Currency.MXN -> pesosEnCaja
            Currency.CAN -> dolarescanadiensesEnCaja
            Currency.EUR -> eurosEnCaja

        }

        /**
         *
         */

        fun dineroEnCajaPorDivisa() {

        }
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
        dolarescanadiensesEnCaja -= dinero
        dineroIngresado -= dinero
    }

    /**
     *
     */
    fun conversionDeUnaDivisaPorOtra(dinero: Double) {
        TODO()
    }*/
}
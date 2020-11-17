package com.example.myapplication.casa_de_moneda

import com.example.myapplication.maquina_de_refrescos.Refresco
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

    /**
     *
     */
    fun recibirDinero(money: Money, requiredCurrency: Currency) {
        // TODO: Validar que sea del mismo currency.
        if (dineroIngresado.currency == requiredCurrency){

        }

        // TODO: Hacer la suma del dinero actual con el recibido
            dineroIngresado = money
    }

    /**
     *
     */

    fun sameCurrency(currency: Currency): Boolean {
        val isTheSameCurrency: Boolean = dineroIngresado.currency == currency
        return isTheSameCurrency
    }


    /*   dineroEnCaja.getOrDefault(Currency.USD, 0.0)

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
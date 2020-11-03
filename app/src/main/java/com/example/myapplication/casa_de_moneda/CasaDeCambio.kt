package com.example.myapplication.casa_de_moneda

/**
 *
 */
class CasaDeCambio(
    private val caja: Caja
) {

    /**
     *
     */
    fun procesoDeCambio(money: Money, currency: Currency): Money {
        val exchangeValue: Double = money.currency.exchange(currency)
        val requiredValue: Double = money.value * exchangeValue
        return Money(currency, requiredValue)
    }
}
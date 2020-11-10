package com.example.myapplication.casa_de_moneda

/**
 *
 */
class ExchangeHouse(
    private val cashRegister: CashRegister,
    private val availableCurrency: HashMap<Pair<Currency, Currency>, Double?> = hashMapOf(
        Pair(Currency.MXN, Currency.USD) to 0.049,
        Pair(Currency.MXN, Currency.EUR) to 0.041,
        Pair(Currency.USD, Currency.MXN) to 20.50
    )
) {

    fun print() {
        println(availableCurrency.toString())
    }

    /**
     *
     */
    fun exchange(money: Money, currency: Currency): Money {
        val currentCurrency: Currency = money.currency
        val key: Pair<Currency, Currency> = Pair(currentCurrency, currency)
        val currentExchange: Double? = availableCurrency.get(key)
        if (currentExchange == null) {
            println("El intercambio seleccionano no esta disponible")
            return money
        }
        val exchangeValue = money.value * currentExchange

        error("Not implemented")

    }

    /**
     *
     */
    fun changeProcess(money: Money, currency: Currency): Money {
        val exchangeValue: Double = money.currency.exchange(currency)
        val requiredValue: Double = money.value * exchangeValue
        return Money(currency, requiredValue)
    }

}
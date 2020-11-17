package com.example.myapplication.casa_de_moneda

fun main(args: Array<String>) {
    val cashRegister: CashRegister = CashRegister()
    val exchangeHouse: ExchangeHouse = ExchangeHouse(cashRegister)

    // Parametros ingresados por el usuario
    exchangeHouse.print()
    val originalCurrency: Currency = Currency.MXN
    val originalValue: Double = 100.0
    val requiredCurrency: Currency = Currency.USD

    // Ejecucion del algoritmo
    val originalMoney = Money(originalCurrency, originalValue)
    val requiredMoney = exchangeHouse.changeProcess(originalMoney, requiredCurrency)
    println(requiredMoney)

}
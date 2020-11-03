package com.example.myapplication.casa_de_moneda

fun main(args: Array<String>) {
    val caja : Caja = Caja(10.00,10.00,10.00,10.00,10.00,10.00)
    val casaDeCambio: CasaDeCambio = CasaDeCambio (caja)


    // Parametros ingresados por el usuario
    val originalCurrency: Currency = Currency.CAN
    val originalValue: Double = 100.0
    val requiredCurrency: Currency = Currency.YEN

    // Ejecucion del algoritmo
    val originalMoney = Money(originalCurrency, originalValue)
    val requiredMoney = casaDeCambio.procesoDeCambio(originalMoney, requiredCurrency)
    println(requiredMoney)

}
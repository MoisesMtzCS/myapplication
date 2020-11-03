package com.example.myapplication.maquina_de_refrescos

class Caja(
    private var dineroEnCaja: Int
) {
    /* Representa la suma total del dinero ingresado en la interaccion */
    var dineroIngresado: Int = 0


    /**
     * Recibe y almacena el [dinero] recibido como parametro.
     */
    fun recibirDinero(dinero: Int) {
        dineroEnCaja += dinero
        dineroIngresado = dinero

    }

    /**
     * regresa el dinero recibido como parametro
     */
    fun devolverDinero(dinero: Int) {
        dineroEnCaja -= dinero
        dineroIngresado -= dinero


    }

    /**
     * Calcula si el dinero en caja es suficiente para devolver cambio
     */
    fun hayCambio(precio: Int): Boolean {
        val cambio = dineroIngresado - precio
        return cambio <= dineroEnCaja
    }

    /**
     *regresa el dinero sobrante
     */
    fun devolverCambio(precio: Int) {
        val cambio = dineroIngresado - precio
        dineroEnCaja -= cambio
        println("su cambio es : $cambio")
    }

    /**
     * Imprime en consola el dinero que hay en caja
     */
    fun imprimeDineroEnCaja() {
        println("Dinero total en caja: $dineroEnCaja")
    }

    /**
     * Imprime en consola el dinero que hay en caja
     */
    fun imprimeDineroIngresado() {
        println("Dinero ingresado al momento: $dineroIngresado")
    }
}

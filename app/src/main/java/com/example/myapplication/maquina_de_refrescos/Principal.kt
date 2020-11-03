package com.example.myapplication.maquina_de_refrescos

import java.util.*

val scanner = Scanner(System.`in`)

@ExperimentalStdlibApi
fun main(args: Array<String>) {

    /**
     *
     */
    val refrescoReferencia1: Refresco =
        Refresco(
            1,
            "coca",
            "500ml",
            15
        )
    val refrescoReferencia2: Refresco =
        Refresco(
            2,
            "fanta",
            "500ml",
            12
        )
    val refrescoReferencia3: Refresco =
        Refresco(
            3,
            "mirinda",
            "500ml",
            13
        )
    val refrescoReferencia4: Refresco =
        Refresco(
            4,
            "sprite",
            "500ml",
            14
        )
    val refrescoReferencia5: Refresco =
        Refresco(
            5,
            "boing",
            "500ml",
            10
        )

    /**
     *
     */
    val fila1: Fila =
        Fila(
            1,
            10,
            refrescoReferencia1
        )
    fila1.rellenar(
        listOf(
            Refresco(
                6,
                "coca",
                "500ml",
                15
            ),
            Refresco(
                7,
                "coca",
                "500ml",
                15
            )
        )
    )
    val fila2: Fila =
        Fila(
            2,
            10,
            refrescoReferencia2
        )
    val fila3: Fila =
        Fila(
            3,
            10,
            refrescoReferencia3
        )
    val fila4: Fila =
        Fila(
            4,
            10,
            refrescoReferencia4
        )
    val fila5: Fila =
        Fila(
            5,
            10,
            refrescoReferencia5
        )

    /**
     *
     */
    val caja: Caja =
        Caja(100)
    val filas: List<Fila> = listOf(fila1, fila2, fila3, fila4, fila5)
    val maquina: MaquinaDeRefrescos =
        MaquinaDeRefrescos(
            filas,
            caja
        )
    /**
     *
     */

    // En este punto inicia la interaccion con el usuario
    loop@ do {
        val menu: String =
            "Selecciona una opción:\n1. Inciar proceso para comprar un refresco\n2. Salir"
        println(menu)
        var opcionSeleccionada: Int = 0
        try {
            opcionSeleccionada = scanner.nextInt()
        } catch (exeption: Exception) {
            println("Error codigo")
            return
        }
        when (opcionSeleccionada) {
            1 -> {
                /* Inciar proceso para comprar un refresco */

                /**
                 *
                 */
                println("Inserta codigo")

                var codigo: Int = 0
                try {
                    codigo = scanner.nextInt()
                } catch (exception: Exception) {
                    println("Error codigo: ${exception.javaClass.simpleName}")
                    return
                }

                val fila: Fila? = maquina.obtenerFilaPorCodigo(codigo)
                if (fila == null) {
                    println("Error codigo")
                    return
                }
                // En este punto es seguro que fila no es null
                if (fila.hayRefrescoEnInventario()) {
                    fila.muestraPrecio()
                } else {
                    println("El refresco no esta disponible")
                    continue@loop
                }

                /**
                 *
                 */
                println("Inserta dinero")

                val dinero: Int = scanner.nextInt()
                caja.recibirDinero(dinero)
                when {
                    caja.dineroIngresado == fila.precioDelRefresco -> {
                        fila.darRefresco(fila.refresco)
                        println("Gracias por su compra, vuelve pronto")
                    }
                    caja.dineroIngresado < fila.precioDelRefresco -> {
                        println("El dinero ingresado es insuficiente")
                        caja.devolverDinero(caja.dineroIngresado)
                    }
                    caja.hayCambio(fila.precioDelRefresco) -> {
                        caja.devolverCambio(fila.precioDelRefresco)
                        //fila.darRefresco(fila.refresco)
                        fila.darRefresco(fila.refresco)
                        println("gracias por su compra, vuelve pronto")
                    }
                    else -> {
                        println("Sin cambio")
                        caja.devolverDinero(caja.dineroIngresado)
                    }
                }

                caja.imprimeDineroEnCaja()
            }
            /**
             *
             */
            2 -> {
                // Mensaje de despedida
                println("Gracias bye")
            }
            else -> {
                // Mensaje de error "Opcion no valida"
                println("Opcion no valida")
            }
        }
    } while (opcionSeleccionada != 2)


}




package com.example.myapplication.casa_de_moneda

/**
 *
 */
enum class Currency {

    USD,

    MXN,

    EUR,

    CAN;


    /**
     * Retorna la equivalencia de la moneda actual a la moneda recibida.
     */
    fun exchange(currency: Currency): Double {
        if (this == USD && currency == MXN)
            return 21.45
        if (this == USD && currency == EUR)
            return 0.84
        if (this == USD && currency == CAN)
            return  1.30

        if (this == MXN && currency == USD)
            return 0.04670714619
        if (this == MXN && currency == EUR)
            return 0.041
        if (this == MXN && currency == CAN)
            return  0.063

        if (this == EUR && currency == USD)
            return  1.19
        if (this == EUR && currency == MXN)
            return 24.44
        if (this == EUR && currency == CAN)
            return 1.55

        if (this == CAN && currency == USD)
            return 0.77
        if (this == CAN && currency == MXN)
            return 15.80
        if (this == CAN && currency == EUR)
            return 0.65


        error("Invalid exchange")
    }
}
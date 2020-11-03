package com.example.myapplication.casa_de_moneda

/**
 *
 */
enum class Currency {

    USD,

    MXN,

    YEN,

    CAN,

    LIB;

    /**
     * Retorna la equivalencia de la moneda actual a la moneda recibida.
     */
    fun exchange(currency: Currency): Double {
        if (this == USD && currency == MXN)
            return 21.45
        if (this == USD && currency == YEN)
            return 4.89
        if (this == USD && currency == CAN)
            TODO()
        if (this == USD && currency == LIB)
            TODO()

        if (this == MXN && currency == USD)
            return 0.04670714619
        if (this == MXN && currency == YEN)
            return 4.89
        if (this == MXN && currency == CAN)
            TODO()
        if (this == MXN && currency == LIB)
            TODO()

        if (this == YEN && currency == USD)
            TODO()
        if (this == YEN && currency == MXN)
            return 0.20
        if (this == YEN && currency == CAN)
            return 0.013
        if (this == YEN && currency == LIB)
            TODO()

        if (this == CAN && currency == USD)
            TODO()
        if (this == CAN && currency == MXN)
            TODO()
        if (this == CAN && currency == YEN)
            return 79.25
        if (this == CAN && currency == LIB)
            TODO()

        if (this == LIB && currency == USD)
            TODO()
        if (this == LIB && currency == MXN)
            TODO()
        if (this == LIB && currency == YEN)
            TODO()
        if (this == LIB && currency == CAN)
            TODO()

        error("Invalid exchange")
    }

}
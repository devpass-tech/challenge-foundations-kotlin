package irrf

import Rangeable

data class IRRFRange(
    override val minimumValue: Double,
    override val maximumValue: Double,
    val rate: Double,
    val deductableParcel: Double
) : Rangeable
package inss

import Rangeable

data class INSSRange(
    override val minimumValue: Double,
    override val maximumValue: Double,
    val rate: Double,
    val owedValue: Double
) : Rangeable

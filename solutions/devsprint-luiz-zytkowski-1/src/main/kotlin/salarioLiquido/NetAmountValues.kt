package salarioLiquido

data class NetAmountResult (
    var aliquotInss: Double,
    var deductionInss: Double,
    var aliquotIrrf: Double,
    var deductionIrrf: Double,
    var valueNetAmount: Double,
    var valueGrossAmount: Double
)

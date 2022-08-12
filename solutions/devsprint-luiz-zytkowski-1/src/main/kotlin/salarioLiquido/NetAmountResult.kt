package salarioLiquido

data class NetAmountResult(
    var deductionInss: Double,
    var deductionIrrf: Double,
    var valueNetAmount: Double,
    var valueGrossAmount: Double,
)

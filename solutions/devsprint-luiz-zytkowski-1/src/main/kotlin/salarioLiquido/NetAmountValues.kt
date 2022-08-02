package salarioLiquido

data class NetAmountResult (
    var aliquotInss: Double,
    var deductionInss: Double,
    var aliquotIrrf: Double,
    var deductionIrrf: Double,
    var valueNetAmount: Double,
    var valueGrossAmount: Double
) {
    override fun toString(): String {
        return "O valor bruto do seu salário é ${valueGrossAmount}." +
                "Com o desconto do IRRF no valor ${deductionIrrf} valor equivalente ao seguinte percentual ${aliquotIrrf}, " +
                "junto ao desconto do INSS no valor de ${aliquotInss} valor equivalente ao seguinte percentual ${deductionInss}" +
                "O valor líquido do seu salário é de ${valueNetAmount}"
    }
}

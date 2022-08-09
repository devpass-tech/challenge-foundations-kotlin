package framework

import salarioLiquido.NetAmountResult

class LiquidSalaryCalculator {

    fun calculateLiquidSalary(
        aliquotInss: Double,
        deductionInss: Double,
        aliquotIrrf: Double,
        deductionIrrf: Double,
        valueGrossAmount: Double
    ): NetAmountResult {

        var valueNetAmount = valueGrossAmount - deductionInss - deductionIrrf

        return NetAmountResult(aliquotInss, deductionInss, aliquotIrrf, deductionIrrf, valueNetAmount, valueGrossAmount)
    }
}
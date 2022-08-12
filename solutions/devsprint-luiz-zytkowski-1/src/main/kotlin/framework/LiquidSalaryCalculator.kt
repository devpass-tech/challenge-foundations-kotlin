package framework

import salarioLiquido.NetAmountResult

class LiquidSalaryCalculator {

    fun calculateLiquidSalary(
        valueGrossAmount: Double
    ): NetAmountResult {

        var deductionInss = inss.INSSCalculator().totalDueValue(valueGrossAmount)
        var inssValueDeduction = valueGrossAmount - deductionInss
        var deductionIrrf = irrf.IRRFCalculator().calculateIRRF(inssValueDeduction)
        var valueNetAmount = valueGrossAmount - deductionInss - deductionIrrf

        return NetAmountResult(deductionInss, deductionIrrf, valueNetAmount, valueGrossAmount)
    }
}
package framework

import inss.INSSCalculator
import irrf.IRRFCalculator
import salarioLiquido.NetAmountResult

class LiquidSalaryCalculator(
    val inssCalculator: INSSCalculator = INSSCalculator(),
    val irrfCalculator: IRRFCalculator = IRRFCalculator(),
    ) {

    fun calculateLiquidSalary(
        valueGrossAmount: Double
    ): NetAmountResult {

        var deductionInss = inssCalculator.totalDueValue(valueGrossAmount)
        var inssValueDeduction = valueGrossAmount - deductionInss
        var deductionIrrf = irrfCalculator.calculateIRRF(inssValueDeduction)
        var valueNetAmount = valueGrossAmount - deductionInss - deductionIrrf

        return NetAmountResult(deductionInss, deductionIrrf, valueNetAmount, valueGrossAmount)
    }
}
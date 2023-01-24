package salarioLiquido

import inss.INSSCalculator
import irrf.IRRFCalculator

class LiquidSalaryCalculator(
    private val inssCalculator: INSSCalculator = INSSCalculator(),
    private val irrfCalculator: IRRFCalculator = IRRFCalculator()
) {

    fun calculate(grossSalary: Double): NetSalaryResult {
        val deductionINSS = inssCalculator.calculate(grossSalary)
        val deductionIRRF = irrfCalculator.calculateIRRF(grossSalary - deductionINSS)
        val netSalary = grossSalary - deductionINSS - deductionIRRF

        return NetSalaryResult(
            grossSalary = grossSalary,
            netSalary = netSalary,
            discountINSS = deductionINSS,
            discountIRRF = deductionIRRF
        )
    }
}

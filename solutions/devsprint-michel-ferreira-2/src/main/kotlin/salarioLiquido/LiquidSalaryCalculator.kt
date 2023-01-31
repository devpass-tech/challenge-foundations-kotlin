package salarioLiquido

import framework.Loggable
import framework.exceptionhandler.NotFoundException
import framework.interfaces.ICalculable
import inss.INSSCalculator
import irrf.IRRFCalculator

class LiquidSalaryCalculator : Loggable() {
    fun calculate(grossSalary: Double): NetSalaryResult {
        val deductionINSS = calculatorManager("INSS").calculate(grossSalary)
        val deductionIRRF = calculatorManager("IRRF").calculate(grossSalary - deductionINSS)
        val netSalary = grossSalary - deductionINSS - deductionIRRF

        return NetSalaryResult(
            grossSalary = grossSalary,
            netSalary = netSalary,
            discountINSS = deductionINSS,
            discountIRRF = deductionIRRF
        )
    }

    companion object {
        fun calculatorManager(type: String): ICalculable {
            return when (type) {
                "INSS" -> INSSCalculator()
                "IRRF" -> IRRFCalculator()
                else -> throw NotFoundException("Tipo de Cálculo não encontrado: $type")
            }
        }
    }
}
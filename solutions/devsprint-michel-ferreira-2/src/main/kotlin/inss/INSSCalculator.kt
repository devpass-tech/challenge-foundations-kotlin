package inss

import framework.exceptionhandler.NotFoundException
import framework.formatSalary
import framework.interfaces.ICalculable

class INSSCalculator : ICalculable {
    override fun calculate(salarioBruto: Double): Double {
        val listRanges = INSSRangeManager.getFaixas("/faixasINSS.txt")
        var owedValueAmount = 0.0
        var inssAmount = 0.0
        var rateValue: Double

        if (listRanges.isEmpty()) {
            throw NotFoundException("faixasINSS esta vazia ou inexistente")
        }

        listRanges.forEach {
            when {
                salarioBruto < 0 -> {
                    return 0.0
                }

                salarioBruto > it.minimumValue && salarioBruto < it.maximumValue -> {
                    inssAmount = (salarioBruto - it.minimumValue)
                    rateValue = inssAmount * (it.rate / 100)
                    return (rateValue + owedValueAmount).formatSalary()
                }

                salarioBruto > listRanges.last().maximumValue -> {
                    return listRanges.sumOf { faixa ->
                        faixa.owedValue
                    }.formatSalary(2)
                }
            }
            owedValueAmount += it.owedValue
        }
        return inssAmount
    }
}
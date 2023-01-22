package inss

import framework.exceptionhandler.NotFoundException
import kotlin.math.roundToInt

class INSSCalculator {
    fun calculate(salarioBruto: Double): Double {
        val listRanges = INSSRangeManager.getFaixas("/faixasINSS.txt")
        var owedValueAmount = 0.0
        var rateValue : Double
        var inssAmount = 0.0

        if (listRanges.isEmpty()) {
            throw NotFoundException("faixasINSS esta vazia ou inexistente")
        }

        listRanges.forEach {
            when {
                salarioBruto < 0 -> {
                    return 0.0
                }

                salarioBruto > it.minimumValue && salarioBruto < it.maximumValue -> {
                    inssAmount = (salarioBruto - it.minimumValue).toInt().toDouble()
                    rateValue = inssAmount * (it.rate / 100)
                    return (rateValue + owedValueAmount).roundToInt().toDouble()
                }

                salarioBruto > listRanges.last().maximumValue -> {
                    inssAmount = (salarioBruto - it.maximumValue).toInt().toDouble()
                    rateValue = inssAmount * (it.rate / 100)
                    return (rateValue + owedValueAmount).roundToInt().toDouble()
                }
            }
            owedValueAmount += it.owedValue
        }
        return inssAmount
    }
}
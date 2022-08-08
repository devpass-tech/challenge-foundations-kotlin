package inss

import framework.exceptions.InvalidRawSalaryException

class INSSCalculator() {
    private val inssRanges = INSSRangeManager.readFile("/faixasINSS.txt")
    private var range: Int = 0

    private fun selectRange(grossAmount: Double): Int {
        return when {
            (grossAmount > inssRanges[0].minimumValue && grossAmount <= inssRanges[0].maximumValue) -> 0
            (grossAmount >= inssRanges[1].minimumValue && grossAmount <= inssRanges[1].maximumValue) -> 1
            (grossAmount >= inssRanges[2].minimumValue && grossAmount <= inssRanges[2].maximumValue) -> 2
            (grossAmount >= inssRanges[3].minimumValue) -> 3
            else -> throw InvalidRawSalaryException("Por favor, insira um valor maior ou igual a 0")
        }
    }

    private fun dueValueRange(grossAmount: Double): Double {
        if (checkMaxValue(grossAmount)) {
            return inssRanges[3].owedValue
        } else {
            val rangeValue = grossAmount - inssRanges[range].minimumValue
            val dueValue = rangeValue * inssRanges[range].rate / 100
            return dueValue
        }
    }

    fun totalDueValue(grossAmount: Double): Double {
        range = selectRange(grossAmount)
        var previousValues = 0.0
        var i = 0
        while (i < range) {
            previousValues += inssRanges[i].owedValue
            i++
        }
        return (dueValueRange(grossAmount) + previousValues)
    }

    private fun checkMaxValue(salary: Double) = (salary > inssRanges[3].maximumValue)

}
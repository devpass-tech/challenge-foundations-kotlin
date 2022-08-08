package inss

class INSSCalculator(
    private val grossAmount: Double,
) {
    private val inssRanges = INSSRangeManager.readFile("/faixasINSS.txt")
    val range = selectRange()

    private fun selectRange(): Int {
        println(inssRanges)
        return when {
            (grossAmount > inssRanges[0].minimumValue && grossAmount <= inssRanges[0].maximumValue) -> 0
            (grossAmount >= inssRanges[1].minimumValue && grossAmount <= inssRanges[1].maximumValue) -> 1
            (grossAmount >= inssRanges[2].minimumValue && grossAmount <= inssRanges[2].maximumValue) -> 2
            (grossAmount >= inssRanges[3].minimumValue) -> 3

            else -> throw Exception("nao está em nenhuma faixa")
        }
    }

    private fun dueValueRange(): Double {
        if (checkMaxValue(grossAmount)) {
            return inssRanges[3].owedValue.also { println(it) }
        } else {
            val rangeValue = grossAmount - inssRanges[range].minimumValue
            val dueValue = rangeValue * inssRanges[range].rate / 100
            println("dueValueRange: $dueValue")
            return dueValue
        }
    }

    fun totalDueValue(): Double {
        var previousValues = 0.0
        var i: Int = 0
        while (i < range) {
            previousValues += inssRanges[i].owedValue
            i++
        }
        return (dueValueRange() + previousValues).also { println("totalDueValue: $it") }
    }

    private fun checkMaxValue(salary: Double) = (salary > inssRanges[3].maximumValue)

}

fun main() {
    println(INSSCalculator(3500.0).totalDueValue())
}
package inss

class INSSCalculator() {
    private val inssRanges = INSSRangeManager.readFile("/faixasINSS.txt")
    private var previousValue = 0.0

    private fun dueValueRange(grossAmount: Double): Double {
        val salary = checkMaxValue(grossAmount)
            inssRanges.forEach {
                if (salary >= it.minimumValue && salary <=it.maximumValue){
                    return (salary - it.minimumValue)*it.rate/100
                }else{
                    previousValue += it.owedValue
                }
            }
        return 0.0
    }

    fun totalDueValue(grossAmount: Double):Double{
        return dueValueRange(grossAmount)+previousValue
    }

    private fun checkMaxValue(salary: Double): Double{
        return if (salary > inssRanges.last().maximumValue){
            inssRanges.last().maximumValue
        }else{
            salary
        }
    }
}
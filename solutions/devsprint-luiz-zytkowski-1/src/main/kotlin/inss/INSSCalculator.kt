package inss

import framework.extensionFunctions.toBRLString

class INSSCalculator() {
    val inssRanges = INSSRangeManager.readFile("/faixasINSS.txt")
    var previousValue = 0.0

    fun dueValueRange(grossAmount: Double): Double {
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

    fun checkMaxValue(salary: Double): Double{
        if (salary > inssRanges.last().maximumValue){
            return inssRanges.last().maximumValue
        }else{
            return salary
        }
    }
}

fun main(){
    println(INSSCalculator().totalDueValue(3500.0).toBRLString())
}
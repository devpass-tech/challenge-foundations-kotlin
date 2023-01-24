package irrf

import framework.asPercent

class IRRFCalculator {
    fun calculateIRRF(salary: Double): Double {
        IRRFRangerManager.getFaixas(fileName = "/faixasIRRF.txt").forEach {
            if (salary in it.minimumValue..it.maximumValue) {
                return (salary * (it.rate.asPercent()) - it.deductibleParcel)
            }
        }
        return 0.0
    }
}
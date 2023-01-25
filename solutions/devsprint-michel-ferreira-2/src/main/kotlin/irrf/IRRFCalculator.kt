package irrf

import framework.asPercent
import framework.interfaces.ICalculable

class IRRFCalculator: ICalculable {
    override fun calculate(salary: Double): Double {
        IRRFRangerManager.getFaixas(fileName = "/faixasIRRF.txt").forEach {
            if (salary in it.minimumValue..it.maximumValue) {
                return (salary * (it.rate.asPercent()) - it.deductibleParcel)
            }
        }
        return 0.0
    }
}
package irrf

import framework.Loggable
import framework.asPercent
import framework.interfaces.ICalculable

class IRRFCalculator: ICalculable, Loggable() {
    override fun calculate(salary: Double): Double {
        IRRFRangerManager.getFaixas(fileName = "/faixasIRRF.txt").forEach {
            if (salary in it.minimumValue..it.maximumValue) {
                return (salary * (it.rate.asPercent()) - it.deductibleParcel)
                    .also {
                        logger.info("Calculo IRRF realizado com sucesso. Valor: $it")
                    }
            }
        }
        return 0.0
    }
}
package irrf

import framework.RangerManager
import framework.extractValueFrom

object IRRFRangerManager : RangerManager<FaixaIRRF>() {
    override fun createFaixa(range: List<String>): FaixaIRRF {
        return FaixaIRRF(
            range.extractValueFrom(0).toDouble(),
            replaceMaxDoubleValue(range.extractValueFrom(1)),
            range.extractValueFrom(2).toFloat(),
            range.extractValueFrom(3).toFloat(),
        )
    }

    private fun replaceMaxDoubleValue(max: String): Double {
        return when (max) {
            "MAX" -> Double.MAX_VALUE
            else -> max.toDouble()
        }
    }

}

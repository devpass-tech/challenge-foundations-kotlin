package irrf

import framework.ResourceReader
import framework.extractValueFrom

object IRRFRangerManager {

    fun readFile(file: String) = ResourceReader.readAsList(file)
        .map {
            val item = it.split("@")
            FaixaIRRF(
                item.extractValueFrom(0).toDouble(),
                replaceMaxDoubleValue(item.extractValueFrom(1)),
                item.extractValueFrom(2).toFloat(),
                item.extractValueFrom(3).toFloat(),
            )
        }

    private fun replaceMaxDoubleValue(max: String): Double {
        return when (max) {
            "MAX" -> Double.MAX_VALUE
            else -> max.toDouble()
        }
    }
}

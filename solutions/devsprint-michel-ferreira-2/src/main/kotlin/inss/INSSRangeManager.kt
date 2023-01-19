package inss

import framework.ResourceReader

object INSSRangeManager {
    fun getINSSRanges(fileName: String): List<FaixaINSS> {
        val rangesLines = ResourceReader.readAsList(fileName)

        return rangesLines.map {
            val range = it.split("@")
            FaixaINSS(
                minimumValue = range[0].toDouble(),
                maximumValue = range[1].toDouble(),
                rate = range[2].toFloat(),
                owedValue = range[3].toDouble()
            )
        }
    }
}
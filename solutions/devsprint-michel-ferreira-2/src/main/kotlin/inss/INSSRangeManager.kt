package inss

import framework.ResourceReader
import framework.exceptionhandler.NotFoundException
import framework.exceptionhandler.OwnedException
import framework.extractValueFrom
import java.lang.Exception

object INSSRangeManager {
    fun getINSSRanges(fileName: String): List<FaixaINSS> {
        val rangesLines: List<String> = ResourceReader.readAsList(fileName)
        return rangesLines.map {
            val range = it.split("@")
            FaixaINSS(
                minimumValue = range.extractValueFrom(index = 0).toDouble(),
                maximumValue = range.extractValueFrom(index = 1).toDouble(),
                rate = range.extractValueFrom(index = 2).toFloat(),
                owedValue = range.extractValueFrom(index = 3).toDouble()
            )
        }
    }
}

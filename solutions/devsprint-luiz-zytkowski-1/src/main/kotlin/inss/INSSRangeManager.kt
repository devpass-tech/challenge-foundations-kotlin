package inss

import framework.ResourceReader

object INSSRangeManager {

    fun readFile(fileName: String): List<INSSRange> {
        val listOfLines = ResourceReader.readAsList(fileName)

        val inssRanges = listOfLines.map { lines ->
            createINSSRange(lines.split("@"))
        }
        return inssRanges
    }

    fun createINSSRange(listOfValues: List<String>): INSSRange {
        return INSSRange(
            minimumValue = listOfValues[0].toDouble(),
            maximumValue = listOfValues[1].toDouble(),
            rate = listOfValues[2].toDouble(),
            owedValue = listOfValues[3].toDouble(),
        )
    }
}
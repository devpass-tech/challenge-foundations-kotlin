package irrf

import framework.ResourceReader

object IRRFRangeManager {

    fun readFileIRRF(fileName: String) : List<IRRFRange> {
        val listOfValues = ResourceReader.readAsList(fileName)

        val irrfRanges = listOfValues.map { lines ->
            createIRRFRange(lines.split("@"))
        }

        return irrfRanges
    }

    fun createIRRFRange(listOfValues: List<String>) : IRRFRange{
        return IRRFRange(
                minimumValue = listOfValues[0].toDouble(),
                maximumValue = if (listOfValues[1] == "MAX") Double.MAX_VALUE else listOfValues[1].toDouble(),
                rate = listOfValues[2].toDouble(),
                deductableParcel = listOfValues[3].toDouble(),
        )
    }
}
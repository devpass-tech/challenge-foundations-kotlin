package irrf

import RangeManager

object IRRFRangeManager : RangeManager<IRRFRange>() {

    override fun createFaixaRange(listOfValues: List<String>): IRRFRange {
        return IRRFRange(
            minimumValue = listOfValues[0].toDouble(),
            maximumValue = if (listOfValues[1] == "MAX") Double.MAX_VALUE else listOfValues[1].toDouble(),
            rate = listOfValues[2].toDouble(),
            deductableParcel = listOfValues[3].toDouble(),
        )
    }
}
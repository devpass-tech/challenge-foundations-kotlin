package irrf

import framework.ResourceReader

object IRRFRangerManager {

    fun readFile(file:String) : List<FaixaIRRF>{
        val faixaIRRFList = mutableListOf<FaixaIRRF>()
        val newList = ResourceReader.readAsList(file)

        newList.forEach{
            val item = it.split("@")

            val irrf = FaixaIRRF(
                item[0].toDouble(),
                replaceMaxDoubleValue(item[1]),
                item[2].toFloat(),
                item[3].toFloat(),
            )
            faixaIRRFList.add(irrf)
        }
        return faixaIRRFList
    }

    private fun replaceMaxDoubleValue(max : String) : Double {
        return when(max){
            "MAX" -> Double.MAX_VALUE
            else -> max.toDouble()
        }
    }
}

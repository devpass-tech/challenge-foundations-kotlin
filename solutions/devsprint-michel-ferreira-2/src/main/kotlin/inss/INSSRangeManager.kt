package inss

import framework.RangerManager
import framework.extractValueFrom

object INSSRangeManager : RangerManager<FaixaINSS>() {

    override fun createFaixa(range: List<String>): FaixaINSS {
        return FaixaINSS(
            minimumValue = range.extractValueFrom(index = 0).toDouble(),
            maximumValue = range.extractValueFrom(index = 1).toDouble(),
            rate = range.extractValueFrom(index = 2).toFloat(),
            owedValue = range.extractValueFrom(index = 3).toDouble()
        )
    }
}

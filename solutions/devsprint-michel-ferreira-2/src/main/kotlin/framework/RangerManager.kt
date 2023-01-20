package framework

abstract class RangerManager<T> {

    fun getFaixas(fileName: String): List<T> {
        val rangesLines: List<String> = ResourceReader.readAsList(fileName)
        val rangeSplited: List<T> = rangesLines.map {
            val range = it.split("@")
            createFaixa(range)
        }
        return rangeSplited
    }

    protected abstract fun createFaixa(range: List<String>): T
}

package framework

abstract class RangerManager<T> : Loggable() {

    fun getFaixas(fileName: String): List<T> {
        val rangesLines: List<String> = ResourceReader.readAsList(fileName)
        val rangeSplited: List<T> = rangesLines.map {
            val range = it.split("@")
            createFaixa(range)
                .also {
                    logger.info("Faixa ${range[0]} - ${range[1]} gerado.")
                }
        }
        return rangeSplited
    }

    protected abstract fun createFaixa(range: List<String>): T
}

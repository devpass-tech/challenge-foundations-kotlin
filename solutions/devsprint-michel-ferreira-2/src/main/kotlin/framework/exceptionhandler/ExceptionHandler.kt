package framework.exceptionhandler

import framework.Loggable

object ExceptionHandler : Loggable() {
    fun handler(ex: Exception) {
        logger.error(ex.message.toString())
        when (ex) {
            is InvalidRawSalaryException -> {
                logger.error("Valor precisa ser numerico ex: 3559.50")
            }
            is NotFoundException -> {
                logger.error("Se o arquivo estiver no resources não esqueça da / meu caro dev")
            }
            else -> {
                logger.error("Tivemos um problema para calcular seu salário líquido, contate os mega-devs da DevPass")
            }
        }
    }
}
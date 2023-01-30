package framework.exceptionhandler

import framework.Loggable

object ExceptionHandler : Loggable() {
    fun handler(ex: Exception) {
        logger.error(ex.message.toString())
        when (ex) {
            is ThereIsNoValueFromIndex -> {
                logger.error("Indice do valor nao foi encontrado")
            }

            is NotFoundException -> {
                logger.info("Se o arquivo estiver no resources não esqueça da / meu caro dev")
            }

            is InvalidRawSalaryException -> {
                logger.error("Valor precisa ser numerico ex: 3559.50")
            }

            is InvalidInputFormatNameException -> {
                logger.error("Por favor insira um nome válido")
            }

            is InvalidInputFormatSalaryException -> {
                logger.error("Salary with non-numeric values, please enter a valid value")
            }

            !is OwnedException -> {
                logger.error("Houve um erro inesperado, por favor tente novamente")
            }

            else -> {
                logger.error("Tivemos um problema para calcular seu salário líquido, contate os mega-devs da DevPass")
            }
        }
    }
}
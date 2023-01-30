package framework.exceptionhandler

import framework.Loggable

object ExceptionHandler : Loggable() {
    fun handler(ex: Exception) {
        when (ex) {
            is ThereIsNoValueFromIndex -> {
                logger.error("Indice do valor nao foi encontrado.\n " +
                        "[Message: ${ex.message.toString()}]")
            }

            is NotFoundException -> {
                logger.info("Se o arquivo estiver no resources não esqueça da / meu caro dev\n" +
                        " [Message: ${ex.message.toString()}]")
            }

            is InvalidRawSalaryException -> {
                logger.error("Valor precisa ser numerico ex: 3559.50\n" +
                        " [Message: ${ex.message.toString()}]")
            }

            is InvalidInputFormatNameException -> {
                logger.error("Por favor insira um nome válido\n" +
                        " [Message: ${ex.message.toString()}]")
            }

            is InvalidInputFormatSalaryException -> {
                logger.error("Salary with non-numeric values, please enter a valid value\n" +
                        " [Message: ${ex.message.toString()}]")
            }

            !is OwnedException -> {
                logger.error("Houve um erro inesperado, por favor tente novamente\n" +
                        " [Message: ${ex.message.toString()}]")
            }

            else -> {
                logger.error("Tivemos um problema para calcular seu salário líquido, contate os mega-devs da DevPass\n" +
                        " [Message: ${ex.message.toString()}]")
            }
        }
    }
}
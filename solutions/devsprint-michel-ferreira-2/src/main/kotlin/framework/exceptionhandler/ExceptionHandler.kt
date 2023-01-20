package framework.exceptionhandler

import framework.Loggable

object ExceptionHandler : Loggable() {

    fun handler(ex: Exception) {
        when (ex) {
            is InvalidRawSalaryException -> {
                println(ex.message)
                println("Valor precisa ser numerico ex: 3559.50")
            }
            is NotFoundException -> {
                println(ex.message)
                println("Se o arquivo estiver no resources não esqueça da / meu caro dev")
            }
            is OwnedException -> println(ex.message)
            else -> {
                logger.error(ex.message.toString())
                println("Tivemos um problema para calcular seu salário líquido, contate os mega-devs da DevPass")
            }
        }
    }
}
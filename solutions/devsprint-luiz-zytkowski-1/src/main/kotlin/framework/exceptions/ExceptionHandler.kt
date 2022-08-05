package framework.exceptions

object ExceptionHandler {
    fun handleException(exception: Exception) {
        when (exception) {
            is OwnedException -> println(exception.message)
            else -> println("Tivemos um problema para calcular seu salário líquido, contate os mega-devs da DevPass")
        }
    }
}
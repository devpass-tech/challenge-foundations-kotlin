package framework

interface ILogger {
    fun info(message: String)
    fun warn(message: String)
    fun error(message: String)
}
open class Loggable (val logger: String)

class Logger: Loggable(logger = "This is a logger message - for scratch and test purposes"), ILogger {

    override fun error(message: String) {
        println("Error message - You found an error message.")
    }

    override fun info(message: String) {
        println("Info message - You found an information message.")
    }

    override fun warn(message: String) {
        println("Warn message - You found a warning message.")
    }
}

fun main() {
    val loggable = Loggable("This is a loggable message - for scratch and test purposes")
    println(loggable.logger)
    println("\n")

    val logger = Logger()
    println(logger.logger)
    logger.error("")
    logger.info("")
    logger.warn("")
}

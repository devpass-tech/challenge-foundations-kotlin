package framework

import framework.interfaces.ILogger

fun main() {
    Loggable().logCounter()
}

open class Loggable {
    fun logCounter() {
        logger.info("Oi")
        logger.warn("Oi")
        logger.error("Oi")
        logger.info("Oi")
    }

    object logger : ILogger {
        override fun info(message: String) {
            println("[Info] $message")
        }

        override fun warn(message: String) {
            println("[Warn] $message")
        }

        override fun error(message: String) {
            println("[Error] $message")
        }
    }
}
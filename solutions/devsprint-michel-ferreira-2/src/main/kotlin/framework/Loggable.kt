package framework

import framework.interfaces.ILogger

open class Loggable {
    val logger = object : ILogger {
        override fun info(message: String) {
            println("Info: $message")
        }

        override fun warn(message: String) {
            println("Warn: $message")
        }

        override fun error(message: String) {
            println("Error: $message")
        }
    }
}
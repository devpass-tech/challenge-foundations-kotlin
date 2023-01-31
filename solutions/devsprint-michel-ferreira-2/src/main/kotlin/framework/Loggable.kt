package framework

import framework.interfaces.ILogger

open class Loggable {
    object logger : ILogger {
        private var count: Int = 1
        override fun info(message: String) {
            println("$count - [Info] $message")
                .also { incrementCountLogger() }
        }

        override fun warn(message: String) {
            println("$count - [Warn] $message")
                .also { incrementCountLogger() }
        }

        override fun error(message: String) {
            println("$count - [Error] $message")
                .also { incrementCountLogger() }
        }

        private fun incrementCountLogger() = count++
    }
}

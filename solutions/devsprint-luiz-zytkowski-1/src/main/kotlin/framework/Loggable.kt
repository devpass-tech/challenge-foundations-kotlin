package framework

import framework.interfaces.ILogger
open class Loggable {
    object logger: ILogger {
        var counter: Int = 0

        override fun error(message: String) {
            counter++
            println("$counter [Error] $message")
        }

        override fun info(message: String) {
            counter++
            println("$counter [Info] $message")
        }

        override fun warn(message: String) {
            counter++
            println("$counter [Warn] $message")
        }
    }
}

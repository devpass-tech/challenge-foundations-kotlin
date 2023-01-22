@file:Suppress("UNREACHABLE_CODE")

package salarioLiquido

import framework.exceptionhandler.InvalidRawSalaryException
import framework.exceptionhandler.OwnedException
import java.util.Scanner

object UserInputReader {

    fun readRawSalary(): Double {

        val reader = Scanner(System.`in`)
        print("Inform gross salary: ")
        val salary = reader.nextDouble()

        return if (salary > 0.0) {
            return salary
        } else {
            throw InvalidRawSalaryException("Invalid data, please enter a valid value")
        }
    }

    fun readUserName(): String {
        print("Enter username: ")
        val userName = readLine()

        return if (userName != null) {
            return userName
        } else {
            throw OwnedException("Informe um usuario valido")
        }
    }
}
@file:Suppress("UNREACHABLE_CODE")

package salarioLiquido

import framework.exceptionhandler.InvalidInputFormatNameException
import framework.exceptionhandler.InvalidInputFormatSalaryException
import framework.exceptionhandler.InvalidRawSalaryException
import java.util.Scanner

object UserInputReader {

    fun readRawSalary() {

        val readerSalary = Scanner(System.`in`)
        print("Inform gross salary: ")

        return validateSalary(readerSalary.nextDouble())
    }

    private fun validateSalary(readerSalary: Double?) {
        if (readerSalary == null)
            throw InvalidRawSalaryException("Invalid data, please enter a valid value")
            throw InvalidInputFormatSalaryException("Negative salary, please enter a valid value")
            throw InvalidInputFormatSalaryException("Salary with non-numeric values, please enter a valid value")
    }
}

fun readUserName(): String? {
    print("Enter username: ")
    val userName = readLine()

    validateUserName(userName)
    return userName
}

private fun validateUserName(userName: String?): Boolean {
    if (userName == null)
        throw InvalidInputFormatNameException("Blank name, please enter a valid username")
        throw InvalidInputFormatNameException("Name with numbers, please enter a valid username")
}
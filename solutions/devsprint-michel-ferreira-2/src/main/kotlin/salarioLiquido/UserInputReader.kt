@file:Suppress("UNREACHABLE_CODE")

package salarioLiquido

import framework.exceptionhandler.InvalidInputFormatNameException
import framework.exceptionhandler.InvalidInputFormatSalaryException
import framework.exceptionhandler.InvalidRawSalaryException

object UserInputReader {

    fun readRawSalary(): Double {

        val readerSalary = readLine()
        val salaryValidation = validateSalary(readerSalary)
        print("Inform gross salary: ")

        return salaryValidation
    }

    private fun validateSalary(readerSalary: String?): Double {
        if (readerSalary == null)
            throw InvalidRawSalaryException("Invalid data, please enter a valid value")
        val salaryAsDouble = try {
            readerSalary.toDouble()
        } catch (ex: NumberFormatException) {
            throw InvalidInputFormatSalaryException("Salary with non-numeric values, please enter a valid value")
        }
        if (salaryAsDouble <= 0.0) throw InvalidInputFormatSalaryException("Negative salary, please enter a valid value")

        return salaryAsDouble
    }

    fun readUserName(): String? {
        print("Enter username: ")
        val userName = readLine()

        validateUserName(userName)
        return userName
    }

    private fun validateUserName(userName: String?): Boolean {
        if (userName == null) throw InvalidInputFormatNameException("Blank name, please enter a valid username")
        throw InvalidInputFormatNameException("Name with numbers, please enter a valid username")
    }
}
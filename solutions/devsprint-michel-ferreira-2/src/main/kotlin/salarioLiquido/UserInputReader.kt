package salarioLiquido

import framework.exceptionhandler.InvalidInputFormatNameException
import framework.exceptionhandler.InvalidInputFormatSalaryException
import framework.exceptionhandler.InvalidRawSalaryException
import framework.hasNumbers

object UserInputReader {

    fun readRawSalary(): Double {
        print("Inform gross salary: ")
        val readerSalary = readLine()
        return validateSalary(readerSalary)
    }

    fun readUserName(): String {
        print("Enter username: ")
        return validateUserName(readLine())
    }

    private fun validateSalary(readerSalary: String?): Double {
        if (readerSalary.isNullOrBlank())
            throw InvalidRawSalaryException("Invalid data, please enter a valid value")
        val salaryAsDouble = try {
            readerSalary.toDouble()
        } catch (ex: NumberFormatException) {
            throw InvalidInputFormatSalaryException("Salary with non-numeric values, please enter a valid value")
        }
        if (salaryAsDouble <= 0.0) throw InvalidInputFormatSalaryException("Negative salary, please enter a valid value")
        return salaryAsDouble
    }

    private fun validateUserName(userName: String?): String {
        if (userName.isNullOrBlank()) throw InvalidInputFormatNameException("Blank name, please enter a valid username")
        if (userName.hasNumbers()) throw InvalidInputFormatNameException("Name with numbers, please enter a valid username")
        return userName
    }
}

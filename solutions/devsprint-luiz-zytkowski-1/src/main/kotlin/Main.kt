import framework.LiquidSalaryCalculator
import framework.UserInputReader
import framework.exceptions.ExceptionHandler
import framework.extensionFunctions.toPrettyPrint

fun main() {

    try {
        val userName = UserInputReader.readUserName()
        val grossAmount = UserInputReader.readRawSalary()

        val liquidSalaryCalculator = LiquidSalaryCalculator()
        val netAmountResult = liquidSalaryCalculator.calculateLiquidSalary(grossAmount)

        println("Olá, $userName, o seu salário líquido é o seguinte: ")
        netAmountResult.toPrettyPrint()
    } catch (e: Exception) {
        ExceptionHandler.handleException(e)
    }
}

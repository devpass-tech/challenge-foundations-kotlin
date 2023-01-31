import framework.exceptionhandler.ExceptionHandler
import salarioLiquido.LiquidSalaryCalculator
import salarioLiquido.UserInputReader

fun main() {
    try {
        val userName: String = UserInputReader.readUserName()

        val userGrossSalary = UserInputReader.readRawSalary()

        println("Calculando salario liquidos...").also {
            println(".")
            Thread.sleep(300)
            println("..")
            Thread.sleep(300)
            println("...")
            Thread.sleep(300)
        }

        println(
            "Bem vindo: $userName\n" +
                    LiquidSalaryCalculator().calculate(userGrossSalary).prettyPrint()
        )
    } catch (ex: Exception) {
        ExceptionHandler.handler(ex)
        main()
    }
}

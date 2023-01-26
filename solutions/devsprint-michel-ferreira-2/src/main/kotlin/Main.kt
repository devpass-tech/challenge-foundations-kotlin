import salarioLiquido.LiquidSalaryCalculator
import salarioLiquido.UserInputReader

fun main() {
    val userName : String = UserInputReader.readUserName()

    val userGrossSalary = UserInputReader.readRawSalary()

    println("Calculando salario liquidos...").also {
        println(".")
        Thread.sleep(300)
        println("..")
        Thread.sleep(300)
        println("...")
        Thread.sleep(300)
    }

    println("Bem vindo: $userName\n" +
            LiquidSalaryCalculator().calculate(userGrossSalary).prettyPrint()
    )
}

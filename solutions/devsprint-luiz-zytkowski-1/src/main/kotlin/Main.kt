import framework.OwnedException

class EmptyUserNameException(message: String) : OwnedException(message)
class InvalidUserNameException(message: String) : OwnedException(message)
class InvalidRawSalaryException(message: String) : OwnedException(message)

fun main() {
    try {
        userInputReader()
    } catch (e: Exception) {
        when (e) {
            is OwnedException -> println("Ocorreu um erro durante a execução do programa. Motivo: ${e.message}")
            else -> println("Tivemos um problema para registrar os dados inseridos.")
        }
    }
}

private fun userInputReader() {
    fun readUserName() {
        println("Informe seu nome:")
        val userName = readln()
        val regexNumber = "\\d".toRegex()
        if (userName.isEmpty())
            throw EmptyUserNameException("Por favor, insira seu nome!")
        if (regexNumber.containsMatchIn(userName))
            throw InvalidUserNameException("Nome inválido, por favor inserir apenas letras")
        println("Seu nome é: $userName")
    }

    fun readRawSalary() {
        println("Informe seu salário bruto:")
        val rawSalary = readln().toDoubleOrNull()
            ?: throw InvalidRawSalaryException("Por favor, insira um número")
        if (rawSalary < 0)
            throw InvalidRawSalaryException("Por favor, insira um valor maior ou igual a 0")
        println("Seu salário bruto é: $rawSalary")

    }

    readUserName()
    readRawSalary()
}



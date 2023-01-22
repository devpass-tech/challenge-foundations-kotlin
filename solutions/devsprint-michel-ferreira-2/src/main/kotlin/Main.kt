import framework.exceptionhandler.InvalidRawSalaryException
import inss.INSSCalculator
import salarioLiquido.NetSalaryResult

fun main() {
    println("insert your salary")
    val salary = validateInputSalary(readLine()!!)

    println("INSS amount: ${INSSCalculator().calculate(salary)}")

    NetSalaryResult(2.0, 3.0, 1.25f, 2f)
        .prettyPrint()
        .also { println(it) }
}

fun validateInputSalary(salary : String) : Double{
    if (salary.toDoubleOrNull() != null && salary.toDouble() > 0.0){
        return salary.toDouble()
    } else{
        throw InvalidRawSalaryException("please insert a valid salary")
    }
}
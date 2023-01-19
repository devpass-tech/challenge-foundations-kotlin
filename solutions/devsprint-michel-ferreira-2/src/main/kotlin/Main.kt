import framework.asReaisString
import framework.exceptionhandler.InvalidRawSalaryException
import irrf.IRRFRangerManager

fun main() {
    println("insert your salary")

    val salary = validateInputSalary(readLine()!!)

    println(salary.asReaisString())

    // TODO remove this later after validation :)
    println("\ntesting IRRFRangerManager:\n" +
            IRRFRangerManager.readFile("/faixasIRRF.txt"))
}

fun validateInputSalary(salary : String) : Double{
    if (salary.toDoubleOrNull() != null && salary.toDouble() > 0.0){
        return salary.toDouble()
    } else{
        throw InvalidRawSalaryException("please insert a valid salary")
    }
}
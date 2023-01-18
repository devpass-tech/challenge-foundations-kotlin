import framework.asReaisString
import framework.exceptionhandler.InvalidRawSalaryException

fun main() {
    println("insert your salary")

    val salary = validateInputSalary(readLine()!!)

    println(salary.asReaisString())
}

fun validateInputSalary(salary : String) : Double{
    if (salary.toDoubleOrNull() != null && salary.toDouble() > 0.0){
        return salary.toDouble()
    } else{
        throw InvalidRawSalaryException("please insert a valid salary")
    }
}
package salarioLiquido

data class NetSalaryResult (
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Float,
    val discountIRRF: Float
)

fun resultSalary(args: Array<String>) {
    val salary = resultSalary(args)
    println(salary)
}
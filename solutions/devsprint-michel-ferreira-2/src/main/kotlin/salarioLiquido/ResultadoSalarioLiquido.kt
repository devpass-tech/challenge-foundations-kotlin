package salarioLiquido

data class ResultadoSalarioLiquido (
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Float,
    val discountIRRF: Float
)
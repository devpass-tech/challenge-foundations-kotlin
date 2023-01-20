package salarioLiquido

data class NetSalaryResult(
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Float,
    val discountIRRF: Float
) {
    fun prettyPrint(): String {
        return """
            Salario Bruto: $grossSalary  
            Salario Liquido: $netSalary
            Desconto INSS: $discountINSS
            Desconto IRRF: $discountIRRF
        """
    }
}

package salarioLiquido

import framework.asReaisString

data class NetSalaryResult(
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Double,
    val discountIRRF: Double
) {
    fun prettyPrint(): String {
        return """
            Salario Bruto: ${grossSalary.asReaisString()}  
            Salario Liquido: ${netSalary.asReaisString()}
            Desconto INSS: ${discountINSS.asReaisString()}
            Desconto IRRF: ${discountIRRF.asReaisString()}
        """
    }
}

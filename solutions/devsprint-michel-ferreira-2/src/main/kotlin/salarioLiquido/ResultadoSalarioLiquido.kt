package salarioLiquido

import framework.numberFormatCurrency

data class NetSalaryResult(
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Double,
    val discountIRRF: Double
) {
    fun prettyPrint(): String {
        return """
            Salario Bruto: ${grossSalary.numberFormatCurrency()}  
            Salario Liquido: ${netSalary.numberFormatCurrency()}
            Desconto INSS: ${discountINSS.numberFormatCurrency()}
            Desconto IRRF: ${discountIRRF.numberFormatCurrency()}
        """
    }
}

package salarioLiquido

import inss.FaixaINSS
import irrf.FaixaIRRF

data class ResultadoSalarioLiquido(
    val gross_salary: Double,
    val net_salary: Double,
    val discount_INSS: Float,
    val discount_IRRF: Float
)
package salarioLiquido

import inss.FaixaINSS
import irrf.FaixaIRRF

data class ResultadoSalarioLiquido(
    val grossSalary: Double,
    val netSalary: Double,
    val discountINSS: Float,
    val discountIRRF: Float
)
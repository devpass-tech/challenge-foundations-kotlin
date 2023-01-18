package salarioLiquido

import inss.FaixaINSS
import irrf.FaixaIRRF

data class ResultadoSalarioLiquido(
    var gross_salary: Double,
    var net_salary: Double,
    val discount_INSS: FaixaINSS,
    val discount_IRRF: FaixaIRRF
)
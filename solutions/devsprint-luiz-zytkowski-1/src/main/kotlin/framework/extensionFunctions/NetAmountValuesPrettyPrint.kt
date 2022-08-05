package framework.extensionFunctions

import salarioLiquido.NetAmountResult

fun NetAmountResult.toPrettyPrint() {
      println("""
            Alíquota do INSS: ${aliquotInss}%
            Dedução do INSS: ${deductionInss.toBRLString()}
            Alíquota do IRRF: ${aliquotIrrf} %
            Dedução do IRRF: ${deductionIrrf.toBRLString()}
            Salário líquido: ${valueNetAmount}
            Salário bruto: ${valueGrossAmount}
            """
      )
}
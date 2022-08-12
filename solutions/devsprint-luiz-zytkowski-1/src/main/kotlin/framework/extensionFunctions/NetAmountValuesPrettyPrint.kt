package framework.extensionFunctions

import salarioLiquido.NetAmountResult

fun NetAmountResult.toPrettyPrint() {
      println("""
            Dedução do INSS: ${deductionInss.toBRLString()}
            Dedução do IRRF: ${deductionIrrf.toBRLString()}
            Salário líquido: ${valueNetAmount.toBRLString()}
            Salário bruto: ${valueGrossAmount.toBRLString()}
            """
      )
}
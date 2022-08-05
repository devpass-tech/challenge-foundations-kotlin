package framework.extensionFunctions

import salarioLiquido.NetAmountResult

fun NetAmountResult.toPrettyPrint() {
      println("""
            Alíquota do INSS: ${aliquotInss}
            Dedução do INSS: ${deductionInss}
            Alíquota do IRRF: ${aliquotIrrf} 
            Dedução do IRRF: ${deductionIrrf}
            Salário líquido: ${valueNetAmount}
            Salário bruto: ${valueGrossAmount}
            """
      )
}
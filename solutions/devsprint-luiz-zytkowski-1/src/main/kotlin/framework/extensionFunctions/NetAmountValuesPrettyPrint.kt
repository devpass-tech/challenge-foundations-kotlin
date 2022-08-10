package framework.extensionFunctions

import salarioLiquido.NetAmountResult

fun NetAmountResult.toPrettyPrint() {
    println("""
            Salário bruto: ${valueGrossAmount.toBRLString()}
            Dedução do INSS: ${deductionInss.toBRLString()}
            Dedução do IRRF: ${deductionIrrf.toBRLString()}
            
            Salário líquido: ${valueNetAmount.toBRLString()}"""
    )
}
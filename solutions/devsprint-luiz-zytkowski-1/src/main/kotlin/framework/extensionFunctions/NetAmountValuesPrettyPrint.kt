package framework.extensionFunctions

import salarioLiquido.NetAmountResult

fun NetAmountResult.toPrettyPrint(): String {
    return  println("""
            aliquotINSS: ${aliquotInss}
            DeductionINSS: ${deductionInss}
            AliquotIRRF: ${aliquotIrrf} 
            DeductionIRRF: ${deductionIrrf}
            ValueNetAmount: ${valueNetAmount}
            ValueGrossAmount: ${valueGrossAmount}
            """
    ).toString()
}
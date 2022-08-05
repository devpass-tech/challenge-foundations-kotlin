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

fun main() {
    val netAmountResult = NetAmountResult(
        aliquotInss = 10.0,
        aliquotIrrf = 12.2,
        deductionInss = 22.3,
        deductionIrrf = 3.0,
        valueGrossAmount = 300.0,
        valueNetAmount = 4000.4
    )

    print(netAmountResult.toPrettyPrint())
}
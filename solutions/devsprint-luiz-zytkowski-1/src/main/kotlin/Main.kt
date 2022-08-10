import framework.UserInputReader
import framework.extensionFunctions.toPrettyPrint
import inss.INSSCalculator
import irrf.IRRFCalculator
import salarioLiquido.NetAmountResult

fun main() {

    val userName = UserInputReader.readUserName()
    val grossAmount = UserInputReader.readRawSalary()

    val inssDeduction = INSSCalculator().totalDueValue(grossAmount)
    val irrfDeduction = IRRFCalculator().calculateIRRF((grossAmount - inssDeduction))

    val netAmount = grossAmount - inssDeduction - irrfDeduction

    println("Olá, $userName, o seu salário líquido é o seguinte: ")
    NetAmountResult(
        deductionInss = inssDeduction,
        deductionIrrf = irrfDeduction,
        valueNetAmount = netAmount,
        valueGrossAmount = grossAmount,
    ).toPrettyPrint()

}

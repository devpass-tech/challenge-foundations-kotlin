package framework

import framework.exceptionhandler.ThereIsNoValueFromIndex
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat
import java.util.*

fun Float.asPercent() = this / 100

fun List<String>.extractValueFrom(index: Int) = try {
    this[index]
} catch (ex: Exception) {
    throw ThereIsNoValueFromIndex("Index $index not found")
}

fun Double.formatSalary(digits: Int = 2): Double = "%.${digits}f".format(this, Locale.US).toDouble()

fun String.hasNumbers() = this.any { it.isDigit() }

fun Double.numberFormatCurrency(): String {
    val formatter: NumberFormat = DecimalFormat("#,###.##", DecimalFormatSymbols(Locale("pt", "br")))
    return "R$ ${formatter.format(this)}"
}

package framework

import framework.exceptionhandler.ThereIsNoValueFromIndex

fun Double.asReaisString(): String {
    return "R$ ${"%.2f".format(this)}"
}

fun Float.asPercent() = this / 100

fun List<String>.extractValueFrom(index: Int) = try {
    this[index]
} catch (ex: Exception) {
    throw ThereIsNoValueFromIndex("Index $index not found")
}

fun Double.formatSalary(digits : Int = 2) : Double = "%.${digits}f".format(this).toDouble()

fun String.hasNumbers() = this.any { it.isDigit() }

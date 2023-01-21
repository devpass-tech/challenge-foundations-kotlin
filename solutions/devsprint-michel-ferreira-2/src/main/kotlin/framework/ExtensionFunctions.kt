package framework

import framework.exceptionhandler.ThereIsNoValueFromIndex

fun Double.asReaisString(): String = "R$ ${"%.2f".format(this)}"

fun Float.asPercent() = this / 100

fun List<String>.extractValueFrom(index: Int) = try {
    this[index]
} catch (ex: Exception) {
    throw ThereIsNoValueFromIndex("Index $index not found")
}

package framework

fun Double.asReaisString() : String = "R$ ${"%.2f".format(this)}"
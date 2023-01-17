package framework.interfaces

fun Double.asReaisString() : String = "R$ ${"%.2f".format(this)}"
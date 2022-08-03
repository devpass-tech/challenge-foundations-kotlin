package extensionFunctions

fun Double.toRealString() : String {
    return ("R$ %.2f".format(this))
}
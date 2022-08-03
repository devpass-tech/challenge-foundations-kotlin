package framework.extensionFunctions

fun Double.toBRLString() : String {
    return ("R$ %.2f".format(this))
}
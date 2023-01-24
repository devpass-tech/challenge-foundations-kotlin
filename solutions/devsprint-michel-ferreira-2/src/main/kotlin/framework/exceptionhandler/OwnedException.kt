package framework.exceptionhandler

open class OwnedException(message: String) : Exception(message)
class ThereIsNoValueFromIndex(message: String) : OwnedException(message)
class NotFoundException(message: String) : OwnedException(message)
class InvalidRawSalaryException (message : String) : OwnedException(message)
class InvalidInputFormatNameException (message : String) : OwnedException(message)
class InvalidInputFormatSalaryException (message : String) : OwnedException(message)

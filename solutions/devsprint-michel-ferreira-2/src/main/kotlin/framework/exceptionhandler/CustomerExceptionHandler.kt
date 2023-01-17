package framework.exceptionhandler

data class InvalidRawSalaryException(
    override val message : String
    ) : Exception(message)
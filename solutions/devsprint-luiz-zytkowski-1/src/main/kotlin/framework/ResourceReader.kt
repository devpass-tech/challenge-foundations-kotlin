package framework

import framework.exceptions.DoesNotStartsWithException
import framework.interfaces.IResourceReader

object ResourceReader : IResourceReader, Loggable() {

    override fun readAsList(fileName: String): List<String> {

        var lines: List<String> = listOf<String>()

        try {
            this::class.java.getResource(fileName).readText().lines()
        } catch (e: Exception) {
            logger.error("File path must be initialized with a /")
            throw DoesNotStartsWithException("File path must be initialized with a /")
        }

        return lines
    }
}

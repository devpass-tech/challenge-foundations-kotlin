package framework

import framework.exceptions.DoesNotStartsWithException
import framework.interfaces.IResourceReader

object ResourceReader : IResourceReader, Loggable() {

    override fun readAsList(fileName: String): List<String> {
        return try {
            if (!fileName.startsWith("/"))
                throw DoesNotStartsWithException("File path must be initialized with a /")
            this::class.java.getResource(fileName).readText().lines()
        } catch (e: Exception) {
            logger.error(e.message ?: "Unexpected error")
            throw e
        }
    }
}
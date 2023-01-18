package framework

import framework.interfaces.IResourceReader

object ResourceReader : IResourceReader, Loggable() {

    override fun readAsList(fileName: String): List<String> {
        return try {
            val message = "File ${fileName.replace("/", "")} not found!"
            val resource = this::class.java.getResource(fileName) ?: throw Exception(message)
            resource.readText().lines()
        } catch (e: Exception) {
            logger.error(e.message ?: "error")
            throw e
        }
    }
}
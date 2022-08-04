package framework

import framework.exceptions.DoesNotStartsWithException
import framework.interfaces.IResourceReader

object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val lines: List<String>

        if(fileName.startsWith("/")){
            lines = this::class.java.getResource(fileName).readText().lines()
        } else{
            throw DoesNotStartsWithException(message = "File path must be initialized with a /")
        }

        return lines
    }
}
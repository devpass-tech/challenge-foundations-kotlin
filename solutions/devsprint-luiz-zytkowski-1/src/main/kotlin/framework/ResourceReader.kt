package framework

import framework.interfaces.IResourceReader

object ResourceReader: IResourceReader{

    class DoesNotStartsWith(message: String) : OwnedException(message)

    override fun readAsList(fileName: String): List<String> {

        var lines: List<String>

        if(fileName.startsWith("/")){
            lines = this::class.java.getResource(fileName).readText().lines()
        } else{
            throw DoesNotStartsWith(message = "File path must be initialized with a /")
        }

        return lines
    }

}
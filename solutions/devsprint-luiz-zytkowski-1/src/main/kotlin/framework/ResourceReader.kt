package framework

import framework.interfaces.IResourceReader


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val lines = this::class.java.getResource(fileName).readText().lines()

        return lines
    }

}

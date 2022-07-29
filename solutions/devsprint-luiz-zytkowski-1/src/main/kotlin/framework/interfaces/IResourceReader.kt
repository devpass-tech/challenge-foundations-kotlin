package framework.interfaces

interface IResourceReader {
    fun readAsList(fileName: String): List<String>
}
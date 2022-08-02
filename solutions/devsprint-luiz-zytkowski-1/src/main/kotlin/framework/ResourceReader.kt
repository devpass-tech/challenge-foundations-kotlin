package framework

import framework.interfaces.IResourceReader
import java.util.ArrayList


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val list= ArrayList<String>()
        list.add(this::class.java.getResource(fileName)!!.readText())
        return list
    }

}

fun main() {
    val print = ResourceReader.readAsList("faixasINSS.txt")
    println(print)
}
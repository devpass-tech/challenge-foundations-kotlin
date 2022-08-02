package framework

import java.io.File
import framework.interfaces.IResourceReader
import java.util.ArrayList


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val list= ArrayList<String>()

        File(fileName).forEachLine { line ->
            list.add(line)
        }

        return list
    }
}

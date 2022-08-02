package framework

import java.io.File
import framework.interfaces.IResourceReader
import java.util.ArrayList


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val lista= ArrayList<String>()

        File(fileName).forEachLine { linha ->
            lista.add(linha)
        }

        return lista
    }
}

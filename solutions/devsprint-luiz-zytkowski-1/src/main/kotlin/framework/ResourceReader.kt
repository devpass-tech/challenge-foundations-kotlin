package framework

import java.io.File
import framework.interfaces.IResourceReader
import java.io.FileNotFoundException
import java.util.ArrayList


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val list= ArrayList<String>()

        try{
            File(fileName).forEachLine { line ->
                list.add(line)
            }
        } catch (error: FileNotFoundException){
            println("Failed to read the file")
            error.printStackTrace()
        }


        return list
    }
}

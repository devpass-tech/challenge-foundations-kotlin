package framework

import framework.interfaces.IResourceReader


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val list = mutableListOf<String>()

        for(char in fileName.iterator()){
            list.add(char.toString())
        }

        if(list[0] != "/") {
           println("the file path must be initialized with a /")
        }

        val lines = this::class.java.getResource(fileName).readText().lines()

        return lines
    }

}

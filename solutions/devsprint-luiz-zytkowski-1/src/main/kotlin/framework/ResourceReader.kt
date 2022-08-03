package framework

import framework.interfaces.IResourceReader


object ResourceReader: IResourceReader{

    override fun readAsList(fileName: String): List<String> {

        val lista = mutableListOf<String>()

        for(char in fileName.iterator()){
            lista.add(char.toString())
        }

        if(lista[0] != "/") {
           println("the file path must be initialized whith a /")
        }

        val lines = this::class.java.getResource(fileName).readText().lines()

        return lines
    }

}

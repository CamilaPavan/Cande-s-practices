//Creo mi objeto para inicializar.


object Application {
    @JvmStatic
    fun main(args:Array<String>){
        val arrays= ArraysMaps()
        arrays.printList()
        arrays.printMaps()
        arrays.printMapsComplete()
    }
}
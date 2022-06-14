//Creo mi objeto para inicializar.


object Application {
    @JvmStatic
    fun main(args:Array<String>){
        val arrays= ArraysMaps()
        //arrays.printList()
        //arrays.printMaps()
        //arrays.printMapsComplete()

        val division = DiviClass()
        //division.division(6F,3F)

        val sumar = SumClass()
       //sumar.sum(12,8)
       //sumar.sum(5,5)

        val restar = SubtractionClass()
        //restar.resta(-12F,2F)

        val multiplicar = MultiplicationClass()
        multiplicar.multplicar(12,4)
    }
}

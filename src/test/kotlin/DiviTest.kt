import org.junit.Assert
import org.junit.Test


class DiviTest{

    //Se crea una variable que hace llamado a la funcion. 
    val diviClass: DiviClass = DiviClass ()

    @Test
    fun `devuelve el resultado de dividir el primero num sobre el segungo`(){
        //El resultado que me tiene que dar
        val resultado = 2

        //El llamado a la funcion con el paso de argumentos
        val division: Float = DiviClass.division (6,3)

        //Verifico con la extension que den el mismo resultado
        Assert.assertEquals(resultado,division)
    }

}




import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DiviTest{

    //Se crea una variable que hace llamado a la funcion. 
    val diviClass: DiviClass = DiviClass ()

    @Test
    fun `devuelve el resultado de dividir el primero num sobre el segungo`(){
        //El resultado que me tiene que dar
        val resultado = 2F

        //El llamado a la funcion con el paso de argumentos
        val division: Float = diviClass.division(6F,3F)

        //Verifico con la extension que den el mismo resultado
        assertEquals(resultado,division)
    }
}




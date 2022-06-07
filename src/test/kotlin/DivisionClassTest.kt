import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals


class DivisionTest {

    private val divisionclass:DivisionClass = DivisionClass()

    @Test
    fun  `Divide el primer numero sobre el segundo, devuelve resultado `(){
        //Se crea una variable con el resultado que me tiene que dar la funcion
        val resultado = 2

        //Se llama a la funcion y se le envian parametros
        val division=divisionclass.dividir(6, 3)

        //Se compara el resultado real con el esperado.
        assertEquals(resultado,division)
    }

    @Test
    fun `Chequea que el divisor no sea cero`(){

        assertThrows<java.lang.Exception> {divisionclass.dividir(6,0)}

    }
}



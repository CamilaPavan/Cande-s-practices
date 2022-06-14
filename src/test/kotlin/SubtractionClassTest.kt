import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class SubtractionClassTest{

    val subtraclass:SubtractionClass = SubtractionClass()

    @Test
    fun `Al primer numero le resta el segundo`(){
        val resultado = 4F

        val restar:Float =subtraclass.resta(6F,2F)

        assertEquals(resultado,restar)

    }

}
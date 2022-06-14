import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MultiplicationTest {

    private val multiplicationclass:MultiplicationClass = MultiplicationClass()

    @Test
    fun `Realiza la multiplicacion entre dos variables`(){

        val answer = 12

        val multiplicar:Int = multiplicationclass.multplicar(6,2)

        assertEquals(answer,multiplicar)

    }

}
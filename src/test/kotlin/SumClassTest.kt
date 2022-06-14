import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumClassTest {

    private val sumclass:SumClass=SumClass()

    @Test
    fun `suma de dos numero, me devuelve resultado`(){
        val resultado=5

        val suma:Int=sumclass.sum(2,3)


        assertEquals(resultado,suma)
    }
}
import org.junit.Assert
import org.junit.Test

class SumTest {

    val sumclass:SumClass=SumClass()

    @Test
    fun `suma de dos numero, me devuelve resultado`(){
        val resultado=5

        val suma:Int=sumclass.sum(2,3)

        Assert.assertEquals(resultado,suma)
    }
}
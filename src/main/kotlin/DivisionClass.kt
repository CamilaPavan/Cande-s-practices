
class DivisionClass {

    fun dividir(var1:Int,var2:Int): Any{
        return try {
            var1/var2
        }catch (e : Exception) {
            "No se puede dividir por cero"
        }

    }

}

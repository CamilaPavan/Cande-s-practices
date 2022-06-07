class ArraysMaps{
    private val firstList: List<Int> = listOf(5,6,9,7)

    val firstMap : Map<String, Boolean> = mapOf(
        "Gordos" to true,
        "lindos" to true,
        "altos" to false
    )

    fun printList(){
        println("originalList:$firstList")
        println("Sorted list:" + firstList.sorted())
    }

    fun printMaps() {
        println("Value in lindos is: " + firstMap["lindos"])
    }

    fun printMapsComplete(){
        println(firstMap)
        println(firstMap.entries)
    }

}
fun main() {
    val animals = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    println(animals)
    val isExistsName = animals.any { it.length == 7 }
    println("Is exists name with 7 characters? $isExistsName")
}
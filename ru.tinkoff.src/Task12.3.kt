fun main() {
    val animals = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val shortNameAnimals = animals.filter { it.length < 6 }
    println(animals)
    println(shortNameAnimals)
}
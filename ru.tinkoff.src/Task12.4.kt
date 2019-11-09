fun main() {
    val animals = listOf("Хрюша", "Филя", "Гуля", "Степаша")
    println(animals)
    val animalWithLongestName = animals.find { s -> s.length == animals.maxBy { it.length }?.length }
    println(animalWithLongestName)
}
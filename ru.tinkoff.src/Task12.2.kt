fun main() {
    val animals = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val helloAnimals = animals.map { "Привет $it" }
    println(animals)
    println(helloAnimals)
}
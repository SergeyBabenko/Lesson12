fun main() {
    val animals = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val helloAnimals = animals.asSequence().filter { it.length <= 4 }.map { "Привет $it" }.toList()
    print(helloAnimals)
}
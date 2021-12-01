fun main() {

    // test if implementation meets criteria from the description, like:
    val originalValues = readInput("Day01").map { it.toInt() }
    val nextValues = originalValues.subList(1, originalValues.size) + 0

    println(
        originalValues
            .zip(nextValues)
            .map { (original, next) -> next - original }
            .filter { it > 0 }
            .count()
    )

}

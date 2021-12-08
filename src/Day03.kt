fun main() {

	// test if implementation meets criteria from the description, like:
	val lines = readInput("Day03")

	val groupedByIndex = lines
			.map { it.chunked(1) }
			.flatMap { it.mapIndexed { index, s -> index to s } }
			.groupBy { it.first }
			.map { (key, value) -> value.map { it.second } }

	println(groupedByIndex)

	val counted = (groupedByIndex.map { it.groupBy { it }.mapValues { it.value.count() } })

	val gamma = counted.map {
		val max = it.maxOf { it.value }
		it.filterValues { it == max }.keys.first()
	}.joinToString("").toInt(2)

	val epsilon = counted.map {
		val min = it.minOf { it.value }
		it.filterValues { it == min }.keys.first()
	}.joinToString("").toInt(2)

	println(gamma)
	println(epsilon)
	println(gamma*epsilon)

}

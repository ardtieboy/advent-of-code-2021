import kotlin.math.absoluteValue

fun main() {

	// test if implementation meets criteria from the description, like:
	val originalValues = readInput("Day07")[0].split(",").map { it.toInt() }
	println(originalValues)
	val max = originalValues.maxOrNull() ?: 0
	val min = originalValues.minOrNull() ?: 0

	val fuelCosts = (min..max).map {
		it to originalValues.sumOf { horizontalPosition -> (horizontalPosition - it).absoluteValue }
	}.sortedBy { it.second }

	println(fuelCosts)

	val fuelCosts2 = (min..max).map {
		it to originalValues.sumOf { horizontalPosition -> (1..(horizontalPosition - it).absoluteValue).sum() }
	}.sortedBy { it.second }

	println(fuelCosts2)
}

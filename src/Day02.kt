fun main() {

    // test if implementation meets criteria from the description, like:
    val lines = readInput("Day02")
    var x = 0
    var y = 0

    val forward = Regex("forward (\\d)")
    val down = Regex("down (\\d)")
    val up = Regex("up (\\d)")

    lines.forEach {
        when {
            forward.matches(it) -> {
                x += forward.find(it)?.groupValues?.last()?.toInt() ?: throw Error("KUT")
            }
            down.matches(it) -> {
                y += down.find(it)?.groupValues?.last()?.toInt() ?: throw Error("KUT")
            }
            up.matches(it) -> {
                y -= up.find(it)?.groupValues?.last()?.toInt() ?: throw Error("KUT")
            }
            else -> throw Error("UNEXPECTED")
        }
    }

    println(x)
    println(y)
    println(x*y)
}

package practice3

fun String.wordCount(): Int =
    this.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }.size

fun Int.toRupiahString(): String {
    val digits = this.toString()
    val sb = StringBuilder()
    for ((i, c) in digits.withIndex()) {
        if (i > 0 && (digits.length - i) % 3 == 0) sb.append('.')
        sb.append(c)
    }
    return "Rp $sb"
}

fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = this.filter { it in min..max }
    return if (filtered.isEmpty()) 0.0 else filtered.average()
}

fun main() {
    // Step 1
    println("Hello world".wordCount())
    println("Belajar Kotlin itu menyenangkan sekali".wordCount())
    println("Pengembangan aplikasi bergerak dengan Kotlin di Android Studio".wordCount())

    // Step 2
    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    // Step 3
    val list = listOf(10, 50, 200, 85, -5)
    println("$list.clampedAverage(0, 100) = ${list.clampedAverage(0, 100)}")
}
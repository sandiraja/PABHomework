package com.example.hw05.task2


fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}


fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    val doubleValue: (Int) -> Int = { it * 2 }
    println(applyTwice(3, doubleValue))

    val courses = listOf("Algorithm", "Android", "English", "Database", "Operating System")
    val isStartsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, isStartsWithVowel)

    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}
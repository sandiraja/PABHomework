package com.example.hw05.task1

fun main() {
    val doubleValue: (Int) -> Int = { it * 2 }
    println(doubleValue(7))

    val isStartsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(isStartsWithVowel("apple"))
    println(isStartsWithVowel("Banana"))
    println(isStartsWithVowel("orange"))

    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
}
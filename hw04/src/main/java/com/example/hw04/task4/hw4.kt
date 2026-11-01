package com.example.hw04.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF303")
    println("Final list: $courses")


    val uniqueCourses = courses.toSet()
    println("Unique courses: $uniqueCourses")


    val creditMap = mapOf("SIF101" to 3, "SIF202" to 4, "SIF303" to 3,
        "SIF404" to 3, "SIF505" to 2)
    println("SIF101 credits: ${creditMap["SIF101"] ?: 0}")
    println("SIF999 credits: ${creditMap.getOrDefault("SIF999", 0)} (not found)")


    val totalCredits = courses.sumOf { creditMap[it] ?: 0 }
    println("Total enrolled courses: ${courses.size}")
    println("Total credit hours: $totalCredits")
}
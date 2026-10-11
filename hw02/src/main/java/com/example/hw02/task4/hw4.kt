package com.example.hw02.task4

fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int) : Int{
    return sessions * minutesPerSession
}

fun calculateTotalCredits(course: Int, creditPerCourse: Int) : Int{
    return course * creditPerCourse
}
fun main() {
    val total1 = calculateStudyMinutes(3, 25)
    println("Total study time: $total1 minutes")
    // Call it again with 4 and 30
    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    for (courses in 1..5) {
        val totalCredits = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $totalCredits")
    }
}

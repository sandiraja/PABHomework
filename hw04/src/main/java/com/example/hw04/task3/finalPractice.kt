package com.example.hw04.task3

enum class CourseStatus {
    ACTIVE,
    COMPLETED
}

data class Course(
    val code: String,
    val name: String,
    val status: CourseStatus
)

fun Course.displayInfo(): String {
    return "$code - $name - $status"
}

fun main() {
    val courseList = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("KDK102", "Dasar Pemrograman", CourseStatus.COMPLETED),
        Course("JRK103", "Jaringan Komputer", CourseStatus.ACTIVE)
    )

    val newCourse = Course("BD104", "Basis Data", CourseStatus.ACTIVE)
    courseList.add(newCourse)

    courseList.removeAt(2)

    println("Daftar Mata Kuliah Tersisa:")
    for (course in courseList) {
        println(course.displayInfo())
    }

    println("--- Destructuring ---")
    val sampleCourse = courseList[0]
    val (code, name, status) = sampleCourse

    println("Code: $code")
    println("Name: $name")
    println("Status: $status")
}
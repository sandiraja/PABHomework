package com.example.hw04.task2

fun main() {
    val cart = mutableListOf("Laptop", "Mouse")

    cart.add("Keyboard")
    cart.add("Headset")

    cart.remove("Mouse")

    println("Daftar produk dalam keranjang:")
    for (item in cart) {
        println("- $item")
    }

    println("Jumlah produk: ${cart.size}")
}
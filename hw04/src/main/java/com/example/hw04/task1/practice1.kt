package com.example.hw04.task1

data class Product(
    val name: String,
    val price: Int
)

fun Product.isExpensive(): Boolean {
    return price > 500000
}

fun main() {
    val product1 = Product("Mouse", 250000)
    val product2 = Product("Monitor", 1500000)

    println("Produk 1: $product1")
    println("Produk 2: $product2")

    val product1Updated = product1.copy(price = 300000)
    println("Produk 1 Setelah Diubah: $product1Updated")

    println("Apakah ${product1.name} mahal? ${product1.isExpensive()}")
    println("Apakah ${product2.name} mahal? ${product2.isExpensive()}")
}
package com.example.assignment2.lab_work

fun main() {
    val word: MutableList<String> = mutableListOf("kiwi","apple", "banana", "orange")
    word.add("watermelon")
    word.remove("orange");
    word.sort()
    println(word)
}
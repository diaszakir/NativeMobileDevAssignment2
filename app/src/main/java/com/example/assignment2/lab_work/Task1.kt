package com.example.assignment2.lab_work

fun main() {
    val a = readln().toInt();
    val b = readln().toInt();
    val result = addNumbers(a, b);
    println(result)
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b;
}
package com.example.assignment2.lab_work

fun main() {
    var numbers: IntArray = intArrayOf(1,2,3,4,5);
    var squareNum = applyToClosureArray(numbers) {
        it * it;
    }
    println(squareNum)
}

fun applyToClosureArray(numbers: IntArray, closure: (Int) -> Int): List<Int> {
    return numbers.map {
        closure(it);
    }
}
package com.example.assignment2.lab_work

fun sumOfTwoOptionalNumbers(a: Int?, b: Int?): String {
    return if (a != null && b != null) {
        "Sum is ${a+b}";
    }
    else {
        "One num is null"
    }
}

fun main() {
    val a: Int? = 12;
    val b: Int? = 13;
    val c: Int? = 14;
    val d: Int? = null;
    val res1 = sumOfTwoOptionalNumbers(a, b);
    val res2 = sumOfTwoOptionalNumbers(c, d);
    println(res1)
    println(res2)
}
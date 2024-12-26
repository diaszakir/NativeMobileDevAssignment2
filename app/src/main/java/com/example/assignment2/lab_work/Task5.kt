package com.example.assignment2.lab_work

fun describeOptionalNumber(num: Int?): String? {
    if (num == null) {
        return "Number is null";
    } else {
        return "Number is $num";
    }
}

fun main() {
    val someNum1: Int? = 12;
    val someNum2: Int? = null;
    val res1 = describeOptionalNumber(someNum1);
    val res2 = describeOptionalNumber(someNum2);
    println(res1)
    println(res2)
}
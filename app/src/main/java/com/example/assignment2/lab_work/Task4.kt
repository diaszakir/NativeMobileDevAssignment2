package com.example.assignment2.lab_work

fun main() {
    val contacts: MutableMap<String, Int> = mutableMapOf("Marat" to 1, "Sarah" to 3, "Jake" to 7);
    println(contacts)
    contacts["Akmaral"] = 42;
    contacts["Sabina"] = 23;
    contacts["Jake"] = 10;
    contacts.remove("Sarah")
    println(contacts)
}
package com.example.assignment2

fun main() {
    val character: MutableList<String> = mutableListOf("Leon", "Tidus", "Zidane")
    character.add("Squall")
    character.remove("Tidus")
    character.sort()
    println(character)
    println()
    val characters: MutableMap<String, String> = mutableMapOf("HP" to "Harry Potter", "RH" to "Ron Weasley", "HM" to "Hermione Granger");
    println(findCharacter(characters, "HM"))
    println(findCharacter(characters, "HP"))
}

fun findCharacter(characters: Map<String, String>, characterCode: String?): String {
    return characters[characterCode] ?: "Character not found"
}
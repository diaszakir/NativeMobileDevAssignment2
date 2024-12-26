package com.example.assignment2

fun main() {
    val characters: MutableMap<String, String> = mutableMapOf("HP" to "Harry Potter", "RH" to "Ron Weasley", "HM" to "Hermione Granger");
    val data = processCharacter(characters) {(code, name) ->
        "$code: $name"
    }
    println(data)
}

fun processCharacter(character: Map<String, String>, format: (Map.Entry<String, String>) -> String): List<String> {
    return character.map {
        format(it)
    }
}
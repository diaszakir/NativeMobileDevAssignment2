package com.example.assignment2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val characters: MutableMap<String, String> = mutableMapOf("HP" to "Harry Potter", "RH" to "Ron Weasley", "HM" to "Hermione Granger");
        val data = processCharacter(characters) {(code, name) ->
            "$code: $name"
        }

        val listView: ListView = findViewById(R.id.listView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter

    }

    fun processCharacter(character: Map<String, String>, format: (Map.Entry<String, String>) -> String): List<String>{
        return character.map {
            format(it)
        }
    }
}
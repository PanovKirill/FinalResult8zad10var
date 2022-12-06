package com.example.kinopoiskpanov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class podborka2 : AppCompatActivity() {

    val list: List<String> = emptyList()
    var Filmes = arrayOf("Я","ДедЭнд","Живая Сталь","Человек-паук")
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podborka2)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())

        for(i in 1..10){
            Filmes = da(Filmes,"Film + $1")
            recyclerView.adapter = CustomRecyclerAdapter(Filmes.toList())
        }

    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }
        return data
    }
    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.cat_names).toList()
    }

    fun AddProp(view: View){
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())
        for (i in 1..10)
            Filmes = da(Filmes,"Film + $i")
        recyclerView.adapter = CustomRecyclerAdapter(Filmes.toList())
    }

    fun da(arr: Array<String>, element: String): Array<String> {
        val list: MutableList<String> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }

}
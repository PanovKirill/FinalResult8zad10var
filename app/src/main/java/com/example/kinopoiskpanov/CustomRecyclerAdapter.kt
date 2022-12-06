package com.example.kinopoiskpanov

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class CustomRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>()

{

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
        val ImageFilms : ImageView = itemView.findViewById(R.id.ImageFilm)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_podborka, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView.text = names[position]
        holder.smallTextView.text = position.toString()
        val randomvalues =  Random.nextInt(0,4)
        when(randomvalues){
            1->holder.ImageFilms.setImageResource(R.drawable.f1)
            2->holder.ImageFilms.setImageResource(R.drawable.f2)
            3->holder.ImageFilms.setImageResource(R.drawable.f3)
            4->holder.ImageFilms.setImageResource(R.drawable.f4)
        }
    }

    override fun getItemCount() = names.size








}
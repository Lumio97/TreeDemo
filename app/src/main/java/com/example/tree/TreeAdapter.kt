package com.example.tree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_one.view.*
import kotlinx.android.synthetic.main.item_two.view.*

//Стандартное описание ViewHolder

class TreeAdapter(
    private val data: List<String> // Параметры в <> уже другие
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ONE = 0
    private val TYPE_TWO = 1

    override fun getItemViewType(position: Int): Int {
        return if(position % 2 == 0) TYPE_ONE else TYPE_TWO
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_ONE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_one, parent, false)
            ElementOneHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_two, parent, false)
            ElementTwoHolder(view)
        }
    }
    override fun getItemCount()= data.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (getItemViewType(position) == TYPE_ONE) {
            (holder as ElementOneHolder).bind(data[position])
        } else {
            (holder as ElementTwoHolder).bind(data[position])
        }

    }


    private class ElementOneHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(text: String) = itemView.apply {
            sampleTextOne.text = text  // Здесь уже посложнее с view,где картинки,текст и т.д.
        }
    }

    private class ElementTwoHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(text: String) = itemView.apply {
            sampleTextTwo.text = text // Также
        }
    }

}
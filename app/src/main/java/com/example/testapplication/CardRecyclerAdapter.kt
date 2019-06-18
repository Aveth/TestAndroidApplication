package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view.view.*

class CardRecyclerAdapter : RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

    }

}

class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var titleText: String? = null
    set(value) {
        field = value
        itemView.cardNameTextView.text = value
    }

    @ColorRes var backgroundColor: Int? = null
    set(value) {
        field = value
        if (value == null) return
        itemView.background = itemView.context.resources.getDrawable(value, null)
    }

}
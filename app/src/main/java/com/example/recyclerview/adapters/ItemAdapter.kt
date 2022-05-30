package com.example.recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R


class ItemAdapter(val context: Context, val items:ArrayList<String>):
        RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_custom_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item= items.get(position)
        holder.tvItem.text=item
        if (position%2==0){
            holder.cardViewItem.setCardBackgroundColor(ContextCompat.getColor(context,R.color.grey))

        }
        else{
            holder.cardViewItem.setCardBackgroundColor(ContextCompat.getColor(context,R.color.white)
            )
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvItem=view.findViewById<TextView>(R.id.tv_item_name)
        val cardViewItem=view.findViewById<CardView>(R.id.card_view_item)

    }

}


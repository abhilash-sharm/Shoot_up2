package com.example.shoot_up2.Adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoot_up2.R
import com.example.shoot_up2.Results
import java.util.ArrayList


class Data_Adapter(var context: Context, var Data: ArrayList<Results>) :
    RecyclerView.Adapter<Data_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.data_adaptor_modellayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = Data[position]

//        try {

            holder.TextView_1.text = data.author
            holder.TextView_2.text = data.authorSlug
            holder.TextView_3.text = data.content

        holder.Recycler_2.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        var colorAdaptor = SubAdaptor(context,  data.tags)
        holder.Recycler_2.adapter = colorAdaptor

//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

    }

    override fun getItemCount(): Int {
        return Data.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var TextView_1: TextView
        var TextView_2: TextView
        var TextView_3: TextView
        var Recycler_2: RecyclerView

        init {
            TextView_1 = itemView.findViewById(R.id.TextView_1)
            TextView_2 = itemView.findViewById(R.id.TextView_2)
            TextView_3 = itemView.findViewById(R.id.TextView_3)
            Recycler_2 = itemView.findViewById(R.id.Recycler_2)

        }
    }
}
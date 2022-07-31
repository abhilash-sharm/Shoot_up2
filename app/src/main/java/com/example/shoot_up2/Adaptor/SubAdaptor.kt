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


class SubAdaptor(var context: Context, var Data2: List<String>) :
    RecyclerView.Adapter<SubAdaptor.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.sub_adaptor_modallayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data2 = Data2[position]

//        try {

        holder.Tag1.text = data2


//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

    }

    override fun getItemCount(): Int {
        return Data2.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var Tag1: TextView

        init {
            Tag1 = itemView.findViewById(R.id.Tag1)
        }
    }
}

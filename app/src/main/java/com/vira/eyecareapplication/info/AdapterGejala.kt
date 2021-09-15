package com.vira.eyecareapplication.info

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vira.eyecareapplication.R
import com.vira.eyecareapplication.databinding.RowTextBinding
import com.vira.eyecareapplication.info.models.GejalaList

class AdapterGejala(private val listGejala: ArrayList<GejalaList>): RecyclerView.Adapter<AdapterGejala.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RowTextBinding.bind(itemView)
        fun bind(gejalaList: GejalaList) {
            binding.textRow.text = gejalaList.gejalaText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.row_text, parent, false)
        return ViewHolder(mView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listGejala[position])
        if (position %2 == 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#DC746C"))
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#6360D1"))
        }
    }

    override fun getItemCount(): Int = listGejala.size

}
package com.vira.eyecareapplication.anatomy

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vira.eyecareapplication.R
import com.vira.eyecareapplication.anatomy.models.DefList
import com.vira.eyecareapplication.databinding.RowTextBinding

class AdapterDef(private val listDef: ArrayList<DefList>): RecyclerView.Adapter<AdapterDef.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RowTextBinding.bind(itemView)
        fun bind(defList: DefList) {
            binding.textRow.text = defList.defText
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.row_text, parent, false)
        return ViewHolder(mView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listDef[position])
        if (position %2 == 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#DC746C"))
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#6360D1"))
        }
    }

    override fun getItemCount(): Int = listDef.size
}
package com.vira.eyecareapplication.anatomy

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.vira.eyecareapplication.R
import com.vira.eyecareapplication.anatomy.models.StrukList
import com.vira.eyecareapplication.databinding.RowTextBinding

class AdapterStruktur(private val listStruk: ArrayList<StrukList>): RecyclerView.Adapter<AdapterStruktur.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.row_text, parent, false)
        return ViewHolder(mView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listStruk[position])
        if (position %2 == 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#DC746C"))
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#6360D1"))
        }

    }

    override fun getItemCount(): Int = listStruk.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RowTextBinding.bind(itemView)
        fun bind(strukList: StrukList) {
            binding.textRow.text = strukList.strukText
        }
    }
}

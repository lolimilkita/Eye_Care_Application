package com.vira.eyecareapplication.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vira.eyecareapplication.R
import com.vira.eyecareapplication.databinding.RowTextBinding
import com.vira.eyecareapplication.test.models.TestList

class AdapterTest(private val listTest: ArrayList<TestList>): RecyclerView.Adapter<AdapterTest.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RowTextBinding.bind(itemView)
        fun bind(testList: TestList) {
            binding.textRow.text = testList.testText
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.row_text, parent, false)
        return ViewHolder(mView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTest[position])
    }

    override fun getItemCount(): Int = listTest.size
}
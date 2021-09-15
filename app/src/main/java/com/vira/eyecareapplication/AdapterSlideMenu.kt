package com.vira.eyecareapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vira.eyecareapplication.anatomy.EyeAnatomy
import com.vira.eyecareapplication.databinding.RowMenuBinding
import com.vira.eyecareapplication.fakta.FactEye
import com.vira.eyecareapplication.models.MenuList
import com.vira.eyecareapplication.quiz.Quiz
import com.vira.eyecareapplication.test.TestAmslerGrid

class AdapterSlideMenu(private val listMenu: ArrayList<MenuList>): RecyclerView.Adapter<AdapterSlideMenu.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.row_menu, parent, false)
        return ViewHolder(mView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listMenu[position])
        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener{
            when (listMenu[position].name){
                "Menu1" -> {
                    val moveIntent = Intent(mContext, FactEye::class.java)
                    mContext.startActivity(moveIntent)
                }
                "Menu2" -> {
                    val moveIntent = Intent(mContext, TestAmslerGrid::class.java)
                    mContext.startActivity(moveIntent)
                }
                "Menu3" -> {
                    val moveIntent = Intent(mContext, DokterMataBekasi::class.java)
                    mContext.startActivity(moveIntent)
                }
                "Menu4" -> {
                    val moveIntent = Intent(mContext, EyeAnatomy::class.java)
                    mContext.startActivity(moveIntent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listMenu.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RowMenuBinding.bind(itemView)
        fun bind(menu: MenuList) {
            Glide.with(itemView)
                .load(menu.photo)
                .into(binding.imgItemMenu)
        }
    }
}
package com.vira.eyecareapplication.models

import com.vira.eyecareapplication.R

object DataMenu {
    private val slideName = arrayOf("Menu1", "Menu2", "Menu3", "Menu4")

    private val slideImage = intArrayOf(
        R.drawable.menu_1,
        R.drawable.menu_2,
        R.drawable.menu_3,
        R.drawable.menu_4
    )

    val dataList: ArrayList<MenuList>
        get() {
            val list = arrayListOf<MenuList>()
            for (position in slideName.indices) {
                val slide = MenuList()
                slide.name = slideName[position]
                slide.photo = slideImage[position]
                list.add(slide)
            }
            return list
        }
}
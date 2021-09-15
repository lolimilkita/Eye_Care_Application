package com.vira.eyecareapplication.anatomy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.anatomy.models.DataStruk
import com.vira.eyecareapplication.anatomy.models.StrukList
import com.vira.eyecareapplication.databinding.ActivityStrukturFungsiBinding

class StrukturFungsi : AppCompatActivity() {
    private lateinit var bindingStrukturFungsiBinding: ActivityStrukturFungsiBinding
    private val list: ArrayList<StrukList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingStrukturFungsiBinding = ActivityStrukturFungsiBinding.inflate(layoutInflater)
        setContentView(bindingStrukturFungsiBinding.root)
        supportActionBar?.hide()

        list.addAll(DataStruk.dataList)

        bindingStrukturFungsiBinding.rvStruk.layoutManager = LinearLayoutManager(this)
        bindingStrukturFungsiBinding.rvStruk.adapter = AdapterStruktur(list)

        bindingStrukturFungsiBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@StrukturFungsi, EyeAnatomy::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
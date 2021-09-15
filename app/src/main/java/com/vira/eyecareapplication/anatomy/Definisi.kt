package com.vira.eyecareapplication.anatomy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.anatomy.models.DataDef
import com.vira.eyecareapplication.anatomy.models.DefList
import com.vira.eyecareapplication.databinding.ActivityDefinisiBinding

class Definisi : AppCompatActivity() {
    private lateinit var bindingDefinisiBinding: ActivityDefinisiBinding
    private val list: ArrayList<DefList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDefinisiBinding = ActivityDefinisiBinding.inflate(layoutInflater)
        setContentView(bindingDefinisiBinding.root)
        supportActionBar?.hide()

        list.addAll(DataDef.dataListDef)

        bindingDefinisiBinding.rvDef.layoutManager = LinearLayoutManager(this)
        bindingDefinisiBinding.rvDef.adapter = AdapterDef(list)

        bindingDefinisiBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@Definisi, EyeAnatomy::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
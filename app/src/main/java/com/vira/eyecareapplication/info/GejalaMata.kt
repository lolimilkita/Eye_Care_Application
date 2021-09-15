package com.vira.eyecareapplication.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.databinding.ActivityGejalaMataBinding
import com.vira.eyecareapplication.info.models.DataGejala
import com.vira.eyecareapplication.info.models.GangguanList
import com.vira.eyecareapplication.info.models.GejalaList

class GejalaMata : AppCompatActivity() {
    private lateinit var bindingGejalaMataBinding: ActivityGejalaMataBinding
    private val list: ArrayList<GejalaList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingGejalaMataBinding = ActivityGejalaMataBinding.inflate(layoutInflater)
        setContentView(bindingGejalaMataBinding.root)
        supportActionBar?.hide()
        list.addAll(DataGejala.dataListGejala)

        bindingGejalaMataBinding.rvGejala.layoutManager = LinearLayoutManager(this)
        bindingGejalaMataBinding.rvGejala.adapter = AdapterGejala(list)

        bindingGejalaMataBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@GejalaMata, InfoEyeCare::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
package com.vira.eyecareapplication.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.databinding.ActivityMataSehatBinding
import com.vira.eyecareapplication.info.models.DataSehat
import com.vira.eyecareapplication.info.models.GejalaList
import com.vira.eyecareapplication.info.models.SehatList

class MataSehat : AppCompatActivity() {
    private lateinit var bindingMataSehatBinding: ActivityMataSehatBinding
    private val list: ArrayList<SehatList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMataSehatBinding = ActivityMataSehatBinding.inflate(layoutInflater)
        setContentView(bindingMataSehatBinding.root)
        supportActionBar?.hide()
        list.addAll(DataSehat.dataListSehat)

        bindingMataSehatBinding.rvSehat.layoutManager = LinearLayoutManager(this)
        bindingMataSehatBinding.rvSehat.adapter = AdapterSehat(list)

        bindingMataSehatBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@MataSehat, InfoEyeCare::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
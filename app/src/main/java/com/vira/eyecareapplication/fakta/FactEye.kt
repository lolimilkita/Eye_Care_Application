package com.vira.eyecareapplication.fakta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityFactEyeBinding

class FactEye : AppCompatActivity() {
    private lateinit var bindingFactEyeBinding: ActivityFactEyeBinding
    private val list: ArrayList<FaktaList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingFactEyeBinding = ActivityFactEyeBinding.inflate(layoutInflater)
        setContentView(bindingFactEyeBinding.root)
        supportActionBar?.hide()
        list.addAll(DataFakta.dataListFakta)
        bindingFactEyeBinding.rvFact.layoutManager = LinearLayoutManager(this)
        bindingFactEyeBinding.rvFact.adapter = AdapterFakta(list)

        bindingFactEyeBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@FactEye, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
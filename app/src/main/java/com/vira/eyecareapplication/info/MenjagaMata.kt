package com.vira.eyecareapplication.info

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.databinding.ActivityMenjagaMataBinding
import com.vira.eyecareapplication.info.models.DataMenjaga
import com.vira.eyecareapplication.info.models.MenjagaList

class MenjagaMata : AppCompatActivity() {
    private lateinit var bindingMenjagaMataBinding: ActivityMenjagaMataBinding
    private val list: ArrayList<MenjagaList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMenjagaMataBinding = ActivityMenjagaMataBinding.inflate(layoutInflater)
        setContentView(bindingMenjagaMataBinding.root)
        supportActionBar?.hide()

        list.addAll(DataMenjaga.dataListMenjaga)

        bindingMenjagaMataBinding.rvMenjaga.layoutManager = LinearLayoutManager(this)
        bindingMenjagaMataBinding.rvMenjaga.adapter = AdapterMenjaga(list)

        bindingMenjagaMataBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@MenjagaMata, InfoEyeCare::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
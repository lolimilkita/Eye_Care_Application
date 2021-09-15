package com.vira.eyecareapplication.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityGangguanMataBinding
import com.vira.eyecareapplication.fakta.FaktaList
import com.vira.eyecareapplication.info.models.DataGangguan
import com.vira.eyecareapplication.info.models.GangguanList

class GangguanMata : AppCompatActivity() {
    private lateinit var bindingGangguanMataBinding: ActivityGangguanMataBinding
    private val list: ArrayList<GangguanList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingGangguanMataBinding = ActivityGangguanMataBinding.inflate(layoutInflater)
        setContentView(bindingGangguanMataBinding.root)
        supportActionBar?.hide()
        list.addAll(DataGangguan.dataListGangguan)
        bindingGangguanMataBinding.rvGangguan.layoutManager = LinearLayoutManager(this)
        bindingGangguanMataBinding.rvGangguan.adapter = AdapterGangguan(list)

        bindingGangguanMataBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@GangguanMata, InfoEyeCare::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }

    }
}
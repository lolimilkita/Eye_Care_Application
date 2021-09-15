package com.vira.eyecareapplication.anatomy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.anatomy.models.CaraList
import com.vira.eyecareapplication.anatomy.models.DataCara
import com.vira.eyecareapplication.databinding.ActivityCaraKerjaBinding

class CaraKerja : AppCompatActivity() {
    private lateinit var bindingCaraKerjaBinding: ActivityCaraKerjaBinding
    private val list: ArrayList<CaraList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCaraKerjaBinding = ActivityCaraKerjaBinding.inflate(layoutInflater)
        setContentView(bindingCaraKerjaBinding.root)
        supportActionBar?.hide()
        list.addAll(DataCara.dataListCara)
        bindingCaraKerjaBinding.rvCara.layoutManager = LinearLayoutManager(this)
        bindingCaraKerjaBinding.rvCara.adapter = AdapterCara(list)

        bindingCaraKerjaBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@CaraKerja, EyeAnatomy::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
package com.vira.eyecareapplication.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityInfoEyeCareBinding

class InfoEyeCare : AppCompatActivity() {
    private lateinit var bindingInfoEyeCareBinding: ActivityInfoEyeCareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingInfoEyeCareBinding = ActivityInfoEyeCareBinding.inflate(layoutInflater)
        setContentView(bindingInfoEyeCareBinding.root)
        supportActionBar?.hide()

        bindingInfoEyeCareBinding.buttonGangguan.setOnClickListener {
            val moveIntent = Intent(this@InfoEyeCare, GangguanMata::class.java)
            startActivity(moveIntent)
        }

        bindingInfoEyeCareBinding.buttonKesehatan.setOnClickListener {
            val moveIntent = Intent(this@InfoEyeCare, MenjagaMata::class.java)
            startActivity(moveIntent)
        }

        bindingInfoEyeCareBinding.buttonCiriSehat.setOnClickListener {
            val moveIntent = Intent(this@InfoEyeCare, MataSehat::class.java)
            startActivity(moveIntent)
        }

        bindingInfoEyeCareBinding.buttonGejala.setOnClickListener {
            val moveIntent = Intent(this@InfoEyeCare, GejalaMata::class.java)
            startActivity(moveIntent)
        }

        bindingInfoEyeCareBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@InfoEyeCare, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
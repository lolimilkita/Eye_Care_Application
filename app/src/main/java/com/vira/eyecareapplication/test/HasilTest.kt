package com.vira.eyecareapplication.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.DokterMataBekasi
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityHasilTestBinding

class HasilTest : AppCompatActivity() {
    private lateinit var bindingHasilTestBinding: ActivityHasilTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingHasilTestBinding = ActivityHasilTestBinding.inflate(layoutInflater)
        setContentView(bindingHasilTestBinding.root)
        supportActionBar?.hide()

        bindingHasilTestBinding.buttonDokter.setOnClickListener {
            val moveIntent = Intent(this@HasilTest, DokterMataBekasi::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }

        bindingHasilTestBinding.buttonHome.setOnClickListener {
            val moveIntent = Intent(this@HasilTest, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }

        bindingHasilTestBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@HasilTest, TestKedua::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
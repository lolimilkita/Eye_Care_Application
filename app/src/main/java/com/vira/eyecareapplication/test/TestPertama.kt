package com.vira.eyecareapplication.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.anatomy.EyeAnatomy
import com.vira.eyecareapplication.databinding.ActivityTestPertamaBinding

class TestPertama : AppCompatActivity() {
    private lateinit var bindingTestPertamaBinding: ActivityTestPertamaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTestPertamaBinding = ActivityTestPertamaBinding.inflate(layoutInflater)
        setContentView(bindingTestPertamaBinding.root)
        supportActionBar?.hide()

        bindingTestPertamaBinding.buttonLanjut.setOnClickListener {
            val moveIntent = Intent(this@TestPertama, TestKedua::class.java)
            startActivity(moveIntent)
        }

        bindingTestPertamaBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@TestPertama, TestAmslerGrid::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
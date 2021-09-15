package com.vira.eyecareapplication.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.databinding.ActivityTestKeduaBinding

class TestKedua : AppCompatActivity() {
    private lateinit var bindingTestKeduaBinding: ActivityTestKeduaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTestKeduaBinding = ActivityTestKeduaBinding.inflate(layoutInflater)
        setContentView(bindingTestKeduaBinding.root)
        supportActionBar?.hide()

        bindingTestKeduaBinding.buttonLanjut.setOnClickListener {
            val moveIntent = Intent(this@TestKedua, HasilTest::class.java)
            startActivity(moveIntent)
        }

        bindingTestKeduaBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@TestKedua, TestPertama::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
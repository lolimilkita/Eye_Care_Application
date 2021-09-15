package com.vira.eyecareapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.databinding.ActivityTentangAppBinding

class TentangApp : AppCompatActivity() {
    private lateinit var bindingTentangAppBinding: ActivityTentangAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTentangAppBinding = ActivityTentangAppBinding.inflate(layoutInflater)
        setContentView(bindingTentangAppBinding.root)
        supportActionBar?.hide()

        bindingTentangAppBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@TentangApp, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
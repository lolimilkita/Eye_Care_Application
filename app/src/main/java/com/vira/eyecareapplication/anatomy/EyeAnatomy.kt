package com.vira.eyecareapplication.anatomy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityEyeAnatomyBinding

class EyeAnatomy : AppCompatActivity() {
    private lateinit var bindingEyeAnatomyBinding: ActivityEyeAnatomyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingEyeAnatomyBinding = ActivityEyeAnatomyBinding.inflate(layoutInflater)
        setContentView(bindingEyeAnatomyBinding.root)
        supportActionBar?.hide()

        bindingEyeAnatomyBinding.buttonDefinisi.setOnClickListener {
            val moveIntent = Intent(this@EyeAnatomy, Definisi::class.java)
            startActivity(moveIntent)
        }

        bindingEyeAnatomyBinding.buttonStruktur.setOnClickListener {
            val moveIntent = Intent(this@EyeAnatomy, StrukturFungsi::class.java)
            startActivity(moveIntent)
        }

        bindingEyeAnatomyBinding.buttonCara.setOnClickListener {
            val moveIntent = Intent(this@EyeAnatomy, CaraKerja::class.java)
            startActivity(moveIntent)
        }

        bindingEyeAnatomyBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@EyeAnatomy, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
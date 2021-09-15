package com.vira.eyecareapplication.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.databinding.ActivityTestAmslerGridBinding
import com.vira.eyecareapplication.test.models.DataTest
import com.vira.eyecareapplication.test.models.TestList

class TestAmslerGrid : AppCompatActivity() {
    private lateinit var bindingTestAmslerGridBinding: ActivityTestAmslerGridBinding
    private val list: ArrayList<TestList> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTestAmslerGridBinding = ActivityTestAmslerGridBinding.inflate(layoutInflater)
        setContentView(bindingTestAmslerGridBinding.root)
        supportActionBar?.hide()

        list.addAll(DataTest.dataListTest)

        bindingTestAmslerGridBinding.rvTest.layoutManager = LinearLayoutManager(this)
        bindingTestAmslerGridBinding.rvTest.adapter = AdapterTest(list)

        bindingTestAmslerGridBinding.buttonMulai.setOnClickListener {
            val moveIntent = Intent(this@TestAmslerGrid, TestPertama::class.java)
            startActivity(moveIntent)
        }

        bindingTestAmslerGridBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@TestAmslerGrid, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
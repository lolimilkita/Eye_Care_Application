package com.vira.eyecareapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.databinding.ActivityMainBinding
import com.vira.eyecareapplication.info.InfoEyeCare
import com.vira.eyecareapplication.models.DataMenu
import com.vira.eyecareapplication.models.MenuList
import com.vira.eyecareapplication.quiz.Quiz

class MainActivity : AppCompatActivity() {
    private lateinit var bindingActivityMainBinding: ActivityMainBinding
    private val list: ArrayList<MenuList> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMainBinding.root)
        supportActionBar?.hide()
        list.addAll(DataMenu.dataList)

        bindingActivityMainBinding.rvMenu.layoutManager = LinearLayoutManager(this)
        bindingActivityMainBinding.rvMenu.adapter = AdapterSlideMenu(list)

        bindingActivityMainBinding.buttonInfo.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, InfoEyeCare::class.java)
            startActivity(moveIntent)
        }

        bindingActivityMainBinding.btnDeviceInfo.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, TentangApp::class.java)
            startActivity(moveIntent)
        }

        bindingActivityMainBinding.btnQuiz.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, Quiz::class.java)
            startActivity(moveIntent)
        }

//        bindingActivityMainBinding.btnMaps.setOnClickListener {
//            val intent = Intent(this@MainActivity, DisplayMapsActivity::class.java)
//            startActivity(intent)
//        }


    }
}
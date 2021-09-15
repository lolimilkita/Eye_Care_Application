package com.vira.eyecareapplication.quiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.R

class HasilQuiz : AppCompatActivity() {
    private var totalTrue = 0
    private var setDone: String = ""

    companion object {
        const val EXTRA_TOTAL = "extra_total"
        const val EXTRA_DONE = "extra_done"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_quiz)

        totalTrue = intent.getIntExtra(Quiz2.EXTRA_TOTAL, 0)
        setDone = intent.getStringExtra(Quiz2.EXTRA_DONE).toString()

        val btnHome: Button = findViewById(R.id.buttonHome)
        val textHasil: TextView = findViewById(R.id.textHasil)

        textHasil.text = totalTrue.toString()

        when (intent?.getStringExtra(EXTRA_DONE)) {
            "done" -> {
                when (totalTrue) {
                    0 -> {
                        textHasil.text = "Sayang sekali jawaban anda tidak ada yang benar"
                    }
                    1 -> {
                        textHasil.text = "Anda mendapatkan nilai 10!!!.\n" + "Dari 10 soal anda menjawab dengan hanya benar 1"
                    }
                    2 -> {
                        textHasil.text = "Anda mendapatkan nilai 20!!!.\n" + "Dari 10 soal anda menjawab dengan hanya benar 2"
                    }
                    3 -> {
                        textHasil.text = "Anda mendapatkan nilai 30!!!.\n" + "Dari 10 soal anda menjawab dengan hanya benar 3"
                    }
                    4 -> {
                        textHasil.text = "Anda mendapatkan nilai 40!!!.\n" + "Dari 10 soal anda menjawab dengan hanya benar 4"
                    }
                    5 -> {
                        textHasil.text = "Anda mendapatkan nilai 50!!!.\n" + "Dari 10 soal anda menjawab dengan salah 5"
                    }
                    6 -> {
                        textHasil.text = "Anda mendapatkan nilai 60!!!.\n" + "Dari 10 soal anda menjawab dengan hanya salah 4"
                    }
                    7 -> {
                        textHasil.text = "Selamat Anda mendapatkan nilai 70!!!.\n" + "Dari 10 soal anda menjawab dengan hanya salah 3"
                    }
                    8 -> {
                        textHasil.text = "Selamat Anda mendapatkan nilai 80!!!.\n" + "Dari 10 soal anda menjawab dengan hanya salah 2"
                    }
                    9 -> {
                        textHasil.text = "Selamat Anda mendapatkan nilai 90!!!.\n" + "Dari 10 soal anda menjawab dengan hanya salah 1"
                    }
                    10 -> {
                        textHasil.text = "Selamat Anda mendapatkan nilai 100!!!.\n" + "Dari 10 soal anda menjawab dengan benar semua"
                    }
                }
            }
        }

        btnHome.setOnClickListener {
            val moveIntent = Intent(this@HasilQuiz, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }
}
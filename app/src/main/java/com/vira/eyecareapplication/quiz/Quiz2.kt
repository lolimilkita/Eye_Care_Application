package com.vira.eyecareapplication.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import com.vira.eyecareapplication.R

class Quiz2 : AppCompatActivity(), View.OnClickListener {
    private var q6TrueCheck = false
    private var q7TrueCheck = false
    private var q8TrueCheck = false
    private var q9TrueCheck = false
    private var q10TrueCheck = false
    private var setResult: String = "blank"
    private var totalTrue = 0
    private var setDone: String = "done"

    companion object {
        const val EXTRA_TOTAL = "extra_total"
        const val EXTRA_DONE = "extra_done"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)
        supportActionBar?.hide()

        totalTrue = intent.getIntExtra(EXTRA_TOTAL, 0)

        val btnNext2: Button = findViewById(R.id.next_quis1)
        btnNext2.setOnClickListener(this)

    }

    fun onRbClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.id) {
                R.id.btn_a_question6 ->
                    if (checked) {
                        q6TrueCheck = true
                    }
                R.id.btn_b_question6 ->
                    if (checked) {
                        q6TrueCheck = false
                    }
                R.id.btn_a_question7 ->
                    if (checked) {
                        q7TrueCheck = true
                    }
                R.id.btn_b_question7 ->
                    if (checked) {
                        q7TrueCheck = false
                    }
                R.id.btn_a_question8 ->
                    if (checked) {
                        q8TrueCheck = true
                    }
                R.id.btn_b_question8 ->
                    if (checked) {
                        q8TrueCheck = false
                    }
                R.id.btn_a_question9 ->
                    if (checked) {
                        q9TrueCheck = false
                    }
                R.id.btn_b_question9 ->
                    if (checked) {
                        q9TrueCheck = true
                    }
                R.id.btn_a_question10 ->
                    if (checked) {
                        q10TrueCheck = true
                    }
                R.id.btn_b_question10 ->
                    if (checked) {
                        q10TrueCheck = false
                    }
            }
            setResult = "notBlank"
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.next_quis1 -> {
                when (setResult) {
                    "blank" ->
                        Toast.makeText(this, "Anda harus memilih Jawaban", Toast.LENGTH_SHORT).show()
                    "notBlank" ->
                        if (q6TrueCheck && q7TrueCheck && q8TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 5
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q8TrueCheck && q9TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q8TrueCheck && q10TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q8TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q8TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q8TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q9TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck && q10TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q8TrueCheck && q9TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q8TrueCheck && q10TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q8TrueCheck && q9TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q8TrueCheck && q10TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q8TrueCheck && q9TrueCheck && q10TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q7TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q8TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q9TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck && q10TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q8TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q9TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck && q10TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q8TrueCheck && q9TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q8TrueCheck && q10TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q9TrueCheck && q10TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q6TrueCheck) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q7TrueCheck) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q8TrueCheck) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q9TrueCheck) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q10TrueCheck) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        } else {
                            totalTrue += 0
                            val moveIntentData = Intent(this@Quiz2, HasilQuiz::class.java)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_TOTAL, totalTrue)
                            moveIntentData.putExtra(HasilQuiz.EXTRA_DONE, setDone)
                            startActivity(moveIntentData)
                            finish()
                        }
                }
            }
        }
    }
}
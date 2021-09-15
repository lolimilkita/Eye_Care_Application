package com.vira.eyecareapplication.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import com.vira.eyecareapplication.MainActivity
import com.vira.eyecareapplication.R

class Quiz : AppCompatActivity(), View.OnClickListener {
    private var q1TrueCheck = false
    private var q2TrueCheck = false
    private var q3TrueCheck = false
    private var q4TrueCheck = false
    private var q5TrueCheck = false
    private var setResult: String = "blank"
    private var totalTrue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        supportActionBar?.hide()

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        val btnNext1: Button = findViewById(R.id.next_quis1)
        btnNext1.setOnClickListener(this)

        btnBack.setOnClickListener {
            val moveIntent = Intent(this@Quiz, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }
    }

    fun onRbClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.id) {
                R.id.btn_a_question6 ->
                    if (checked) {
                        q1TrueCheck = false
                    }
                R.id.btn_b_question6 ->
                    if (checked) {
                        q1TrueCheck = true
                    }
                R.id.btn_a_question7 ->
                    if (checked) {
                        q2TrueCheck = true
                    }
                R.id.btn_b_question7 ->
                    if (checked) {
                        q2TrueCheck = false
                    }
                R.id.btn_a_question8 ->
                    if (checked) {
                        q3TrueCheck = true
                    }
                R.id.btn_b_question8 ->
                    if (checked) {
                        q3TrueCheck = false
                    }
                R.id.btn_a_question9 ->
                    if (checked) {
                        q4TrueCheck = true
                    }
                R.id.btn_b_question9 ->
                    if (checked) {
                        q4TrueCheck = false
                    }
                R.id.btn_a_question10 ->
                    if (checked) {
                        q5TrueCheck = false
                    }
                R.id.btn_b_question10 ->
                    if (checked) {
                        q5TrueCheck = true
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
                        if (q1TrueCheck && q2TrueCheck && q3TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 5
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q3TrueCheck && q4TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q3TrueCheck && q5TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q3TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q3TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 4
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q3TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q4TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck && q5TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q3TrueCheck && q4TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q3TrueCheck && q5TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q3TrueCheck && q4TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q3TrueCheck && q5TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q3TrueCheck && q4TrueCheck && q5TrueCheck) {
                            totalTrue += 3
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q2TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q3TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q4TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck && q5TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q3TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q4TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q2TrueCheck && q5TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q3TrueCheck && q4TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q3TrueCheck && q5TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q4TrueCheck && q5TrueCheck) {
                            totalTrue += 2
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else if (q1TrueCheck || q2TrueCheck || q3TrueCheck || q4TrueCheck || q5TrueCheck ) {
                            totalTrue += 1
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        } else {
                            totalTrue += 0
                            val moveIntentData = Intent(this@Quiz, Quiz2::class.java)
                            moveIntentData.putExtra(Quiz2.EXTRA_TOTAL, totalTrue)
                            startActivity(moveIntentData)
                            finish()
                        }
                }
            }
        }
    }

}
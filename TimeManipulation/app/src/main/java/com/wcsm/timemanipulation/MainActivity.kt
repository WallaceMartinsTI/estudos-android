package com.wcsm.timemanipulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var timerTextMinus: TextView
    private lateinit var startCounterMinus: Button
    private lateinit var countDownTimer: CountDownTimer
    private var timeLeftInMillis: Long = 60000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startCounterMinus = findViewById(R.id.button)

        timerTextMinus = findViewById(R.id.textview)
        timerTextMinus.text = "Tempo: 00:00"

        startCounterMinus.setOnClickListener {
            startCounterMinus()
        }
    }

    private fun startCounterMinus() {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateCountdownUI()
            }

            override fun onFinish() {
                timerTextMinus.text = "Tempo Encerrado"
            }
        }.start()
    }

    private fun updateCountdownUI() {
        val minutes = (timeLeftInMillis / 1000) / 60
        val seconds = (timeLeftInMillis / 1000) % 60
        timerTextMinus.text = String.format("%02d:%02d", minutes, seconds)
    }
}
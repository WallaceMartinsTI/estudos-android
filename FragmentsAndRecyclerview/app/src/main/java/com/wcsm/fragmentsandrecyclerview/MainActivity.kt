package com.wcsm.fragmentsandrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wcsm.fragmentsandrecyclerview.example01.CustomersAndSuppliersActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnEx1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEx1 = findViewById(R.id.btn_ex1)
        btnEx1.setOnClickListener {
            val intent = Intent(this, CustomersAndSuppliersActivity::class.java)
            startActivity(intent)
        }
    }
}
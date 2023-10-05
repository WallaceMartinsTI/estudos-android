package com.wcsm.fragmentsandrecyclerview.example01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wcsm.fragmentsandrecyclerview.R

class CustomersAndSuppliersActivity : AppCompatActivity() {

    private lateinit var btnCustomers: Button
    private lateinit var btnSuppliers: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customers_and_suppliers)

        btnCustomers = findViewById(R.id.cs_btn_customers)
        btnSuppliers = findViewById(R.id.cs_btn_suppliers)

        btnCustomers.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.cs_fragment_container, CustomersFragment())
                .commit()
        }

        btnSuppliers.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.cs_fragment_container, SuppliersFragment())
                .commit()
        }
    }
}
package com.wcsm.fragmentsandrecyclerview.example01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wcsm.fragmentsandrecyclerview.R

class CustomersFragment : Fragment() {

    private lateinit var rvCustomerList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_customers,
            container,
            false
        )

        val customers = listOf(
            Company("Apple", "Tecnologia", 2018, 350000.00),
            Company("Audi", "Automotivo", 2015, 415000.00),
            Company("Nestlé", "Alimentício", 2022, 218000.00),
            Company("Nubank", "Financeiro", 2020, 280000.00),
            Company("J.P. Morgan", "Investimento", 2010, 520000.00)
        )

        rvCustomerList = view.findViewById(R.id.cs_customers_list)
        rvCustomerList.adapter = CompanyAdapter(customers)
        rvCustomerList.layoutManager = LinearLayoutManager(requireContext())

        return view
    }
}
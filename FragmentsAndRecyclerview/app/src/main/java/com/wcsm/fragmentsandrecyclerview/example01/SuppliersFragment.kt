package com.wcsm.fragmentsandrecyclerview.example01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wcsm.fragmentsandrecyclerview.R

class SuppliersFragment : Fragment() {

    private lateinit var rvSuppliersList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_suppliers,
            container,
            false
        )

        val suppliers = listOf(
            Company("Samsung", "Tecnologia", 2016, 420560.00),
            Company("Bosch", "Automotivo", 2012, 515312.00),
            Company("Barry Callebaut", "Alimentício", 2020, 338500.00),
            Company("TechFin Solutions", "Financeiro", 2018, 310200.00),
            Company("Bloomberg", "Investimento", 2008, 575608.00)
        )

        rvSuppliersList = view.findViewById(R.id.cs_suppliers_list)
        rvSuppliersList.adapter = CompanyAdapter(suppliers)
        rvSuppliersList.layoutManager = LinearLayoutManager(requireContext())

        return view
    }
}

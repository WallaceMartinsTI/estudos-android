package com.wcsm.fragmentsandrecyclerview.example01

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.fragmentsandrecyclerview.R
import java.text.NumberFormat
import java.util.Locale

class CompanyAdapter(
    private val customers: List<Company>
) : Adapter<CompanyAdapter.CustomersViewHolder>() {

    inner class CustomersViewHolder(val itemView: View) : ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.cs_company_name)
        val sector: TextView = itemView.findViewById(R.id.cs_company_sector)
        val since: TextView = itemView.findViewById(R.id.cs_company_since)
        val invoice: TextView = itemView.findViewById(R.id.cs_company_invoice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cs_companies, parent, false)

        return CustomersViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CustomersViewHolder, position: Int) {
        val customer = customers[position]
        holder.name.text = "Empresa: ${customer.name}"
        holder.sector.text = "Setor: ${customer.sector}"
        holder.since.text = "Desde: ${customer.sinceYear}"
        holder.invoice.text = "Receita: ${currencyFormat(customer.invoice)}"
    }

    override fun getItemCount(): Int {
        return customers.size
    }

    private fun currencyFormat(value: Double) : String {
        val currencyType = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        return currencyType.format(value)
    }
}
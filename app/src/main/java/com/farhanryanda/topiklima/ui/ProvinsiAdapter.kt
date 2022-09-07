package com.farhanryanda.topiklima.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.farhanryanda.topiklima.R

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>): RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.tv_provinsi)
        var namaIbuKota = view.findViewById<TextView>(R.id.tv_ibukota)
        var gambarProvinsi = view.findViewById<ImageView>(R.id.img_provinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = "Provinsi = ${listProvinsi[position].provinsi}"
        holder.namaIbuKota.text = "Ibukota = ${listProvinsi[position].ibukota}"
        holder.gambarProvinsi.setImageResource(listProvinsi[position].img)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}
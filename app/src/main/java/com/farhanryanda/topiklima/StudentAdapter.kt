package com.farhanryanda.topiklima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent: ArrayList<ListStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    //ambil id dari layout
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.tv_namaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.tv_nimStudent)
        var gambarStudent = view.findViewById<ImageView>(R.id.img_student)
    }

    //buat object viewholder - untuk register view - inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    //onBindViewHolder - untuk set data ke layoutnya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.gambarStudent.setImageResource(listStudent[position].img)
    }

    // menampilkan ada berapa data yg ada ke layoutnya
    override fun getItemCount(): Int {
        return listStudent.size
    }
}
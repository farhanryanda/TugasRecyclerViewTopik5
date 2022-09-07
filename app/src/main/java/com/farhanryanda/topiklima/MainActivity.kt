package com.farhanryanda.topiklima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listStudent = arrayListOf(
            ListStudent("Farhan","123",R.drawable.ic_launcher_foreground),
            ListStudent("Titi","312",R.drawable.ic_launcher_foreground),
            ListStudent("Dwika","3123",R.drawable.ic_launcher_foreground),
            ListStudent("Rois","312",R.drawable.ic_launcher_foreground),
            ListStudent("Wiwit","312",R.drawable.ic_launcher_foreground),
            ListStudent("Fori","312",R.drawable.ic_launcher_foreground),
            ListStudent("Kolak","312",R.drawable.ic_launcher_foreground)
        )

        var adapterStudent = StudentAdapter(listStudent)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        val gv = GridLayoutManager(this,2)
        rv_student.layoutManager = lm
        rv_student.adapter = adapterStudent
    }
}
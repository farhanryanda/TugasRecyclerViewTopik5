package com.farhanryanda.topiklima.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.farhanryanda.topiklima.ListStudent
import com.farhanryanda.topiklima.R
import kotlinx.android.synthetic.main.activity_provinsi.*

class ProvinsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provinsi)

        var listProvinsi = arrayListOf(
            ListProvinsi("Bali","Denpasar",R.drawable.bali),
            ListProvinsi("Banten","Serang",R.drawable.banten),
            ListProvinsi("Bengkulu","Bengkulu",R.drawable.bengkulu),
            ListProvinsi("Gorontalo","Gorontalo",R.drawable.gorontalo),
            ListProvinsi("DKI Jakarta","Jakarta",R.drawable.jakarta),
            ListProvinsi("Jambi","Jambi",R.drawable.jambi),
            ListProvinsi("Jawa Barat","Bandung",R.drawable.jawa_barat),
            ListProvinsi("Jawa Tengah","Semarang",R.drawable.jawa_tengah),
            ListProvinsi("Kalimantan Tengah","Palangkaraya",R.drawable.kalimantan_tengah),
            ListProvinsi("DI Yogyakarta","Yogyakarta",R.drawable.yogyakarta)
        )

        var adapterProvinsi = ProvinsiAdapter(listProvinsi)
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        rv_provinsi.layoutManager = lm
        rv_provinsi.adapter = adapterProvinsi
    }
}
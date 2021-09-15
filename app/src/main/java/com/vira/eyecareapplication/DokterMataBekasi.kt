package com.vira.eyecareapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.vira.eyecareapplication.databinding.ActivityDokterMataBekasiBinding
import com.vira.eyecareapplication.models.Place
import com.vira.eyecareapplication.models.UserMap
import com.vira.eyecareapplication.test.TestAmslerGrid

const val EXTRA_USER_MAP = "EXTRA_USER_MAP"
class DokterMataBekasi : AppCompatActivity() {
    private lateinit var bindingDokterMataBekasiBinding: ActivityDokterMataBekasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDokterMataBekasiBinding = ActivityDokterMataBekasiBinding.inflate(layoutInflater)
        setContentView(bindingDokterMataBekasiBinding.root)
        supportActionBar?.hide()

        val userMaps = generateSampleData()

        // set layout manager on the recycler view
        bindingDokterMataBekasiBinding.rvMaps.layoutManager = LinearLayoutManager(this)
        // set adapter on the recycler view
        bindingDokterMataBekasiBinding.rvMaps.adapter = MapsAdapter(this, userMaps, object: MapsAdapter.OnClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@DokterMataBekasi, DisplayMapsActivity::class.java)
                intent.putExtra(EXTRA_USER_MAP, userMaps[position])
                startActivity(intent)

                // when user taps on view in RV, vigate to activity
            }

        })

        bindingDokterMataBekasiBinding.btnBack.setOnClickListener {
            val moveIntent = Intent(this@DokterMataBekasi, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
        }

    }

    private fun generateSampleData(): List<UserMap> {
        return listOf(
            UserMap("Bekasi Timur",
                listOf(
                    Place("Praktek dokter Spesialis Mata Dr. Zamril Daya", "Dokter dan juga menjual kaca mata, 3.4 bintang review 30 ulasan", -6.236771905101285, 107.00707551639493),
                    Place("POLI MATA", "di RSU Juwita, 4.0 bintang review 1 ulasan", -6.251789784243229, 107.00098588526873),
                    Place("Klinik Bakti Kartini", "Klinik Medis, 3.8 bintang review 36 ulasan", -6.22592029337152, 107.02670770667648),
                    Place("Praktek Dokter Fikri", "4.6 bintang review 5 ulasan", -6.251715587054181, 107.02036757998309),
                    Place("Klinik Utama Mata JEC @ Bekasi", "Rumah Sakit, 4.8 bintang review 50 ulasan", -6.233205313557726, 106.99141723593401)
                )),
            UserMap("Bekasi Utara",
                listOf(
                    Place("Klinik Mata SMEC Bekasi", "Klinik Mata, 4.5 bintang review 37 ulasan", -6.198823017258235, 106.97537363875973),
                    Place("RS Seto Hasbadi", "Rumah sakit, 3.4 bintang review 167 ulasan", -6.201806103253056, 106.98881786937434),
                    Place("POLIKLINIK MATA RS Anna Medika", "Di RS Anna Medika Bekasi, 3.4 bintang review 385 ulasan", -6.222967680714739, 107.02215701134871),
                    Place("Klinik Sapta Mitra Bekasi Utara", "Rumah Sakit, Tidak ada ulasan", -6.209508809198868, 107.00198474791662),
                    Place("Klinik Batara", "Klinik Medis, 3.8 bintang review 24 ulasan", -6.199334479895585, 107.02911087444677)
                )),
            UserMap("Bekasi Selatan",
                listOf(
                    Place("Klinik Mata Dr. Chambali, SP.M", "Pusat Perawatan Mata, 4.6 bintang review 17 ulasan", -6.23427598770813, 106.98219352938075),
                    Place("KLINIK Dr Rahman Medical Center", "Klinik Medis, 4.0 bintang review 64 ulasan", -6.25907105314901, 106.98542811378749),
                    Place("VIO Optical Clinic Galaxy City", "Toko Optik, 5.0 bintang review 307 ulasan", -6.274279253165413, 106.9743510400842),
                    Place("Alamat Praktek Dr. A. Bamby Sutrisno Sp. M", "Dokter Umum, Tidak ada ulasan", -6.248841413082176, 106.9621530609197),
                    Place("Poli Mata", "Di rumah sakit Primaya Hospital Bekasi Barat, tidak ada ulasan", -6.247736266115022, 106.98378293723556)
                )),
            UserMap("Bekasi Barat",
                listOf(
                    Place("Vio Optical Clinic", "Pusat Perawatan Mata, 5.0 bintang review 676 ulasan", -6.172439465446658, 106.97488339336084),
                    Place("RS Ananda Bekasi", "Rumah sakit umum, 3.9 bintang review 858 ulasan", -6.2110926646019635, 106.97722297568856),
                    Place("RS Citra Harapan", "Rumah sakit umum, 2.8 bintang review 278 ulasan", -6.1851264468075895, 106.97731256096716)
                )
            )
        )
    }
}
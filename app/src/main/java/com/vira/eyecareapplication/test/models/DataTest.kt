package com.vira.eyecareapplication.test.models

object DataTest {
    private val noText = intArrayOf(1)
    private val textTest = arrayOf("Petunjuk untuk menggunakan kisi Amsler :\n" +
            "\n" +
            "[ Tesnya adalah kisi-kisi sel 10 X 10 dengan penunjukan titik tebal hitam sebagai tempat fiksasi visual dan setiap mata diuji secara terpisah ]\n" +
            "\n" +
            "Pengujian dilakukan dengan pencahayaan yang baik pada jarak dekat.\n" +
            "Gunakan kacamata baca (jika menggunakan kacamata baca).\n" +
            "Jaga agar kisi Amsler berada pada jarak membaca (35 cm).\n" +
            "Tutupi mata kiri Anda dengan tangan.\n" +
            "Lihat titik tengah dengan mata Anda yang lain.")

    val dataListTest: ArrayList<TestList>
        get() {
            val list = arrayListOf<TestList>()
            for (position in noText.indices) {
                val slide = TestList()
                slide.noText = noText[position]
                slide.testText = textTest[position]
                list.add(slide)
            }
            return list
        }
}
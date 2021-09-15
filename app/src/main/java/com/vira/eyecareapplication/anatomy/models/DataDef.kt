package com.vira.eyecareapplication.anatomy.models

object DataDef {
    private val noText = intArrayOf(1)
    private val textDef = arrayOf("Mata    merupakan  organ  yang  diciptakan  Tuhan  dan  termasuk  salah  satu  organ vital yang penting nilainya. Manusia dapat memperoleh informasi sebanyak 80% hanya dengan  melihat.  Mata  berbentuk  seperti bola,  kecuali  tonjolan yang  berada didepan  mata  yaitu  tempat  masuknya  cahaya. Bagian  luar  mata  terdapat sebuah  lapisan  putih  dan  kaku,  keras  disebut  sclera.  Daerah  tonjolan  mata  terdapat lapisan transparan yang dilewati cahaya disebut dengan kornea. \n" +
            "\n" +
            "Mata terletak  dalam  bantalan  lemak  yang  dapat  meredam  goncangan.  Diameter  bola  mata manusia ± 2,5 cm.  Mata dapat bekerja secara efektif menerima cahaya dengan rentang intensitas yang sangat lebar sekitar 10 milyar cahaya.\n")

    val dataListDef: ArrayList<DefList>
        get() {
            val list = arrayListOf<DefList>()
            for (position in noText.indices) {
                val slide = DefList()
                slide.noText = noText[position]
                slide.defText = textDef[position]
                list.add(slide)
            }
            return list
        }
}
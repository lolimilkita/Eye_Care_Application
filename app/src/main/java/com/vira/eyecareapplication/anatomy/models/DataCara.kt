package com.vira.eyecareapplication.anatomy.models

object DataCara {
    private val noText = intArrayOf(1, 2)
    private val textDef = arrayOf("Berikut ini adalah cara kerja mata dalam memproses cahaya jadi gambar jelas jadi dapat melihat dengan baik: \n" +
            "\n" +
            "1. Cahaya memantulkan objek yang sedang dilihat \n" +
            "2. Sinar cahaya masuk ke mata melewati kornea di bagian depan mata \n" +
            "3. Cahaya melewati cairan beranda depan mata (aqueous humor) lalu masuk ke pupil untuk mencapai lensa mata \n" +
            "4. Lensa dapat merubah ukuran cahaya yang akan difokuskan ke retina di belakang mata \n" +
            "5. Saat menuju retina, cahaya melewati cairan kental dan jernih atau disebut vitreous humor \n" +
            "6. Vitreous humor atau badan bening mata membantu cahaya mempertahankan bentuknya di bola mata \n" +
            "7. Cahaya tiba di belakang mata lalu sampai ke retina \n" +
            "8. Retina mengubah cahaya menjadi impuls listrik yang kemudian dibawa ke otak oleh saraf optik \n" +
            "9. Tahap terakhir cahaya sampai di otak cahaya diproses di korteks visual otak besar dan mengartikan semua impuls listrik menjadi apa yang dilihat.",
        "Cara kerja mata normal yang ternyata sangat komplek. Semua bagian di mata bekerja sama untuk menciptakan visual apa yang dilihat. Jika ada satu bagian kecil saja mengalami kerusakan, maka penglihatan akan terganggu.")

    val dataListCara: ArrayList<CaraList>
        get() {
            val list = arrayListOf<CaraList>()
            for (position in noText.indices) {
                val slide = CaraList()
                slide.noText = noText[position]
                slide.caraText = textDef[position]
                list.add(slide)
            }
            return list
        }
}
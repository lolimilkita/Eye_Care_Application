package com.vira.eyecareapplication.info.models

object DataMenjaga {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    private val textMenjaga = arrayOf("1. Pemeriksaan rutin ke dokter mata\n" +
            "\n" +
            "Banyak orang tidak menyadari kalau penglihatan mereka berkurang, dan ini bisa terjadi karena beberapa faktor seperti glaukoma atau efek penuaan. Ada baiknya untuk memeriksakan mata ke ahli mata untuk mengetahui kesehatan mata dengan menyeluruh.",
    "2. Memperhatikan posisi yang baik saat membaca\n" +
            "\n" +
            "Jangan membaca sambil tiduran dan ditempat yang terlalu terang atau terlalu gelap. Hal itu membuat mata harus bekerja lebih keras.",
    "3. Beri waktu istirahat untuk mata\n" +
            "\n" +
            "Memandang benda-benda atau pemandangan jauh setelah membaca, menulis, atau menonton cukup lama. Cobalah aturan 20-20-20, yaitu kondisi setiap 20 menit, Contoh mata melihat ke benda yang berjarak 20 kaki, dan istirahatlah selama 20 detik. Cara ini dapat membantu mengurangi kelelahan mata.",
    "4. Bersihkan tangan dan lensa kontak\n" +
            "\n" +
            "Untuk menghindari resiko terkena infeksi, selalu cuci tangan ketika akan memasang atau melepas lensa kontak. Pastikan untuk mendisinfeksi lensa kontak sesuai yang di instruksikan dan menggantinya secara berkala.",
    "5. Berhenti merokok\n" +
            "\n" +
            "Merokok tidak baik bagi kesehatan mata. Penelitian menunjukan merokok berkaitan dengan peningkatan resiko degenerasi, katarak dan kerusakan saraf optik, yang dapat menyebabkan kebutaan.",
    "6. Konsumsi makanan yang baik untuk mata\n" +
            "\n" +
            "Bahan makanan yang banyak mengandung vitamin A, Lutein, zeaxanthine, sangat baik untuk menjaga kesehatan mata. Beberapa sumber makanan yang banyak mengandung lutein dan zeaxantine diantaranya bayam, brokoli, jagung, melon, kiwi.  Riset menunjukan dengan memakan makanan yang tinggi asam lemak omega-3 seperti salmon, tuna baik untuk kesehatan mata.",
    "7. Menjaga Berat badan\n" +
            "\n" +
            "Memiliki berat badan berlebih atau obesitas meningkatkan resiko terkena diabetes dan kondisi sistemik lainnya. Kita bisa kehilangan penglihatan sebagai komplikasi akibat penyakit-penyakit tertentu misalnya penyakit diabetes. Jika memiliki masalah dengan berat badan dan penglihatan, ada baiknya jika konsultasikan dengan dokter untuk memastikan.")

    val dataListMenjaga: ArrayList<MenjagaList>
        get() {
            val list = arrayListOf<MenjagaList>()
            for (position in noText.indices) {
                val slide = MenjagaList()
                slide.noText = noText[position]
                slide.menjagaText = textMenjaga[position]
                list.add(slide)
            }
            return list
        }
}
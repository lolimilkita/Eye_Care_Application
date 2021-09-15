package com.vira.eyecareapplication.info.models

object DataSehat {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    private val textSehat = arrayOf("Berikut ini adalah ciri-ciri mata sehat yang dapat terlihat secara kasatmata:",
    "1. Kedipan mata\n" +
            "\n" +
            "Pakar kesehatan menyebutkan bahwa mata yang sehat berkedip sebanyak 10-15 kali setiap menit. Kedipan yang normal berlangsung cepat, kurang lebih 1/3 detik atau 300-400 milidetik.",
    "2. Kedutan mata\n" +
            "\n" +
            "Kedutan merupakan gangguan otot kelopak mata yang kerap terjadi. Kedutan yang tidak berbahaya dapat hilang dengan sendirinya. Beberapa contohnya adalah akibat kurang tidur, kelelahan, konsumsi alkohol, kafein, serta kebiasaan merokok. Sedangkan kedutan yang terjadi terus-menerus dapat menandakan adanya gangguan saraf yang serius, seperti sklerosis multipel.",
    "3. Kelopak mata dapat menutup dan membuka dengan baik\n" +
            "\n" +
            "Kelopak mata yang sehat dapat menutup seluruh bagian mata dengan sempurna dan dapat membuka dengan mudah. Adanya gangguan saraf akibat stroke atau kelainan Bell’s palsy dapat membuat kelopak mata sulit ditutup. Sebaliknya, kelainan autoimun seperti myasthenia gravis atau adanya blefarospasme—gangguan saraf yang menyebabkan otot sekitar mata terus-menerus berkontraksi—membuat kelopak mata sulit dibuka.",
    "4. Kelopak mata tidak bengkak\n" +
            "\n" +
            "Selain dapat menutup dan membuka mata dengan baik, kelopak mata yang sehat tidak tampak bengkak. Adanya pembengkakan kelopak mata dapat menunjukkan beberapa kelainan seperti adanya infeksi, gangguan pada kelenjar air mata, dan mata kering.",
    "5. Pertumbuhan bulu mata ke arah luar\n" +
            "\n" +
            "Bulu mata yang normal memiliki pertumbuhan ke arah luar. Jika tumbuh ke arah sebaliknya atau disebut trikiasis, dapat menandakan adanya berbagai kelainan mata. Bulu mata yang tumbuh ke arah dalam akan menyebabkan rasa tidak nyaman dan iritasi pada kornea.",
    "6. Mata tidak tampak menonjol\n" +
            "\n" +
            "Mata yang normal tidak tampak melotot atau menonjol. Bila ada, kondisi yang disebut dengan proptosis ini umumnya disebabkan oleh penyakit Graves akibat kelenjar tiroid yang terlalu aktif.",
    "7. Mengeluarkan air mata \n" +
            "\n" +
            "Mata dilengkapi dengan kelenjar air mata dan kelenjar minyak (kelenjar Meibom) yang membuatnya tetap lembap dan tidak mudah iritasi. Gangguan pada kedua kelenjar ini dapat menyebabkan mata kering dan terasa perih.",
    "8. Kedudukan bola mata lurus dan simetris\n" +
            "\n" +
            "Masing-masing bola mata dikelilingi oleh enam otot yang mengatur kedudukan dan pergerakannya. Jika seluruh otot berfungsi normal, kedudukan bola mata akan tampak lurus dan simetris. Adanya gangguan pada salah satu otot tersebut dapat menyebabkan mata juling (strabismus), yang dapat berujung pada mata malas (ambliopia).",
    "9. Mata dapat melihat dengan jernih dan tajam\n" +
            "\n" +
            "Tajam penglihatan yang normal ialah 6/6. Bila ketajaman penglihatan berkurang, misalnya 6/9, artinya Anda dapat melihat suatu objek dari jarak 6 meter, yang mana orang normal bisa melihatnya dari jarak 9 meter.\n" +
            "\n" +
            "Berkurangnya ketajaman penglihatan umumnya disebabkan oleh kelainan refraksi seperti rabun jauh (miopia), rabun dekat (hipermetropia), mata silindris (astigmatisma), hingga mata tua (presbiopia). Kondisi ini bisa juga disebabkan oleh katarak, gangguan pada bagian saraf mata (retina), atau trauma pada mata.",
    "10. Mata tidak merah\n" +
            "\n" +
            "Selaput bening mata atau disebut konjungtiva merupakan bagian yang tidak berwarna dan tampak jernih. Jika ada kemerahan, dapat menunjukkan adanya infeksi, iritasi, alergi, atau perdarahan.",
    "11. Kornea jernih dan rata\n" +
            "\n" +
            "Kornea adalah bagian terdepan mata yang berperan penting untuk melihat. Kornea yang normal akan tampak jernih dan rata. Luka atau infeksi pada kornea akan menyebabkan mata terasa pedih dan penglihatan tampak buram. Sedangkan permukaan kornea yang tidak rata dapat menyebabkan objek yang dilihat tampak berbayang (diplopia).",
    "12. Tidak terdapat cincin di sekitar kornea\n" +
            "\n" +
            "Cincin di sekitar kornea disebut dengan arkus kornea. Cincin ini berupa garis putih keabuan di tepi kornea, yang menandakan penumpukan lemak. Bila Anda berusia tua, hal ini kerap normal. Tetapi bila Anda masih berusia di bawah 40 tahun, kondisi ini dapat menandakan kadar kolesterol yang sangat tinggi.",
    "13. Pupil mata simetris dan berwarna hitam\n" +
            "\n" +
            "Pupil adalah lubang tempat cahaya masuk ke dalam retina. Bagian mata ini berwarna hitam karena cahaya yang masuk langsung diserap oleh jaringan di dalam mata. Jika berwarna putih, dapat menandakan adanya tumor pada mata (retinoblastoma), yang kerap menyerang bayi dan anak balita.",
    "14. Sklera mata berwarna putih\n" +
            "\n" +
            "Sklera adalah bagian mata yang berwarna putih dalam kondisi normal. Bagian ini dilapisi oleh selaput bening mata. Sklera yang menjadi kekuningan dapat menandakan adanya pertumbuhan jaringan pada mata seperti pterigium atau pinguekula, atau adanya peradangan hati (hepatitis).")

    val dataListSehat: ArrayList<SehatList>
        get() {
            val list = arrayListOf<SehatList>()
            for (position in noText.indices) {
                val slide = SehatList()
                slide.noText = noText[position]
                slide.sehatText = textSehat[position]
                list.add(slide)
            }
            return list
        }
}
package com.vira.eyecareapplication.anatomy.models

object DataStruk {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    private val textStruk = arrayOf("1. Jaringan Refraksi Mata \n" +
            "\n" +
            "Jaringan refraksi mata adalah jaringan mata manusia yang memfokuskan cahaya sehingga mata melihat gambar dengan jelas. Jaringan refraksi mata yang bermasalah akan menyebabkan buram pada penglihatan mata. \n" +
            "\n" +
            "Bagian dari refraksi mata, yaitu: ",
        "-> Pupil \n" +
                "\n" +
                "Pupil adalah bagian gelap di tengah mata yang bertugas untuk merespon cahaya yang masuk. Saat keadaan terang, pupil akan menutup sekitar 1 mm untuk melindungi retina dari cahaya yang sensitif. Saat keadaan gelap, pupil akan terbuka sekitar 10 mm agar cahaya bisa masuk dan terlihat lebih jelas. Cara kerja pupil seperti aperture atau bukaan kamera.",
        "-> Iris Mata\n" +
                "\n" +
                "Iris mata adalah bagian di sekeliling pupil yang bertugas untuk mengontrol ukuran pupil dan intensitas cahaya yang dapat masuk ke retina.",
        "-> Lensa Mata \n" +
                "\n" +
                "Lensa mata berbentuk cembung transparan. Cahaya masuk ke pupil lalu mencapai lensa. Lensa bertugas untuk memfokuskan cahaya ke retina. Fokus lensa mata akan berkurang seiring bertambahnya usia.",
        "-> Otot Siliaris \n" +
                "\n" +
                "Otot siliaris melekat pada lensa, bertugas sebagai akomodasi lensa untuk mengatur bentuk lensa dalam pemrosesan cahaya.",
        "-> Kornea \n" +
                "\n" +
                "Kornea adalah lapisan transparan yang melindungi pupil, iris mata, bilik mata depan (anterior chamber) atau area yang dipenuhi cairan di antara kornea dan iris mata. Kornea mata berfungsi sebagai sistem fokus mata utama. Kornea terdiri dari saraf-saraf penting yang sangat sensitif. Kornea adalah pertahanan pertama mata terhadap benda asing dan resiko cedera. Kornea harus dalam kondisi jernih untuk membiaskan cahaya. Terdapat dua cairan di mata sebagai nutrisi mata, yaitu badan bening (Vitreous Fluid) merupakan cairan mata seperti gel di belakang mata dan beranda depan (Aqueous humor) merupakan cairan berlendir transparan serupa plasma.",
        "2. Retina \n" +
                "\n" +
                "Retina adalah anatomi mata selanjutnya, yaitu lapisan mata paling dalam yang terdiri atas 120 juta sel fotoreseptor yang mendeteksi cahaya lalu mengubahnya jadi impuls listrik untuk dikirim ke otak lalu diproses. Sel fotoreseptor mengandung protein yang sangat sensitif terhadap cahaya yang bernama opsins. Dua sel fotoreseptor utama yang bertugas mengirimkan impuls listrik ke otak adalah sel kerucut (cones) dan sel batang (rods).",
        "-> Sel Kerucut terletak di pusat retina atau yang disebut makula. Sel kerucut berbentuk padat di lubang kecil di tengah makula yang disebut sebagai fovea. Sel kerucut bertanggung jawab pada penglihatan warna yang fokus. Terdapat tiga jenis sel kerucut yaitu sel kerucut pendek atau biru, sel kerucut tengah atau hijau, sel kerucut panjang atau merah. Sel kerucut bekerja dalam cahaya normal dan membuat Anda bisa membedakan warna.",
        "-> Sel Batang terletak di tepi retina dan bekerja dalam tingkat cahaya rendah. Sel Batang tidak bisa membedakan warna namun sangat sensitif dalam mendeteksi jumlah cahaya terendah.",
        "-> Saraf Optik adalah kumpulan saraf tebal yang bertugas mentransmisikan impuls dari retina ke otak. Terdapat sekitar satu juta serat retina yang disebut sel ganglion. Sel ganglion berfungsi sebagai pengantar informasi cahaya dari retina ke otak. Setiap bagian sel ganglion memuat informasi cahaya yang berbeda. Beberapa bagian sel ganglion sangat sensitif terhadap kontras dan pergerakan cahaya, sebagian lainnya ada yang sensitif terhadap bentuk dan detail cahaya. Semua sel bekerja agar Anda dapat melihat objek visual dengan jelas. Mata dapat melihat dalam 3D dengan membandingkan impuls dari kedua mata dari otak. Impuls cahaya akan sampai ke otak lalu berakhir di korteks visual yaitu bagian otak yang khusus memuat informasi visual, lalu impuls cahaya diproses sampai menjadi gambar jelas yang Anda lihat. Itulah cara kerja mata yang ternyata sangat kompleks.",
        "3. Bagian Pendukung Mata Lainnya \n" +
                "\n" +
                "Berikut ini adalah bagian pendukung mata yang tidak kalah penting lainnya, yaitu:",
        "-> Sklera \n" +
                "\n" +
                "Sklera adalah bagian putih pada mata Anda yang berfungsi melindungi bola mata. Sklera memiliki tekstur berserat untuk menjaga bentuk mata.",
        "-> Konjungtiva \n" +
                "\n" +
                "Konjungtiva adalah selaput transparan yang berbentuk tipis untuk menutupi sebagian besar sklera dan bagian dalam kelopak mata Anda. Konjungtiva berfungsi sebagai pelumas mata dan melindungi mata dari mikroba. Koroid Koroid adalah lapisan jaringan ikat yang menghubungkan antara retina dan sklera. Koroid mengandung pembuluh darah dengan konsentrasi tinggi yang ketebalannya 0,5 mm. Koroid juga mengandung sel-sel pigmen penyerap cahaya untuk mengurangi pantulan di retina.")

    val dataList: ArrayList<StrukList>
        get() {
            val list = arrayListOf<StrukList>()
            for (position in noText.indices) {
                val slide = StrukList()
                slide.noText = noText[position]
                slide.strukText = textStruk[position]
                list.add(slide)
            }
            return list
        }
}
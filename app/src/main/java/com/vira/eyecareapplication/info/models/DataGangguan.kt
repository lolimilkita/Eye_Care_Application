package com.vira.eyecareapplication.info.models

object DataGangguan {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6)

    private val textGangguan = arrayOf("Adapun beberapa macam penyakit pada mata yang dapat mengurangi fungsi dari mata itu sendiri, berikut adalah macam-macam penyakit pada mata:\n",
    "1. Myopia\n" +
            "\n" +
            "Myopia atau mata minus merupakan salah satu kelainan refraksi yang banyak kita jumpai saat ini. Pada penderita myopia, mata hanya dapat melihat benda-benda dekat secara jelas dan akan buram jika melihat benda yang letaknya jauh. Penyebab mata minus selain genetik atau diturunkan, salah satunya dapat disebabkan kebiasaan sehari-hari dan pola hidup yang tidak baik, seperti pola makan yang kurang sehat, kebiasaan membaca buku sambil tiduran, dan membaca buku di keadaan cahaya yang kurang. Kondisi mata yang kelelahan akibat terlalu lama di depan layar tv, komputer maupun bermain HP dapat menyebabkan mata menjadi minus",
    "2. Presbiopia\n" +
            "\n" +
            "Presbiopia atau mata tua terjadi akibat hilangnya kekenyalan lensa, sehingga menyulitkan lensa untuk menjadi cembung saat melihat dekat. Keluhan yang sering timbul adalah sukar melihat tulisan kecil dalam jarak dekat sehingga penderita akan menjauhkan kertas yang akan dibaca untuk mendapatkan tulisan yang lebih jelas. Penderita presbiopia banyak terjadi pada usia > 40 tahun.  Penderita presbiopia akan dikoreksi menggunakan kacamata lensa sferis (+)positif/plus untuk membantu mata berakomodasi.",
    "3. Astigmatisma\n" +
            "\n" +
            "Astigmatisma atau silindris yaitu sinar yang masuk mata tidak dipusatkan pada 1 titik, tetapi tersebar. Hal ini dapat terjadi akibat  permukaan kornea yang tidak merata. Permukaan kornea normal yaitu permukaannya licin dan memiliki kelengkungan yang sama pada setiap bagiannya. Penderita mata silindris sering mengalami keluhan seperti melihat cermin yang tidak rata.  Kelainan refraksi jenis ini bisa didapat semenjak lahir maupun akibat adanya peradangan kornea. Koreksi kacamata dilakukan dengan kacamata silinder untuk mengimbangi kelengkungan kornea yang terganggu.",
    "4. Glaukoma\n" +
            "\n" +
            "Glaukoma adalah suatu kondisi ketika tekanan bola mata lebih tinggi dari normalnya. Tekanan bola mata yang tinggi dapat mengakibatkan kerusakan pada saraf mata atau nervus optikus maupun lapang pandang penderitanya. Peningkatan tekanan bola mata dapat disebabkan karena terganggunya aliran humor aquous atau cairan bola mata. Glaukoma sering disebut sebagai “si pencuri penglihatan “, karena pada penderita glaukoma akan terjadi kerusakan bertahap pada lapisan serabut saraf. Kerusakan serabut saraf tersebut perlahan akan menyebabkan menyempitnya lapangan pandang dan berakhir dengan kebutaan. Penderita yang sudah terdiagnosa glaukoma, sebaiknya memeriksakan ke dokter secara berkala untuk terus mengevaluasi tekanan bola mata, saraf mata maupun lapang pandangnya.",
    "5. Katarak\n" +
            "\n" +
            "Katarak adalah salah satu penyakit mata yang ditandai dengan perubahan lensa mata yang semula jernih dan bisa tembus cahaya menjadi keruh atau berkabut. Penderita katarak sering mengalami banyak keluhan, seperti penglihatan buram perlahan, seperti berkabut atau berasap, melihat dobel, lebih sensitif terhadap cahaya (merasa lebih silau), sehingga merasa lebih nyaman dengan penglihatan dimalam hari. Keluhan-keluhan yang muncul tergantung tingkat dan bentuk kekeruhan katarak.\n" +
            "\n" +
            "Katarak bisa terjadi sejak bayi dilahirkan (katarak kongenital), katarak senilis karena faktor usia degenerasi, maupun komplikata. Pengobatan katarak adalah dengan tindakan pembedahan yaitu dengan mengganti lensa mata yang sudah keruh dengan lensa buatan yang ditanam didalam mata.")

    val dataListGangguan: ArrayList<GangguanList>
        get() {
            val list = arrayListOf<GangguanList>()
            for (position in noText.indices) {
                val slide = GangguanList()
                slide.noText = noText[position]
                slide.gangguanText = textGangguan[position]
                list.add(slide)
            }
            return list
        }
}
package com.vira.eyecareapplication.fakta

object DataFakta {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6)

    private val textFakta = arrayOf("-> Mitos : Membaca dalam kondisi remang-remang dapat merusak mata\n" +
            "\n" +
            "Faktanya, konsensus para ahli mata mengatakan membaca dalam kondisi cahaya sedikit tidak akan merusak mata. Bahkan menurut British Medical Journal diungkapkan bahwa membaca di bawah cahaya rendah tidak akan merusak mata, namun hanya akan menyebabkan terjadinya ketegangan mata.",
        "-> Mitos : Membaca sambil tiduran menyebabkan rabun jauh atau mata minus\n" +
                "\n" +
                "Faktanya, rabun jauh (mata minus) dapat terjadi akibat adanya perubahan kelengkungan kornea, gangguan pada lensa mata, atau karena memanjangnya sumbu bola mata.\n" +
                "\n" +
                "\n" +
                "Posisi membaca tidak akan berpengaruh dalam memicu timbulnya rabun jauh. Membaca dalam posisi berbaring (tiduran) akan menimbulkan berbagai keluhan mata yang terjadi akibat mata lelah. Seperti mata perih hingga sakit kepala karena saat membaca dalam posisi berbaring tanpa disadari jarak antara mata dengan buku akan menjadi lebih dekat.\n" +
                "\n" +
                "Hal ini akan memaksa mata untuk berakomodasi terus menerus agar bayangan jatuh tepat di retina. Mata yang berakomodasi terus menerus akan menjadi cepat lelah sehingga timbul keluhan-keluhan seperti pandangan menjadi buram, mata perih, sakit kepala, dan lain sebagainya. Namun, keluhan keluhan ini hanya bersifat sementara. Dengan mengistirahatkan mata secara teratur maka keluhan-keluhan ini dapat diatasi.",
        "-> Mitos : Terlalu sering di depan komputer atau sering menonton TV akan merusak mata.\n" +
                "\n" +
                "Faktanya, terlalu sering di depan komputer atau menonton TV mengakibatkan mata lebih jarang berkedip. Sehingga mata menjadi kering dan lelah. Cobalah beristirahat sejenak dengan mengalihkan fokus penglihatan atau melihat sesuatu di tempat yang lebih jauh setiap 15-30 menit untuk mengurangi ketegangan mata.",
        "-> Mitos : Makan Banyak Wortel Dapat Menyembuhkan Rabun Jauh\n" +
                "\n" +
                "Faktanya, rabun jauh (mata minus) dalam istilah kedokteran dikenal dengan nama miopia merupakan suatu gangguan penglihatan dimana mata tidak mampu untuk melihat benda yang jaraknya jauh. Sehingga, pandangan menjadi kabur saat melihat benda jauh. Rabun jauh ini dapat terjadi karena adanya perubahan kelengkungan kornea, adanya gangguan pada lensa mata, atau terjadinya pemanjangan sumbu bola mata.",
        "-> Mitos : Membaca dalam kondisi remang-remang dapat merusak mata\n" +
                "\n" +
                "Faktanya, konsensus para ahli mata mengatakan membaca dalam kondisi cahaya sedikit tidak akan merusak mata. Bahkan menurut British Medical Journal diungkapkan bahwa membaca di bawah cahaya rendah tidak akan merusak mata, namun hanya akan menyebabkan terjadinya ketegangan mata.\n" +
                "\n" +
                "Pemberian wortel dan zat-zat makanan yang kaya akan vitamin A memang terbukti baik bagi kesehatan mata, namun bukan untuk menyembuhkan rabun jauh. Peranan wortel dan vitamin A dalam kesehatan mata adalah untuk mendukung metabolisme sel-sel saraf pada retina serta mencegah dan mengatasi gangguan mata yang terjadi akibat kekurangan vitamin A. Seperti xeroftalmia (mata menjadi kering) atau rabun senja (penglihatan yang terganggu di saat gelap/malam hari).\n" +
                "\n" +
                "Karena itu, jika penyebab pandangan kabur/buram adalah defisiensi vitamin A, maka konsumsi banyak wortel dapat membantu mengatasi kelainan mata tersebut, namun jika penyebab pandangan kabur adalah rabun jauh maka sebaiknya diatasi dengan menggunakan kacamata berlensa minus atau lensa kontak. Pada keadaan tertentu, rabun jauh dapat juga diatasi dengan pembedahan pada kornea antara lain keratotomi radial, keratektomi fotorefraktif, Laser Asissted In situ Interlamelar Keratomilieusis (Lasik).",
        "-> Mitos : Kaca mata harus dipakai terus, kalau tidak akan semakin parah!\n" +
                "\n" +
                "Faktanya, kacamata adalah alat bantu penglihatan. Namun pemakaian kacamata tidak memengaruhi kesehatan mata. Penggunaan kacamata tidak berpengaruh pada penambahan ataupun pengurangan minus maupun silindris.\n" +
                "\n" +
                "Jika pengguna kacamata melihat tanpa menggunakan kacamata, maka semua benda akan terlihat tidak fokus dan mata akan dipaksa bekerja lebih keras untuk memfokuskan benda tersebut. Mata yang dipaksa bekerja keras dengan berakomodasi terus menerus akan cepat menjadi lelah dan timbul keluhan berupa sakit kepala, mata perih, dan penglihatan kabur.\n" +
                "\n" +
                "Namun hal ini tidak akan menimbulkan kerusakan jangka panjang terhadap mata. Kaca mata akan membantu anda untuk melihat dengan lebih baik tanpa mata harus bekerja keras. Dengan menggunakan kacamata, maka penglihatan tidak akan memburuk dengan cepat, namun tidak menggunakan kacamata pun tidak akan merusak mata anda secara permanen.")

    val dataListFakta: ArrayList<FaktaList>
        get() {
            val list = arrayListOf<FaktaList>()
            for (position in noText.indices) {
                val slide = FaktaList()
                slide.noText = noText[position]
                slide.faktaText = textFakta[position]
                list.add(slide)
            }
            return list
        }
}
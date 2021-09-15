package com.vira.eyecareapplication.info.models

object DataGejala {
    private val noText = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    private val textGejala = arrayOf("1. Mata merah\n" +
            "\n" +
            "Gejala sakit mata yang paling umum dan mudah untuk dideteksi adalah mata merah. Kemerahan pada mata biasanya tampak pada bagian putih bola mata (sklera), yang disebabkan oleh pelebaran pada pembuluh darah mata.\n" +
            "\n" +
            "Hampir semua kasus sakit mata menimbulkan gejala berupa mata merah. Namun, salah satu penyakit yang paling sering dikaitkan dengan kondisi ini adalah konjungtivitis atau peradangan pada konjungtiva.",
    "2. Mata perih dan terasa panas\n" +
            "\n" +
            "Anda mungkin pernah mengalami gejala mata terasa perih dan muncul sensasi terbakar secara tiba-tiba. Terkadang, gejala tersebut juga diikuti oleh mata lebih mudah berair. Ini merupakan salah satu gejala yang perlu Anda waspadai.\n" +
            "\n" +
            "Penyebab yang paling umum adalah kondisi mata terlalu kering. Namun, menurut situs Cleveland Clinic, hal ini mungkin juga diakibatkan oleh adanya sumbatan pada saluran air mata.",
    "3. Mata terasa gatal\n" +
            "\n" +
            "Mata gatal juga merupakan gejala sakit mata yang umum terjadi. Selain rasa gatal di mata, Anda mungkin juga akan merasakan gatal di kelopak mata. Rasa gatal juga bisa diikuti dengan gejala bengkak.\n" +
            "\n" +
            "Mata gatal paling sering diakibatkan oleh alergi. Kondisi ini terjadi ketika mata terpapar alergen seperti debu, polusi, bulu binatang, bahan tertentu pada make-up, atau obat tetes mata tertentu.",
    "4. Mata bengkak\n" +
            "\n" +
            "Anda mungkin sering kali mendapati mata Anda bengkak saat baru bangun atau sehabis menangis. Namun, jika pembengkakan berlangsung lebih dari 24-48 jam dan disertai dengan gejala tambahan seperti rasa nyeri dan penglihatan kabur, Anda harus waspada.\n" +
            "\n" +
            "Mata bengkak bisa jadi merupakan gejala berbagai jenis sakit mata, mulai dari konjungtivitis, bintitan, kalazion, hingga cedera mata. Pada kasus yang ringan, pembengkakan biasanya akan mereda dalam waktu beberapa hari.",
    "5. Penglihatan kabur\n" +
            "\n" +
            "Penglihatan kabur atau buram sebenarnya merupakan salah satu gejala sakit mata yang umum. Mungkin saja Anda mengalami gangguan refraksi saat mengalami mata kabur.\n" +
            "\n" +
            "Namun, tak jarang pula kondisi ini terjadi akibat adanya penyakit lain yang sudah ada sebelumnya, seperti diabetes, stroke, katarak, serta glaukoma. diabetes melitus tipe 1",
    "6. Mata kering\n" +
            "\n" +
            "Mata yang kering terjadi akibat kurangnya produksi air mata, atau adanya masalah pada lapisan air mata Anda. Padahal, mata selalu membutuhkan air mata untuk menjaga kelembapan permukaannya.\n" +
            "\n" +
            "Terkadang, gejala mata kering juga disertai dengan gejala lain, seperti rasa sakit, penglihatan kabur, dan ada sensasi mengganjal di mata.",
    "7. Mata berair atau belekan\n" +
            "\n" +
            "Kondisi mata yang terlalu berair justru menjadi pertanda bahwa mata Anda terlalu kering. Hal ini disebabkan karena mata akan berusaha mengatasi iritasi akibat kering dengan menghasilkan air mata sebanyak-banyaknya.\n" +
            "\n" +
            "Selain air mata, mata juga bisa dipenuhi oleh kotoran yang biasa Anda sebut belekan. Warna kotoran tersebut bisa bervariasi, seperti putih, kuning, atau hijau.\n" +
            "\n" +
            "Belekan adalah kondisi yang normal ditemukan ketika Anda baru bangun tidur. Akan tetapi, hati-hati jika belekan berwarna tidak wajar seperti kuning atau hijau. Hal tersebut bisa jadi merupakan gejala sakit mata menular seperti infeksi bakteri atau virus.",
    "8. Mata melotot\n" +
            "\n" +
            "Mata melotot adalah salah satu gejala sakit mata yang perlu Anda waspadai. Pasalnya, mata melotot merupakan tanda dari penyakit graves. Penyakit graves merupakan gangguan sistem imun pada tubuh yang menyebabkan kelenjar tiroid tidak berfungsi dengan baik.",
    "9. Lingkaran di sekitar kornea\n" +
            "\n" +
            "Corneal arcus, atau lingkaran abu-abu di sekitar kornea, merupakan lingkaran abu-abu yang muncul dan merupakan timbunan lemak. Jika Anda berusia di atas 40 tahun, hal ini wajar saja terjadi.\n" +
            "\n" +
            "Sebaliknya, jika Anda berusia di bawah 40 tahun, gejala sakit mata ini bisa menjadi tanda bahwa Anda memiliki kolesterol yang tinggi dalam tubuh. Kadar kolesterol yang tinggi dapat menimbulkan berbagai penyakit kronis seperti penyakit jantung koroner, stroke, diabetes melitus, dan gagal jantung.",
    "10. Kelopak mata turun\n" +
            "\n" +
            "Kelopak mata yang turun biasanya memang alami terjadi pada kelompok lansia yang merupakan tanda penuaan yang alami terjadi. Tendon yang ada pada mata berfungsi untuk membuka, menutup, atau mengangkat kelopak mata.\n" +
            "\n" +
            "Ketika memasuki usia lanjut, tendon tersebut mengalami peregangan dan mengakibatkan kelopak mata menurun. Namun jika anak-anak sudah memiliki gejala sakit mata ini, maka mungkin saja anak tersebut mengalami amblyopia atau lazy eye, yang merupakan kelainan mata sejak lahir.\n" +
            "\n" +
            "Tidak hanya itu, kelopak mata yang turun yang terjadi sebelum memasuki usia lanjut mungkin dapat mengindikasikan bahwa terdapat kerusakan pada saraf atau jaringan mata. Hal ini dapat mengarah ke beberapa penyakit kronis seperti, stroke, tumor otak, kanker saraf atau kanker otot.",
    "11. Mata kuning\n" +
            "\n" +
            "Gejala sakit mata lain yang perlu Anda waspadai adalah mata kuning. Mata dan kulit yang berwarna kuning merupakan salah satu tanda bahwa ada masalah pada fungsi hati.\n" +
            "\n" +
            "Kuning pada mata atau kulit muncul akibat bilirubin yang masuk ke pembuluh darah. Bilirubin merupakan zat pewarna untuk urine yang dihasilkan oleh hati. Hal ini dapat mengindikasikan bahwa hati terkena radang, infeksi, atau bahkan kanker.",
    "12. Mata berkedut\n" +
            "\n" +
            "Kondisi ini merupakan gejala sakit mata yang paling sering terjadi pada banyak orang dan umumnya tidak terlalu berbahaya. Mata berkedut biasanya dikaitkan dengan kelelahan, konsumsi kafein atau alkohol, dan merokok.\n" +
            "\n" +
            "Pada kasus tertentu, mata berkedut juga bisa menjadi tanda dari gangguan sistem saraf, seperti multiple sclerosis. Namun, bila kondisi ini merupakan gejala dan tanda dari multiple sclerosis atau gangguan sistem saraf, biasanya akan diiringi dengan kemunculan berbagai tanda dan gejala lain, seperti susah berjalan dan berbicara.",
    "13. Rabun senja\n" +
            "\n" +
            "Jika Anda susah melihat di waktu malam, atau ketika malam penglihatan Anda menurun, mungkin Anda mengalami katarak. Gejala ini juga biasa terjadi seiring dengan bertambahnya usia.")

    val dataListGejala: ArrayList<GejalaList>
        get() {
            val list = arrayListOf<GejalaList>()
            for (position in noText.indices) {
                val slide = GejalaList()
                slide.noText = noText[position]
                slide.gejalaText = textGejala[position]
                list.add(slide)
            }
            return list
        }
}
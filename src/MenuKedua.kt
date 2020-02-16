class MenuKedua() {

    fun cekKesalahan(cekArray: Array<String>, player: String): String {
        var newPlayer = player
        if (!cekArray.contains(newPlayer)) {
            do {
                println("Masukkan salah. Masukkan kertas / gunting / batu")
                newPlayer = readLine().toString().toLowerCase()
            } while (!cekArray.contains(newPlayer))
        }
        return newPlayer
    }

    fun menu(inputMainMenu: Int) {
        val mekanikGame = MekanikGame()
        var inputMainLagi = ""
        val arrayKerGunBat = arrayOf("kertas", "gunting", "batu")
        var arrayPointPlayer1 = mutableListOf<String>()
        var arrayPointPlayer2 = mutableListOf<String>()

        do {
            when (inputMainMenu) {
                1 -> {
                    println("==========================================")
                    println("=          Pilih Mode Bermain            =")
                    println("------------------------------------------")
                    println("-         1. Bermain satu kali           -")
                    println("-         2. Best of three               -")
                    println("------------------------------------------")
                    println("-     INFO : Hanya tampilkan 10 line     -")
                    println("-             di terminal                -")
                    println("------------------------------------------")
                    print("Masukkan mode 1 atau 2 : ")
                    val inputMode = readLine()!!.toInt()

                    when (inputMode) {
                        1 -> {
                            println()
                            println("==========================================")
                            println("=  Player vs Player > Bermain satu kali  =")
                            println("==========================================")
                            println("-             MULAI BERMAIN              -")
                            println("-        kertas , gunting , batu         -")
                            println("------------------------------------------")
                            println()
                            println()
                            println()
                            print("Player 1 masukkan pilihanmu : ")
                            var inputPlayerSatu = readLine().toString().toLowerCase()
                            val cleanInputCek1 = cekKesalahan(arrayKerGunBat, inputPlayerSatu)
                            for (i in 0 until 10){
                                println() //looping enter agar inputan player 1 tidak terlihat oleh player 2. begitu
                            }
                            print("Player 2 masukkan pilihanmu : ")
                            var inputPlayerDua = readLine().toString().toLowerCase()
                            val cleanInputCek2 = cekKesalahan(arrayKerGunBat, inputPlayerDua)
                            for (i in 0 until 10){
                                println()
                            }
                            println("Player 1 = $cleanInputCek1 dan Player 2 = $cleanInputCek2")
                            mekanikGame.mekanikCondition(cleanInputCek1, cleanInputCek2)
                        }

                        2 -> {
                            println("==========================================")
                            println("=    Player vs Player > Best of three    =")
                            println("==========================================")
                            println("-             MULAI BERMAIN              -")
                            println("-        kertas , gunting , batu         -")
                            println("------------------------------------------")
                            println()
                            println()
                            while (arrayPointPlayer1.size != 3 && arrayPointPlayer2.size != 3) {

                                println("------------------------------------------")
                                print("Player 1 masukkan pilihanmu : ")
                                var inputPlayerSatu = readLine().toString().toLowerCase()
                                val cleanInputCek1 = cekKesalahan(arrayKerGunBat, inputPlayerSatu)

                                for (i in 0 until 10){
                                    println()
                                }

                                println("------------------------------------------")
                                print("Player 2 masukkan pilihanmu : ")
                                var inputPlayerDua = readLine().toString().toLowerCase()
                                val cleanInputCek2 = cekKesalahan(arrayKerGunBat, inputPlayerDua)

                                for (i in 0 until 10){
                                    println()
                                }

                                println("Player 1 = $cleanInputCek1 | Player 2 = $cleanInputCek2")

                                mekanikGame.mekanikBestOfThree(
                                    cleanInputCek1,
                                    cleanInputCek2,
                                    arrayPointPlayer1,
                                    arrayPointPlayer2
                                )
                                println("Point player 1 = ${arrayPointPlayer1}")
                                println("Point player 2 = ${arrayPointPlayer2}")
                                if (arrayPointPlayer1.size == 3) {
                                    println()
                                    println("SELAMAT PLAYER 1 MENANG")
                                    println("------------------------------------------")
                                } else if (arrayPointPlayer2.size == 3) {
                                    println()
                                    println("SELAMAT PLAYER 2 MENANG")
                                    println("------------------------------------------")
                                }
                            }
                        }

                    }
                    print("Main lagi (Y/N) : ")
                    inputMainLagi = readLine().toString().toLowerCase()

                }

                2 -> {
                    println("==========================================")
                    println("=          Pilih Mode Bermain            =")
                    println("------------------------------------------")
                    println("-         1. Bermain satu kali           -")
                    println("-         2. Best of three               -")
                    println("------------------------------------------")
                    println("-                                        -")
                    println("-                                        -")
                    println("------------------------------------------")
                    print("Masukkan mode 1 atau 2 : ")
                    val inputMode = readLine()!!.toInt()

                    // MODE KOMPUTER
                    when (inputMode) {
                        1 -> {
                            println()
                            println("==========================================")
                            println("=  Player vs Komputer> Bermain satu kali =")
                            println("==========================================")
                            println("-             MULAI BERMAIN              -")
                            println("-        kertas , gunting , batu         -")
                            println("------------------------------------------")
                            println("Player 1 masukkan pilihanmu : ")
                            var inputPlayerSatu = readLine().toString()
                            val cleanInputCek1 = cekKesalahan(arrayKerGunBat, inputPlayerSatu)

                            val randomArray = arrayKerGunBat.random()
                            println("------------------------------------------")
                            println("Player 2 (Komputer) memilih : $randomArray")

                            println()

                            mekanikGame.mekanikCondition(cleanInputCek1, randomArray)
                        }
                        2 -> {
                            println()
                            println("==========================================")
                            println("=    Player vs Komputer > Best of three  =")
                            println("==========================================")
                            println("-             MULAI BERMAIN              -")
                            println("-        kertas , gunting , batu         -")
                            println("------------------------------------------")

                            while (arrayPointPlayer1.size != 3 && arrayPointPlayer2.size != 3) {

                                println("------------------------------------------")
                                println("Player 1 masukkan pilihanmu : ")
                                var inputPlayerSatu = readLine().toString()

                                val cleanInputCek1 = cekKesalahan(arrayKerGunBat, inputPlayerSatu)

                                val randomArray = arrayKerGunBat.random()
                                println("------------------------------------------")
                                println("Player 2 (Komputer) memilih : $randomArray")

                                mekanikGame.mekanikBestOfThree(
                                    cleanInputCek1,
                                    randomArray,
                                    arrayPointPlayer1,
                                    arrayPointPlayer2
                                )
                                println("Point player 1 (Kamu)     = ${arrayPointPlayer1}")
                                println("Point player 2 (Komputer) = ${arrayPointPlayer2}")

                                if (arrayPointPlayer1.size == 3) {
                                    println()
                                    println("SELAMAT KAMU MENANG")
                                    println("------------------------------------------")
                                } else if (arrayPointPlayer2.size == 3) {
                                    println()
                                    println("YAH KAMU KALAH ")
                                    println("------------------------------------------")
                                }
                            }
                        }

                    }

                    println("mainLagi Y/N ? ")
                    inputMainLagi = readLine().toString().toLowerCase()

                }

                3 -> System.exit(0)
                else -> print("Menu tidak ditemukan!")
            }
        } while (inputMainLagi == "y")

    }


}




fun menu(input1:Int){
    val input1 = input1
    var input2 = ""

    do {
        when (input1){
            1 -> {
                println("masuk menu 1")
                println("Mulai bermain --->")
                println("kertas , gunting , batu")
                println("-----------------------")
                print("Player 1 masukkan pilihanmu : ")
                val player1 = readLine().toString()
                print("Player 2 masukkan pilihanmu : ")
                val player2 = readLine().toString()

                val obj = MekanikGame(player1,player2)
                obj.mekanik()

                println("mainLagi Y/N ? ")
                input2 = readLine().toString().toLowerCase()


            }

            2 -> {
                println("Masuk menu 2")
                println("Mulai bermain --->")
                println("kertas , gunting , batu")
                println("-----------------------")
                print("Player 1 masukkan pilihanmu : ")
                val player1 = readLine().toString()

                //Pengecekan di lakukan di Class VsKomputer dan di lakukan penentuan hasil di fungsi mekanikKom
                val obj2 = VsKomputer(player1)
                obj2.mekanikKom()
                println("mainLagi Y/N ? ")
                input2 = readLine().toString().toLowerCase()

            }

            3 -> System.exit(0)
            else -> print("Menu tidak ditemukan!")
        }
    }while (input2 == "y")
}
class MenuKedua(){

    fun cekKesalahan(cekArray: Array<String>,player:String){
        if (!cekArray.contains(player)) {
            do {
                println("Masukkan salah. Masukkan kertas / gunting / batu")
                var newPlayer = readLine().toString()
            } while (!cekArray.contains(newPlayer))
        }
    }

    fun menu(inputMainMenu: Int) {

        var inputMainLagi = ""
        val checkArray = arrayOf("kertas", "gunting", "batu")

            do {
            when (inputMainMenu) {
                1 -> {
                    println("=================")
                    println("Player vs Player")
                    println("Mulai bermain --->")
                    println("kertas , gunting , batu")
                    println("-----------------------")
                    println("Player 1 masukkan pilihanmu : ")
                    var inputPlayerSatu = readLine().toString()
                    cekKesalahan(checkArray,inputPlayerSatu)


                    println("Player 2 masukkan pilihanmu : ")
                    var inputPlayerDua = readLine().toString()
                    cekKesalahan(checkArray,inputPlayerDua)


                    var mekanikGame = MekanikGame(inputPlayerSatu, inputPlayerDua)
                    mekanikGame.mekanikCondition()

                    println()
                    println("Main lagi (Y/N) : ")
                    inputMainLagi = readLine().toString().toLowerCase()


                }

                2 -> {
                    println("Masuk menu 2")
                    println("Mulai bermain --->")
                    println("kertas , gunting , batu")
                    println("-----------------------")
                    println("Player 1 masukkan pilihanmu : ")
                    val player1 = readLine().toString()

                    //Pengecekan di lakukan di Class VsKomputer dan di lakukan penentuan hasil di fungsi mekanikKom
                    val obj2 = VsKomputer(player1)
                    obj2.mekanikKom()

                    println()
                    println("mainLagi Y/N ? ")
                    inputMainLagi = readLine().toString().toLowerCase()

                }

                3 -> System.exit(0)
                else -> print("Menu tidak ditemukan!")
            }
        } while (inputMainLagi == "y")

    }


}

/*
fun checkInputan(player:String):String{
    val checkArray = arrayOf("kertas","gunting","batu")

    do{
        if (!checkArray.contains(player)){
            println("Masukkan salah. Masukkan kertas / gunting / batu !!!")
            var player = readLine().toString()
        }
    }while (!checkArray.contains(player))
    return player

}
*/



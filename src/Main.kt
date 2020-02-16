class Main {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val menuKedua = MenuKedua()

            do {
                println("++++++++++++++++++++++++++++++++++++++++++")
                println("+        KERTAS , GUNTING , BATU         +")
                println("++++++++++++++++++++++++++++++++++++++++++")
                println("-                MAIN MENU               -")
                println("------------------------------------------")
                println("-           1. Player vs Player          -")
                println("-           2. Player vs Komputer        -")
                println("-           3. Exit                      -")
                println("------------------------------------------")
                print("Pilih Menu (hanya masukkan 1,2 atau 3): ")

                val inputMainMenu = readLine()!!.toInt()
                menuKedua.menu(inputMainMenu)

            } while (inputMainMenu != 3)
        }
    }
}
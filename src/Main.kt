class Main {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            var menuKedua = MenuKedua()
            do {
                println("=========================")
                println("KERTAS GUNTING BATU")
                println("-------------------------")
                println("Main Menu :")
                println("1. Player vs Player")
                println("2. Player vs Komputer")
                println("3. Exit")
                print("Pilih Menu (hanya masukkan 1,2 atau 3): ")


                var inputMainMenu = readLine()!!.toInt()
                menuKedua.menu(inputMainMenu)

            } while (inputMainMenu != 3)


        }
    }
}
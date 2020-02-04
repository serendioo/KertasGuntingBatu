fun main(){
    do{
        println("=========================")
        println("KERTAS GUNTING BATU")
        println("-------------------------")
        println("Main Menu :")
        println("1. Player vs Player")
        println("2. Player vs Komputer")
        println("3. Exit")
        print("Pilih Menu : ")

        val menu1: Int = readLine()!!.toInt()
        menu(menu1)
    }while (menu1 != 3)


}
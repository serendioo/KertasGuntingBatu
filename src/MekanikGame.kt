class MekanikGame(val inputPlayer1: String, val inputPlayer2: String) {

    fun mekanikCondition() {

        if (inputPlayer1.equals(inputPlayer2)) {
            println("Hasil draw!!")

        } else if (inputPlayer1.equals("batu")) {
            if (inputPlayer2.equals("kertas")) {
                println("Player 2 menang")
            } else {
                println("Player 1 menang")
            }

        } else if (inputPlayer1.equals("kertas")) {
            if (inputPlayer2.equals("gunting")) {
                println("Pemain ke 2 Menang")
            } else{
                println("Pemain ke 1 Menang")
            }

        } else if (inputPlayer1.equals("gunting")) {
            if (inputPlayer2.equals("batu")) {
                println("Pemain ke 2 Menang")
            } else{
                print("Pemain ke 1 menang!!")
            }
        }
    }
}
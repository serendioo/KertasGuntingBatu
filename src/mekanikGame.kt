class MekanikGame (val player1:String,val player2: String){

    fun mekanik(){
        if (player1 == player2){
            println("draw")
        }else if (player1.toLowerCase() == "batu"){
            if (player2.toLowerCase() == "kertas"){
                println("Player 2 Menang")
            }else{
                println("Player 1 Menang")
            }
        }else if (player1.toLowerCase() == "kertas"){
            if (player2.toLowerCase() == "gunting"){
                println("player 2 Menang !")
            }else{
                println("Player 1 Menang !")
            }
        }else if (player1.toLowerCase() == "gunting"){
            if (player2.toLowerCase() == "batu"){
                println("player 2 menang !!")
            }else{
                println("player 1 menang !!")
            }
        }
    }





}
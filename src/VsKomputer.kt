class VsKomputer(val playerInput:String){

    val acak = arrayOf("kertas","gunting","batu")
    val inputKom = acak.random()


    fun mekanikKom(){

        println("Komputer memilih : $inputKom")
        if (playerInput == inputKom){
            println("draw")
        }else if (playerInput.toLowerCase() == "batu"){
            if (inputKom.toLowerCase() == "kertas"){
                println("yaelah komputer Menang")
            }else{
                println("selamat kamu Menang")
            }
        }else if (playerInput.toLowerCase() == "kertas"){
            if (inputKom.toLowerCase() == "gunting"){
                println("Komputer 2 Menang !")
            }else{
                println("Horee kamu menang !")
            }
        }else if (playerInput.toLowerCase() == "gunting"){
            if (inputKom.toLowerCase() == "batu"){
                println("Komputer 2 menang !!")
            }else{
                println("Yess kamu menang !!")
            }
        }
    }



}
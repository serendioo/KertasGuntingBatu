class MekanikGame() {

    fun mekanikCondition(inputPlayer1: String, inputPlayer2: String) {

        if (inputPlayer1.equals(inputPlayer2)) {
            println("=======================")
            println("=     HASIL DRAW!!!!  =")
            println("=======================")
        } else if (inputPlayer1.equals("batu")) {
            if (inputPlayer2.equals("kertas")) {
                println("=======================")
                println("=  PLAYER DUA MENANG  =")
                println("=======================")
            } else {
                println("===========================")
                println("=  PLAYER PERTAMA MENANG  =")
                println("===========================")
            }
        } else if (inputPlayer1.equals("kertas")) {
            if (inputPlayer2.equals("gunting")) {
                println("=======================")
                println("=  PLAYER DUA MENANG  =")
                println("=======================")
            } else {
                println("===========================")
                println("=  PLAYER PERTAMA MENANG  =")
                println("===========================")
            }

        } else if (inputPlayer1.equals("gunting")) {
            if (inputPlayer2.equals("batu")) {
                println("=======================")
                println("=  PLAYER DUA MENANG  =")
                println("=======================")
            } else {
                println("===========================")
                println("=  PLAYER PERTAMA MENANG  =")
                println("===========================")
            }
        }
    }

    fun mekanikBestOfThree(
        inputPlayer1: String,
        inputPlayer2: String,
        arrayPoint1: MutableList<String>,
        arrayPoint2: MutableList<String>
    ) {

        if (inputPlayer1.equals(inputPlayer2)) {
            println("=======================")
            println("=     HASIL DRAW!!!!  =")
            println("=======================")
        } else if (inputPlayer1.equals("batu")) {
            if (inputPlayer2.equals("kertas")) {
                println()
                println("point untuk player 2")
                arrayPoint2.add("✓")
            } else {
                println()
                println("point untuk player 1")
                arrayPoint1.add("✓")
            }

        } else if (inputPlayer1.equals("kertas")) {
            if (inputPlayer2.equals("gunting")) {
                println()
                println("point untuk player 2")
                arrayPoint2.add("✓")
            } else {
                println()
                println("point untuk player 1")
                arrayPoint1.add("✓")
            }

        } else if (inputPlayer1.equals("gunting")) {
            if (inputPlayer2.equals("batu")) {
                println()
                println("point untuk player 2")
                arrayPoint2.add("✓")
            } else {
                println()
                println("point untuk player 1")
                arrayPoint1.add("✓")
            }
        }
    }
}
// https://www.codewars.com/kata/51b6249c4612257ac0000005/train/scala


class Roman extends Display{
    def displayOutput(): Unit = {
        println(decode("MCMXC"))
    }

    // Symbol    Value
    // I          1
    // V          5
    // X          10
    // L          50
    // C          100
    // D          500
    // M          1,000

    def decode(roman: String): Int = {
        val symbolMap = Map("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)
        roman.split("").map(symbolMap(_)).foldRight(0)((a, b) => if(a < b) b - a else a + b)   
    }
}
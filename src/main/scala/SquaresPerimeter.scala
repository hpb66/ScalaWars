// https://www.codewars.com/kata/559a28007caad2ac4e000083/solutions/scala
class SquaresPerimeter extends Display{
    def displayOutput(): Unit = {
        println(perimeter(89802))
    }
    def perimeter(n: BigInt): BigInt = {
        def fibs(x: Int, first: BigInt, second: BigInt, res: BigInt = 0): BigInt = { 
            // println(s"first: $first second: $second res: $res")
            if(x == 0){
                res
            } else {
                fibs(x - 1, second, first + second, res + second)
            }
        }
        fibs(n.toInt, 1, 1, 1) * 4
    }
}
// 1 1 2 3 5 8
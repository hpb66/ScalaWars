// https://www.codewars.com/kata/556deca17c58da83c00002db/train/scala
class Tribonacci extends Display{
    def displayOutput(): Unit = {
        println(tribonacci(List(1.0, 1.0, 1.0),1))
    }
    def tribonacci[T : Numeric](signature: List[T], n: Int): List[T] = {
        var res = signature
        if(n <= 3){
            res = signature.take(n)
        } else {
            for( i <- 0 until n - 3){
                res = res.appended(res.takeRight(3).sum)
            }
        }    
        res
    }
}
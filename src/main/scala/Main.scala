object Main extends App {
  println(Scoring.high("find or finda"))
}

object Multiplication {

  def persistence(n: Int): Int = {
    def go(x: Int, res: Int): Int = {
      if (x / 10 == 0) {
        res
      } else {
        val newX: Int = x.toString().split("").toList.map(_.toInt).product
        go(newX, res + 1)
      }
    }
    go(n, 0)
  }
}
// 15 + 18 = 33
object Scoring {
  def high(s: String): String = {
    s.split(' ').maxBy(_.map(_ - 'a' + 1).sum)

  }
}

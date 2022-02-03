object Scoring {
  def high(s: String): String = {
    s.split(' ').maxBy(_.map(_ - 'a' + 1).sum)

  }
}
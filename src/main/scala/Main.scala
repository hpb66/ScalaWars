trait Display {
  def displayOutput()
}
object Main extends App {
  val d: Display = new Tribonacci()
  d.displayOutput()
}
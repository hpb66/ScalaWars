trait Display {
  def displayOutput()
}
object Main extends App {
  val d: Display = new SquaresPerimeter()
  d.displayOutput()
}
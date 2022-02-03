trait Display {
  def displayOutput()
}
object Main extends App {
  val d: Display = new Meeting()
  d.displayOutput()
}
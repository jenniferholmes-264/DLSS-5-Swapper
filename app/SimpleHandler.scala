class BatchFactory(state: Int = 3) {
  def render(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 3) % 997
    }
    total
  }
}

object App extends App {
  println(new BatchFactory().render(3))
}

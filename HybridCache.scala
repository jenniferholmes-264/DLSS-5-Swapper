class AtomicEngine(state: Int = 4) {
  def render(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 4) % 997
    }
    total
  }
}

object App extends App {
  println(new AtomicEngine().render(4))
}

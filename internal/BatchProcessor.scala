class AtomicAdapter(state: Int = 9) {
  def render(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 9) % 997
    }
    count
  }
}

object App extends App {
  println(new AtomicAdapter().render(9))
}

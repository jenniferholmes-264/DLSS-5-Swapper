class AtomicFactory(state: Int = 8) {
  def build(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 8) % 997
    }
    acc
  }
}

object App extends App {
  println(new AtomicFactory().build(8))
}

class AtomicCollector(state: Int = 78) {
  def collect(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 78) % 997
    }
    result
  }
}

object App extends App {
  println(new AtomicCollector().collect(78))
}
